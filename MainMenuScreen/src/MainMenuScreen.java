package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class MainMenuScreen extends AbstractScreen{

	private Button newGameButton, continueGameButton, optionsButton, updatesButton, exitButton;
	private TextureRegion [] animatedTorchImages;
	private TextureRegion torch;
	private Animation<TextureRegion> animatedTorch;
	private Music DeathIsAnotherPath;
	private float stateTime;
	private Stage ButtonStage;
	private boolean playedNewGameButton, playedContinueGameButton, playedOptionsButton, playedUpdatesButton, playedExitButton;

	public MainMenuScreen() {
		super.font.setColor(Color.GOLDENROD);
		super.font.getData().setScale(1.5f, 1.5f);
		
		this.animatedTorchImages = new TextureRegion [] {
				new Sprite(new Texture(Gdx.files.internal("MainMenuTextures/AnimatedTorch/darkTorch1.png"))),
				new Sprite(new Texture(Gdx.files.internal("MainMenuTextures/AnimatedTorch/darkTorch2.png"))),
				new Sprite(new Texture(Gdx.files.internal("MainMenuTextures/AnimatedTorch/darkTorch3.png"))),
				new Sprite(new Texture(Gdx.files.internal("MainMenuTextures/AnimatedTorch/darkTorch4.png"))),
				new Sprite(new Texture(Gdx.files.internal("MainMenuTextures/AnimatedTorch/darkTorch5.png"))),
				new Sprite(new Texture(Gdx.files.internal("MainMenuTextures/AnimatedTorch/darkTorch6.png"))),
				new Sprite(new Texture(Gdx.files.internal("MainMenuTextures/AnimatedTorch/darkTorch7.png")))
		};
		this.animatedTorch = new Animation<TextureRegion>(0.15f, this.animatedTorchImages);
		
		this.playedNewGameButton = false;
		this.playedContinueGameButton = false;
		this.playedOptionsButton = false;
		this.playedUpdatesButton = false;
		this.playedExitButton = false;

		// Music for the main menu
		this.DeathIsAnotherPath = Gdx.audio.newMusic(Gdx.files.internal("MainMenuTextures/Music/DeathIsJustAnotherPath.mp3"));
		this.DeathIsAnotherPath.setVolume(0.1f);
		this.DeathIsAnotherPath.setLooping(true);
		
		this.ButtonStage = new Stage();
	}

	@Override
	public void buildStage() {
		Gdx.input.setInputProcessor(this.ButtonStage);
		
		// Main menu buttons
		this.newGameButton = new Button();
		this.continueGameButton = new Button();
		this.optionsButton = new Button();
		this.updatesButton = new Button();
		this.exitButton = new Button();

		this.newGameButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/1.542f, 420, 80);
		this.continueGameButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/1.928f, 420, 80);
		this.optionsButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/2.602f, 420, 80);
		this.updatesButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/3.927f, 420, 80);
		this.exitButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/8.0f, 420, 80);

		this.ButtonStage.addActor(this.newGameButton);
		this.ButtonStage.addActor(this.continueGameButton);
		this.ButtonStage.addActor(this.optionsButton);
		this.ButtonStage.addActor(this.updatesButton);
		this.ButtonStage.addActor(this.exitButton);
	}

	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		update(delta);

		super.camera.update();
		super.batch.setProjectionMatrix(super.camera.combined);
		super.camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		super.batch.begin();
		super.batch.draw(World.mainPicture, 0, 0);
		super.batch.end();

		this.ButtonStage.act(delta);
		
		super.batch.begin();
		super.batch.draw(World.darkButton, this.newGameButton.getX(), this.newGameButton.getY(), 420, 80);
		super.batch.draw(World.darkButton, this.continueGameButton.getX(), this.continueGameButton.getY(), 420, 80);
		super.batch.draw(World.darkButton, this.optionsButton.getX(), this.optionsButton.getY(), 420, 80);
		super.batch.draw(World.darkButton, this.updatesButton.getX(), this.updatesButton.getY(), 420, 80);
		super.batch.draw(World.darkButton, this.exitButton.getX(), this.exitButton.getY(), 420, 80);
		if(this.newGameButton.isOver()) {
			if(this.playedNewGameButton == false) {
				this.playedNewGameButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/1.5766f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/1.5766f);
			super.batch.draw(World.lightButton, this.newGameButton.getX(), this.newGameButton.getY(), this.newGameButton.getWidth(), this.newGameButton.getHeight());
		}else if(this.continueGameButton.isOver()) {
			if(this.playedContinueGameButton == false) {
				this.playedContinueGameButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/2.0f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/2.0f);
			super.batch.draw(World.lightButton, this.continueGameButton.getX(), this.continueGameButton.getY(), this.continueGameButton.getWidth(), this.newGameButton.getHeight());
		}else if(this.optionsButton.isOver()) {
			if(this.playedOptionsButton == false) {
				this.playedOptionsButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/2.7f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/2.7f);
			super.batch.draw(World.lightButton, this.optionsButton.getX(), this.optionsButton.getY(), this.optionsButton.getWidth(), this.optionsButton.getHeight());
		}else if(this.updatesButton.isOver()) {
			if(this.playedUpdatesButton == false) {
				this.playedUpdatesButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/4.153f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/4.153f);
			super.batch.draw(World.lightButton, this.updatesButton.getX(), this.updatesButton.getY(), this.updatesButton.getWidth(), this.updatesButton.getHeight());
		}else if(this.exitButton.isOver()) {
			if(this.playedExitButton == false) {
				this.playedExitButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/9.0f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/9.0f);
			super.batch.draw(World.lightButton, this.exitButton.getX(), this.exitButton.getY(), this.exitButton.getWidth(), this.exitButton.getHeight());
		}else {
			this.playedNewGameButton = false;
			this.playedContinueGameButton = false;
			this.playedOptionsButton = false;
			this.playedUpdatesButton = false;
			this.playedExitButton = false;
		}
		
		if(this.newGameButton.isPressed()) super.batch.draw(World.pressedButton, this.newGameButton.getX(), this.newGameButton.getY(), this.newGameButton.getWidth(), this.newGameButton.getHeight());
		if(this.continueGameButton.isPressed()) super.batch.draw(World.pressedButton, this.continueGameButton.getX(), this.continueGameButton.getY(), this.continueGameButton.getWidth(), this.continueGameButton.getHeight());
		if(this.optionsButton.isPressed()) super.batch.draw(World.pressedButton, this.optionsButton.getX(), this.optionsButton.getY(), this.optionsButton.getWidth(), this.optionsButton.getHeight());
		if(this.updatesButton.isPressed()) super.batch.draw(World.pressedButton, this.updatesButton.getX(), this.updatesButton.getY(), this.updatesButton.getWidth(), this.updatesButton.getHeight());
		if(this.exitButton.isPressed()) super.batch.draw(World.pressedButton, this.exitButton.getX(), this.updatesButton.getY(), this.updatesButton.getWidth(), this.updatesButton.getHeight());
		
		super.font.draw(super.batch, "NEW GAME", Gdx.graphics.getWidth()/2.1694f, Gdx.graphics.getHeight()/1.44f);
		super.font.draw(super.batch, "CONTINUE GAME", Gdx.graphics.getWidth()/2.2456f, Gdx.graphics.getHeight()/1.7704f);
		super.font.draw(super.batch, "OPTIONS", Gdx.graphics.getWidth()/2.1452f, Gdx.graphics.getHeight()/2.3225f);
		super.font.draw(super.batch, "UPDATES", Gdx.graphics.getWidth()/2.1452f, Gdx.graphics.getHeight()/3.323f);
		super.font.draw(super.batch, "EXIT", Gdx.graphics.getWidth()/2.0869f, Gdx.graphics.getHeight()/5.837f);
		super.font.draw(super.batch, "Version-Alpha", 1780, 25);
		super.batch.end();

		this.optionsButton.addListener(UIFactory.createListener(World.OptionsMenuScreen));

		if(this.exitButton.isPressed()) this.exit();
	}

	public void update(float dt) {
		this.stateTime += dt;

		// Texture region for the torch in the main menu
		this.torch = (TextureRegion) this.animatedTorch.getKeyFrame(this.stateTime, true);
	}

	@Override
	public void show() {
		//this.DeathIsAnotherPath.play();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}

	public void exit() {
		Gdx.app.exit();
	}
}

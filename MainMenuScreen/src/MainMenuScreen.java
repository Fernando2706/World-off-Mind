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
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class MainMenuScreen extends AbstractScreen{

	private Texture buttonLight, buttonDark, mainPicture;
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

		this.mainPicture = new Texture(Gdx.files.internal("MainMenuTextures/mainPicture.jpg"));
		this.buttonLight = new Texture(Gdx.files.internal("MainMenuTextures/buttonLight.png"));
		this.buttonDark = new Texture(Gdx.files.internal("MainMenuTextures/buttonDark.png"));
		
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
		this.DeathIsAnotherPath.setVolume(0.2f);
		this.DeathIsAnotherPath.setLooping(true);

		this.ButtonStage = new Stage();
		Gdx.input.setInputProcessor(this.ButtonStage);
	}

	@Override
	public void buildStage() {
		// Main menu buttons
		this.newGameButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));
		this.continueGameButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));
		this.optionsButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));
		this.updatesButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));
		this.exitButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));

		this.newGameButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/1.695f, 420, 200);
		this.newGameButton.getStyle().over = new TextureRegionDrawable(new TextureRegion(this.buttonLight));
		this.continueGameButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/2.175f, 420, 200);
		this.continueGameButton.getStyle().over = new TextureRegionDrawable(new TextureRegion(this.buttonLight));
		this.optionsButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/3.04f, 420, 200);
		this.optionsButton.getStyle().over = new TextureRegionDrawable(new TextureRegion(this.buttonLight));
		this.updatesButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/5.023f, 420, 200);
		this.updatesButton.getStyle().over = new TextureRegionDrawable(new TextureRegion(this.buttonLight));
		this.exitButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/14.4f, 420, 200);
		this.exitButton.getStyle().over = new TextureRegionDrawable(new TextureRegion(this.buttonLight));

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
		super.camera.setToOrtho(false, 1920, 1080);

		super.batch.begin();
		if(Gdx.graphics.isFullscreen()) {
			super.batch.draw(this.mainPicture, 0, 0);
		}
		super.batch.end();

		this.ButtonStage.act(delta);
		this.ButtonStage.draw();
		
		super.batch.begin();
		if(this.newGameButton.isOver()) {
			this.playedContinueGameButton = false;
			if(this.playedNewGameButton == false) {
				this.playedNewGameButton = true;
				super.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/1.5766f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/1.5766f);
		}else if(this.continueGameButton.isOver()) {
			this.playedNewGameButton = false;
			this.playedOptionsButton = false;
			if(this.playedContinueGameButton == false) {
				this.playedContinueGameButton = true;
				super.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/2.0f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/2.0f);
		}else if(this.optionsButton.isOver()) {
			this.playedContinueGameButton = false;
			this.playedUpdatesButton = false;
			if(this.playedOptionsButton == false) {
				this.playedOptionsButton = true;
				super.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/2.7f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/2.7f);
		}else if(this.updatesButton.isOver()) {
			this.playedOptionsButton = false;
			this.playedExitButton = false;
			if(this.playedUpdatesButton == false) {
				this.playedUpdatesButton = true;
				super.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/4.153f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/4.153f);
		}else if(this.exitButton.isOver()) {
			this.playedUpdatesButton = false;
			if(this.playedExitButton == false) {
				this.playedExitButton = true;
				super.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/9.0f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/9.0f);
		}else {
			this.playedNewGameButton = false;
			this.playedContinueGameButton = false;
			this.playedOptionsButton = false;
			this.playedUpdatesButton = false;
			this.playedExitButton = false;
		}
		super.font.draw(super.batch, "NEW GAME", Gdx.graphics.getWidth()/2.1694f, Gdx.graphics.getHeight()/1.44f);
		super.font.draw(super.batch, "CONTINUE GAME", Gdx.graphics.getWidth()/2.2456f, Gdx.graphics.getHeight()/1.7704f);
		super.font.draw(super.batch, "OPTIONS", Gdx.graphics.getWidth()/2.1452f, Gdx.graphics.getHeight()/2.3225f);
		super.font.draw(super.batch, "UPDATES", Gdx.graphics.getWidth()/2.1452f, Gdx.graphics.getHeight()/3.323f);
		super.font.draw(super.batch, "EXIT", Gdx.graphics.getWidth()/2.0869f, Gdx.graphics.getHeight()/5.837f);
		super.font.draw(super.batch, "Version-Alpha", 1780, 25);
		super.batch.end();

		this.optionsButton.addListener(UIFactory.createListener(ScreenEnum.OptionsMenuScreen));

		if(this.exitButton.isPressed()) this.exit();
	}

	public void update(float dt) {
		this.stateTime += dt;

		// Texture region for the torch in the main menu
		this.torch = (TextureRegion) this.animatedTorch.getKeyFrame(this.stateTime, true);
	}

	@Override
	public void show() {
		this.DeathIsAnotherPath.play();
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
		this.mainPicture.dispose();
		this.buttonLight.dispose();
		this.ButtonStage.dispose();
		this.DeathIsAnotherPath.stop();
		super.dispose();
	}

	public void exit() {
		Gdx.app.exit();
	}
}

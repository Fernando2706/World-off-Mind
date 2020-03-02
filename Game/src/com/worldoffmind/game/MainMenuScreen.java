package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class MainMenuScreen extends AbstractScreen {

	private Button startGameButton, optionsButton, achievementsButton, exitButton;
	private TextureRegion [] animatedTorchImages;
	private TextureRegion torch;
	private Animation<TextureRegion> animatedTorch;
	private float stateTime;
	private Stage ButtonStage;
	private Group buttonsGroup;
	public Music DeathIsAnotherPath;
	private boolean playedStartGameButton, playedOptionsButton, playedAchievementsButton, playedExitButton;

	public MainMenuScreen() {
		super.font.setColor(Color.GOLDENROD);
		super.font.getData().setScale(Gdx.graphics.getWidth()/1280f, Gdx.graphics.getHeight()/720f);
		
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
		
		this.DeathIsAnotherPath = Gdx.audio.newMusic(Gdx.files.internal("MainMenuTextures/Music/DeathIsJustAnotherPath.mp3"));
		this.DeathIsAnotherPath.setVolume(0.1f);
		this.DeathIsAnotherPath.setLooping(true);
		
		this.playedStartGameButton = false;
		this.playedOptionsButton = false;
		this.playedAchievementsButton = false;
		this.playedExitButton = false;
		
		this.ButtonStage = new Stage();
		this.buttonsGroup = new Group();
	}

	@Override
	public void buildStage() {
		Gdx.input.setInputProcessor(this.ButtonStage);
		
		// Main menu buttons
		this.startGameButton = new Button();
		this.optionsButton = new Button();
		this.achievementsButton = new Button();
		this.exitButton = new Button();

		this.startGameButton.setBounds(730, 560, Gdx.graphics.getWidth()/4.571f, Gdx.graphics.getHeight()/13.5f);
		this.optionsButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/2.602f, Gdx.graphics.getWidth()/4.571f, Gdx.graphics.getHeight()/13.5f);
		this.achievementsButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/3.927f, Gdx.graphics.getWidth()/4.571f, Gdx.graphics.getHeight()/13.5f);
		this.exitButton.setBounds(Gdx.graphics.getWidth()/2.62f, Gdx.graphics.getHeight()/8.0f, Gdx.graphics.getWidth()/4.571f, Gdx.graphics.getHeight()/13.5f);

		this.buttonsGroup.addActor(this.startGameButton);
		this.buttonsGroup.addActor(this.optionsButton);
		this.buttonsGroup.addActor(this.achievementsButton);
		this.buttonsGroup.addActor(this.exitButton);
		this.ButtonStage.setRoot(this.buttonsGroup);
	}

	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		update(delta);

		super.camera.update();
		super.batch.setProjectionMatrix(super.camera.combined);
		super.camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		this.ButtonStage.act(delta);
		
		super.batch.begin();
		super.batch.draw(World.mainPicture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		super.batch.draw(World.darkButton, this.startGameButton.getX(), this.startGameButton.getY(), this.startGameButton.getWidth(), this.startGameButton.getHeight());
		super.batch.draw(World.darkButton, this.optionsButton.getX(), this.optionsButton.getY(), this.optionsButton.getWidth(), this.optionsButton.getHeight());
		super.batch.draw(World.darkButton, this.achievementsButton.getX(), this.achievementsButton.getY(), this.achievementsButton.getWidth(), this.achievementsButton.getHeight());
		super.batch.draw(World.darkButton, this.exitButton.getX(), this.exitButton.getY(), this.exitButton.getWidth(), this.exitButton.getHeight());
		if(this.startGameButton.isOver()) {
			if(this.playedStartGameButton == false) {
				this.playedStartGameButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, 540, Gdx.graphics.getWidth()/21.57f, Gdx.graphics.getHeight()/7.2f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, 540, Gdx.graphics.getWidth()/21.57f, Gdx.graphics.getHeight()/7.2f);
			super.batch.draw(World.lightButton, this.startGameButton.getX(), this.startGameButton.getY(), this.startGameButton.getWidth(), this.startGameButton.getHeight());
		}else if(this.optionsButton.isOver()) {
			if(this.playedOptionsButton == false) {
				this.playedOptionsButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/2.7f, Gdx.graphics.getWidth()/21.57f, Gdx.graphics.getHeight()/7.2f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/2.7f, Gdx.graphics.getWidth()/21.57f, Gdx.graphics.getHeight()/7.2f);
			super.batch.draw(World.lightButton, this.optionsButton.getX(), this.optionsButton.getY(), this.optionsButton.getWidth(), this.optionsButton.getHeight());
		}else if(this.achievementsButton.isOver()) {
			if(this.playedAchievementsButton == false) {
				this.playedAchievementsButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/4.153f, Gdx.graphics.getWidth()/21.57f, Gdx.graphics.getHeight()/7.2f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/4.153f, Gdx.graphics.getWidth()/21.57f, Gdx.graphics.getHeight()/7.2f);
			super.batch.draw(World.lightButton, this.achievementsButton.getX(), this.achievementsButton.getY(), this.achievementsButton.getWidth(), this.achievementsButton.getHeight());
		}else if(this.exitButton.isOver()) {
			if(this.playedExitButton == false) {
				this.playedExitButton = true;
				World.clickSound.play();
			}
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/2.9767f, Gdx.graphics.getHeight()/9.0f, Gdx.graphics.getWidth()/21.57f, Gdx.graphics.getHeight()/7.2f);
			super.batch.draw(this.torch, Gdx.graphics.getWidth()/1.665f, Gdx.graphics.getHeight()/9.0f, Gdx.graphics.getWidth()/21.57f, Gdx.graphics.getHeight()/7.2f);
			super.batch.draw(World.lightButton, this.exitButton.getX(), this.exitButton.getY(), this.exitButton.getWidth(), this.exitButton.getHeight());
		}else {
			this.playedStartGameButton = false;
			this.playedOptionsButton = false;
			this.playedAchievementsButton = false;
			this.playedExitButton = false;
		}
		
		if(this.startGameButton.isPressed()) super.batch.draw(World.pressedButton, this.startGameButton.getX(), this.startGameButton.getY(), this.startGameButton.getWidth(), this.startGameButton.getHeight());
		if(this.optionsButton.isPressed()) super.batch.draw(World.pressedButton, this.optionsButton.getX(), this.optionsButton.getY(), this.optionsButton.getWidth(), this.optionsButton.getHeight());
		if(this.achievementsButton.isPressed()) super.batch.draw(World.pressedButton, this.achievementsButton.getX(), this.achievementsButton.getY(), this.achievementsButton.getWidth(), this.achievementsButton.getHeight());
		if(this.exitButton.isPressed()) {
			super.batch.draw(World.pressedButton, this.exitButton.getX(), this.exitButton.getY(), this.exitButton.getWidth(), this.exitButton.getHeight());
			this.exit();
		}
		
		super.font.draw(super.batch, "START GAME", 870, 610);
		super.font.draw(super.batch, "OPTIONS", Gdx.graphics.getWidth()/2.1452f, Gdx.graphics.getHeight()/2.3225f);
		super.font.draw(super.batch, "ACHIEVEMENTS", 860, 325);
		super.font.draw(super.batch, "EXIT", Gdx.graphics.getWidth()/2.0869f, Gdx.graphics.getHeight()/5.837f);
		super.font.draw(super.batch, "Version-Alpha", Gdx.graphics.getWidth()/1.0786f, Gdx.graphics.getHeight()/43.2f);
		super.batch.end();

		this.optionsButton.addListener(UIFactory.createListener(World.OptionsMenuScreen));
		this.startGameButton.addListener(UIFactory.createListener(World.StartGameScreen));
	}

	public void update(float dt) {
		this.stateTime += dt;

		this.torch = (TextureRegion) this.animatedTorch.getKeyFrame(this.stateTime, true);
	}

	@Override
	public void show() {
		//super.DeathIsAnotherPath.play();
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

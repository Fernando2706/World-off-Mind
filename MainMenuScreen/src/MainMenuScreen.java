package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class MainMenuScreen implements Screen{

	private final World game;
	private OrthographicCamera camera;
	private Texture buttonLight, buttonDark, mainPicture;
	private Stage Buttonstage;
	private Button newGameButton, continueGameButton, optionsButton, updatesButton, exitButton;
	Sprite one = new Sprite(new Texture(Gdx.files.internal("AnimatedTorch/darkTorch1.png")));
	private TextureRegion [] animatedTorchImages = {
			one,
			new Sprite(new Texture(Gdx.files.internal("AnimatedTorch/darkTorch2.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimatedTorch/darkTorch3.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimatedTorch/darkTorch4.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimatedTorch/darkTorch5.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimatedTorch/darkTorch6.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimatedTorch/darkTorch7.png")))
	};
	private TextureRegion torch;
	private Animation animatedTorch;
	private Music DeathIsAnotherPath;
	private Cursor cursor;
	private float stateTime;

	public MainMenuScreen(final World game) {
		this.game = game;

		this.camera = new OrthographicCamera();

		// Cursor
		this.cursor = Gdx.graphics.newCursor(new Pixmap(Gdx.files.internal("Cursor/dwarven_gauntlet.png")), 0, 0);
		Gdx.graphics.setCursor(this.cursor);

		this.mainPicture = new Texture(Gdx.files.internal("mainPicture.jpg"));
		this.buttonLight = new Texture(Gdx.files.internal("buttonLight.png"));
		this.buttonDark = new Texture(Gdx.files.internal("buttonDark.png"));
		this.animatedTorch = new Animation(0.15f, this.animatedTorchImages);

		// Stages
		this.Buttonstage = new Stage();
		Gdx.input.setInputProcessor(this.Buttonstage);

		// Main menu buttons
		this.newGameButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));
		this.continueGameButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));
		this.optionsButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));
		this.updatesButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));
		this.exitButton = new Button(new TextureRegionDrawable(new TextureRegion(this.buttonDark)));

		this.Buttonstage.addActor(this.newGameButton);
		this.Buttonstage.addActor(this.continueGameButton);
		this.Buttonstage.addActor(this.optionsButton);
		this.Buttonstage.addActor(this.updatesButton);
		this.Buttonstage.addActor(this.exitButton);

		// Music for the main menu
		this.DeathIsAnotherPath = Gdx.audio.newMusic(Gdx.files.internal("Music/DeathIsJustAnotherPath.mp3"));
		this.DeathIsAnotherPath.setVolume(0.3f);
		this.DeathIsAnotherPath.setLooping(true);
	}

	public void render(float delta) {
		float dt = Gdx.graphics.getDeltaTime();

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		update(dt);

		this.camera.update();
		this.game.batch.setProjectionMatrix(this.camera.combined);

		if(Gdx.graphics.isFullscreen()) {
			this.camera.setToOrtho(false, 1920, 1080);
			this.newGameButton.setBounds(735, 637, 420, 200);
			this.continueGameButton.setBounds(735, 497, 420, 200);
			this.optionsButton.setBounds(735, 355, 420, 200);
			this.updatesButton.setBounds(735, 215, 420, 200);
			this.exitButton.setBounds(735, 75, 420, 200);
		}

		this.game.batch.begin();
		if(Gdx.graphics.isFullscreen()) {
			this.game.batch.draw(this.mainPicture, 0, 0);
		}
		this.game.batch.end();

		this.Buttonstage.draw();
		this.Buttonstage.act();

		this.game.batch.begin();
		if(this.newGameButton.isOver()) {
			this.game.batch.draw(this.torch, 645, 685);
			this.game.batch.draw(this.torch, 1160, 685);
			this.game.batch.draw(this.buttonLight, 735, 637, 420, 200);
		}else if(this.continueGameButton.isOver()) {
			this.game.batch.draw(this.torch, 645, 540);
			this.game.batch.draw(this.torch, 1160, 540);
			this.game.batch.draw(this.buttonLight, 735, 497, 420, 200);
		}else if(this.optionsButton.isOver()) {
			this.game.batch.draw(this.torch, 645, 400);
			this.game.batch.draw(this.torch, 1160, 400);
			this.game.batch.draw(this.buttonLight, 735, 355, 420, 200);
		}else if(this.updatesButton.isOver()) {
			this.game.batch.draw(this.torch, 645, 260);
			this.game.batch.draw(this.torch, 1160, 260);
			this.game.batch.draw(this.buttonLight, 735, 215, 420, 200);
		}else if(this.exitButton.isOver()) {
			this.game.batch.draw(this.torch, 645, 120);
			this.game.batch.draw(this.torch, 1160, 120);
			this.game.batch.draw(this.buttonLight, 735, 75, 420, 200);
		}
		this.game.font.draw(this.game.batch, "NEW GAME", 890, 750);
		this.game.font.draw(this.game.batch, "CONTINUE GAME", 860, 610);
		this.game.font.draw(this.game.batch, "OPTIONS", 905, 465);
		this.game.font.draw(this.game.batch, "UPDATES", 905, 325);
		this.game.font.draw(this.game.batch, "EXIT", 930, 185);
		this.game.font.draw(this.game.batch, "Version-Alpha", 1830, 15);
		this.game.batch.end();
		
		if(this.exitButton.isPressed()) dispose();
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
		this.mainPicture.dispose();
		this.buttonLight.dispose();
		this.Buttonstage.dispose();
		this.DeathIsAnotherPath.dispose();
		this.cursor.dispose();
		this.game.dispose();
	}
}

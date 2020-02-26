package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class StartGameScreen extends AbstractScreen{

	private BitmapFont fontForNumbers, fontForTitle;
	private SpriteBatch batchForProfiles;
	private Stage buttonsStage;
	private Group buttonsGroup;
	private Button newGame1Button, newGame2Button, newGame3Button, newGame4Button, newGame5Button, backToMainMenuButton;
	private boolean backToMainMenuButtonPlayed, newGame1ButtonPlayed, newGame2ButtonPlayed, newGame3ButtonPlayed, newGame4ButtonPlayed, newGame5ButtonPlayed;

	public StartGameScreen() {
		super.font.setColor(Color.GOLDENROD);
		super.font.getData().setScale(Gdx.graphics.getWidth()/1280f, Gdx.graphics.getHeight()/720f);
		this.fontForNumbers = new BitmapFont();
		this.fontForNumbers.getData().setScale(3.5f, 3.5f);
		this.fontForTitle = new BitmapFont();
		this.fontForTitle.getData().setScale(5.0f, 5.0f);
		
		this.batchForProfiles = new SpriteBatch();
		this.batchForProfiles.setColor(1, 1, 1, 0.2f);

		this.backToMainMenuButtonPlayed = false;
		this.newGame1ButtonPlayed = false;
		this.newGame2ButtonPlayed = false;
		this.newGame3ButtonPlayed = false;
		this.newGame4ButtonPlayed = false;
		this.newGame5ButtonPlayed = false;

		this.buttonsGroup = new Group();
		this.buttonsStage = new Stage();
	}

	@Override
	public void buildStage() {
		Gdx.input.setInputProcessor(this.buttonsStage);

		this.newGame1Button = new Button();
		this.newGame2Button = new Button();
		this.newGame3Button = new Button();
		this.newGame4Button = new Button();
		this.newGame5Button = new Button();
		this.backToMainMenuButton = new Button();

		this.newGame1Button.setBounds(400, 750, 800, 100);
		this.newGame2Button.setBounds(400, 600, 800, 100);
		this.newGame3Button.setBounds(400, 450, 800, 100);
		this.newGame4Button.setBounds(400, 300, 800, 100);
		this.newGame5Button.setBounds(400, 150, 800, 100);
		this.backToMainMenuButton.setBounds(880, 25, 200, 50);

		this.buttonsGroup.addActor(this.newGame1Button);
		this.buttonsGroup.addActor(this.newGame2Button);
		this.buttonsGroup.addActor(this.newGame3Button);
		this.buttonsGroup.addActor(this.newGame4Button);
		this.buttonsGroup.addActor(this.newGame5Button);
		this.buttonsGroup.addActor(this.backToMainMenuButton);
		this.buttonsStage.setRoot(this.buttonsGroup);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		super.camera.update();
		super.batch.setProjectionMatrix(super.camera.combined);
		super.camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		this.buttonsStage.act(delta);
		
		super.batch.begin();
		super.batch.draw(World.mainPicture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		super.batch.end();
		
		this.batchForProfiles.begin();
		if(this.newGame1Button.isOver()) this.batchForProfiles.draw(World.thirdBackFrame, this.newGame1Button.getX(), this.newGame1Button.getY(), this.newGame1Button.getWidth(), this.newGame1Button.getHeight());
		if(this.newGame2Button.isOver()) this.batchForProfiles.draw(World.thirdBackFrame, this.newGame2Button.getX(), this.newGame2Button.getY(), this.newGame2Button.getWidth(), this.newGame2Button.getHeight());
		if(this.newGame3Button.isOver()) this.batchForProfiles.draw(World.thirdBackFrame, this.newGame3Button.getX(), this.newGame3Button.getY(), this.newGame3Button.getWidth(), this.newGame3Button.getHeight());
		if(this.newGame4Button.isOver()) this.batchForProfiles.draw(World.thirdBackFrame, this.newGame4Button.getX(), this.newGame4Button.getY(), this.newGame4Button.getWidth(), this.newGame4Button.getHeight());
		if(this.newGame5Button.isOver()) this.batchForProfiles.draw(World.thirdBackFrame, this.newGame5Button.getX(), this.newGame5Button.getY(), this.newGame5Button.getWidth(), this.newGame5Button.getHeight());
		this.batchForProfiles.end();

		super.batch.begin();
		this.fontForTitle.draw(super.batch, "SELECT PROFILE", 660, 1000);
		
		if(this.newGame1Button.isOver()) {
			if(this.newGame1ButtonPlayed == false) {
				World.clickSound.play();
				this.newGame1ButtonPlayed = true;
			}
			super.batch.draw(World.leftMarker, 260, 780, 40, 40);
			super.batch.draw(World.rightMarker, 1240, 780, 40, 40);
		}else if(this.newGame2Button.isOver()) {
			if(this.newGame2ButtonPlayed == false) {
				World.clickSound.play();
				this.newGame2ButtonPlayed = true;
			}
			super.batch.draw(World.leftMarker, 260, 630, 40, 40);
			super.batch.draw(World.rightMarker, 1240, 630, 40, 40);
		}else if(this.newGame3Button.isOver()) {
			if(this.newGame3ButtonPlayed == false) {
				World.clickSound.play();
				this.newGame3ButtonPlayed = true;
			}
			super.batch.draw(World.leftMarker, 260, 480, 40, 40);
			super.batch.draw(World.rightMarker, 1240, 480, 40, 40);
		}else if(this.newGame4Button.isOver()) {
			if(this.newGame4ButtonPlayed == false) {
				World.clickSound.play();
				this.newGame4ButtonPlayed = true;
			}
			super.batch.draw(World.leftMarker, 260, 330, 40, 40);
			super.batch.draw(World.rightMarker, 1240, 330, 40, 40);
		}else if(this.newGame5Button.isOver()) {
			if(this.newGame5ButtonPlayed == false) {
				World.clickSound.play();
				this.newGame5ButtonPlayed = true;
			}
			super.batch.draw(World.leftMarker, 260, 180, 40, 40);
			super.batch.draw(World.rightMarker, 1240, 180, 40, 40);
		}else {
			this.newGame1ButtonPlayed = false;
			this.newGame2ButtonPlayed = false;
			this.newGame3ButtonPlayed = false;
			this.newGame4ButtonPlayed = false;
			this.newGame5ButtonPlayed = false;
		}
		
		this.fontForNumbers.draw(super.batch, "1.", 340, 820);
		this.fontForNumbers.draw(super.batch, "2.", 340, 670);
		this.fontForNumbers.draw(super.batch, "3.", 340, 520);
		this.fontForNumbers.draw(super.batch, "4.", 340, 370);
		this.fontForNumbers.draw(super.batch, "5.", 340, 220);
		this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 820);
		this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 670);
		this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 520);
		this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 370);
		this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 220);
		super.batch.draw(World.bottomLittleFrame, 340, 870, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 720, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 570, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 420, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 270, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 120, 860, 5);

		super.batch.draw(World.darkButton, this.backToMainMenuButton.getX(), this.backToMainMenuButton.getY(), this.backToMainMenuButton.getWidth(), this.backToMainMenuButton.getHeight());
		if(this.backToMainMenuButton.isOver()) {
			if(this.backToMainMenuButtonPlayed == false) {
				World.clickSound.play();
				this.backToMainMenuButtonPlayed = true;
			}
			super.batch.draw(World.lightButton, this.backToMainMenuButton.getX(), this.backToMainMenuButton.getY(), this.backToMainMenuButton.getWidth(), this.backToMainMenuButton.getHeight());
		}else {
			this.backToMainMenuButtonPlayed = false;
		}
		super.font.draw(super.batch, "BACK", 950, 60);
		super.batch.end();
		
		this.backToMainMenuButton.addListener(UIFactory.createListener(World.MainMenuScreen));
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
}

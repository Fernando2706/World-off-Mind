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

	private BitmapFont fontForNumbers, fontForTitle, fontUpperTitle, fontToAsk, fontToAskUpper;
	private SpriteBatch batchForProfiles;
	private Stage buttonsStage;
	private Group buttonsGroup;

	private Button newGame1Button, newGame2Button, newGame3Button, newGame4Button, newGame5Button, backToMainMenuButton, deleteGame1Button, deleteGame2Button, deleteGame3Button, deleteGame4Button, deleteGame5Button,
	askToDeleteGame1YesButton, askToDeleteGame1NoButton, askToDeleteGame2YesButton, askToDeleteGame2NoButton, askToDeleteGame3YesButton, askToDeleteGame3NoButton, askToDeleteGame4YesButton,
	askToDeleteGame4NoButton, askToDeleteGame5YesButton, askToDeleteGame5NoButton;

	private boolean backToMainMenuButtonPlayed, newGame1ButtonPlayed, newGame2ButtonPlayed, newGame3ButtonPlayed, newGame4ButtonPlayed, newGame5ButtonPlayed, game1Started, game2Started, game3Started, game4Started,
	game5Started, deleteGame1ButtonPressed, deleteGame1ButtonPlayed, deleteGame2ButtonPressed, deleteGame2ButtonPlayed, deleteGame3ButtonPressed, deleteGame3ButtonPlayed, deleteGame4ButtonPressed, deleteGame4ButtonPlayed,
	deleteGame5ButtonPressed, deleteGame5ButtonPlayed, askToDeleteGame1YesButtonPlayed, askToDeleteGame1NoButtonPlayed, askToDeleteGame2YesButtonPlayed, askToDeleteGame2NoButtonPlayed, askToDeleteGame3YesButtonPlayed,
	askToDeleteGame3NoButtonPlayed, askToDeleteGame4YesButtonPlayed, askToDeleteGame4NoButtonPlayed, askToDeleteGame5YesButtonPlayed, askToDeleteGame5NoButtonPlayed;

	public StartGameScreen() {
		super.font.setColor(Color.GOLDENROD);
		super.font.getData().setScale(Gdx.graphics.getWidth()/1280f, Gdx.graphics.getHeight()/720f);
		this.fontForNumbers = new BitmapFont();
		this.fontForNumbers.getData().setScale(3.5f, 3.5f);
		this.fontForTitle = new BitmapFont();
		this.fontForTitle.getData().setScale(5.0f, 5.0f);
		this.fontUpperTitle = new BitmapFont();
		this.fontUpperTitle.getData().setScale(3.9f, 3.9f);
		this.fontToAsk = new BitmapFont();
		this.fontToAsk.getData().setScale(2.5f, 2.5f);
		this.fontToAskUpper = new BitmapFont();
		this.fontToAskUpper.getData().setScale(2.8f, 2.8f);

		this.batchForProfiles = new SpriteBatch();
		this.batchForProfiles.setColor(1, 1, 1, 0.2f);

		this.backToMainMenuButtonPlayed = false;
		this.newGame1ButtonPlayed = false;
		this.newGame2ButtonPlayed = false;
		this.newGame3ButtonPlayed = false;
		this.newGame4ButtonPlayed = false;
		this.newGame5ButtonPlayed = false;
		this.deleteGame1ButtonPlayed = false;
		this.deleteGame2ButtonPlayed = false;
		this.deleteGame3ButtonPlayed = false;
		this.deleteGame4ButtonPlayed = false;
		this.deleteGame5ButtonPlayed = false;
		this.askToDeleteGame1YesButtonPlayed = false;
		this.askToDeleteGame1NoButtonPlayed = false;
		this.askToDeleteGame2YesButtonPlayed = false;
		this.askToDeleteGame2NoButtonPlayed = false;
		this.askToDeleteGame3YesButtonPlayed = false;
		this.askToDeleteGame3NoButtonPlayed = false;
		this.askToDeleteGame4YesButtonPlayed = false;
		this.askToDeleteGame4NoButtonPlayed = false;
		this.askToDeleteGame5YesButtonPlayed = false;
		this.askToDeleteGame5NoButtonPlayed = false;

		this.deleteGame1ButtonPressed = false;
		this.deleteGame2ButtonPressed = false;
		this.deleteGame3ButtonPressed = false;
		this.deleteGame4ButtonPressed = false;
		this.deleteGame5ButtonPressed = false;

		this.game1Started = false;
		this.game2Started = false;
		this.game3Started = false;
		this.game4Started = false;
		this.game5Started = false;

		this.buttonsGroup = new Group();
		this.buttonsStage = new Stage();
	}

	@Override
	public void buildStage() {
		this.deleteGame1ButtonPressed = false;
		this.deleteGame2ButtonPressed = false;
		this.deleteGame3ButtonPressed = false;
		this.deleteGame4ButtonPressed = false;
		this.deleteGame5ButtonPressed = false;
		
		Gdx.input.setInputProcessor(this.buttonsStage);

		this.newGame1Button = new Button();
		this.newGame2Button = new Button();
		this.newGame3Button = new Button();
		this.newGame4Button = new Button();
		this.newGame5Button = new Button();
		this.backToMainMenuButton = new Button();
		this.deleteGame1Button = new Button();
		this.deleteGame2Button = new Button();
		this.deleteGame3Button = new Button();
		this.deleteGame4Button = new Button();
		this.deleteGame5Button = new Button();
		this.askToDeleteGame1YesButton = new Button();
		this.askToDeleteGame1NoButton = new Button();
		this.askToDeleteGame2YesButton = new Button();
		this.askToDeleteGame2NoButton = new Button();
		this.askToDeleteGame3YesButton = new Button();
		this.askToDeleteGame3NoButton = new Button();
		this.askToDeleteGame4YesButton = new Button();
		this.askToDeleteGame4NoButton = new Button();
		this.askToDeleteGame5YesButton = new Button();
		this.askToDeleteGame5NoButton = new Button();

		this.newGame1Button.setBounds(400, 750, 800, 100);
		this.newGame2Button.setBounds(400, 600, 800, 100);
		this.newGame3Button.setBounds(400, 450, 800, 100);
		this.newGame4Button.setBounds(400, 300, 800, 100);
		this.newGame5Button.setBounds(400, 150, 800, 100);
		this.backToMainMenuButton.setBounds(880, 25, 200, 50);
		this.deleteGame1Button.setBounds(1395, 775, 365, 50);
		this.deleteGame2Button.setBounds(1395, 625, 365, 50);
		this.deleteGame3Button.setBounds(1395, 475, 365, 50);
		this.deleteGame4Button.setBounds(1395, 325, 365, 50);
		this.deleteGame5Button.setBounds(1395, 175, 365, 50);
		this.askToDeleteGame1YesButton.setBounds(1490, 730, 70, 30);
		this.askToDeleteGame1NoButton.setBounds(1620, 730, 50, 30);
		this.askToDeleteGame2YesButton.setBounds(1490, 580, 70, 30);
		this.askToDeleteGame2NoButton.setBounds(1620, 580, 50, 30);
		this.askToDeleteGame3YesButton.setBounds(1490, 430, 70, 30);
		this.askToDeleteGame3NoButton.setBounds(1620, 430, 50, 30);
		this.askToDeleteGame4YesButton.setBounds(1490, 280, 70, 30);
		this.askToDeleteGame4NoButton.setBounds(1620, 280, 50, 30);
		this.askToDeleteGame5YesButton.setBounds(1490, 130, 70, 30);
		this.askToDeleteGame5NoButton.setBounds(1620, 130, 50, 30);

		this.buttonsGroup.addActor(this.newGame1Button);
		this.buttonsGroup.addActor(this.newGame2Button);
		this.buttonsGroup.addActor(this.newGame3Button);
		this.buttonsGroup.addActor(this.newGame4Button);
		this.buttonsGroup.addActor(this.newGame5Button);
		this.buttonsGroup.addActor(this.backToMainMenuButton);
		this.buttonsGroup.addActor(this.deleteGame1Button);
		this.buttonsGroup.addActor(this.deleteGame2Button);
		this.buttonsGroup.addActor(this.deleteGame3Button);
		this.buttonsGroup.addActor(this.deleteGame4Button);
		this.buttonsGroup.addActor(this.deleteGame5Button);
		this.buttonsGroup.addActor(this.askToDeleteGame1YesButton);
		this.buttonsGroup.addActor(this.askToDeleteGame1NoButton);
		this.buttonsGroup.addActor(this.askToDeleteGame2YesButton);
		this.buttonsGroup.addActor(this.askToDeleteGame2NoButton);
		this.buttonsGroup.addActor(this.askToDeleteGame3YesButton);
		this.buttonsGroup.addActor(this.askToDeleteGame3NoButton);
		this.buttonsGroup.addActor(this.askToDeleteGame4YesButton);
		this.buttonsGroup.addActor(this.askToDeleteGame4NoButton);
		this.buttonsGroup.addActor(this.askToDeleteGame5YesButton);
		this.buttonsGroup.addActor(this.askToDeleteGame5NoButton);
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
		super.batch.draw(World.bottomLittleFrame, 340, 870, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 720, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 570, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 420, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 270, 860, 5);
		super.batch.draw(World.bottomLittleFrame, 340, 120, 860, 5);

		if(this.newGame1Button.isPressed()) this.game1Started = true;
		if(this.newGame2Button.isPressed()) this.game2Started = true;
		if(this.newGame3Button.isPressed()) this.game3Started = true;
		if(this.newGame4Button.isPressed()) this.game4Started = true;
		if(this.newGame5Button.isPressed()) this.game5Started = true;

		if(this.game1Started == true) {
			if(this.deleteGame1Button.isPressed()) {
				this.deleteGame1ButtonPressed = true;
				this.deleteGame2ButtonPressed = false;
				this.deleteGame3ButtonPressed = false;
				this.deleteGame4ButtonPressed = false;
				this.deleteGame5ButtonPressed = false;
			}
			if(this.deleteGame1ButtonPressed == true) {
				this.fontForNumbers.draw(super.batch, "ARE YOU SURE?", 1390, 820);

				if(this.askToDeleteGame1YesButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "YES", 1490, 760);
					if(this.askToDeleteGame1YesButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame1YesButtonPlayed = true;
					}
				}else{
					this.askToDeleteGame1YesButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "YES", 1490, 760);
				}
				if(this.askToDeleteGame1YesButton.isPressed()) {
					this.game1Started = false;
					this.deleteGame1ButtonPressed = false;
				}

				if(this.askToDeleteGame1NoButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "NO", 1620, 760);
					if(this.askToDeleteGame1NoButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame1NoButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame1NoButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "NO", 1620, 760);
				}
				if(this.askToDeleteGame1NoButton.isPressed()) {
					this.deleteGame1ButtonPressed = false;
				}
			}else {
				if(this.deleteGame1Button.isOver()) {
					this.fontUpperTitle.draw(super.batch, "DELETE GAME", 1390, 820);
					if(this.deleteGame1ButtonPlayed == false) {
						World.clickSound.play();
						this.deleteGame1ButtonPlayed = true;
					}
				}else {
					this.fontForNumbers.draw(super.batch, "DELETE GAME", 1400, 820);
					this.deleteGame1ButtonPlayed = false;
				}
			}
		}else {
			this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 820);
		}

		if(this.game2Started == true) {
			if(this.deleteGame2Button.isPressed()) {
				this.deleteGame1ButtonPressed = false;
				this.deleteGame2ButtonPressed = true;
				this.deleteGame3ButtonPressed = false;
				this.deleteGame4ButtonPressed = false;
				this.deleteGame5ButtonPressed = false;
			}
			if(this.deleteGame2ButtonPressed == true) {
				this.fontForNumbers.draw(super.batch, "ARE YOU SURE?", 1390, 670);

				if(this.askToDeleteGame2YesButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "YES", 1490, 610);
					if(this.askToDeleteGame2YesButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame2YesButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame2YesButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "YES", 1490, 610);
				}
				if(this.askToDeleteGame2YesButton.isPressed()) {
					this.game2Started = false;
					this.deleteGame2ButtonPressed = false;
				}
				
				if(this.askToDeleteGame2NoButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "NO", 1620, 610);
					if(this.askToDeleteGame2NoButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame2NoButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame2NoButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "NO", 1620, 610);
				}
				if(this.askToDeleteGame2NoButton.isPressed()) {
					this.deleteGame2ButtonPressed = false;
				}
			}else {
				if(this.deleteGame2Button.isOver()) {
					this.fontUpperTitle.draw(super.batch, "DELETE GAME", 1390, 670);
					if(this.deleteGame2ButtonPlayed == false) {
						World.clickSound.play();
						this.deleteGame2ButtonPlayed = true;
					}
				}else {
					this.fontForNumbers.draw(super.batch, "DELETE GAME", 1400, 670);
					this.deleteGame2ButtonPlayed = false;
				}
			}
		}else {
			this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 670);
		}

		if(this.game3Started == true) {
			if(this.deleteGame3Button.isPressed()) {
				this.deleteGame1ButtonPressed = false;
				this.deleteGame2ButtonPressed = false;
				this.deleteGame3ButtonPressed = true;
				this.deleteGame4ButtonPressed = false;
				this.deleteGame5ButtonPressed = false;
			}
			if(this.deleteGame3ButtonPressed == true) {
				this.fontForNumbers.draw(super.batch, "ARE YOU SURE?", 1390, 520);
				
				if(this.askToDeleteGame3YesButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "YES", 1490, 460);
					if(this.askToDeleteGame3YesButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame3YesButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame3YesButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "YES", 1490, 460);
				}
				if(this.askToDeleteGame3YesButton.isPressed()) {
					this.game3Started = false;
					this.deleteGame3ButtonPressed = false;
				}
				
				if(this.askToDeleteGame3NoButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "NO", 1620, 460);
					if(this.askToDeleteGame3NoButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame3NoButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame3NoButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "NO", 1620, 460);
				}
				if(this.askToDeleteGame3NoButton.isPressed()) {
					this.deleteGame3ButtonPressed = false;
				}
			}else {
				if(this.deleteGame3Button.isOver()) {
					this.fontUpperTitle.draw(super.batch, "DELETE GAME", 1390, 520);
					if(this.deleteGame3ButtonPlayed == false) {
						World.clickSound.play();
						this.deleteGame3ButtonPlayed = true;
					}
				}else {
					this.fontForNumbers.draw(super.batch, "DELETE GAME", 1400, 520);
					this.deleteGame3ButtonPlayed = false;
				}
			}
		}else{
			this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 520);
		}

		if(this.game4Started == true) {
			if(this.deleteGame4Button.isPressed()) {
				this.deleteGame1ButtonPressed = false;
				this.deleteGame2ButtonPressed = false;
				this.deleteGame3ButtonPressed = false;
				this.deleteGame4ButtonPressed = true;
				this.deleteGame5ButtonPressed = false;
			}
			if(this.deleteGame4ButtonPressed == true) {
				this.fontForNumbers.draw(super.batch, "ARE YOU SURE?", 1390, 370);
				
				if(this.askToDeleteGame4YesButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "YES", 1490, 310);
					if(this.askToDeleteGame4YesButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame4YesButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame4YesButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "YES", 1490, 310);
				}
				if(this.askToDeleteGame4YesButton.isPressed()) {
					this.game4Started = false;
					this.deleteGame4ButtonPressed = false;
				}
				
				if(this.askToDeleteGame4NoButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "NO", 1620, 310);
					if(this.askToDeleteGame4NoButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame4NoButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame4NoButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "NO", 1620, 310);
				}
				if(this.askToDeleteGame4NoButton.isPressed()) {
					this.deleteGame4ButtonPressed = false;
				}
			}else {
				if(this.deleteGame4Button.isOver()) {
					this.fontUpperTitle.draw(super.batch, "DELETE GAME", 1390, 370);
					if(this.deleteGame4ButtonPlayed == false) {
						World.clickSound.play();
						this.deleteGame4ButtonPlayed = true;
					}
				}else {
					this.fontForNumbers.draw(super.batch, "DELETE GAME", 1400, 370);
					this.deleteGame4ButtonPlayed = false;
				}
			}
		}else {
			this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 370);
		}

		if(this.game5Started == true) {
			if(this.deleteGame5Button.isPressed()) {
				this.deleteGame1ButtonPressed = false;
				this.deleteGame2ButtonPressed = false;
				this.deleteGame3ButtonPressed = false;
				this.deleteGame4ButtonPressed = false;
				this.deleteGame5ButtonPressed = true;
			}
			if(this.deleteGame5ButtonPressed == true) {
				this.fontForNumbers.draw(super.batch, "ARE YOU SURE?", 1390, 220);
				
				if(this.askToDeleteGame5YesButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "YES", 1490, 160);
					if(this.askToDeleteGame5YesButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame5YesButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame5YesButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "YES", 1490, 160);
				}
				if(this.askToDeleteGame5YesButton.isPressed()) {
					this.game5Started = false;
					this.deleteGame5ButtonPressed = false;
				}
				
				if(this.askToDeleteGame5NoButton.isOver()) {
					this.fontToAskUpper.draw(super.batch, "NO", 1620, 160);
					if(this.askToDeleteGame5NoButtonPlayed == false) {
						World.clickSound.play();
						this.askToDeleteGame5NoButtonPlayed = true;
					}
				}else {
					this.askToDeleteGame5NoButtonPlayed = false;
					this.fontToAsk.draw(super.batch, "NO", 1620, 160);
				}
				if(this.askToDeleteGame5NoButton.isPressed()) {
					this.deleteGame5ButtonPressed = false;
				}
			}else {
				if(this.deleteGame5Button.isOver()) {
					this.fontUpperTitle.draw(super.batch, "DELETE GAME", 1390, 220);
					if(this.deleteGame5ButtonPlayed == false) {
						World.clickSound.play();
						this.deleteGame5ButtonPlayed = true;
					}
				}else {
					this.fontForNumbers.draw(super.batch, "DELETE GAME", 1400, 220);
					this.deleteGame5ButtonPlayed = false;
				}
			}
		}else {
			this.fontForNumbers.draw(super.batch, "NEW GAME", 480, 220);
		}

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
		this.newGame1Button.addListener(UIFactory.createGameListener(World.ForestOfSoulsScreen));
		this.newGame2Button.addListener(UIFactory.createGameListener(World.ForestOfSoulsScreen));
		this.newGame3Button.addListener(UIFactory.createGameListener(World.ForestOfSoulsScreen));
		this.newGame4Button.addListener(UIFactory.createGameListener(World.ForestOfSoulsScreen));
		this.newGame5Button.addListener(UIFactory.createGameListener(World.ForestOfSoulsScreen));
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

	public boolean getGame1Started() {
		return game1Started;
	}

	public void setGame1Started(boolean game1Started) {
		this.game1Started = game1Started;
	}

	public boolean getGame2Started() {
		return game2Started;
	}

	public void setGame2Started(boolean game2Started) {
		this.game2Started = game2Started;
	}

	public boolean getGame3Started() {
		return game3Started;
	}

	public void setGame3Started(boolean game3Started) {
		this.game3Started = game3Started;
	}

	public boolean getGame4Started() {
		return game4Started;
	}

	public void setGame4Started(boolean game4Started) {
		this.game4Started = game4Started;
	}

	public boolean getGame5Started() {
		return game5Started;
	}

	public void setGame5Started(boolean game5Started) {
		this.game5Started = game5Started;
	}
}

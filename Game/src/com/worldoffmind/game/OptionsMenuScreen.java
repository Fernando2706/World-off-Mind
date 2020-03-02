package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class OptionsMenuScreen extends AbstractScreen{

	private Texture checkBox, checkedBox, downButton, pressedDownButton, upButton,
					pressedUpButton, leftLittleConection, rightLittleConection, smallTextBoxBorderless, scrollBar, scrollButtonTexture;

	private Stage buttonsStage;
	private Group buttonsGroup;

	private Button videoButton, audioButton, gameButton, shortCutButton, initialConfigurationButton, applyButton, cancelButton, acceptButton, backMainMenuButton,
				   lockCursorButton, VSyncButton, biggerCursorButton, activateAndDeactivateAllSounds, activateAndDeactivateMusic,
				   showLanguagesButton, chooseEnglishButton, chooseSpanishButton, showMonitorsButton, chooseFullScreenButton, chooseWindowedFullScreenButton;
	
	public static Button scrollFPSButton, scrollMasterAudioButton, scrollEffectsAudioButton, scrollEnvironmentalAudioButton, scrollMusicAudioButton;

	private boolean videoButtonPlayed, audioButtonPlayed, gameButtonPlayed, shortCutButtonPlayed, initialConfigurationButtonPlayed, applyButtonPlayed, cancelButtonPlayed, acceptButtonPlayed,
					backMainMenuButtonPlayed, videoButtonPressed, audioButtonPressed, gameButtonPressed, shortCutButtonPressed, lockCursorButtonPressedOneTime,
					lockCursorButtonPlayed, VSyncButtonPressedOneTime, VSyncButtonPlayed, biggerCursorButtonPressed, biggerCursorButtonPressedOneTime, biggerCursorButtonPlayed, activateAndDeactivateAllSoundsPressed,
					activateAndDeactivateAllSoundsPressedOneTime, activateAndDeactivateAllSoundsPlayed, activateAndDeactivateMusicPressed, activateAndDeactivateMusicPressedOneTime, activateAndDeactivateMusicPlayed,
					showLanguagesButtonPressed, showLanguagesButtonPressedOneTime, showLanguagesButtonPlayed, chooseEnglishButtonPressed, chooseEnglishButtonPlayed,
					chooseSpanishButtonPressed, chooseSpanishButtonPlayed, showMonitorsButtonPressed, showMonitorsButtonPressedOneTime, showMonitorsButtonPlayed, chooseFullScreenButtonPressed,
					chooseFullScreenButtonPlayed, chooseWindowedFullScreenButtonPressed, chooseWindowedFullScreenButtonPlayed;
	
	public static boolean lockCursorButtonPressed, VSyncButtonPressed;

	private float floatMasterVolume, floatEffectsVolume, floatEnvironmentalVolume, floatMusicVolume, floatFPS;
	private String choosedLanguage, choosedMonitor;
	private BitmapFont fontForShortCuts, fontForShortCutsNames;

	public OptionsMenuScreen() {

		super.font.setColor(Color.GOLDENROD);
		super.font.getData().setScale(Gdx.graphics.getWidth()/1280f, Gdx.graphics.getHeight()/720f);
		
		this.fontForShortCuts = new BitmapFont();
		this.fontForShortCuts.setColor(Color.WHITE);
		this.fontForShortCuts.getData().setScale(1.3f, 1.3f);
		
		this.fontForShortCutsNames = new BitmapFont();
		this.fontForShortCutsNames.setColor(Color.GOLDENROD);
		this.fontForShortCutsNames.getData().setScale(1.1f, 1.1f);

		this.checkBox = new Texture(Gdx.files.internal("OptionsMenuTextures/checkButton.png"));
		this.checkedBox = new Texture(Gdx.files.internal("OptionsMenuTextures/checkedButton.png"));
		this.downButton = new Texture(Gdx.files.internal("OptionsMenuTextures/downButton.png"));
		this.pressedDownButton = new Texture(Gdx.files.internal("OptionsMenuTextures/pressedDownButton.png"));
		this.upButton = new Texture(Gdx.files.internal("OptionsMenuTextures/upButton.png"));
		this.pressedUpButton = new Texture(Gdx.files.internal("OptionsMenuTextures/pressedUpButton.png"));
		this.leftLittleConection = new Texture(Gdx.files.internal("OptionsMenuTextures/leftLittleConection.png"));
		this.rightLittleConection = new Texture(Gdx.files.internal("OptionsMenuTextures/rightLittleConection.png"));
		this.smallTextBoxBorderless = new Texture(Gdx.files.internal("OptionsMenuTextures/smallTextBoxBorderless.png"));
		this.scrollBar = new Texture(Gdx.files.internal("OptionsMenuTextures/scrollBar.png"));
		this.scrollButtonTexture = new Texture(Gdx.files.internal("OptionsMenuTextures/scrollButton.png"));

		this.videoButtonPlayed = false;
		this.audioButtonPlayed = false;
		this.gameButtonPlayed = false;
		this.shortCutButtonPlayed = false;
		this.initialConfigurationButtonPlayed = false;
		this.applyButtonPlayed = false;
		this.cancelButtonPlayed = false;
		this.acceptButtonPlayed = false;
		this.lockCursorButtonPlayed = false;
		this.VSyncButtonPlayed = false;
		this.biggerCursorButtonPlayed = false;
		this.activateAndDeactivateAllSoundsPlayed = false;
		this.activateAndDeactivateMusicPlayed = false;
		this.showLanguagesButtonPlayed = false;
		this.chooseEnglishButtonPlayed = false;
		this.chooseSpanishButtonPlayed = false;
		this.showMonitorsButtonPlayed = false;
		this.chooseFullScreenButtonPlayed = false;
		this.chooseWindowedFullScreenButtonPlayed = false;

		this.videoButtonPressed = true;
		this.audioButtonPressed = false;
		this.gameButtonPressed = false;
		this.shortCutButtonPressed = false;
		lockCursorButtonPressed = false;
		this.lockCursorButtonPressedOneTime = false;
		VSyncButtonPressed = false;
		this.VSyncButtonPressedOneTime = false;
		this.biggerCursorButtonPressed = false;
		this.biggerCursorButtonPressedOneTime = false;
		this.activateAndDeactivateAllSoundsPressed = false;
		this.activateAndDeactivateAllSoundsPressedOneTime = false;
		this.activateAndDeactivateMusicPressed = false;
		this.activateAndDeactivateMusicPressedOneTime = false;
		this.showLanguagesButtonPressed = false;
		this.showLanguagesButtonPressedOneTime = false;
		this.chooseEnglishButtonPressed = true;
		this.chooseSpanishButtonPressed = false;
		this.showMonitorsButtonPressed = false;
		this.showMonitorsButtonPressedOneTime = false;
		this.chooseFullScreenButtonPressed = true;
		this.chooseWindowedFullScreenButtonPressed = false;

		this.floatFPS = 0f;
		this.floatMasterVolume = 0f;
		this.floatEffectsVolume = 0f;
		this.floatEnvironmentalVolume = 0f;
		this.floatMusicVolume = 0f;
		
		this.choosedLanguage = "English";
		this.choosedMonitor = "Full screen";

		this.buttonsStage = new Stage();
		this.buttonsGroup = new Group();
	}

	@Override
	public void buildStage() {
		Gdx.input.setInputProcessor(this.buttonsStage);

		this.videoButton = new Button();
		this.audioButton = new Button();
		this.gameButton = new Button();
		this.shortCutButton = new Button();
		this.initialConfigurationButton = new Button();
		this.applyButton = new Button();
		this.cancelButton = new Button();
		this.acceptButton = new Button();
		this.backMainMenuButton = new Button();
		this.lockCursorButton = new Button();
		this.VSyncButton = new Button();
		this.biggerCursorButton = new Button();
		this.activateAndDeactivateAllSounds = new Button();
		this.activateAndDeactivateMusic = new Button();
		this.showLanguagesButton = new Button();
		this.chooseEnglishButton = new Button();
		this.chooseSpanishButton = new Button();
		this.showMonitorsButton = new Button();
		this.chooseFullScreenButton = new Button();
		this.chooseWindowedFullScreenButton = new Button();
		scrollFPSButton = new Button();
		scrollMasterAudioButton = new Button();
		scrollEffectsAudioButton = new Button();
		scrollEnvironmentalAudioButton = new Button();
		scrollMusicAudioButton = new Button();

		this.videoButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/1.317f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.audioButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/1.4594f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.gameButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/1.6362f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.shortCutButton.setBounds(290, 580, 350, 80);
		this.initialConfigurationButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.cancelButton.setBounds(Gdx.graphics.getWidth()/2.6666f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.applyButton.setBounds(Gdx.graphics.getWidth()/1.873f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.acceptButton.setBounds(Gdx.graphics.getWidth()/1.4436f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.backMainMenuButton.setBounds(Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.lockCursorButton.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/1.5f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.VSyncButton.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/1.6875f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.biggerCursorButton.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/1.9285f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.activateAndDeactivateAllSounds.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/2.8421f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.activateAndDeactivateMusic.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/3.375f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.showLanguagesButton.setBounds(Gdx.graphics.getWidth()/1.99999f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/38.4f, Gdx.graphics.getHeight()/21.6f);
		this.chooseEnglishButton.setBounds(Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.46938f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
		this.chooseSpanishButton.setBounds(Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
		this.showMonitorsButton.setBounds(Gdx.graphics.getWidth()/1.99999f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/38.4f, Gdx.graphics.getHeight()/21.6f);
		this.chooseFullScreenButton.setBounds(Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.46938f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
		this.chooseWindowedFullScreenButton.setBounds(Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
		scrollFPSButton.setBounds(847, 425, 25, 40);
		scrollMasterAudioButton.setBounds(847, 785, 25, 40);
		scrollEffectsAudioButton.setBounds(847, 675, 25, 40);
		scrollEnvironmentalAudioButton.setBounds(847, 565, 25, 40);
		scrollMusicAudioButton.setBounds(847, 455, 25, 40);

		this.buttonsGroup.addActor(this.videoButton);
		this.buttonsGroup.addActor(this.audioButton);
		this.buttonsGroup.addActor(this.gameButton);
		this.buttonsGroup.addActor(this.shortCutButton);
		this.buttonsGroup.addActor(this.initialConfigurationButton);
		this.buttonsGroup.addActor(this.cancelButton);
		this.buttonsGroup.addActor(this.applyButton);
		this.buttonsGroup.addActor(this.acceptButton);
		this.buttonsGroup.addActor(this.backMainMenuButton);
		this.buttonsGroup.addActor(this.lockCursorButton);
		this.buttonsGroup.addActor(this.VSyncButton);
		this.buttonsGroup.addActor(this.biggerCursorButton);
		this.buttonsGroup.addActor(this.activateAndDeactivateAllSounds);
		this.buttonsGroup.addActor(this.activateAndDeactivateMusic);
		this.buttonsGroup.addActor(this.showLanguagesButton);
		this.buttonsGroup.addActor(this.chooseEnglishButton);
		this.buttonsGroup.addActor(this.chooseSpanishButton);
		this.buttonsGroup.addActor(this.showMonitorsButton);
		this.buttonsGroup.addActor(this.chooseFullScreenButton);
		this.buttonsGroup.addActor(this.chooseWindowedFullScreenButton);
		this.buttonsGroup.addActor(scrollFPSButton);
		this.buttonsGroup.addActor(scrollMasterAudioButton);
		this.buttonsGroup.addActor(scrollEffectsAudioButton);
		this.buttonsGroup.addActor(scrollEnvironmentalAudioButton);
		this.buttonsGroup.addActor(scrollMusicAudioButton);
		this.buttonsStage.setRoot(this.buttonsGroup);
	}
	
	private void reiniciateTableStates() {
		this.showLanguagesButtonPressed = false;
		this.showLanguagesButtonPressedOneTime = false;
		this.showMonitorsButtonPressed = false;
		this.showMonitorsButtonPressedOneTime = false;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		super.camera.update();
		super.batch.setProjectionMatrix(super.camera.combined);
		super.camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		this.buttonsStage.act(delta);

		super.batch.begin();
		super.batch.draw(World.mainPicture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		super.batch.draw(World.bottomFrame, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/9f, Gdx.graphics.getWidth()/1.3521f, Gdx.graphics.getHeight()/36f);
		super.batch.draw(World.topframe, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/1.1675f, Gdx.graphics.getWidth()/1.3521f, Gdx.graphics.getHeight()/36f);
		super.batch.draw(World.leftFrame, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/8.64f, Gdx.graphics.getWidth()/64f, Gdx.graphics.getHeight()/1.3012f);
		super.batch.draw(World.rightFrame, Gdx.graphics.getWidth()/1.1707f, Gdx.graphics.getHeight()/8.64f, Gdx.graphics.getWidth()/64f, Gdx.graphics.getHeight()/1.3012f);
		super.batch.draw(World.topLeftFrame, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/1.1675f, Gdx.graphics.getWidth()/64f, Gdx.graphics.getHeight()/36f);
		super.batch.draw(World.topRightFrame, Gdx.graphics.getWidth()/1.1707f, Gdx.graphics.getHeight()/1.1675f, Gdx.graphics.getWidth()/64f, Gdx.graphics.getHeight()/36f);
		super.batch.draw(World.bottomLeftFrame, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/9f, Gdx.graphics.getWidth()/64f, Gdx.graphics.getHeight()/36f);
		super.batch.draw(World.bottomRightFrame, Gdx.graphics.getWidth()/1.1707f, Gdx.graphics.getHeight()/9f, Gdx.graphics.getWidth()/64f, Gdx.graphics.getHeight()/36f);
		super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/6.857f, Gdx.graphics.getHeight()/7.2f, Gdx.graphics.getWidth()/1.4117f, Gdx.graphics.getHeight()/1.3935f);
		super.batch.draw(World.rightFrame, Gdx.graphics.getWidth()/2.9538f, Gdx.graphics.getHeight()/4.32f, Gdx.graphics.getWidth()/64f, Gdx.graphics.getHeight()/1.6488f);
		super.batch.draw(World.bottomFrame, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/4.32f, Gdx.graphics.getWidth()/1.3521f, Gdx.graphics.getHeight()/36f);
		super.batch.draw(World.topConection, Gdx.graphics.getWidth()/3.127f, Gdx.graphics.getHeight()/1.2162f, Gdx.graphics.getWidth()/18.823f, Gdx.graphics.getHeight()/16.119f);
		super.batch.draw(World.bottomConection, Gdx.graphics.getWidth()/3.127f, Gdx.graphics.getHeight()/4.32f, Gdx.graphics.getWidth()/18.823f, Gdx.graphics.getHeight()/16.119f);
		super.batch.draw(World.leftConection, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/5.0467f, Gdx.graphics.getWidth()/28.656f, Gdx.graphics.getHeight()/10.588f);
		super.batch.draw(World.rightConection, Gdx.graphics.getWidth()/1.1977f, Gdx.graphics.getHeight()/5.0467f, Gdx.graphics.getWidth()/28.656f, Gdx.graphics.getHeight()/10.588f);
		super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/6.857f, Gdx.graphics.getHeight()/3.8571f, Gdx.graphics.getWidth()/5.1891f, Gdx.graphics.getHeight()/1.6744f);
		super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.8235f, Gdx.graphics.getHeight()/3.8571f, Gdx.graphics.getWidth()/2f, Gdx.graphics.getHeight()/1.6744f);
		super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/6.857f, Gdx.graphics.getHeight()/7.2f, Gdx.graphics.getWidth()/1.4117f, Gdx.graphics.getHeight()/10.8f);
		super.batch.draw(World.titleButton, Gdx.graphics.getWidth()/2.4935f, Gdx.graphics.getHeight()/1.2f, Gdx.graphics.getWidth()/4.5714f, Gdx.graphics.getHeight()/13.5f);
		super.batch.draw(World.darkButton, this.videoButton.getX(), this.videoButton.getY(), this.videoButton.getWidth(), this.videoButton.getHeight());
		super.batch.draw(World.darkButton, this.audioButton.getX(), this.audioButton.getY(), this.audioButton.getWidth(), this.audioButton.getHeight());
		super.batch.draw(World.darkButton, this.gameButton.getX(), this.gameButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());
		super.batch.draw(World.darkButton, this.shortCutButton.getX(), this.shortCutButton.getY(), this.shortCutButton.getWidth(), this.shortCutButton.getHeight());
		super.batch.draw(World.darkButton, this.initialConfigurationButton.getX(), this.initialConfigurationButton.getY(), this.initialConfigurationButton.getWidth(), this.initialConfigurationButton.getHeight());
		super.batch.draw(World.darkButton, this.cancelButton.getX(), this.cancelButton.getY(), this.cancelButton.getWidth(), this.cancelButton.getHeight());
		super.batch.draw(World.darkButton, this.applyButton.getX(), this.applyButton.getY(), this.applyButton.getWidth(), this.applyButton.getHeight());
		super.batch.draw(World.darkButton, this.acceptButton.getX(), this.acceptButton.getY(), this.acceptButton.getWidth(), this.acceptButton.getHeight());
		super.batch.draw(World.darkButton, this.backMainMenuButton.getX(), this.backMainMenuButton.getY(), this.backMainMenuButton.getWidth(), this.backMainMenuButton.getHeight());

		if(this.videoButton.isOver()) {
			super.batch.draw(World.lightButton, this.videoButton.getX(), this.videoButton.getY(), this.videoButton.getWidth(), this.videoButton.getHeight());
			this.audioButtonPlayed = false;
			if(this.videoButtonPlayed == false && this.videoButtonPressed == false) {
				this.videoButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.audioButton.isOver()) {
			super.batch.draw(World.lightButton, this.audioButton.getX(), this.audioButton.getY(), this.audioButton.getWidth(), this.audioButton.getHeight());
			this.videoButtonPlayed = false;
			this.gameButtonPlayed = false;
			if(this.audioButtonPlayed == false && this.audioButtonPressed == false) {
				this.audioButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.gameButton.isOver()) {
			super.batch.draw(World.lightButton, this.gameButton.getX(), this.gameButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());
			this.audioButtonPlayed = false;
			this.shortCutButtonPlayed = false;
			if(this.gameButtonPlayed == false && this.gameButtonPressed == false) {
				this.gameButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.shortCutButton.isOver()) {
			super.batch.draw(World.lightButton, this.shortCutButton.getX(), this.shortCutButton.getY(), this.shortCutButton.getWidth(), this.shortCutButton.getHeight());
			this.gameButtonPlayed = false;
			if(this.shortCutButtonPlayed == false && this.shortCutButtonPressed == false) {
				this.shortCutButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.initialConfigurationButton.isOver()) {
			super.batch.draw(World.lightButton, this.initialConfigurationButton.getX(), this.initialConfigurationButton.getY(), this.initialConfigurationButton.getWidth(), this.initialConfigurationButton.getHeight());
			if(this.initialConfigurationButtonPlayed == false) {
				this.initialConfigurationButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.cancelButton.isOver()) {
			super.batch.draw(World.lightButton, this.cancelButton.getX(), this.cancelButton.getY(), this.cancelButton.getWidth(), this.cancelButton.getHeight());
			this.applyButtonPlayed = false;
			if(this.cancelButtonPlayed == false) {
				this.cancelButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.applyButton.isOver()) {
			super.batch.draw(World.lightButton, this.applyButton.getX(), this.applyButton.getY(), this.applyButton.getWidth(), this.applyButton.getHeight());
			this.cancelButtonPlayed = false;
			this.acceptButtonPlayed = false;
			if(this.applyButtonPlayed == false) {
				this.applyButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.acceptButton.isOver()) {
			super.batch.draw(World.lightButton, this.acceptButton.getX(), this.acceptButton.getY(), this.acceptButton.getWidth(), this.acceptButton.getHeight());
			this.applyButtonPlayed = false;
			if(this.acceptButtonPlayed == false) {
				this.acceptButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.backMainMenuButton.isOver()) {
			super.batch.draw(World.lightButton, this.backMainMenuButton.getX(), this.backMainMenuButton.getY(), this.backMainMenuButton.getWidth(), this.backMainMenuButton.getHeight());
			if(this.backMainMenuButtonPlayed == false) {
				this.backMainMenuButtonPlayed = true;
				World.clickSound.play();
			}
		}else {
			this.videoButtonPlayed = false;
			this.audioButtonPlayed = false;
			this.gameButtonPlayed = false;
			this.shortCutButtonPlayed = false;
			this.initialConfigurationButtonPlayed = false;
			this.cancelButtonPlayed = false;
			this.applyButtonPlayed = false;
			this.acceptButtonPlayed = false;
			this.backMainMenuButtonPlayed = false;
		}

		if(this.videoButton.isPressed()) {
			this.videoButtonPressed = true;
			this.audioButtonPressed = false;
			this.gameButtonPressed = false;
			this.shortCutButtonPressed = false;
			this.reiniciateTableStates();
		}else if(this.audioButton.isPressed()) {
			this.videoButtonPressed = false;
			this.audioButtonPressed = true;
			this.gameButtonPressed = false;
			this.shortCutButtonPressed = false;
			this.reiniciateTableStates();
		}else if(this.gameButton.isPressed()) {
			this.videoButtonPressed = false;
			this.audioButtonPressed = false;
			this.gameButtonPressed = true;
			this.shortCutButtonPressed = false;
			this.reiniciateTableStates();
		}else if(this.shortCutButton.isPressed()) {
			this.videoButtonPressed = false;
			this.audioButtonPressed = false;
			this.gameButtonPressed = false;
			this.shortCutButtonPressed = true;
			this.reiniciateTableStates();
		}

		if(this.videoButtonPressed == true) {
			this.buttonsStage.getRoot().removeActor(this.showLanguagesButton);
			this.buttonsStage.getRoot().removeActor(this.chooseEnglishButton);
			this.buttonsStage.getRoot().removeActor(this.chooseSpanishButton);
			this.buttonsGroup.addActor(this.showMonitorsButton);
			
			super.batch.draw(World.pressedButton, this.videoButton.getX(), this.videoButton.getY(), this.videoButton.getWidth(), this.videoButton.getHeight());
			
			super.batch.draw(this.checkBox, this.lockCursorButton.getX(), this.lockCursorButton.getY(), this.lockCursorButton.getWidth(), this.lockCursorButton.getHeight());
			if(this.lockCursorButton.isPressed()) {
				if(this.lockCursorButtonPressedOneTime == true) lockCursorButtonPressed = false;
				else lockCursorButtonPressed = true;
			}else if(!this.lockCursorButton.isPressed()) {
				if(lockCursorButtonPressed == true) this.lockCursorButtonPressedOneTime = true;
				else this.lockCursorButtonPressedOneTime = false;
			}
			if(lockCursorButtonPressed == true) super.batch.draw(this.checkedBox, this.lockCursorButton.getX(), this.lockCursorButton.getY(), this.lockCursorButton.getWidth()+4, this.lockCursorButton.getHeight());
			if(this.lockCursorButton.isPressed() && this.lockCursorButtonPlayed == false) {
				World.clickSound.play();
				this.lockCursorButtonPlayed = true;
			}else if(!this.lockCursorButton.isPressed()) this.lockCursorButtonPlayed = false;
			super.font.draw(super.batch, "Lock the cursor", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/1.4496f);
			
			super.font.draw(super.batch, "Monitor", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2313f);
			super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/18.0f);
			super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2781f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/1.9009f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/18.0f);
			super.batch.draw(World.topLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.3012f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.topRightLittleFrame, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.3012f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/21.6f);
			if(this.showMonitorsButton.isPressed()) {
				if(this.showMonitorsButtonPressedOneTime == true) this.showMonitorsButtonPressed = false;
				else this.showMonitorsButtonPressed = true;
			}else if(!this.showMonitorsButton.isPressed()) {
				if(this.showMonitorsButtonPressed == true) this.showMonitorsButtonPressedOneTime = true;
				else this.showMonitorsButtonPressedOneTime = false;
			}
			if((this.showMonitorsButtonPressed == true && this.showMonitorsButtonPressedOneTime == true) || (this.showMonitorsButtonPressed == false && this.showMonitorsButtonPressedOneTime == true)) {
				this.buttonsGroup.addActor(this.chooseFullScreenButton);
				this.buttonsGroup.addActor(this.chooseWindowedFullScreenButton);
				
				super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/9.0f);
				super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/216f);
				super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/1.9009f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/9.0f);
				super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.47945f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/216f);
				super.batch.draw(this.leftLittleConection, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.39354f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/30.85f);
				super.batch.draw(this.leftLittleConection, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.51048f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/30.85f);
				super.batch.draw(this.rightLittleConection, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.39354f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/30.85f);
				super.batch.draw(this.rightLittleConection, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.51048f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/30.85f);
				super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
				super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
				super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/21.6f);
				super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.46938f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
				super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
				if(this.chooseFullScreenButton.isOver()) {
					this.chooseWindowedFullScreenButtonPlayed = false;
					super.batch.draw(World.secondBackFrame, this.chooseFullScreenButton.getX(), this.chooseFullScreenButton.getY(), this.chooseFullScreenButton.getWidth(), this.chooseFullScreenButton.getHeight());
					if(this.chooseFullScreenButtonPlayed == false) {
						World.clickSound.play();
						this.chooseFullScreenButtonPlayed = true;
					}
				}else if(this.chooseWindowedFullScreenButton.isOver()) {
					this.chooseFullScreenButtonPlayed = false;
					super.batch.draw(World.secondBackFrame, this.chooseWindowedFullScreenButton.getX(), this.chooseWindowedFullScreenButton.getY(), this.chooseWindowedFullScreenButton.getWidth(), this.chooseWindowedFullScreenButton.getHeight());
					if(this.chooseWindowedFullScreenButtonPlayed == false) {
						World.clickSound.play();
						this.chooseWindowedFullScreenButtonPlayed = true;
					}
				}else {
					this.chooseFullScreenButtonPlayed = false;
					this.chooseWindowedFullScreenButtonPlayed = false;
				}
				if(this.chooseFullScreenButton.isPressed()) {
					this.chooseFullScreenButtonPressed = true;
					this.chooseWindowedFullScreenButtonPressed = false;
					this.choosedMonitor = "Full screen";
				}
				else if(this.chooseWindowedFullScreenButton.isPressed()) {
					this.chooseWindowedFullScreenButtonPressed = true;
					this.chooseFullScreenButtonPressed = false;
					this.choosedMonitor = "Windowed(Full screen)";
				}
				if(this.chooseFullScreenButtonPressed == true) super.batch.draw(World.secondBackFrame, this.chooseFullScreenButton.getX(), this.chooseFullScreenButton.getY(), this.chooseFullScreenButton.getWidth(), this.chooseFullScreenButton.getHeight());
				else if(this.chooseWindowedFullScreenButtonPressed == true) super.batch.draw(World.secondBackFrame, this.chooseWindowedFullScreenButton.getX(), this.chooseWindowedFullScreenButton.getY(), this.chooseWindowedFullScreenButton.getWidth(), this.chooseWindowedFullScreenButton.getHeight());
				super.font.draw(super.batch, "Full screen", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.40259f);
				super.font.draw(super.batch, "Windowed(Full screen)", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.52112f);
			}else {
				this.buttonsStage.getRoot().removeActor(this.chooseFullScreenButton);
				this.buttonsStage.getRoot().removeActor(this.chooseWindowedFullScreenButton);
			}
			super.batch.draw(this.smallTextBoxBorderless, Gdx.graphics.getWidth()/1.99999f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/38.4f, Gdx.graphics.getHeight()/21.6f);
			if(this.showMonitorsButtonPressed == false && this.showMonitorsButtonPressedOneTime == false) {
				super.batch.draw(this.downButton, this.showMonitorsButton.getX()+Gdx.graphics.getWidth()/192f, this.showMonitorsButton.getY()+Gdx.graphics.getHeight()/108f, this.showMonitorsButton.getWidth()/1.5f, this.showMonitorsButton.getHeight()/1.5f);
			}else if(this.showMonitorsButtonPressed == true && this.showMonitorsButtonPressedOneTime == false) {
				super.batch.draw(this.pressedDownButton, this.showMonitorsButton.getX()+Gdx.graphics.getWidth()/192f, this.showMonitorsButton.getY()+Gdx.graphics.getHeight()/108f, this.showMonitorsButton.getWidth()/1.5f, this.showMonitorsButton.getHeight()/1.5f);
			}else if(this.showMonitorsButtonPressed == true && this.showMonitorsButtonPressedOneTime == true) {
				super.batch.draw(this.upButton, this.showMonitorsButton.getX()+Gdx.graphics.getWidth()/192f, this.showMonitorsButton.getY()+Gdx.graphics.getHeight()/108f, this.showMonitorsButton.getWidth()/1.5f, this.showMonitorsButton.getHeight()/1.5f);
			}else if(this.showMonitorsButtonPressed == false && this.showMonitorsButtonPressedOneTime == true) {
				super.batch.draw(this.pressedUpButton, this.showMonitorsButton.getX()+Gdx.graphics.getWidth()/192f, this.showMonitorsButton.getY()+Gdx.graphics.getHeight()/108f, this.showMonitorsButton.getWidth()/1.5f, this.showMonitorsButton.getHeight()/1.5f);
			}
			if(this.showMonitorsButton.isPressed() && this.showMonitorsButtonPlayed == false) {
				World.clickSound.play();
				this.showMonitorsButtonPlayed = true;
			}else if(!this.showMonitorsButton.isPressed()) this.showMonitorsButtonPlayed = false;
			super.font.draw(super.batch, this.choosedMonitor, Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.3012f);

			super.batch.draw(this.checkBox, this.VSyncButton.getX(), this.VSyncButton.getY(), this.VSyncButton.getWidth(), this.VSyncButton.getHeight());
			if(this.VSyncButton.isPressed()) {
				if(this.VSyncButtonPressedOneTime == true) VSyncButtonPressed = false;
				else VSyncButtonPressed = true;
			}else if(!this.VSyncButton.isPressed()) {
				if(VSyncButtonPressed == true) this.VSyncButtonPressedOneTime = true;
				else this.VSyncButtonPressedOneTime = false;
			}
			if(VSyncButtonPressed == true) super.batch.draw(this.checkedBox, this.VSyncButton.getX(), this.VSyncButton.getY(), this.VSyncButton.getWidth()+4, this.VSyncButton.getHeight());
			if(this.VSyncButton.isPressed() && this.VSyncButtonPlayed == false) {
				World.clickSound.play();
				this.VSyncButtonPlayed = true;
			}else if(!this.VSyncButton.isPressed()) this.VSyncButtonPlayed = false;
			super.font.draw(super.batch, "Vertical Sync", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/1.624f);

			super.batch.draw(this.checkBox, this.biggerCursorButton.getX(), this.biggerCursorButton.getY(), this.biggerCursorButton.getWidth(), this.biggerCursorButton.getHeight());
			if(this.biggerCursorButton.isPressed()) {
				if(this.biggerCursorButtonPressedOneTime == true) this.biggerCursorButtonPressed = false;
				else this.biggerCursorButtonPressed = true;
			}else if(!this.biggerCursorButton.isPressed()) {
				if(this.biggerCursorButtonPressed == true) this.biggerCursorButtonPressedOneTime = true;
				else this.biggerCursorButtonPressedOneTime = false;
			}
			if(this.biggerCursorButtonPressed == true) super.batch.draw(this.checkedBox, this.biggerCursorButton.getX(), this.biggerCursorButton.getY(), this.biggerCursorButton.getWidth()+4, this.biggerCursorButton.getHeight());
			if(this.biggerCursorButton.isPressed() && this.biggerCursorButtonPlayed == false) {
				World.clickSound.play();
				this.biggerCursorButtonPlayed = true;
			}else if(!this.biggerCursorButton.isPressed()) this.biggerCursorButtonPlayed = false;
			super.font.draw(super.batch, "Bigger cursor", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/1.8461f);

			super.font.draw(super.batch, "Max FPS:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.1176f);
			if(scrollFPSButton.getX() >= 995) scrollFPSButton.setPosition(995, 425);
			if(scrollFPSButton.getX() <= 700) scrollFPSButton.setPosition(700, 425);
			super.batch.draw(this.scrollBar, 710, 440, 300, 10);
			super.batch.draw(this.scrollButtonTexture, scrollFPSButton.getX(), scrollFPSButton.getY(), scrollFPSButton.getWidth(), scrollFPSButton.getHeight());
			this.floatFPS = ((scrollFPSButton.getX() - 698) * 120f) / 296f;
			super.font.draw(super.batch, String.valueOf(Math.round(this.floatFPS)), Gdx.graphics.getWidth()/2.3703f, Gdx.graphics.getHeight()/2.1259f);
		}else if(this.audioButtonPressed == true) {
			this.buttonsStage.getRoot().removeActor(this.showLanguagesButton);
			this.buttonsStage.getRoot().removeActor(this.showMonitorsButton);
			
			super.batch.draw(World.pressedButton, this.audioButton.getX(), this.audioButton.getY(), this.audioButton.getWidth(), this.audioButton.getHeight());
			
			super.font.draw(super.batch, "Master audio:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2413f);
			if(scrollMasterAudioButton.getX() >= 995) scrollMasterAudioButton.setPosition(995, 785);
			if(scrollMasterAudioButton.getX() <= 700) scrollMasterAudioButton.setPosition(700, 785);
			super.batch.draw(this.scrollBar, 710, 800, 300, 10);
			super.batch.draw(this.scrollButtonTexture, scrollMasterAudioButton.getX(), scrollMasterAudioButton.getY(), scrollMasterAudioButton.getWidth(), scrollMasterAudioButton.getHeight());
			this.floatMasterVolume = ((scrollMasterAudioButton.getX() - 700) * 100f) / 296f;
			super.font.draw(super.batch, String.valueOf(Math.round(this.floatMasterVolume)), Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/1.2442f);

			super.font.draw(super.batch, "Effects audio:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.421f);
			if(scrollEffectsAudioButton.getX() >= 995) scrollEffectsAudioButton.setPosition(995, 675);
			if(scrollEffectsAudioButton.getX() <= 700) scrollEffectsAudioButton.setPosition(700, 675);
			super.batch.draw(this.scrollBar, 710, 690, 300, 10);
			super.batch.draw(this.scrollButtonTexture, scrollEffectsAudioButton.getX(), scrollEffectsAudioButton.getY(), scrollEffectsAudioButton.getWidth(), scrollEffectsAudioButton.getHeight());
			this.floatEffectsVolume = ((scrollEffectsAudioButton.getX() - 700) * 100f) / 296f;
			super.font.draw(super.batch, String.valueOf(Math.round(this.floatEffectsVolume)), Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/1.4248f);
			
			super.font.draw(super.batch, "Environmental audio:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.6615f);
			if(scrollEnvironmentalAudioButton.getX() >= 995) scrollEnvironmentalAudioButton.setPosition(995, 565);
			if(scrollEnvironmentalAudioButton.getX() <= 700) scrollEnvironmentalAudioButton.setPosition(700, 565);
			super.batch.draw(this.scrollBar, 710, 580, 300, 10);
			super.batch.draw(this.scrollButtonTexture, scrollEnvironmentalAudioButton.getX(), scrollEnvironmentalAudioButton.getY(), scrollEnvironmentalAudioButton.getWidth(), scrollEnvironmentalAudioButton.getHeight());
			this.floatEnvironmentalVolume = ((scrollEnvironmentalAudioButton.getX() - 700) * 100f) / 296f;
			super.font.draw(super.batch, String.valueOf(Math.round(this.floatEnvironmentalVolume)), Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/1.6666f);

			super.font.draw(super.batch, "Music audio:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2f);
			if(scrollMusicAudioButton.getX() >= 995) scrollMusicAudioButton.setPosition(995, 455);
			if(scrollMusicAudioButton.getX() <= 700) scrollMusicAudioButton.setPosition(700, 455);
			super.batch.draw(this.scrollBar, 710, 470, 300, 10);
			super.batch.draw(this.scrollButtonTexture, scrollMusicAudioButton.getX(), scrollMusicAudioButton.getY(), scrollMusicAudioButton.getWidth(), scrollMusicAudioButton.getHeight());
			this.floatMusicVolume = ((scrollMusicAudioButton.getX() - 700) * 100f) / 296f;
			super.font.draw(super.batch, String.valueOf(Math.round(this.floatMusicVolume)), Gdx.graphics.getWidth()/2.2588f, Gdx.graphics.getHeight()/2.0074f);

			super.batch.draw(this.checkBox, this.activateAndDeactivateAllSounds.getX(), this.activateAndDeactivateAllSounds.getY(), this.activateAndDeactivateAllSounds.getWidth(), this.activateAndDeactivateAllSounds.getHeight());
			if(this.activateAndDeactivateAllSounds.isPressed()) {
				if(this.activateAndDeactivateAllSoundsPressedOneTime == true) this.activateAndDeactivateAllSoundsPressed = false;
				else this.activateAndDeactivateAllSoundsPressed = true;
			}else if(!this.activateAndDeactivateAllSounds.isPressed()) {
				if(this.activateAndDeactivateAllSoundsPressed == true) this.activateAndDeactivateAllSoundsPressedOneTime = true;
				else this.activateAndDeactivateAllSoundsPressedOneTime = false;
			}
			if(activateAndDeactivateAllSoundsPressed == true) super.batch.draw(this.checkedBox, this.activateAndDeactivateAllSounds.getX(), this.activateAndDeactivateAllSounds.getY(), this.activateAndDeactivateAllSounds.getWidth()+4, this.activateAndDeactivateAllSounds.getHeight());
			if(this.activateAndDeactivateAllSounds.isPressed() && this.activateAndDeactivateAllSoundsPlayed == false) {
				World.clickSound.play();
				this.activateAndDeactivateAllSoundsPlayed = true;
			}else if(!this.activateAndDeactivateAllSounds.isPressed()) this.activateAndDeactivateAllSoundsPlayed = false;
			super.font.draw(super.batch, "Deactivate all game sounds", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/2.6666f);

			super.batch.draw(this.checkBox, this.activateAndDeactivateMusic.getX(), this.activateAndDeactivateMusic.getY(), this.activateAndDeactivateMusic.getWidth(), this.activateAndDeactivateMusic.getHeight());
			if(this.activateAndDeactivateMusic.isPressed()) {
				if(this.activateAndDeactivateMusicPressedOneTime == true) this.activateAndDeactivateMusicPressed = false;
				else this.activateAndDeactivateMusicPressed = true;
			}else if(!this.activateAndDeactivateMusic.isPressed()) {
				if(this.activateAndDeactivateMusicPressed == true) this.activateAndDeactivateMusicPressedOneTime = true;
				else this.activateAndDeactivateMusicPressedOneTime = false;
			}
			if(activateAndDeactivateMusicPressed == true) super.batch.draw(this.checkedBox, this.activateAndDeactivateMusic.getX(), this.activateAndDeactivateMusic.getY(), this.activateAndDeactivateMusic.getWidth()+4, this.activateAndDeactivateMusic.getHeight());
			if(this.activateAndDeactivateMusic.isPressed() && this.activateAndDeactivateMusicPlayed == false) {
				World.clickSound.play();
				this.activateAndDeactivateMusicPlayed = true;
			}else if(!this.activateAndDeactivateMusic.isPressed()) this.activateAndDeactivateMusicPlayed = false;
			super.font.draw(super.batch, "Deactivate music game", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/3.1304f);
		}else if(this.gameButtonPressed == true) {
			this.buttonsStage.getRoot().removeActor(this.showMonitorsButton);
			this.buttonsStage.getRoot().removeActor(this.chooseFullScreenButton);
			this.buttonsStage.getRoot().removeActor(this.chooseWindowedFullScreenButton);
			this.buttonsGroup.addActor(this.showLanguagesButton);
			this.buttonsGroup.addActor(this.chooseEnglishButton);
			this.buttonsGroup.addActor(this.chooseSpanishButton);
			
			super.batch.draw(World.pressedButton, this.gameButton.getX(), this.gameButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());
			super.font.draw(super.batch, "Language selection", Gdx.graphics.getWidth()/2.7042f, 880);
			super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/18.0f);
			super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2781f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/1.9009f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/18.0f);
			super.batch.draw(World.topLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.3012f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.topRightLittleFrame, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.3012f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.36708f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/21.6f);
			if(this.showLanguagesButton.isPressed()) {
				if(this.showLanguagesButtonPressedOneTime == true) this.showLanguagesButtonPressed = false;
				else this.showLanguagesButtonPressed = true;
			}else if(!this.showLanguagesButton.isPressed()) {
				if(this.showLanguagesButtonPressed == true) this.showLanguagesButtonPressedOneTime = true;
				else this.showLanguagesButtonPressedOneTime = false;
			}
			if((this.showLanguagesButtonPressed == true && this.showLanguagesButtonPressedOneTime == true) || (this.showLanguagesButtonPressed == false && this.showLanguagesButtonPressedOneTime == true)) {
				super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/9.0f);
				super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/216f);
				super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/1.9009f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/9.0f);
				super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.47945f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/216f);
				super.batch.draw(this.leftLittleConection, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.39354f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/30.85f);
				super.batch.draw(this.leftLittleConection, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.51048f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/30.85f);
				super.batch.draw(this.rightLittleConection, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.39354f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/30.85f);
				super.batch.draw(this.rightLittleConection, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.51048f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/30.85f);
				super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
				super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.61194f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
				super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/21.6f);
				super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.46938f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
				super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
				if(this.chooseEnglishButton.isOver()) {
					this.chooseSpanishButtonPlayed = false;
					super.batch.draw(World.secondBackFrame, this.chooseEnglishButton.getX(), this.chooseEnglishButton.getY(), this.chooseEnglishButton.getWidth(), this.chooseEnglishButton.getHeight());
					if(this.chooseEnglishButtonPlayed == false) {
						World.clickSound.play();
						this.chooseEnglishButtonPlayed = true;
					}
				}else if(this.chooseSpanishButton.isOver()) {
					this.chooseEnglishButtonPlayed = false;
					super.batch.draw(World.secondBackFrame, this.chooseSpanishButton.getX(), this.chooseSpanishButton.getY(), this.chooseSpanishButton.getWidth(), this.chooseSpanishButton.getHeight());
					if(this.chooseSpanishButtonPlayed == false) {
						World.clickSound.play();
						this.chooseSpanishButtonPlayed = true;
					}
				}else {
					this.chooseEnglishButtonPlayed = false;
					this.chooseSpanishButtonPlayed = false;
				}
				if(this.chooseEnglishButton.isPressed()) {
					this.chooseEnglishButtonPressed = true;
					this.chooseSpanishButtonPressed = false;
					this.choosedLanguage = "English";
				}
				else if(this.chooseSpanishButton.isPressed()) {
					this.chooseSpanishButtonPressed = true;
					this.chooseEnglishButtonPressed = false;
					this.choosedLanguage = "Spanish(Spain)";
				}
				if(this.chooseEnglishButtonPressed == true) super.batch.draw(World.secondBackFrame, this.chooseEnglishButton.getX(), this.chooseEnglishButton.getY(), this.chooseEnglishButton.getWidth(), this.chooseEnglishButton.getHeight());
				else if(this.chooseSpanishButtonPressed == true) super.batch.draw(World.secondBackFrame, this.chooseSpanishButton.getX(), this.chooseSpanishButton.getY(), this.chooseSpanishButton.getWidth(), this.chooseSpanishButton.getHeight());
				super.font.draw(super.batch, "English", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.40259f);
				super.font.draw(super.batch, "Spanish(Spain)", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.52112f);
			}
			super.batch.draw(this.smallTextBoxBorderless, Gdx.graphics.getWidth()/1.99999f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/38.4f, Gdx.graphics.getHeight()/21.6f);
			if(this.showLanguagesButtonPressed == false && this.showLanguagesButtonPressedOneTime == false) {
				super.batch.draw(this.downButton, this.showLanguagesButton.getX()+Gdx.graphics.getWidth()/192f, this.showLanguagesButton.getY()+Gdx.graphics.getHeight()/108f, this.showLanguagesButton.getWidth()/1.5f, this.showLanguagesButton.getHeight()/1.5f);
			}else if(this.showLanguagesButtonPressed == true && this.showLanguagesButtonPressedOneTime == false) {
				super.batch.draw(this.pressedDownButton, this.showLanguagesButton.getX()+Gdx.graphics.getWidth()/192f, this.showLanguagesButton.getY()+Gdx.graphics.getHeight()/108f, this.showLanguagesButton.getWidth()/1.5f, this.showLanguagesButton.getHeight()/1.5f);
			}else if(this.showLanguagesButtonPressed == true && this.showLanguagesButtonPressedOneTime == true) {
				super.batch.draw(this.upButton, this.showLanguagesButton.getX()+Gdx.graphics.getWidth()/192f, this.showLanguagesButton.getY()+Gdx.graphics.getHeight()/108f, this.showLanguagesButton.getWidth()/1.5f, this.showLanguagesButton.getHeight()/1.5f);
			}else if(this.showLanguagesButtonPressed == false && this.showLanguagesButtonPressedOneTime == true) {
				super.batch.draw(this.pressedUpButton, this.showLanguagesButton.getX()+Gdx.graphics.getWidth()/192f, this.showLanguagesButton.getY()+Gdx.graphics.getHeight()/108f, this.showLanguagesButton.getWidth()/1.5f, this.showLanguagesButton.getHeight()/1.5f);
			}
			if(this.showLanguagesButton.isPressed() && this.showLanguagesButtonPlayed == false) {
				World.clickSound.play();
				this.showLanguagesButtonPlayed = true;
			}else if(!this.showLanguagesButton.isPressed()) this.showLanguagesButtonPlayed = false;
			super.font.draw(super.batch, this.choosedLanguage, Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.3012f);
		}else if(this.shortCutButtonPressed == true) {
			super.batch.draw(World.pressedButton, this.shortCutButton.getX(), this.shortCutButton.getY(), this.shortCutButton.getWidth(), this.shortCutButton.getHeight());
			
			super.font.draw(super.batch, "COMMAND", 750, 880);
			super.font.draw(super.batch, "KEY", 1305, 880);
			super.batch.draw(World.bottomLittleFrame, 730, 850, 750, 10);
			this.fontForShortCuts.draw(super.batch, "ATTACKS", 750, 830);
			super.batch.draw(World.bottomLittleFrame, 730, 795, 750, 3);
			this.fontForShortCutsNames.draw(super.batch, "Normal attack", 750, 770);
			super.batch.draw(World.darkButton, 1180, 740, 300, 50);
			this.fontForShortCutsNames.draw(super.batch, "Q", 1320, 770);
			super.batch.draw(World.bottomLittleFrame, 730, 730, 750, 3);
			this.fontForShortCuts.draw(super.batch, "MOVES", 750, 710);
			super.batch.draw(World.bottomLittleFrame, 730, 675, 750, 3);
			this.fontForShortCutsNames.draw(super.batch, "Up", 750, 650);
			super.batch.draw(World.darkButton, 1180, 620, 300, 50);
			this.fontForShortCutsNames.draw(super.batch, "Up arrow", 1295, 653);
			super.batch.draw(World.bottomLittleFrame, 730, 610, 750, 3);
			this.fontForShortCutsNames.draw(super.batch, "Right", 750, 585);
			super.batch.draw(World.darkButton, 1180, 555, 300, 50);
			this.fontForShortCutsNames.draw(super.batch, "Right arrow", 1287, 585);
			super.batch.draw(World.bottomLittleFrame, 730, 545, 750, 3);
			this.fontForShortCutsNames.draw(super.batch, "Down", 750, 520);
			super.batch.draw(World.darkButton, 1180, 490, 300, 50);
			this.fontForShortCutsNames.draw(super.batch, "Down arrow", 1285, 520);
			super.batch.draw(World.bottomLittleFrame, 730, 480, 750, 3);
			this.fontForShortCutsNames.draw(super.batch, "Left", 750, 455);
			super.batch.draw(World.darkButton, 1180, 425, 300, 50);
			this.fontForShortCutsNames.draw(super.batch, "Left arrow", 1295, 455);
			super.batch.draw(World.bottomLittleFrame, 730, 415, 750, 3);
		}

		if(this.initialConfigurationButton.isPressed()) {
			super.batch.draw(World.pressedButton, this.initialConfigurationButton.getX(), this.initialConfigurationButton.getY(), this.initialConfigurationButton.getWidth(), this.initialConfigurationButton.getHeight());
			this.reiniciateTableStates();
		}else if(this.cancelButton.isPressed()) {
			super.batch.draw(World.pressedButton, this.cancelButton.getX(), this.cancelButton.getY(), this.cancelButton.getWidth(), this.cancelButton.getHeight());
			this.reiniciateTableStates();
		}else if(this.applyButton.isPressed()) {
			super.batch.draw(World.pressedButton, this.applyButton.getX(), this.applyButton.getY(), this.applyButton.getWidth(), this.applyButton.getHeight());
			this.reiniciateTableStates();
		}else if(this.acceptButton.isPressed()) {
			super.batch.draw(World.pressedButton, this.acceptButton.getX(), this.acceptButton.getY(), this.acceptButton.getWidth(), this.acceptButton.getHeight());
			this.reiniciateTableStates();
		}else if(this.backMainMenuButton.isPressed()) {
			super.batch.draw(World.pressedButton, this.backMainMenuButton.getX(), this.backMainMenuButton.getY(), this.backMainMenuButton.getWidth(), this.backMainMenuButton.getHeight());
			this.reiniciateTableStates();
		}

		super.font.draw(super.batch, "VIDEO", Gdx.graphics.getWidth()/4.4137f, Gdx.graphics.getHeight()/1.24137f);
		super.font.draw(super.batch, "AUDIO", 435, Gdx.graphics.getHeight()/1.36708f);
		super.font.draw(super.batch, "GAME", Gdx.graphics.getWidth()/4.4137f, Gdx.graphics.getHeight()/1.52112f);
		super.font.draw(super.batch, "SHORTCUTS", 400, 630);
		super.font.draw(super.batch, "INITIAL CONFIGURATION", Gdx.graphics.getWidth()/5.7313f, Gdx.graphics.getHeight()/5.1428f);
		super.font.draw(super.batch, "CANCEL", Gdx.graphics.getWidth()/2.31325f, Gdx.graphics.getHeight()/5.1428f);
		super.font.draw(super.batch, "APPLY", Gdx.graphics.getWidth()/1.6842f, Gdx.graphics.getHeight()/5.1428f);
		super.font.draw(super.batch, "ACCEPT", Gdx.graphics.getWidth()/1.33333f, Gdx.graphics.getHeight()/5.1428f);
		super.font.draw(super.batch, "BACK TO MAIN MENU", Gdx.graphics.getWidth()/22.588f, Gdx.graphics.getHeight()/15.4285f);
		super.font.draw(super.batch, "OPTIONS", Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/1.13684f);
		super.batch.end();
		
		if(lockCursorButtonPressed) World.setCursorCatched(true);
		else if(!lockCursorButtonPressed) World.setCursorCatched(false);
		
		if(VSyncButtonPressed) World.setVSync(true);
		else if(!VSyncButtonPressed) World.setVSync(false);

		this.backMainMenuButton.addListener(UIFactory.createListener(World.MainMenuScreen));
		scrollFPSButton.addListener(UIFactory.touchDraggedFPSButton());
		scrollMasterAudioButton.addListener(UIFactory.touchDraggedMasterAudioButton());
		scrollEffectsAudioButton.addListener(UIFactory.touchDraggedEffectsAudioButton());
		scrollEnvironmentalAudioButton.addListener(UIFactory.touchDraggedEnvironmentalAudioButton());
		scrollMusicAudioButton.addListener(UIFactory.touchDraggedMusicAudioButton());
	}

	@Override
	public void show() {

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

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
					backMainMenuButtonPlayed, videoButtonPressed, audioButtonPressed, gameButtonPressed, shortCutButtonPressed,VSyncButtonPressedOneTime, VSyncButtonPlayed, biggerCursorButtonPressed,
					biggerCursorButtonPressedOneTime, biggerCursorButtonPlayed, activateAndDeactivateAllSoundsPressed,
					activateAndDeactivateAllSoundsPressedOneTime, activateAndDeactivateAllSoundsPlayed, activateAndDeactivateMusicPressed, activateAndDeactivateMusicPressedOneTime, activateAndDeactivateMusicPlayed,
					showLanguagesButtonPressed, showLanguagesButtonPressedOneTime, showLanguagesButtonPlayed, chooseEnglishButtonPressed, chooseEnglishButtonPlayed,
					chooseSpanishButtonPressed, chooseSpanishButtonPlayed, showMonitorsButtonPressed, showMonitorsButtonPressedOneTime, showMonitorsButtonPlayed, chooseFullScreenButtonPressed,
					chooseFullScreenButtonPlayed, chooseWindowedFullScreenButtonPressed, chooseWindowedFullScreenButtonPlayed;
	
	public static boolean VSyncButtonPressed;

	private float floatMasterVolume, floatEffectsVolume, floatEnvironmentalVolume, floatMusicVolume, floatFPS;
	public static String choosedLanguage, choosedMonitor;
	private BitmapFont fontForShortCuts, fontForShortCutsNames;

	public OptionsMenuScreen() {

		super.font.setColor(Color.GOLDENROD);
		super.font.getData().setScale(Gdx.graphics.getWidth()/1280f, Gdx.graphics.getHeight()/720f);
		
		this.fontForShortCuts = new BitmapFont();
		this.fontForShortCuts.setColor(Color.WHITE);
		this.fontForShortCuts.getData().setScale(Gdx.graphics.getWidth()/1476.9230f, Gdx.graphics.getHeight()/830.7692f);
		
		this.fontForShortCutsNames = new BitmapFont();
		this.fontForShortCutsNames.setColor(Color.GOLDENROD);
		this.fontForShortCutsNames.getData().setScale(Gdx.graphics.getWidth()/1745.4545f, Gdx.graphics.getHeight()/981.8181f);

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
		
		choosedLanguage = "English";
		choosedMonitor = "Full screen";

		this.buttonsStage = new Stage();
		this.buttonsGroup = new Group();
		
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
		this.shortCutButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/1.8620f, Gdx.graphics.getWidth()/5.4857f, Gdx.graphics.getHeight()/13.5f);
		this.initialConfigurationButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.cancelButton.setBounds(Gdx.graphics.getWidth()/2.6666f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.applyButton.setBounds(Gdx.graphics.getWidth()/1.873f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.acceptButton.setBounds(Gdx.graphics.getWidth()/1.4436f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.backMainMenuButton.setBounds(Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.lockCursorButton.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/1.5f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.VSyncButton.setBounds(Gdx.graphics.getWidth()/2.704f, 700, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.biggerCursorButton.setBounds(Gdx.graphics.getWidth()/2.704f, 620, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.activateAndDeactivateAllSounds.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/2.8421f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.activateAndDeactivateMusic.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/3.375f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.showLanguagesButton.setBounds(Gdx.graphics.getWidth()/1.99999f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/38.4f, Gdx.graphics.getHeight()/21.6f);
		this.chooseEnglishButton.setBounds(Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.46938f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
		this.chooseSpanishButton.setBounds(Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
		this.showMonitorsButton.setBounds(Gdx.graphics.getWidth()/1.99999f, Gdx.graphics.getHeight()/1.35849f, Gdx.graphics.getWidth()/38.4f, Gdx.graphics.getHeight()/21.6f);
		this.chooseFullScreenButton.setBounds(Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.46938f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
		this.chooseWindowedFullScreenButton.setBounds(Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/6.5084f, Gdx.graphics.getHeight()/19.636f);
		scrollFPSButton.setBounds(Gdx.graphics.getWidth()/2.2668f, 475, Gdx.graphics.getWidth()/76.8f, Gdx.graphics.getHeight()/27f);
		scrollMasterAudioButton.setBounds(Gdx.graphics.getWidth()/2.2668f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/76.8f, Gdx.graphics.getHeight()/27f);
		scrollEffectsAudioButton.setBounds(Gdx.graphics.getWidth()/2.2668f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/76.8f, Gdx.graphics.getHeight()/27f);
		scrollEnvironmentalAudioButton.setBounds(Gdx.graphics.getWidth()/2.2668f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/76.8f, Gdx.graphics.getHeight()/27f);
		scrollMusicAudioButton.setBounds(Gdx.graphics.getWidth()/2.2668f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/76.8f, Gdx.graphics.getHeight()/27f);

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

	@Override
	public void buildStage() {
		Gdx.input.setInputProcessor(this.buttonsStage);
		Gdx.input.setCursorCatched(false);
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
			
			super.batch.draw(this.checkBox, this.VSyncButton.getX(), this.VSyncButton.getY(), this.VSyncButton.getWidth(), this.VSyncButton.getHeight());
			if(this.VSyncButton.isPressed()) {
				if(this.VSyncButtonPressedOneTime == true) VSyncButtonPressed = false;
				else VSyncButtonPressed = true;
			}else if(!this.VSyncButton.isPressed()) {
				if(VSyncButtonPressed == true) this.VSyncButtonPressedOneTime = true;
				else this.VSyncButtonPressedOneTime = false;
			}
			if(VSyncButtonPressed == true) super.batch.draw(this.checkedBox, this.VSyncButton.getX(), this.VSyncButton.getY(), this.VSyncButton.getWidth()+(Gdx.graphics.getWidth()/480f), this.VSyncButton.getHeight());
			if(this.VSyncButton.isPressed() && this.VSyncButtonPlayed == false) {
				World.clickSound.play();
				this.VSyncButtonPlayed = true;
			}else if(!this.VSyncButton.isPressed()) this.VSyncButtonPlayed = false;
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Vertical Sync", Gdx.graphics.getWidth()/2.56f, 725);
			else super.font.draw(super.batch, "Sincronización vertical", Gdx.graphics.getWidth()/2.56f, 725);
			
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
					if(choosedLanguage.equals("English")) choosedMonitor = "Full screen";
					else choosedMonitor = "Pantalla completa";
				}
				else if(this.chooseWindowedFullScreenButton.isPressed()) {
					this.chooseWindowedFullScreenButtonPressed = true;
					this.chooseFullScreenButtonPressed = false;
					if(choosedLanguage.equals("English")) choosedMonitor = "Windowed(Full screen)";
					else choosedMonitor = "Modo ventana";
				}
				if(this.chooseFullScreenButtonPressed == true) super.batch.draw(World.secondBackFrame, this.chooseFullScreenButton.getX(), this.chooseFullScreenButton.getY(), this.chooseFullScreenButton.getWidth(), this.chooseFullScreenButton.getHeight());
				else if(this.chooseWindowedFullScreenButtonPressed == true) super.batch.draw(World.secondBackFrame, this.chooseWindowedFullScreenButton.getX(), this.chooseWindowedFullScreenButton.getY(), this.chooseWindowedFullScreenButton.getWidth(), this.chooseWindowedFullScreenButton.getHeight());
				if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Full screen", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.40259f);
				else super.font.draw(super.batch, "Pantalla completa", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.40259f);
				if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Windowed(Full screen)", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.52112f);
				else super.font.draw(super.batch, "Modo ventana", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.52112f);
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
			super.font.draw(super.batch, choosedMonitor, Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.3012f);

			super.batch.draw(this.checkBox, this.biggerCursorButton.getX(), this.biggerCursorButton.getY(), this.biggerCursorButton.getWidth(), this.biggerCursorButton.getHeight());
			if(this.biggerCursorButton.isPressed()) {
				if(this.biggerCursorButtonPressedOneTime == true) this.biggerCursorButtonPressed = false;
				else this.biggerCursorButtonPressed = true;
			}else if(!this.biggerCursorButton.isPressed()) {
				if(this.biggerCursorButtonPressed == true) this.biggerCursorButtonPressedOneTime = true;
				else this.biggerCursorButtonPressedOneTime = false;
			}
			if(this.biggerCursorButtonPressed == true) super.batch.draw(this.checkedBox, this.biggerCursorButton.getX(), this.biggerCursorButton.getY(), this.biggerCursorButton.getWidth()+(Gdx.graphics.getWidth()/480f), this.biggerCursorButton.getHeight());
			if(this.biggerCursorButton.isPressed() && this.biggerCursorButtonPlayed == false) {
				World.clickSound.play();
				this.biggerCursorButtonPlayed = true;
			}else if(!this.biggerCursorButton.isPressed()) this.biggerCursorButtonPlayed = false;
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Bigger cursor", Gdx.graphics.getWidth()/2.56f, 645);
			else super.font.draw(super.batch, "Cursor más grande", Gdx.graphics.getWidth()/2.56f, 645);

			super.font.draw(super.batch, "Max FPS:", Gdx.graphics.getWidth()/2.7042f, 560);
			if(scrollFPSButton.getX() >= Gdx.graphics.getWidth()/1.9296f) scrollFPSButton.setPosition(Gdx.graphics.getWidth()/1.9296f, 475);
			if(scrollFPSButton.getX() <= Gdx.graphics.getWidth()/2.7428f) scrollFPSButton.setPosition(Gdx.graphics.getWidth()/2.7428f, 475);
			super.batch.draw(this.scrollBar, Gdx.graphics.getWidth()/2.7042f, 490, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/108f);
			super.batch.draw(this.scrollButtonTexture, scrollFPSButton.getX(), scrollFPSButton.getY(), scrollFPSButton.getWidth(), scrollFPSButton.getHeight());
			this.floatFPS = ((scrollFPSButton.getX() - (Gdx.graphics.getWidth()/2.7507f)) * 120f) / 296f;
			super.font.draw(super.batch, String.valueOf(Math.round(this.floatFPS)), Gdx.graphics.getWidth()/2.3703f, 560);
		}else if(this.audioButtonPressed == true) {
			this.buttonsStage.getRoot().removeActor(this.showLanguagesButton);
			this.buttonsStage.getRoot().removeActor(this.showMonitorsButton);
			this.buttonsStage.getRoot().removeActor(this.chooseSpanishButton);
			
			super.batch.draw(World.pressedButton, this.audioButton.getX(), this.audioButton.getY(), this.audioButton.getWidth(), this.audioButton.getHeight());
			
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Master audio:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2413f);
			else super.font.draw(super.batch, "Volumen principal:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2413f);
			if(scrollMasterAudioButton.getX() >= Gdx.graphics.getWidth()/1.9296f) scrollMasterAudioButton.setPosition(Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.3757f);
			if(scrollMasterAudioButton.getX() <= Gdx.graphics.getWidth()/2.7428f) scrollMasterAudioButton.setPosition(Gdx.graphics.getWidth()/2.7428f, Gdx.graphics.getHeight()/1.3757f);
			super.batch.draw(this.scrollBar, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.35f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/108f);
			super.batch.draw(this.scrollButtonTexture, scrollMasterAudioButton.getX(), scrollMasterAudioButton.getY(), scrollMasterAudioButton.getWidth(), scrollMasterAudioButton.getHeight());
			this.floatMasterVolume = ((scrollMasterAudioButton.getX() - (Gdx.graphics.getWidth()/2.7428f)) * 100f) / 296f;
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, String.valueOf(Math.round(this.floatMasterVolume)), 845, Gdx.graphics.getHeight()/1.2442f);
			else super.font.draw(super.batch, String.valueOf(Math.round(this.floatMasterVolume)), 890, Gdx.graphics.getHeight()/1.2442f);

			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Effects audio:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.421f);
			else super.font.draw(super.batch, "Volumen de los efectos:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.421f);
			if(scrollEffectsAudioButton.getX() >= Gdx.graphics.getWidth()/1.9296f) scrollEffectsAudioButton.setPosition(Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.6f);
			if(scrollEffectsAudioButton.getX() <= Gdx.graphics.getWidth()/2.7428f) scrollEffectsAudioButton.setPosition(Gdx.graphics.getWidth()/2.7428f, Gdx.graphics.getHeight()/1.6f);
			super.batch.draw(this.scrollBar, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.5652f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/108f);
			super.batch.draw(this.scrollButtonTexture, scrollEffectsAudioButton.getX(), scrollEffectsAudioButton.getY(), scrollEffectsAudioButton.getWidth(), scrollEffectsAudioButton.getHeight());
			this.floatEffectsVolume = ((scrollEffectsAudioButton.getX() - (Gdx.graphics.getWidth()/2.7428f)) * 100f) / 296f;
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, String.valueOf(Math.round(this.floatEffectsVolume)), Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/1.4248f);
			else super.font.draw(super.batch, String.valueOf(Math.round(this.floatEffectsVolume)), 940, Gdx.graphics.getHeight()/1.4248f);
			
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Environmental audio:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.6615f);
			else super.font.draw(super.batch, "Volumen ambiental:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.6615f);
			if(scrollEnvironmentalAudioButton.getX() >= Gdx.graphics.getWidth()/1.9296f) scrollEnvironmentalAudioButton.setPosition(Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/1.9115f);
			if(scrollEnvironmentalAudioButton.getX() <= Gdx.graphics.getWidth()/2.7428f) scrollEnvironmentalAudioButton.setPosition(Gdx.graphics.getWidth()/2.7428f, Gdx.graphics.getHeight()/1.9115f);
			super.batch.draw(this.scrollBar, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.8620f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/108f);
			super.batch.draw(this.scrollButtonTexture, scrollEnvironmentalAudioButton.getX(), scrollEnvironmentalAudioButton.getY(), scrollEnvironmentalAudioButton.getWidth(), scrollEnvironmentalAudioButton.getHeight());
			this.floatEnvironmentalVolume = ((scrollEnvironmentalAudioButton.getX() - (Gdx.graphics.getWidth()/2.7428f)) * 100f) / 296f;
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, String.valueOf(Math.round(this.floatEnvironmentalVolume)), Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/1.6666f);
			else super.font.draw(super.batch, String.valueOf(Math.round(this.floatEnvironmentalVolume)), 900, Gdx.graphics.getHeight()/1.6666f);

			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Music audio:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2f);
			else super.font.draw(super.batch, "Volumen de la musica:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2f);
			if(scrollMusicAudioButton.getX() >= Gdx.graphics.getWidth()/1.9296f) scrollMusicAudioButton.setPosition(Gdx.graphics.getWidth()/1.9296f, Gdx.graphics.getHeight()/2.3736f);
			if(scrollMusicAudioButton.getX() <= Gdx.graphics.getWidth()/2.7428f) scrollMusicAudioButton.setPosition(Gdx.graphics.getWidth()/2.7428f, Gdx.graphics.getHeight()/2.3736f);
			super.batch.draw(this.scrollBar, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.2978f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/108f);
			super.batch.draw(this.scrollButtonTexture, scrollMusicAudioButton.getX(), scrollMusicAudioButton.getY(), scrollMusicAudioButton.getWidth(), scrollMusicAudioButton.getHeight());
			this.floatMusicVolume = ((scrollMusicAudioButton.getX() - (Gdx.graphics.getWidth()/2.7428f)) * 100f) / 296f;
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, String.valueOf(Math.round(this.floatMusicVolume)), Gdx.graphics.getWidth()/2.2588f, Gdx.graphics.getHeight()/2.0074f);
			else super.font.draw(super.batch, String.valueOf(Math.round(this.floatMusicVolume)), 930, Gdx.graphics.getHeight()/2.0074f);

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
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Deactivate all game sounds", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/2.6666f);
			else super.font.draw(super.batch, "Desactivar todos los sonidos del juego", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/2.6666f);

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
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Deactivate music game", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/3.1304f);
			else super.font.draw(super.batch, "Desactivar la musica del juego", Gdx.graphics.getWidth()/2.56f, Gdx.graphics.getHeight()/3.1304f);
		}else if(this.gameButtonPressed == true) {
			this.buttonsStage.getRoot().removeActor(this.showMonitorsButton);
			this.buttonsStage.getRoot().removeActor(this.chooseFullScreenButton);
			this.buttonsStage.getRoot().removeActor(this.chooseWindowedFullScreenButton);
			this.buttonsGroup.addActor(this.showLanguagesButton);
			this.buttonsGroup.addActor(this.chooseEnglishButton);
			this.buttonsGroup.addActor(this.chooseSpanishButton);
			
			super.batch.draw(World.pressedButton, this.gameButton.getX(), this.gameButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Language selection", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2272f);
			else super.font.draw(super.batch, "Selección del idioma", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2272f);
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
					choosedLanguage = "English";
					if(choosedMonitor.equals("Full screen") || choosedMonitor.equals("Pantalla completa")) choosedMonitor = "Full screen";
					else if(choosedMonitor.equals("Windowed(Full screen)") || choosedMonitor.equals("Modo ventana")) choosedMonitor = "Windowed(Full screen)";
				}
				else if(this.chooseSpanishButton.isPressed()) {
					this.chooseSpanishButtonPressed = true;
					this.chooseEnglishButtonPressed = false;
					if(choosedMonitor.equals("Full screen") || choosedMonitor.equals("Pantalla completa")) choosedMonitor = "Pantalla completa";
					else if(choosedMonitor.equals("Windowed(Full screen)") || choosedMonitor.equals("Modo ventana")) choosedMonitor = "Modo ventana";
					choosedLanguage = "Español(España)";
				}
				if(this.chooseEnglishButtonPressed == true) super.batch.draw(World.secondBackFrame, this.chooseEnglishButton.getX(), this.chooseEnglishButton.getY(), this.chooseEnglishButton.getWidth(), this.chooseEnglishButton.getHeight());
				else if(this.chooseSpanishButtonPressed == true) super.batch.draw(World.secondBackFrame, this.chooseSpanishButton.getX(), this.chooseSpanishButton.getY(), this.chooseSpanishButton.getWidth(), this.chooseSpanishButton.getHeight());
				if(choosedLanguage.equals("English")) super.font.draw(super.batch, "English", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.40259f);
				else super.font.draw(super.batch, "Inglés", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.40259f);
				if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Spanish(Spain)", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.52112f);
				else super.font.draw(super.batch, "Español(España)", Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.52112f);
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
			super.font.draw(super.batch, choosedLanguage, Gdx.graphics.getWidth()/2.66666f, Gdx.graphics.getHeight()/1.3012f);
		}else if(this.shortCutButtonPressed == true) {
			super.batch.draw(World.pressedButton, this.shortCutButton.getX(), this.shortCutButton.getY(), this.shortCutButton.getWidth(), this.shortCutButton.getHeight());
			
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Right", 710, 870);
			else super.font.draw(super.batch, "Derecha", 710, 870);
			super.batch.draw(World.darkButton, 850, 835, 220, 50);
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Right arrow", 905, 870);
			else super.font.draw(super.batch, "Flecha derecha", 885, 870);
			
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Left", 710, 790);
			else super.font.draw(super.batch, "izquierda", 710, 790);
			super.batch.draw(World.darkButton, 850, 755, 220, 50);
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Left arrow", 913, 790);
			else super.font.draw(super.batch, "Flecha izquierda", 883, 790);
			
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Up", 710, 710);
			else super.font.draw(super.batch, "Arriba", 710, 710);
			super.batch.draw(World.darkButton, 850, 675, 220, 50);
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Up arrow", 918, 710);
			else super.font.draw(super.batch, "Flecha arriba", 900, 710);
			
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Down", 710, 630);
			else super.font.draw(super.batch, "Abajo", 710, 630);
			super.batch.draw(World.darkButton, 850, 595, 220, 50);
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Down arrow", 905, 630);
			else super.font.draw(super.batch, "Flecha abajo", 900, 630);
			
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Jump", 710, 550);
			else super.font.draw(super.batch, "Saltar", 710, 550);
			super.batch.draw(World.darkButton, 850, 515, 220, 50);
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Space", 930, 550);
			else super.font.draw(super.batch, "Espacio", 925, 550);
			
			super.font.draw(super.batch, "Dash", 710, 470);
			super.batch.draw(World.darkButton, 850, 435, 220, 50);
			super.font.draw(super.batch, "E", 955, 470);
			
			if(choosedLanguage.equals("English")) super.font.draw(super.batch, "Attack", 710, 390);
			else super.font.draw(super.batch, "Atacar", 710, 390);
			super.batch.draw(World.darkButton, 850, 355, 220, 50);
			super.font.draw(super.batch, "Q", 955, 390);
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
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "AUDIO", Gdx.graphics.getWidth()/4.4137f, Gdx.graphics.getHeight()/1.36708f);
		else super.font.draw(super.batch, "VOLUMEN", 410, Gdx.graphics.getHeight()/1.36708f);
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "GAME", Gdx.graphics.getWidth()/4.4137f, Gdx.graphics.getHeight()/1.52112f);
		else super.font.draw(super.batch, "JUEGO", 430, Gdx.graphics.getHeight()/1.52112f);
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "SHORTCUTS", Gdx.graphics.getWidth()/4.8f, Gdx.graphics.getHeight()/1.7142f);
		else super.font.draw(super.batch, "ATAJOS", 427, Gdx.graphics.getHeight()/1.7142f);
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "INITIAL CONFIGURATION", Gdx.graphics.getWidth()/5.7313f, Gdx.graphics.getHeight()/5.1428f);
		else super.font.draw(super.batch, "CONFIGURACION INICIAL",333, Gdx.graphics.getHeight()/5.1428f);
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "CANCEL", Gdx.graphics.getWidth()/2.31325f, Gdx.graphics.getHeight()/5.1428f);
		else super.font.draw(super.batch, "CANCELAR", 810, Gdx.graphics.getHeight()/5.1428f);
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "APPLY", Gdx.graphics.getWidth()/1.6842f, Gdx.graphics.getHeight()/5.1428f);
		else super.font.draw(super.batch, "APLICAR", 1130, Gdx.graphics.getHeight()/5.1428f);
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "ACCEPT", Gdx.graphics.getWidth()/1.33333f, Gdx.graphics.getHeight()/5.1428f);
		else super.font.draw(super.batch, "ACEPTAR", 1430, Gdx.graphics.getHeight()/5.1428f);
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "BACK", 170, Gdx.graphics.getHeight()/15.4285f);
		else super.font.draw(super.batch, "ATRAS", 160, Gdx.graphics.getHeight()/15.4285f);
		
		if(choosedLanguage.equals("English")) super.font.draw(super.batch, "OPTIONS", Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/1.13684f);
		else super.font.draw(super.batch, "OPCIONES", 920, Gdx.graphics.getHeight()/1.13684f);
		super.batch.end();
		
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

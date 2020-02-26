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

	private Texture checkBox, checkedBox, plusButton, pressedPlusButton, minusButton, pressedMinusButton, veryLightYellowFrame, downButton, pressedDownButton, upButton,
					pressedUpButton, leftLittleConection, rightLittleConection, smallTextBoxBorderless;

	private Stage buttonsStage;
	private Group buttonsGroup;

	private Button videoButton, volumeButton, gameButton, languageButton, shortCutButton, initialConfigurationButton, applyButton, cancelButton, acceptButton, backMainMenuButton,
				   lockCursorButton, VSyncButton, biggerCursorButton, moreFPS, lessFPS, moreMasterVolumeButton, lessMasterVolumeButton, moreEffectsVolumeButton, lessEffectsVolumeButton,
				   moreEnvironmentalVolumeButton, lessEnvironmentalVolumeButton, moreMusicVolumeButton, lessMusicVolumeButton, activateAndDeactivateAllSounds, activateAndDeactivateMusic,
				   lifeMonstersBarButton, damageQuantityButton, healingQuantityButton, defensiveMessagesButton, hourButton, showLanguagesButton, chooseEnglishButton, chooseSpanishButton,
				   showMonitorsButton, chooseFullScreenButton, chooseWindowedFullScreenButton, showStatsButton;

	private boolean videoButtonPlayed, volumeButtonPlayed, gameButtonPlayed, languageButtonPlayed, shortCutButtonPlayed, initialConfigurationButtonPlayed, applyButtonPlayed, cancelButtonPlayed, acceptButtonPlayed,
					backMainMenuButtonPlayed, videoButtonPressed, volumeButtonPressed, gameButtonPressed, languageButtonPressed, shortCutButtonPressed, lockCursorButtonPressedOneTime,
					lockCursorButtonPlayed, VSyncButtonPressedOneTime, VSyncButtonPlayed, biggerCursorButtonPressed, biggerCursorButtonPressedOneTime, biggerCursorButtonPlayed,
					moreFPSButtonPressed, lessFPSButtonPressed, moreMasterVolumeButtonPressed, lessMasterVolumeButtonPressed, moreEffectsVolumeButtonPressed, lessEffectsVolumeButtonPressed,
					moreEnvironmentalVolumeButtonPressed, lessEnvironmentalVolumeButtonPressed, moreMusicVolumeButtonPressed, lessMusicVolumeButtonPressed, activateAndDeactivateAllSoundsPressed,
					activateAndDeactivateAllSoundsPressedOneTime, activateAndDeactivateAllSoundsPlayed, activateAndDeactivateMusicPressed, activateAndDeactivateMusicPressedOneTime,
					activateAndDeactivateMusicPlayed, lifeMonstersBarButtonPressed, lifeMonstersBarButtonPressedOneTime, lifeMonstersBarButtonPlayed, damageQuantityButtonPressed,
					damageQuantityButtonPressedOneTime, damageQuantityButtonPlayed, healingQuantityButtonPressed, healingQuantityButtonPressedOneTime, healingQuantityButtonPlayed,
					defensiveMessagesButtonPressed, defensiveMessagesButtonPressedOneTime, defensiveMessagesButtonPlayed, hourButtonPressed, hourButtonPressedOneTime, hourButtonPlayed,
					showLanguagesButtonPressed, showLanguagesButtonPressedOneTime, showLanguagesButtonPlayed, chooseEnglishButtonPressed, chooseEnglishButtonPlayed,
					chooseSpanishButtonPressed, chooseSpanishButtonPlayed, showMonitorsButtonPressed, showMonitorsButtonPressedOneTime, showMonitorsButtonPlayed, chooseFullScreenButtonPressed,
					chooseFullScreenButtonPlayed, chooseWindowedFullScreenButtonPressed, chooseWindowedFullScreenButtonPlayed, showStatsButtonPressed, showStatsButtonPressedOneTime, showStatsButtonPlayed;
	
	public static boolean lockCursorButtonPressed, VSyncButtonPressed;

	private int integerFPS, masterVolume, effectsVolume, environmentalVolume, musicVolume;
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
		this.plusButton = new Texture(Gdx.files.internal("OptionsMenuTextures/plusButton.png"));
		this.pressedPlusButton = new Texture(Gdx.files.internal("OptionsMenuTextures/pressedPlusButton.png"));
		this.minusButton = new Texture(Gdx.files.internal("OptionsMenuTextures/minusButton.png"));
		this.pressedMinusButton = new Texture(Gdx.files.internal("OptionsMenuTextures/pressedMinusButton.png"));
		this.veryLightYellowFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/veryLightYellowFrame.png"));
		this.downButton = new Texture(Gdx.files.internal("OptionsMenuTextures/downButton.png"));
		this.pressedDownButton = new Texture(Gdx.files.internal("OptionsMenuTextures/pressedDownButton.png"));
		this.upButton = new Texture(Gdx.files.internal("OptionsMenuTextures/upButton.png"));
		this.pressedUpButton = new Texture(Gdx.files.internal("OptionsMenuTextures/pressedUpButton.png"));
		this.leftLittleConection = new Texture(Gdx.files.internal("OptionsMenuTextures/leftLittleConection.png"));
		this.rightLittleConection = new Texture(Gdx.files.internal("OptionsMenuTextures/rightLittleConection.png"));
		this.smallTextBoxBorderless = new Texture(Gdx.files.internal("OptionsMenuTextures/smallTextBoxBorderless.png"));

		this.videoButtonPlayed = false;
		this.volumeButtonPlayed = false;
		this.gameButtonPlayed = false;
		this.languageButtonPlayed = false;
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
		this.lifeMonstersBarButtonPlayed = false;
		this.damageQuantityButtonPlayed = false;
		this.healingQuantityButtonPlayed = false;
		this.defensiveMessagesButtonPlayed = false;
		this.hourButtonPlayed = false;
		this.showLanguagesButtonPlayed = false;
		this.chooseEnglishButtonPlayed = false;
		this.chooseSpanishButtonPlayed = false;
		this.showMonitorsButtonPlayed = false;
		this.chooseFullScreenButtonPlayed = false;
		this.chooseWindowedFullScreenButtonPlayed = false;
		this.showStatsButtonPlayed = false;

		this.videoButtonPressed = true;
		this.volumeButtonPressed = false;
		this.gameButtonPressed = false;
		this.languageButtonPressed = false;
		this.shortCutButtonPressed = false;
		lockCursorButtonPressed = false;
		this.lockCursorButtonPressedOneTime = false;
		VSyncButtonPressed = false;
		this.VSyncButtonPressedOneTime = false;
		this.biggerCursorButtonPressed = false;
		this.biggerCursorButtonPressedOneTime = false;
		this.moreFPSButtonPressed = false;
		this.lessFPSButtonPressed = false;
		this.moreMasterVolumeButtonPressed = false;
		this.lessMasterVolumeButtonPressed = false;
		this.moreEffectsVolumeButtonPressed = false;
		this.lessEffectsVolumeButtonPressed = false;
		this.moreEnvironmentalVolumeButtonPressed = false;
		this.lessEnvironmentalVolumeButtonPressed = false;
		this.moreMusicVolumeButtonPressed = false;
		this.lessMusicVolumeButtonPressed = false;
		this.activateAndDeactivateAllSoundsPressed = false;
		this.activateAndDeactivateAllSoundsPressedOneTime = false;
		this.activateAndDeactivateMusicPressed = false;
		this.activateAndDeactivateMusicPressedOneTime = false;
		this.lifeMonstersBarButtonPressed = false;
		this.lifeMonstersBarButtonPressedOneTime = false;
		this.damageQuantityButtonPressed = false;
		this.damageQuantityButtonPressedOneTime = false;
		this.healingQuantityButtonPressed = false;
		this.healingQuantityButtonPressedOneTime = false;
		this.defensiveMessagesButtonPressed = false;
		this.defensiveMessagesButtonPressedOneTime = false;
		this.hourButtonPressed = false;
		this.hourButtonPressedOneTime = false;
		this.showLanguagesButtonPressed = false;
		this.showLanguagesButtonPressedOneTime = false;
		this.chooseEnglishButtonPressed = true;
		this.chooseSpanishButtonPressed = false;
		this.showMonitorsButtonPressed = false;
		this.showMonitorsButtonPressedOneTime = false;
		this.chooseFullScreenButtonPressed = true;
		this.chooseWindowedFullScreenButtonPressed = false;
		this.showStatsButtonPressed = false;
		this.showStatsButtonPressedOneTime = false;

		this.integerFPS = 60;
		this.masterVolume = 50;
		this.effectsVolume = 50;
		this.environmentalVolume = 50;
		this.musicVolume = 50;
		
		this.choosedLanguage = "English";
		this.choosedMonitor = "Full screen";

		this.buttonsStage = new Stage();
		this.buttonsGroup = new Group();
	}

	@Override
	public void buildStage() {
		Gdx.input.setInputProcessor(this.buttonsStage);

		this.videoButton = new Button();
		this.volumeButton = new Button();
		this.gameButton = new Button();
		this.languageButton = new Button();
		this.shortCutButton = new Button();
		this.initialConfigurationButton = new Button();
		this.applyButton = new Button();
		this.cancelButton = new Button();
		this.acceptButton = new Button();
		this.backMainMenuButton = new Button();
		this.lockCursorButton = new Button();
		this.VSyncButton = new Button();
		this.biggerCursorButton = new Button();
		this.moreFPS = new Button();
		this.lessFPS = new Button();
		this.moreMasterVolumeButton = new Button();
		this.lessMasterVolumeButton = new Button();
		this.moreEffectsVolumeButton = new Button();
		this.lessEffectsVolumeButton = new Button();
		this.moreEnvironmentalVolumeButton = new Button();
		this.lessEnvironmentalVolumeButton = new Button();
		this.moreMusicVolumeButton = new Button();
		this.lessMusicVolumeButton = new Button();
		this.activateAndDeactivateAllSounds = new Button();
		this.activateAndDeactivateMusic = new Button();
		this.lifeMonstersBarButton = new Button();
		this.damageQuantityButton = new Button();
		this.healingQuantityButton = new Button();
		this.defensiveMessagesButton = new Button();
		this.hourButton = new Button();
		this.showLanguagesButton = new Button();
		this.chooseEnglishButton = new Button();
		this.chooseSpanishButton = new Button();
		this.showMonitorsButton = new Button();
		this.chooseFullScreenButton = new Button();
		this.chooseWindowedFullScreenButton = new Button();
		this.showStatsButton = new Button();

		this.videoButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/1.317f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.volumeButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/1.4594f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.gameButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/1.6362f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.languageButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/1.862f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.shortCutButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/2.16f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.initialConfigurationButton.setBounds(Gdx.graphics.getWidth()/6.6206f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.cancelButton.setBounds(Gdx.graphics.getWidth()/2.6666f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.applyButton.setBounds(Gdx.graphics.getWidth()/1.873f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.acceptButton.setBounds(Gdx.graphics.getWidth()/1.4436f, Gdx.graphics.getHeight()/6.75f, Gdx.graphics.getWidth()/6.4f, Gdx.graphics.getHeight()/13.5f);
		this.backMainMenuButton.setBounds(Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f, Gdx.graphics.getWidth()/5.485f, Gdx.graphics.getHeight()/13.5f);
		this.lockCursorButton.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/1.5f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.VSyncButton.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/1.6875f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.biggerCursorButton.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/1.9285f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.moreFPS.setBounds(Gdx.graphics.getWidth()/1.8823f, Gdx.graphics.getHeight()/2.5116f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.lessFPS.setBounds(Gdx.graphics.getWidth()/1.9793f, Gdx.graphics.getHeight()/2.5116f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.moreMasterVolumeButton.setBounds(Gdx.graphics.getWidth()/1.9591f, Gdx.graphics.getHeight()/1.367f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.lessMasterVolumeButton.setBounds(Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/1.367f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.moreEffectsVolumeButton.setBounds(Gdx.graphics.getWidth()/1.9591f, Gdx.graphics.getHeight()/1.5882f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.lessEffectsVolumeButton.setBounds(Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/1.5882f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.moreEnvironmentalVolumeButton.setBounds(Gdx.graphics.getWidth()/1.9591f, Gdx.graphics.getHeight()/1.8947f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.lessEnvironmentalVolumeButton.setBounds(Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/1.8947f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.moreMusicVolumeButton.setBounds(Gdx.graphics.getWidth()/1.9591f, Gdx.graphics.getHeight()/2.3478f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.lessMusicVolumeButton.setBounds(Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/2.3478f, Gdx.graphics.getWidth()/48f, Gdx.graphics.getHeight()/27f);
		this.activateAndDeactivateAllSounds.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/2.8421f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.activateAndDeactivateMusic.setBounds(Gdx.graphics.getWidth()/2.704f, Gdx.graphics.getHeight()/3.375f, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.lifeMonstersBarButton.setBounds(Gdx.graphics.getWidth()/2.704f, 840, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.damageQuantityButton.setBounds(Gdx.graphics.getWidth()/2.704f, 760, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.healingQuantityButton.setBounds(Gdx.graphics.getWidth()/2.704f, 680, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.defensiveMessagesButton.setBounds(Gdx.graphics.getWidth()/2.704f, 600, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.hourButton.setBounds(Gdx.graphics.getWidth()/2.704f, 520, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);
		this.showLanguagesButton.setBounds(960, 795, 50, 50);
		this.chooseEnglishButton.setBounds(715, 735, 295, 55);
		this.chooseSpanishButton.setBounds(715, 675, 295, 55);
		this.showMonitorsButton.setBounds(960, 795, 50, 50);
		this.chooseFullScreenButton.setBounds(715, 735, 295, 55);
		this.chooseWindowedFullScreenButton.setBounds(715, 675, 295, 55);
		this.showStatsButton.setBounds(Gdx.graphics.getWidth()/2.704f, 440, Gdx.graphics.getWidth()/54.85f, Gdx.graphics.getHeight()/30.85f);

		this.buttonsGroup.addActor(this.videoButton);
		this.buttonsGroup.addActor(this.volumeButton);
		this.buttonsGroup.addActor(this.gameButton);
		this.buttonsGroup.addActor(this.languageButton);
		this.buttonsGroup.addActor(this.shortCutButton);
		this.buttonsGroup.addActor(this.initialConfigurationButton);
		this.buttonsGroup.addActor(this.cancelButton);
		this.buttonsGroup.addActor(this.applyButton);
		this.buttonsGroup.addActor(this.acceptButton);
		this.buttonsGroup.addActor(this.backMainMenuButton);
		this.buttonsGroup.addActor(this.lockCursorButton);
		this.buttonsGroup.addActor(this.VSyncButton);
		this.buttonsGroup.addActor(this.biggerCursorButton);
		this.buttonsGroup.addActor(this.moreFPS);
		this.buttonsGroup.addActor(this.lessFPS);
		this.buttonsGroup.addActor(this.moreMasterVolumeButton);
		this.buttonsGroup.addActor(this.lessMasterVolumeButton);
		this.buttonsGroup.addActor(this.moreEffectsVolumeButton);
		this.buttonsGroup.addActor(this.lessEffectsVolumeButton);
		this.buttonsGroup.addActor(this.moreEnvironmentalVolumeButton);
		this.buttonsGroup.addActor(this.lessEnvironmentalVolumeButton);
		this.buttonsGroup.addActor(this.moreMusicVolumeButton);
		this.buttonsGroup.addActor(this.lessMusicVolumeButton);
		this.buttonsGroup.addActor(this.activateAndDeactivateAllSounds);
		this.buttonsGroup.addActor(this.activateAndDeactivateMusic);
		this.buttonsGroup.addActor(this.lifeMonstersBarButton);
		this.buttonsGroup.addActor(this.damageQuantityButton);
		this.buttonsGroup.addActor(this.healingQuantityButton);
		this.buttonsGroup.addActor(this.defensiveMessagesButton);
		this.buttonsGroup.addActor(this.hourButton);
		this.buttonsGroup.addActor(this.showLanguagesButton);
		this.buttonsGroup.addActor(this.chooseEnglishButton);
		this.buttonsGroup.addActor(this.chooseSpanishButton);
		this.buttonsGroup.addActor(this.showMonitorsButton);
		this.buttonsGroup.addActor(this.chooseFullScreenButton);
		this.buttonsGroup.addActor(this.chooseWindowedFullScreenButton);
		this.buttonsGroup.addActor(this.showStatsButton);
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
		super.batch.draw(World.darkButton, this.volumeButton.getX(), this.volumeButton.getY(), this.volumeButton.getWidth(), this.volumeButton.getHeight());
		super.batch.draw(World.darkButton, this.gameButton.getX(), this.gameButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());
		super.batch.draw(World.darkButton, this.languageButton.getX(), this.languageButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());
		super.batch.draw(World.darkButton, this.shortCutButton.getX(), this.shortCutButton.getY(), this.shortCutButton.getWidth(), this.shortCutButton.getHeight());
		super.batch.draw(World.darkButton, this.initialConfigurationButton.getX(), this.initialConfigurationButton.getY(), this.initialConfigurationButton.getWidth(), this.initialConfigurationButton.getHeight());
		super.batch.draw(World.darkButton, this.cancelButton.getX(), this.cancelButton.getY(), this.cancelButton.getWidth(), this.cancelButton.getHeight());
		super.batch.draw(World.darkButton, this.applyButton.getX(), this.applyButton.getY(), this.applyButton.getWidth(), this.applyButton.getHeight());
		super.batch.draw(World.darkButton, this.acceptButton.getX(), this.acceptButton.getY(), this.acceptButton.getWidth(), this.acceptButton.getHeight());
		super.batch.draw(World.darkButton, this.backMainMenuButton.getX(), this.backMainMenuButton.getY(), this.backMainMenuButton.getWidth(), this.backMainMenuButton.getHeight());

		if(this.videoButton.isOver()) {
			super.batch.draw(World.lightButton, this.videoButton.getX(), this.videoButton.getY(), this.videoButton.getWidth(), this.videoButton.getHeight());
			this.volumeButtonPlayed = false;
			if(this.videoButtonPlayed == false && this.videoButtonPressed == false) {
				this.videoButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.volumeButton.isOver()) {
			super.batch.draw(World.lightButton, this.volumeButton.getX(), this.volumeButton.getY(), this.volumeButton.getWidth(), this.volumeButton.getHeight());
			this.videoButtonPlayed = false;
			this.gameButtonPlayed = false;
			if(this.volumeButtonPlayed == false && this.volumeButtonPressed == false) {
				this.volumeButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.gameButton.isOver()) {
			super.batch.draw(World.lightButton, this.gameButton.getX(), this.gameButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());
			this.volumeButtonPlayed = false;
			this.languageButtonPlayed = false;
			if(this.gameButtonPlayed == false && this.gameButtonPressed == false) {
				this.gameButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.languageButton.isOver()) {
			super.batch.draw(World.lightButton, this.languageButton.getX(), this.languageButton.getY(), this.languageButton.getWidth(), this.languageButton.getHeight());
			this.gameButtonPlayed = false;
			this.shortCutButtonPlayed = false;
			if(this.languageButtonPlayed == false && this.languageButtonPressed == false) {
				this.languageButtonPlayed = true;
				World.clickSound.play();
			}
		}else if(this.shortCutButton.isOver()) {
			super.batch.draw(World.lightButton, this.shortCutButton.getX(), this.shortCutButton.getY(), this.shortCutButton.getWidth(), this.shortCutButton.getHeight());
			this.languageButtonPlayed = false;
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
			this.volumeButtonPlayed = false;
			this.gameButtonPlayed = false;
			this.languageButtonPlayed = false;
			this.shortCutButtonPlayed = false;
			this.initialConfigurationButtonPlayed = false;
			this.cancelButtonPlayed = false;
			this.applyButtonPlayed = false;
			this.acceptButtonPlayed = false;
			this.backMainMenuButtonPlayed = false;
		}

		if(this.videoButton.isPressed()) {
			this.videoButtonPressed = true;
			this.volumeButtonPressed = false;
			this.gameButtonPressed = false;
			this.languageButtonPressed = false;
			this.shortCutButtonPressed = false;
			this.reiniciateTableStates();
		}else if(this.volumeButton.isPressed()) {
			this.videoButtonPressed = false;
			this.volumeButtonPressed = true;
			this.gameButtonPressed = false;
			this.languageButtonPressed = false;
			this.shortCutButtonPressed = false;
			this.reiniciateTableStates();
		}else if(this.gameButton.isPressed()) {
			this.videoButtonPressed = false;
			this.volumeButtonPressed = false;
			this.gameButtonPressed = true;
			this.languageButtonPressed = false;
			this.shortCutButtonPressed = false;
			this.reiniciateTableStates();
		}else if(this.languageButton.isPressed()) {
			this.videoButtonPressed = false;
			this.volumeButtonPressed = false;
			this.gameButtonPressed = false;
			this.languageButtonPressed = true;
			this.shortCutButtonPressed = false;
			this.reiniciateTableStates();
		}else if(this.shortCutButton.isPressed()) {
			this.videoButtonPressed = false;
			this.volumeButtonPressed = false;
			this.gameButtonPressed = false;
			this.languageButtonPressed = false;
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
			super.batch.draw(World.leftLittleFrame, 710, 790, 5, 60);
			super.batch.draw(World.bottomLittleFrame, 710, 790, 300, 5);
			super.batch.draw(World.topLittleFrame, 710, 845, 300, 5);
			super.batch.draw(World.rightLittleFrame, 1010, 790, 5, 60);
			super.batch.draw(World.topLeftLittleFrame, 710, 830, 20, 20);
			super.batch.draw(World.topRightLittleFrame, 995, 830, 20, 20);
			super.batch.draw(World.bottomLeftLittleFrame, 710, 790, 20, 20);
			super.batch.draw(World.bottomRightLittleFrame, 995, 790, 20, 20);
			super.batch.draw(World.backFrame, 715, 795, 295, 50);
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
				
				super.batch.draw(World.leftLittleFrame, 710, 670, 5, 120);
				super.batch.draw(World.bottomLittleFrame, 710, 670, 300, 5);
				super.batch.draw(World.rightLittleFrame, 1010, 670, 5, 120);
				super.batch.draw(World.bottomLittleFrame, 710, 730, 300, 5);
				super.batch.draw(this.leftLittleConection, 710, 775, 20, 35);
				super.batch.draw(this.leftLittleConection, 710, 715, 20, 35);
				super.batch.draw(this.rightLittleConection, 995, 775, 20, 35);
				super.batch.draw(this.rightLittleConection, 995, 715, 20, 35);
				super.batch.draw(World.bottomLeftLittleFrame, 710, 670, 20, 20);
				super.batch.draw(World.bottomRightLittleFrame, 995, 670, 20, 20);
				super.batch.draw(World.backFrame, 715, 795, 295, 50);
				super.batch.draw(World.backFrame, 715, 735, 295, 55);
				super.batch.draw(World.backFrame, 715, 675, 295, 55);
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
				super.font.draw(super.batch, "Full screen", 720, 770);
				super.font.draw(super.batch, "Windowed(Full screen)", 720, 710);
			}else {
				this.buttonsStage.getRoot().removeActor(this.chooseFullScreenButton);
				this.buttonsStage.getRoot().removeActor(this.chooseWindowedFullScreenButton);
			}
			super.batch.draw(this.smallTextBoxBorderless, 960, 795, 50, 50);
			if(this.showMonitorsButtonPressed == false && this.showMonitorsButtonPressedOneTime == false) {
				super.batch.draw(this.downButton, this.showMonitorsButton.getX()+10, this.showMonitorsButton.getY()+10, this.showMonitorsButton.getWidth()/1.5f, this.showMonitorsButton.getHeight()/1.5f);
			}else if(this.showMonitorsButtonPressed == true && this.showMonitorsButtonPressedOneTime == false) {
				super.batch.draw(this.pressedDownButton, this.showMonitorsButton.getX()+10, this.showMonitorsButton.getY()+10, this.showMonitorsButton.getWidth()/1.5f, this.showMonitorsButton.getHeight()/1.5f);
			}else if(this.showMonitorsButtonPressed == true && this.showMonitorsButtonPressedOneTime == true) {
				super.batch.draw(this.upButton, this.showMonitorsButton.getX()+10, this.showMonitorsButton.getY()+10, this.showMonitorsButton.getWidth()/1.5f, this.showMonitorsButton.getHeight()/1.5f);
			}else if(this.showMonitorsButtonPressed == false && this.showMonitorsButtonPressedOneTime == true) {
				super.batch.draw(this.pressedUpButton, this.showMonitorsButton.getX()+10, this.showMonitorsButton.getY()+10, this.showMonitorsButton.getWidth()/1.5f, this.showMonitorsButton.getHeight()/1.5f);
			}
			if(this.showMonitorsButton.isPressed() && this.showMonitorsButtonPlayed == false) {
				World.clickSound.play();
				this.showMonitorsButtonPlayed = true;
			}else if(!this.showMonitorsButton.isPressed()) this.showMonitorsButtonPlayed = false;
			super.font.draw(super.batch, this.choosedMonitor, 720, 830);

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
			super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.6024f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/2.0104f, Gdx.graphics.getHeight()/2.6024f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.6024f, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.2736f, Gdx.graphics.getWidth()/7.68f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.3478f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.6024f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.topRightLittleFrame, Gdx.graphics.getWidth()/2.0425f, Gdx.graphics.getHeight()/2.3478f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/2.0425f, Gdx.graphics.getHeight()/2.6024f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/2.5714f, Gdx.graphics.getWidth()/8f, Gdx.graphics.getHeight()/19.633f);
			super.batch.draw(this.plusButton, this.moreFPS.getX(), this.moreFPS.getY(), this.moreFPS.getWidth(), this.moreFPS.getHeight());
			if(this.moreFPS.isPressed() && this.moreFPSButtonPressed == false) {
				if(this.integerFPS < 120) this.integerFPS += 10;
				this.moreFPSButtonPressed = true;
				World.clickSound.play();
			}else if(!this.moreFPS.isPressed()) this.moreFPSButtonPressed = false;
			if(this.moreFPS.isPressed()) super.batch.draw(this.pressedPlusButton, this.moreFPS.getX(), this.moreFPS.getY(), this.moreFPS.getWidth(), this.moreFPS.getHeight());
			super.batch.draw(this.minusButton, this.lessFPS.getX(), this.lessFPS.getY(), this.lessFPS.getWidth(), this.lessFPS.getHeight());
			if(this.lessFPS.isPressed() && this.lessFPSButtonPressed == false) {
				if(this.integerFPS > 10) this.integerFPS -= 10;
				this.lessFPSButtonPressed = true;
				World.clickSound.play();
			}else if(!this.lessFPS.isPressed()) this.lessFPSButtonPressed = false;
			if(this.lessFPS.isPressed()) super.batch.draw(this.pressedMinusButton, this.lessFPS.getX(), this.lessFPS.getY(), this.lessFPS.getWidth(), this.lessFPS.getHeight());
			if(this.integerFPS >= 10) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.6666f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 20) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5945f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 30) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5263f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 40) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4615f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 50) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 60) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.3414f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 70) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2857f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 80) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 90) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.1818f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 100) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.13333f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 110) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.0869f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.integerFPS >= 120) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.0425f, Gdx.graphics.getHeight()/2.541f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			super.font.draw(super.batch, String.valueOf(Math.round(this.integerFPS)), Gdx.graphics.getWidth()/2.3703f, Gdx.graphics.getHeight()/2.1259f);
		}else if(this.volumeButtonPressed == true) {
			this.buttonsStage.getRoot().removeActor(this.showLanguagesButton);
			this.buttonsStage.getRoot().removeActor(this.showMonitorsButton);
			
			super.batch.draw(World.pressedButton, this.volumeButton.getX(), this.volumeButton.getY(), this.volumeButton.getWidth(), this.volumeButton.getHeight());
			
			super.font.draw(super.batch, "Master volume:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2413f);
			super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.3935f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/2.0983f, Gdx.graphics.getHeight()/1.3935f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.3935f, Gdx.graphics.getWidth()/9.1428f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.2934f, Gdx.graphics.getWidth()/9.1428f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.31707f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.3935f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.topRightLittleFrame, Gdx.graphics.getWidth()/2.1333f, Gdx.graphics.getHeight()/1.31707f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/2.1333f, Gdx.graphics.getHeight()/1.3935f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.3846f, Gdx.graphics.getWidth()/9.6f, Gdx.graphics.getHeight()/19.633f);
			super.batch.draw(this.plusButton, this.moreMasterVolumeButton.getX(), this.moreMasterVolumeButton.getY(), this.moreMasterVolumeButton.getWidth(), this.moreMasterVolumeButton.getHeight());
			if(this.moreMasterVolumeButton.isPressed() && this.moreMasterVolumeButtonPressed == false) {
				if(this.masterVolume < 100) this.masterVolume += 10;
				this.moreMasterVolumeButtonPressed = true;
				World.clickSound.play();
			}else if(!this.moreMasterVolumeButton.isPressed()) this.moreMasterVolumeButtonPressed = false;
			if(this.moreMasterVolumeButton.isPressed()) super.batch.draw(this.pressedPlusButton, this.moreMasterVolumeButton.getX(), this.moreMasterVolumeButton.getY(), this.moreMasterVolumeButton.getWidth(), this.moreMasterVolumeButton.getHeight());
			super.batch.draw(this.minusButton, this.lessMasterVolumeButton.getX(), this.lessMasterVolumeButton.getY(), this.lessMasterVolumeButton.getWidth(), this.lessMasterVolumeButton.getHeight());
			if(this.lessMasterVolumeButton.isPressed() && this.lessMasterVolumeButtonPressed == false) {
				if(this.masterVolume > 0) this.masterVolume -= 10;
				this.lessMasterVolumeButtonPressed = true;
				World.clickSound.play();
			}else if(!this.lessMasterVolumeButton.isPressed()) this.lessMasterVolumeButtonPressed = false;
			if(this.lessMasterVolumeButton.isPressed()) super.batch.draw(this.pressedMinusButton, this.lessMasterVolumeButton.getX(), this.lessMasterVolumeButton.getY(), this.lessMasterVolumeButton.getWidth(), this.lessMasterVolumeButton.getHeight());
			if(this.masterVolume >= 10) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.6666f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 20) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5945f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 30) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5263f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 40) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4615f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 50) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 60) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.3414f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 70) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2857f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 80) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 90) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.1818f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.masterVolume >= 100) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.13333f, Gdx.graphics.getHeight()/1.3757f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			super.font.draw(super.batch, String.valueOf(Math.round(this.masterVolume)), Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/1.2442f);

			super.font.draw(super.batch, "Effects volume:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.421f);
			super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.62406f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/2.0983f, Gdx.graphics.getHeight()/1.62406f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.62406f, Gdx.graphics.getWidth()/9.1428f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.4896f, Gdx.graphics.getWidth()/9.1428f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.5211f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.62406f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.topRightLittleFrame, Gdx.graphics.getWidth()/2.1333f, Gdx.graphics.getHeight()/1.5211f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/2.1333f, Gdx.graphics.getHeight()/1.62406f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.6119f, Gdx.graphics.getWidth()/9.6f, Gdx.graphics.getHeight()/19.633f);
			super.batch.draw(this.plusButton, this.moreEffectsVolumeButton.getX(), this.moreEffectsVolumeButton.getY(), this.moreEffectsVolumeButton.getWidth(), this.moreEffectsVolumeButton.getHeight());
			if(this.moreEffectsVolumeButton.isPressed() && this.moreEffectsVolumeButtonPressed == false) {
				if(this.effectsVolume < 100) this.effectsVolume += 10;
				this.moreEffectsVolumeButtonPressed = true;
				World.clickSound.play();
			}else if(!this.moreEffectsVolumeButton.isPressed()) this.moreEffectsVolumeButtonPressed = false;
			if(this.moreEffectsVolumeButton.isPressed()) super.batch.draw(this.pressedPlusButton, this.moreEffectsVolumeButton.getX(), this.moreEffectsVolumeButton.getY(), this.moreEffectsVolumeButton.getWidth(), this.moreEffectsVolumeButton.getHeight());
			super.batch.draw(this.minusButton, this.lessEffectsVolumeButton.getX(), this.lessEffectsVolumeButton.getY(), this.lessEffectsVolumeButton.getWidth(), this.lessEffectsVolumeButton.getHeight());	
			if(this.lessEffectsVolumeButton.isPressed() && this.lessEffectsVolumeButtonPressed == false) {
				if(this.effectsVolume > 0) this.effectsVolume -= 10;
				this.lessEffectsVolumeButtonPressed = true;
				World.clickSound.play();
			}else if(!this.lessEffectsVolumeButton.isPressed()) this.lessEffectsVolumeButtonPressed = false;
			if(this.lessEffectsVolumeButton.isPressed()) super.batch.draw(this.pressedMinusButton, this.lessEffectsVolumeButton.getX(), this.lessEffectsVolumeButton.getY(), this.lessEffectsVolumeButton.getWidth(), this.lessEffectsVolumeButton.getHeight());
			if(this.effectsVolume >= 10) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.6666f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 20) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5945f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 30) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5263f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 40) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4615f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 50) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 60) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.3414f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 70) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2857f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 80) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 90) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.1818f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.effectsVolume >= 100) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.13333f, Gdx.graphics.getHeight()/1.6f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			super.font.draw(super.batch, String.valueOf(Math.round(this.effectsVolume)), Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/1.4248f);

			super.font.draw(super.batch, "Environmental volume:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.6615f);
			super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.9459f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/2.0983f, Gdx.graphics.getHeight()/1.9459f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.9459f, Gdx.graphics.getWidth()/9.1428f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.75609f, Gdx.graphics.getWidth()/9.1428f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.8f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/1.9459f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.topRightLittleFrame, Gdx.graphics.getWidth()/2.1333f, Gdx.graphics.getHeight()/1.8f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/2.1333f, Gdx.graphics.getHeight()/1.9459f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/1.9285f, Gdx.graphics.getWidth()/9.6f, Gdx.graphics.getHeight()/19.633f);
			super.batch.draw(this.plusButton, this.moreEnvironmentalVolumeButton.getX(), this.moreEnvironmentalVolumeButton.getY(), this.moreEnvironmentalVolumeButton.getWidth(), this.moreEnvironmentalVolumeButton.getHeight());
			if(this.moreEnvironmentalVolumeButton.isPressed() && this.moreEnvironmentalVolumeButtonPressed == false) {
				if(this.environmentalVolume < 100) this.environmentalVolume += 10;
				this.moreEnvironmentalVolumeButtonPressed = true;
				World.clickSound.play();
			}else if(!this.moreEnvironmentalVolumeButton.isPressed()) this.moreEnvironmentalVolumeButtonPressed = false;
			if(this.moreEnvironmentalVolumeButton.isPressed()) super.batch.draw(this.pressedPlusButton, this.moreEnvironmentalVolumeButton.getX(), this.moreEnvironmentalVolumeButton.getY(), this.moreEnvironmentalVolumeButton.getWidth(), this.moreEnvironmentalVolumeButton.getHeight());
			super.batch.draw(this.minusButton, this.lessEnvironmentalVolumeButton.getX(), this.lessEnvironmentalVolumeButton.getY(), this.lessEnvironmentalVolumeButton.getWidth(), this.lessEnvironmentalVolumeButton.getHeight());
			if(this.lessEnvironmentalVolumeButton.isPressed() && this.lessEnvironmentalVolumeButtonPressed == false) {
				if(this.environmentalVolume > 0) this.environmentalVolume -= 10;
				this.lessEnvironmentalVolumeButtonPressed = true;
				World.clickSound.play();
			}else if(!this.lessEnvironmentalVolumeButton.isPressed()) this.lessEnvironmentalVolumeButtonPressed = false;
			if(this.lessEnvironmentalVolumeButton.isPressed()) super.batch.draw(this.pressedMinusButton, this.lessEnvironmentalVolumeButton.getX(), this.lessEnvironmentalVolumeButton.getY(), this.lessEnvironmentalVolumeButton.getWidth(), this.lessEnvironmentalVolumeButton.getHeight());
			if(this.environmentalVolume >= 10) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.6666f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 20) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5945f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 30) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5263f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 40) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4615f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 50) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 60) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.3414f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 70) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2857f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 80) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 90) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.1818f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.environmentalVolume >= 100) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.13333f, Gdx.graphics.getHeight()/1.9115f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			super.font.draw(super.batch, String.valueOf(Math.round(this.environmentalVolume)), Gdx.graphics.getWidth()/2.0645f, Gdx.graphics.getHeight()/1.6666f);

			super.font.draw(super.batch, "Music volume:", Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2f);
			super.batch.draw(World.leftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.4269f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.rightLittleFrame, Gdx.graphics.getWidth()/2.0983f, Gdx.graphics.getHeight()/2.4269f, Gdx.graphics.getWidth()/384f, Gdx.graphics.getHeight()/16.615f);
			super.batch.draw(World.bottomLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.4269f, Gdx.graphics.getWidth()/9.1428f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.1386f, Gdx.graphics.getWidth()/9.1428f, Gdx.graphics.getHeight()/216f);
			super.batch.draw(World.topLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.20408f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomLeftLittleFrame, Gdx.graphics.getWidth()/2.7042f, Gdx.graphics.getHeight()/2.4269f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.topRightLittleFrame, Gdx.graphics.getWidth()/2.1333f, Gdx.graphics.getHeight()/2.20408f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.bottomRightLittleFrame, Gdx.graphics.getWidth()/2.1333f, Gdx.graphics.getHeight()/2.4269f, Gdx.graphics.getWidth()/96f, Gdx.graphics.getHeight()/54f);
			super.batch.draw(World.backFrame, Gdx.graphics.getWidth()/2.6853f, Gdx.graphics.getHeight()/2.4f, Gdx.graphics.getWidth()/9.6f, Gdx.graphics.getHeight()/19.633f);
			super.batch.draw(this.plusButton, this.moreMusicVolumeButton.getX(), this.moreMusicVolumeButton.getY(), this.moreMusicVolumeButton.getWidth(), this.moreMusicVolumeButton.getHeight());
			if(this.moreMusicVolumeButton.isPressed() && this.moreMusicVolumeButtonPressed == false) {
				if(this.musicVolume < 100) this.musicVolume += 10;
				this.moreMusicVolumeButtonPressed = true;
				World.clickSound.play();
			}else if(!this.moreMusicVolumeButton.isPressed()) this.moreMusicVolumeButtonPressed = false;
			if(this.moreMusicVolumeButton.isPressed()) super.batch.draw(this.pressedPlusButton, this.moreMusicVolumeButton.getX(), this.moreMusicVolumeButton.getY(), this.moreMusicVolumeButton.getWidth(), this.moreMusicVolumeButton.getHeight());
			super.batch.draw(this.minusButton, this.lessMusicVolumeButton.getX(), this.lessMusicVolumeButton.getY(), this.lessMusicVolumeButton.getWidth(), this.lessMusicVolumeButton.getHeight());
			if(this.lessMusicVolumeButton.isPressed() && this.lessMusicVolumeButtonPressed == false) {
				if(this.musicVolume > 0) this.musicVolume -= 10;
				this.lessMusicVolumeButtonPressed = true;
				World.clickSound.play();
			}else if(!this.lessMusicVolumeButton.isPressed()) this.lessMusicVolumeButtonPressed = false;
			if(this.lessMusicVolumeButton.isPressed()) super.batch.draw(this.pressedMinusButton, this.lessMusicVolumeButton.getX(), this.lessMusicVolumeButton.getY(), this.lessMusicVolumeButton.getWidth(), this.lessMusicVolumeButton.getHeight());
			if(this.musicVolume >= 10) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.6666f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 20) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5945f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 30) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.5263f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 40) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4615f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 50) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.4f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 60) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.3414f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 70) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2857f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 80) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.2325f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 90) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.1818f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			if(this.musicVolume >= 100) super.batch.draw(this.veryLightYellowFrame, Gdx.graphics.getWidth()/2.13333f, Gdx.graphics.getHeight()/2.3736f, Gdx.graphics.getWidth()/192f, Gdx.graphics.getHeight()/24f);
			super.font.draw(super.batch, String.valueOf(Math.round(this.musicVolume)), Gdx.graphics.getWidth()/2.2588f, Gdx.graphics.getHeight()/2.0074f);

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
			this.buttonsStage.getRoot().removeActor(this.chooseEnglishButton);
			this.buttonsStage.getRoot().removeActor(this.chooseSpanishButton);
			this.buttonsStage.getRoot().removeActor(this.chooseFullScreenButton);
			this.buttonsStage.getRoot().removeActor(this.chooseWindowedFullScreenButton);
			
			super.batch.draw(World.pressedButton, this.gameButton.getX(), this.gameButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());

			super.batch.draw(this.checkBox, this.lifeMonstersBarButton.getX(), this.lifeMonstersBarButton.getY(), this.lifeMonstersBarButton.getWidth(), this.lifeMonstersBarButton.getHeight());
			if(this.lifeMonstersBarButton.isPressed()) {
				if(this.lifeMonstersBarButtonPressedOneTime == true) this.lifeMonstersBarButtonPressed = false;
				else this.lifeMonstersBarButtonPressed = true;
			}else if(!this.lifeMonstersBarButton.isPressed()) {
				if(this.lifeMonstersBarButtonPressed == true) this.lifeMonstersBarButtonPressedOneTime = true;
				else this.lifeMonstersBarButtonPressedOneTime = false;
			}
			if(lifeMonstersBarButtonPressed == true) super.batch.draw(this.checkedBox, this.lifeMonstersBarButton.getX(), this.lifeMonstersBarButton.getY(), this.lifeMonstersBarButton.getWidth()+4, this.lifeMonstersBarButton.getHeight());
			if(this.lifeMonstersBarButton.isPressed() && this.lifeMonstersBarButtonPlayed == false) {
				World.clickSound.play();
				this.lifeMonstersBarButtonPlayed = true;
			}else if(!this.lifeMonstersBarButton.isPressed()) this.lifeMonstersBarButtonPlayed = false;
			super.font.draw(super.batch, "Show monsters life bar", 750, 865);

			super.batch.draw(this.checkBox, this.damageQuantityButton.getX(), this.damageQuantityButton.getY(), this.damageQuantityButton.getWidth(), this.damageQuantityButton.getHeight());
			if(this.damageQuantityButton.isPressed()) {
				if(this.damageQuantityButtonPressedOneTime == true) this.damageQuantityButtonPressed = false;
				else this.damageQuantityButtonPressed = true;
			}else if(!this.damageQuantityButton.isPressed()) {
				if(this.damageQuantityButtonPressed == true) this.damageQuantityButtonPressedOneTime = true;
				else this.damageQuantityButtonPressedOneTime = false;
			}
			if(damageQuantityButtonPressed == true) super.batch.draw(this.checkedBox, this.damageQuantityButton.getX(), this.damageQuantityButton.getY(), this.damageQuantityButton.getWidth()+4, this.damageQuantityButton.getHeight());
			if(this.damageQuantityButton.isPressed() && this.damageQuantityButtonPlayed == false) {
				World.clickSound.play();
				this.damageQuantityButtonPlayed = true;
			}else if(!this.damageQuantityButton.isPressed()) this.damageQuantityButtonPlayed = false;
			super.font.draw(super.batch, "Show  damage deal to enemies", 750, 785);

			super.batch.draw(this.checkBox, this.healingQuantityButton.getX(), this.healingQuantityButton.getY(), this.healingQuantityButton.getWidth(), this.healingQuantityButton.getHeight());
			if(this.healingQuantityButton.isPressed()) {
				if(this.healingQuantityButtonPressedOneTime == true) this.healingQuantityButtonPressed = false;
				else this.healingQuantityButtonPressed = true;
			}else if(!this.healingQuantityButton.isPressed()) {
				if(this.healingQuantityButtonPressed == true) this.healingQuantityButtonPressedOneTime = true;
				else this.healingQuantityButtonPressedOneTime = false;
			}
			if(healingQuantityButtonPressed == true) super.batch.draw(this.checkedBox, this.healingQuantityButton.getX(), this.healingQuantityButton.getY(), this.healingQuantityButton.getWidth()+4, this.healingQuantityButton.getHeight());
			if(this.healingQuantityButton.isPressed() && this.healingQuantityButtonPlayed == false) {
				World.clickSound.play();
				this.healingQuantityButtonPlayed = true;
			}else if(!this.healingQuantityButton.isPressed()) this.healingQuantityButtonPlayed = false;
			super.font.draw(super.batch, "Show healing", 750, 705);

			super.batch.draw(this.checkBox, this.defensiveMessagesButton.getX(), this.defensiveMessagesButton.getY(), this.defensiveMessagesButton.getWidth(), this.defensiveMessagesButton.getHeight());
			if(this.defensiveMessagesButton.isPressed()) {
				if(this.defensiveMessagesButtonPressedOneTime == true) this.defensiveMessagesButtonPressed = false;
				else this.defensiveMessagesButtonPressed = true;
			}else if(!this.defensiveMessagesButton.isPressed()) {
				if(this.defensiveMessagesButtonPressed == true) this.defensiveMessagesButtonPressedOneTime = true;
				else this.defensiveMessagesButtonPressedOneTime = false;
			}
			if(defensiveMessagesButtonPressed == true) super.batch.draw(this.checkedBox, this.defensiveMessagesButton.getX(), this.defensiveMessagesButton.getY(), this.defensiveMessagesButton.getWidth()+4, this.defensiveMessagesButton.getHeight());
			if(this.defensiveMessagesButton.isPressed() && this.defensiveMessagesButtonPlayed == false) {
				World.clickSound.play();
				this.defensiveMessagesButtonPlayed = true;
			}else if(!this.defensiveMessagesButton.isPressed()) this.defensiveMessagesButtonPlayed = false;
			super.font.draw(super.batch, "Show defensive messages", 750, 625);

			super.batch.draw(this.checkBox, this.hourButton.getX(), this.hourButton.getY(), this.hourButton.getWidth(), this.hourButton.getHeight());
			if(this.hourButton.isPressed()) {
				if(this.hourButtonPressedOneTime == true) this.hourButtonPressed = false;
				else this.hourButtonPressed = true;
			}else if(!this.hourButton.isPressed()) {
				if(this.hourButtonPressed == true) this.hourButtonPressedOneTime = true;
				else this.hourButtonPressedOneTime = false;
			}
			if(hourButtonPressed == true) super.batch.draw(this.checkedBox, this.hourButton.getX(), this.hourButton.getY(), this.hourButton.getWidth()+4, this.hourButton.getHeight());
			if(this.hourButton.isPressed() && this.hourButtonPlayed == false) {
				World.clickSound.play();
				this.hourButtonPlayed = true;
			}else if(!this.hourButton.isPressed()) this.hourButtonPlayed = false;
			super.font.draw(super.batch, "Show hour", 750, 545);
			
			super.batch.draw(this.checkBox, this.showStatsButton.getX(), this.showStatsButton.getY(), this.showStatsButton.getWidth(), this.showStatsButton.getHeight());
			if(this.showStatsButton.isPressed()) {
				if(this.showStatsButtonPressedOneTime == true) this.showStatsButtonPressed = false;
				else this.showStatsButtonPressed = true;
			}else if(!this.showStatsButton.isPressed()) {
				if(this.showStatsButtonPressed == true) this.showStatsButtonPressedOneTime = true;
				else this.showStatsButtonPressedOneTime = false;
			}
			if(showStatsButtonPressed == true) super.batch.draw(this.checkedBox, this.showStatsButton.getX(), this.showStatsButton.getY(), this.showStatsButton.getWidth()+4, this.showStatsButton.getHeight());
			if(this.showStatsButton.isPressed() && this.showStatsButtonPlayed == false) {
				World.clickSound.play();
				this.showStatsButtonPlayed = true;
			}else if(!this.showStatsButton.isPressed()) this.showStatsButtonPlayed = false;
			super.font.draw(super.batch, "Show player stats", 750, 465);
		}else if(this.languageButtonPressed == true) {
			this.buttonsGroup.addActor(this.showLanguagesButton);
			this.buttonsGroup.addActor(this.chooseEnglishButton);
			this.buttonsGroup.addActor(this.chooseSpanishButton);
			super.batch.draw(World.pressedButton, this.languageButton.getX(), this.languageButton.getY(), this.languageButton.getWidth(), this.languageButton.getHeight());
			super.font.draw(super.batch, "Language selection", 710, 880);
			super.batch.draw(World.leftLittleFrame, 710, 790, 5, 60);
			super.batch.draw(World.bottomLittleFrame, 710, 790, 300, 5);
			super.batch.draw(World.topLittleFrame, 710, 845, 300, 5);
			super.batch.draw(World.rightLittleFrame, 1010, 790, 5, 60);
			super.batch.draw(World.topLeftLittleFrame, 710, 830, 20, 20);
			super.batch.draw(World.topRightLittleFrame, 995, 830, 20, 20);
			super.batch.draw(World.bottomLeftLittleFrame, 710, 790, 20, 20);
			super.batch.draw(World.bottomRightLittleFrame, 995, 790, 20, 20);
			super.batch.draw(World.backFrame, 715, 795, 295, 50);
			if(this.showLanguagesButton.isPressed()) {
				if(this.showLanguagesButtonPressedOneTime == true) this.showLanguagesButtonPressed = false;
				else this.showLanguagesButtonPressed = true;
			}else if(!this.showLanguagesButton.isPressed()) {
				if(this.showLanguagesButtonPressed == true) this.showLanguagesButtonPressedOneTime = true;
				else this.showLanguagesButtonPressedOneTime = false;
			}
			if((this.showLanguagesButtonPressed == true && this.showLanguagesButtonPressedOneTime == true) || (this.showLanguagesButtonPressed == false && this.showLanguagesButtonPressedOneTime == true)) {
				super.batch.draw(World.leftLittleFrame, 710, 670, 5, 120);
				super.batch.draw(World.bottomLittleFrame, 710, 670, 300, 5);
				super.batch.draw(World.rightLittleFrame, 1010, 670, 5, 120);
				super.batch.draw(World.bottomLittleFrame, 710, 730, 300, 5);
				super.batch.draw(this.leftLittleConection, 710, 775, 20, 35);
				super.batch.draw(this.leftLittleConection, 710, 715, 20, 35);
				super.batch.draw(this.rightLittleConection, 995, 775, 20, 35);
				super.batch.draw(this.rightLittleConection, 995, 715, 20, 35);
				super.batch.draw(World.bottomLeftLittleFrame, 710, 670, 20, 20);
				super.batch.draw(World.bottomRightLittleFrame, 995, 670, 20, 20);
				super.batch.draw(World.backFrame, 715, 795, 295, 50);
				super.batch.draw(World.backFrame, 715, 735, 295, 55);
				super.batch.draw(World.backFrame, 715, 675, 295, 55);
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
				super.font.draw(super.batch, "English", 720, 770);
				super.font.draw(super.batch, "Spanish(Spain)", 720, 710);
			}
			super.batch.draw(this.smallTextBoxBorderless, 960, 795, 50, 50);
			if(this.showLanguagesButtonPressed == false && this.showLanguagesButtonPressedOneTime == false) {
				super.batch.draw(this.downButton, this.showLanguagesButton.getX()+10, this.showLanguagesButton.getY()+10, this.showLanguagesButton.getWidth()/1.5f, this.showLanguagesButton.getHeight()/1.5f);
			}else if(this.showLanguagesButtonPressed == true && this.showLanguagesButtonPressedOneTime == false) {
				super.batch.draw(this.pressedDownButton, this.showLanguagesButton.getX()+10, this.showLanguagesButton.getY()+10, this.showLanguagesButton.getWidth()/1.5f, this.showLanguagesButton.getHeight()/1.5f);
			}else if(this.showLanguagesButtonPressed == true && this.showLanguagesButtonPressedOneTime == true) {
				super.batch.draw(this.upButton, this.showLanguagesButton.getX()+10, this.showLanguagesButton.getY()+10, this.showLanguagesButton.getWidth()/1.5f, this.showLanguagesButton.getHeight()/1.5f);
			}else if(this.showLanguagesButtonPressed == false && this.showLanguagesButtonPressedOneTime == true) {
				super.batch.draw(this.pressedUpButton, this.showLanguagesButton.getX()+10, this.showLanguagesButton.getY()+10, this.showLanguagesButton.getWidth()/1.5f, this.showLanguagesButton.getHeight()/1.5f);
			}
			if(this.showLanguagesButton.isPressed() && this.showLanguagesButtonPlayed == false) {
				World.clickSound.play();
				this.showLanguagesButtonPlayed = true;
			}else if(!this.showLanguagesButton.isPressed()) this.showLanguagesButtonPlayed = false;
			super.font.draw(super.batch, this.choosedLanguage, 720, 830);
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
			this.fontForShortCutsNames.draw(super.batch, "Top movement", 750, 650);
			super.batch.draw(World.darkButton, 1180, 620, 300, 50);
			this.fontForShortCutsNames.draw(super.batch, "Up arrow", 1295, 653);
			super.batch.draw(World.bottomLittleFrame, 730, 610, 750, 3);
			this.fontForShortCutsNames.draw(super.batch, "Right movement", 750, 585);
			super.batch.draw(World.darkButton, 1180, 555, 300, 50);
			this.fontForShortCutsNames.draw(super.batch, "Right arrow", 1287, 585);
			super.batch.draw(World.bottomLittleFrame, 730, 545, 750, 3);
			this.fontForShortCutsNames.draw(super.batch, "Bottom movement", 750, 520);
			super.batch.draw(World.darkButton, 1180, 490, 300, 50);
			this.fontForShortCutsNames.draw(super.batch, "Down arrow", 1285, 520);
			super.batch.draw(World.bottomLittleFrame, 730, 480, 750, 3);
			this.fontForShortCutsNames.draw(super.batch, "Left movement", 750, 455);
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
		super.font.draw(super.batch, "VOLUME", Gdx.graphics.getWidth()/4.5714f, Gdx.graphics.getHeight()/1.36708f);
		super.font.draw(super.batch, "GAME", Gdx.graphics.getWidth()/4.4137f, Gdx.graphics.getHeight()/1.52112f);
		super.font.draw(super.batch, "LANGUAGE", Gdx.graphics.getWidth()/4.6829f, Gdx.graphics.getHeight()/1.71428f);
		super.font.draw(super.batch, "SHORTCUTS", Gdx.graphics.getWidth()/4.8f, Gdx.graphics.getHeight()/1.96363f);
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

package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class OptionsMenuScreen extends AbstractScreen{
	
	private Texture topframe, rightFrame, bottomFrame, leftFrame, topLeftFrame, topRightFrame, bottomLeftFrame, bottomRightFrame, topLittleFrame, topLeftLittleFrame, leftLittleFrame, bottomLeftLittleFrame,
					bottomLittleFrame, bottomRightLittleFrame, rightLittleFrame, topRightLittleFrame, topConection, rightConection, bottomConection, leftConection, backFrame, textBox, checkBox, checkedBox,
					plusButton, pressedPlusButton, minusButton, pressedMinusButton, veryLightYellowFrame;
	private Stage buttonsStage;
	private Button videoButton, volumeButton, gameButton, languageButton, shortCutButton, initialConfigurationButton, applyButton, cancelButton, acceptButton, backMainMenuButton,
				   lockCursorButton, VSyncButton, biggerCursorButton, moreFPS, lessFPS, moreMasterVolumeButton, lessMasterVolumeButton, moreEffectsVolumeButton, lessEffectsVolumeButton,
				   moreEnvironmentalVolumeButton, lessEnvironmentalVolumeButton, moreMusicVolumeButton, lessMusicVolumeButton;
	private boolean videoButtonPlayed, volumeButtonPlayed, gameButtonPlayed, languageButtonPlayed, shortCutButtonPlayed, initialConfigurationButtonPlayed, applyButtonPlayed, cancelButtonPlayed, acceptButtonPlayed,
					backMainMenuButtonPlayed, videoButtonPressed, volumeButtonPressed, gameButtonPressed, languageButtonPressed, shortCutButtonPressed, lockCursorButtonPressed, lockCursorButtonPressedOneTime,
					lockCursorButtonPlayed, VSyncButtonPressed, VSyncButtonPressedOneTime, VSyncButtonPlayed, biggerCursorButtonPressed, biggerCursorButtonPressedOneTime, biggerCursorButtonPlayed,
					moreFPSButtonPressed, lessFPSButtonPressed, moreMasterVolumeButtonPressed, lessMasterVolumeButtonPressed, moreEffectsVolumeButtonPressed, lessEffectsVolumeButtonPressed,
					moreEnvironmentalVolumeButtonPressed, lessEnvironmentalVolumeButtonPressed, moreMusicVolumeButtonPressed, lessMusicVolumeButtonPressed;
	private int integerFPS, masterVolume, effectsVolume, environmentalVolume, musicVolume;
	
	public OptionsMenuScreen() {
		
		super.font.setColor(Color.GOLDENROD);
		super.font.getData().setScale(1.5f, 1.5f);
		
		this.topframe = new Texture(Gdx.files.internal("OptionsMenuTextures/topFrame.png"));
		this.rightFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/rightFrame.png"));
		this.bottomFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/bottomFrame.png"));
		this.leftFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/leftFrame.png"));
		this.topLeftFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/topLeftFrame.png"));
		this.topRightFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/topRightFrame.png"));
		this.bottomLeftFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/bottomLeftFrame.png"));
		this.bottomRightFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/bottomRightFrame.png"));
		this.topConection = new Texture(Gdx.files.internal("OptionsMenuTextures/topConection.png"));
		this.rightConection = new Texture(Gdx.files.internal("OptionsMenuTextures/rightConection.png"));
		this.bottomConection = new Texture(Gdx.files.internal("OptionsMenuTextures/bottomConection.png"));
		this.leftConection = new Texture(Gdx.files.internal("OptionsMenuTextures/leftConection.png"));
		this.backFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/backFrame.png"));
		this.textBox = new Texture(Gdx.files.internal("OptionsMenuTextures/textBox.png"));
		this.checkBox = new Texture(Gdx.files.internal("OptionsMenuTextures/checkButton.png"));
		this.checkedBox = new Texture(Gdx.files.internal("OptionsMenuTextures/checkedButton.png"));
		this.topLittleFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/topLittleFrame.png"));
		this.topLeftLittleFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/topLeftLittleFrame.png"));
		this.leftLittleFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/leftLittleFrame.png"));
		this.bottomLeftLittleFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/bottomLeftLittleFrame.png"));
		this.bottomLittleFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/bottomLittleFrame.png"));
		this.bottomRightLittleFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/bottomRightLittleFrame.png"));
		this.rightLittleFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/rightLittleFrame.png"));
		this.topRightLittleFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/topRightLittleFrame.png"));
		this.plusButton = new Texture(Gdx.files.internal("OptionsMenuTextures/plusButton.png"));
		this.pressedPlusButton = new Texture(Gdx.files.internal("OptionsMenuTextures/pressedPlusButton.png"));
		this.minusButton = new Texture(Gdx.files.internal("OptionsMenuTextures/minusButton.png"));
		this.pressedMinusButton = new Texture(Gdx.files.internal("OptionsMenuTextures/pressedMinusButton.png"));
		this.veryLightYellowFrame = new Texture(Gdx.files.internal("OptionsMenuTextures/veryLightYellowFrame.png"));
		
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
		
		this.videoButtonPressed = true;
		this.volumeButtonPressed = false;
		this.gameButtonPressed = false;
		this.languageButtonPressed = false;
		this.shortCutButtonPressed = false;
		this.lockCursorButtonPressed = false;
		this.lockCursorButtonPressedOneTime = false;
		this.VSyncButtonPressed = false;
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
		
		this.integerFPS = 60;
		this.masterVolume = 50;
		this.effectsVolume = 50;
		this.environmentalVolume = 50;
		this.musicVolume = 50;
		
		this.buttonsStage = new Stage();
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
		
		this.videoButton.setBounds(290, 820, 350, 80);
		this.volumeButton.setBounds(290, 740, 350, 80);
		this.gameButton.setBounds(290, 660, 350, 80);
		this.languageButton.setBounds(290, 580, 350, 80);
		this.shortCutButton.setBounds(290, 500, 350, 80);
		this.initialConfigurationButton.setBounds(290, 160, 350, 80);
		this.cancelButton.setBounds(720, 160, 300, 80);
		this.applyButton.setBounds(1025, 160, 300, 80);
		this.acceptButton.setBounds(1330, 160, 300, 80);
		this.backMainMenuButton.setBounds(20, 20, 350, 80);
		this.lockCursorButton.setBounds(710, 670, 35, 35);
		this.VSyncButton.setBounds(710, 590, 35, 35);
		this.biggerCursorButton.setBounds(710, 510, 35, 35);
		this.moreFPS.setBounds(1020, 360, 40, 40);
		this.lessFPS.setBounds(970, 360, 40, 40);
		this.moreMasterVolumeButton.setBounds(980, 790, 40, 40);
		this.lessMasterVolumeButton.setBounds(930, 790, 40, 40);
		this.moreEffectsVolumeButton.setBounds(980, 680, 40, 40);
		this.lessEffectsVolumeButton.setBounds(930, 680, 40, 40);
		
		this.buttonsStage.addActor(this.videoButton);
		this.buttonsStage.addActor(this.volumeButton);
		this.buttonsStage.addActor(this.gameButton);
		this.buttonsStage.addActor(this.languageButton);
		this.buttonsStage.addActor(this.shortCutButton);
		this.buttonsStage.addActor(this.initialConfigurationButton);
		this.buttonsStage.addActor(this.cancelButton);
		this.buttonsStage.addActor(this.applyButton);
		this.buttonsStage.addActor(this.acceptButton);
		this.buttonsStage.addActor(this.backMainMenuButton);
		this.buttonsStage.addActor(this.lockCursorButton);
		this.buttonsStage.addActor(this.VSyncButton);
		this.buttonsStage.addActor(this.biggerCursorButton);
		this.buttonsStage.addActor(this.moreFPS);
		this.buttonsStage.addActor(this.lessFPS);
		this.buttonsStage.addActor(this.moreMasterVolumeButton);
		this.buttonsStage.addActor(this.lessMasterVolumeButton);
		this.buttonsStage.addActor(this.moreEffectsVolumeButton);
		this.buttonsStage.addActor(this.lessEffectsVolumeButton);
		this.buttonsStage.addActor(this.moreEnvironmentalVolumeButton);
		this.buttonsStage.addActor(this.lessEnvironmentalVolumeButton);
		this.buttonsStage.addActor(this.moreMusicVolumeButton);
		this.buttonsStage.addActor(this.lessMusicVolumeButton);
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
		super.batch.draw(World.mainPicture, 0, 0);
		super.batch.draw(this.bottomFrame, 250, 120, 1420, 30);
		super.batch.draw(this.topframe, 250, 925, 1420, 30);
		super.batch.draw(this.leftFrame, 250, 125, 30, 830);
		super.batch.draw(this.rightFrame, 1640, 125, 30, 830);
		super.batch.draw(this.topLeftFrame, 250, 925, 30, 30);
		super.batch.draw(this.topRightFrame, 1640, 925, 30, 30);
		super.batch.draw(this.bottomLeftFrame, 250, 120, 30, 30);
		super.batch.draw(this.bottomRightFrame, 1640, 120, 30, 30);
		super.batch.draw(this.backFrame, 280, 150, 1360, 775);
		super.batch.draw(this.rightFrame, 650, 250, 30, 655);
		super.batch.draw(this.bottomFrame, 250, 250, 1420, 30);
		super.batch.draw(this.topConection, 614, 888, 102, 67);
		super.batch.draw(this.bottomConection, 614, 250, 102, 67);
		super.batch.draw(this.leftConection, 250, 214, 67, 102);
		super.batch.draw(this.rightConection, 1603, 214, 67, 102);
		super.batch.draw(this.backFrame, 280, 280, 370, 645);
		super.batch.draw(this.backFrame, 680, 280, 960, 645);
		super.batch.draw(this.backFrame, 280, 150, 1360, 100);
		super.batch.draw(World.titleButton, 770, 900, 420, 80);
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
		}else if(this.volumeButton.isPressed()) {
			this.videoButtonPressed = false;
			this.volumeButtonPressed = true;
			this.gameButtonPressed = false;
			this.languageButtonPressed = false;
			this.shortCutButtonPressed = false;
		}else if(this.gameButton.isPressed()) {
			this.videoButtonPressed = false;
			this.volumeButtonPressed = false;
			this.gameButtonPressed = true;
			this.languageButtonPressed = false;
			this.shortCutButtonPressed = false;
		}else if(this.languageButton.isPressed()) {
			this.videoButtonPressed = false;
			this.volumeButtonPressed = false;
			this.gameButtonPressed = false;
			this.languageButtonPressed = true;
			this.shortCutButtonPressed = false;
		}else if(this.shortCutButton.isPressed()) {
			this.videoButtonPressed = false;
			this.volumeButtonPressed = false;
			this.gameButtonPressed = false;
			this.languageButtonPressed = false;
			this.shortCutButtonPressed = true;
		}
		
		if(this.videoButtonPressed == true) {
			super.batch.draw(World.pressedButton, this.videoButton.getX(), this.videoButton.getY(), this.videoButton.getWidth(), this.videoButton.getHeight());
			super.batch.draw(this.textBox, 710, 810, 270, 70);
			super.font.draw(super.batch, "SCREEN", 800, 850);
			super.font.draw(super.batch, "Monitor: ", 710, 770);
			super.batch.draw(this.textBox, 800, 740, 180, 40);
			super.font.draw(super.batch, "Full screen", 840, 770);
			
			super.batch.draw(this.checkBox, this.lockCursorButton.getX(), this.lockCursorButton.getY(), this.lockCursorButton.getWidth(), this.lockCursorButton.getHeight());
			if(this.lockCursorButton.isPressed()) {
				if(this.lockCursorButtonPressedOneTime == true) this.lockCursorButtonPressed = false;
				else this.lockCursorButtonPressed = true;
			}else if(!this.lockCursorButton.isPressed()) {
				if(this.lockCursorButtonPressed == true) this.lockCursorButtonPressedOneTime = true;
				else this.lockCursorButtonPressedOneTime = false;
			}
			if(lockCursorButtonPressed == true) super.batch.draw(this.checkedBox, this.lockCursorButton.getX(), this.lockCursorButton.getY(), this.lockCursorButton.getWidth()+4, this.lockCursorButton.getHeight());
			if(this.lockCursorButton.isPressed() && this.lockCursorButtonPlayed == false) {
				World.clickSound.play();
				this.lockCursorButtonPlayed = true;
			}else if(!this.lockCursorButton.isPressed()) this.lockCursorButtonPlayed = false;
			super.font.draw(super.batch, "Lock the cursor", 750, 695);
			
			super.batch.draw(this.checkBox, this.VSyncButton.getX(), this.VSyncButton.getY(), this.VSyncButton.getWidth(), this.VSyncButton.getHeight());
			if(this.VSyncButton.isPressed()) {
				if(this.VSyncButtonPressedOneTime == true) this.VSyncButtonPressed = false;
				else this.VSyncButtonPressed = true;
			}else if(!this.VSyncButton.isPressed()) {
				if(this.VSyncButtonPressed == true) this.VSyncButtonPressedOneTime = true;
				else this.VSyncButtonPressedOneTime = false;
			}
			if(this.VSyncButtonPressed == true) super.batch.draw(this.checkedBox, this.VSyncButton.getX(), this.VSyncButton.getY(), this.VSyncButton.getWidth()+4, this.VSyncButton.getHeight());
			if(this.VSyncButton.isPressed() && this.VSyncButtonPlayed == false) {
				World.clickSound.play();
				this.VSyncButtonPlayed = true;
			}else if(!this.VSyncButton.isPressed()) this.VSyncButtonPlayed = false;
			super.font.draw(super.batch, "VSync", 750, 615);
			
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
			super.font.draw(super.batch, "Bigger cursor", 750, 535);
			
			super.font.draw(super.batch, "Max FPS:", 710, 460);
			super.batch.draw(this.leftLittleFrame, 710, 345, 5, 65);
			super.batch.draw(this.rightLittleFrame, 955, 345, 5, 65);
			super.batch.draw(this.bottomLittleFrame, 710, 345, 250, 5);
			super.batch.draw(this.topLittleFrame, 710, 405, 250, 5);
			super.batch.draw(this.topLeftLittleFrame, 710, 390, 20, 20);
			super.batch.draw(this.bottomLeftLittleFrame, 710, 345, 20, 20);
			super.batch.draw(this.topRightLittleFrame, 940, 390, 20, 20);
			super.batch.draw(this.bottomRightLittleFrame, 940, 345, 20, 20);
			super.batch.draw(this.backFrame, 715, 350, 240, 55);
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
			if(this.integerFPS >= 10) super.batch.draw(this.veryLightYellowFrame, 720, 355, 10, 45);
			if(this.integerFPS >= 20) super.batch.draw(this.veryLightYellowFrame, 740, 355, 10, 45);
			if(this.integerFPS >= 30) super.batch.draw(this.veryLightYellowFrame, 760, 355, 10, 45);
			if(this.integerFPS >= 40) super.batch.draw(this.veryLightYellowFrame, 780, 355, 10, 45);
			if(this.integerFPS >= 50) super.batch.draw(this.veryLightYellowFrame, 800, 355, 10, 45);
			if(this.integerFPS >= 60) super.batch.draw(this.veryLightYellowFrame, 820, 355, 10, 45);
			if(this.integerFPS >= 70) super.batch.draw(this.veryLightYellowFrame, 840, 355, 10, 45);
			if(this.integerFPS >= 80) super.batch.draw(this.veryLightYellowFrame, 860, 355, 10, 45);
			if(this.integerFPS >= 90) super.batch.draw(this.veryLightYellowFrame, 880, 355, 10, 45);
			if(this.integerFPS >= 100) super.batch.draw(this.veryLightYellowFrame, 900, 355, 10, 45);
			if(this.integerFPS >= 110) super.batch.draw(this.veryLightYellowFrame, 920, 355, 10, 45);
			if(this.integerFPS >= 120) super.batch.draw(this.veryLightYellowFrame, 940, 355, 10, 45);
			super.font.draw(super.batch, String.valueOf(Math.round(this.integerFPS)), 810, 458);
		}else if(this.volumeButtonPressed == true) {
			super.batch.draw(World.pressedButton, this.volumeButton.getX(), this.volumeButton.getY(), this.volumeButton.getWidth(), this.volumeButton.getHeight());
			super.font.draw(super.batch, "Master volume:", 710, 870);
			super.batch.draw(this.leftLittleFrame, 710, 775, 5, 65);
			super.batch.draw(this.rightLittleFrame, 915, 775, 5, 65);
			super.batch.draw(this.bottomLittleFrame, 710, 775, 210, 5);
			super.batch.draw(this.topLittleFrame, 710, 835, 210, 5);
			super.batch.draw(this.topLeftLittleFrame, 710, 820, 20, 20);
			super.batch.draw(this.bottomLeftLittleFrame, 710, 775, 20, 20);
			super.batch.draw(this.topRightLittleFrame, 900, 820, 20, 20);
			super.batch.draw(this.bottomRightLittleFrame, 900, 775, 20, 20);
			super.batch.draw(this.backFrame, 715, 780, 200, 55);
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
			if(this.masterVolume >= 10) super.batch.draw(this.veryLightYellowFrame, 720, 785, 10, 45);
			if(this.masterVolume >= 20) super.batch.draw(this.veryLightYellowFrame, 740, 785, 10, 45);
			if(this.masterVolume >= 30) super.batch.draw(this.veryLightYellowFrame, 760, 785, 10, 45);
			if(this.masterVolume >= 40) super.batch.draw(this.veryLightYellowFrame, 780, 785, 10, 45);
			if(this.masterVolume >= 50) super.batch.draw(this.veryLightYellowFrame, 800, 785, 10, 45);
			if(this.masterVolume >= 60) super.batch.draw(this.veryLightYellowFrame, 820, 785, 10, 45);
			if(this.masterVolume >= 70) super.batch.draw(this.veryLightYellowFrame, 840, 785, 10, 45);
			if(this.masterVolume >= 80) super.batch.draw(this.veryLightYellowFrame, 860, 785, 10, 45);
			if(this.masterVolume >= 90) super.batch.draw(this.veryLightYellowFrame, 880, 785, 10, 45);
			if(this.masterVolume >= 100) super.batch.draw(this.veryLightYellowFrame, 900, 785, 10, 45);
			super.font.draw(super.batch, String.valueOf(Math.round(this.masterVolume)), 860, 868);
			
			super.batch.draw(World.pressedButton, this.volumeButton.getX(), this.volumeButton.getY(), this.volumeButton.getWidth(), this.volumeButton.getHeight());
			super.font.draw(super.batch, "Effects volume:", 710, 760);
			super.batch.draw(this.leftLittleFrame, 710, 665, 5, 65);
			super.batch.draw(this.rightLittleFrame, 915, 665, 5, 65);
			super.batch.draw(this.bottomLittleFrame, 710, 665, 210, 5);
			super.batch.draw(this.topLittleFrame, 710, 725, 210, 5);
			super.batch.draw(this.topLeftLittleFrame, 710, 710, 20, 20);
			super.batch.draw(this.bottomLeftLittleFrame, 710, 665, 20, 20);
			super.batch.draw(this.topRightLittleFrame, 900, 710, 20, 20);
			super.batch.draw(this.bottomRightLittleFrame, 900, 665, 20, 20);
			super.batch.draw(this.backFrame, 715, 670, 200, 55);
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
			if(this.effectsVolume >= 10) super.batch.draw(this.veryLightYellowFrame, 720, 675, 10, 45);
			if(this.effectsVolume >= 20) super.batch.draw(this.veryLightYellowFrame, 740, 675, 10, 45);
			if(this.effectsVolume >= 30) super.batch.draw(this.veryLightYellowFrame, 760, 675, 10, 45);
			if(this.effectsVolume >= 40) super.batch.draw(this.veryLightYellowFrame, 780, 675, 10, 45);
			if(this.effectsVolume >= 50) super.batch.draw(this.veryLightYellowFrame, 800, 675, 10, 45);
			if(this.effectsVolume >= 60) super.batch.draw(this.veryLightYellowFrame, 820, 675, 10, 45);
			if(this.effectsVolume >= 70) super.batch.draw(this.veryLightYellowFrame, 840, 675, 10, 45);
			if(this.effectsVolume >= 80) super.batch.draw(this.veryLightYellowFrame, 860, 675, 10, 45);
			if(this.effectsVolume >= 90) super.batch.draw(this.veryLightYellowFrame, 880, 675, 10, 45);
			if(this.effectsVolume >= 100) super.batch.draw(this.veryLightYellowFrame, 900, 675, 10, 45);
			super.font.draw(super.batch, String.valueOf(Math.round(this.effectsVolume)), 860, 758);
		}else if(this.gameButtonPressed == true) super.batch.draw(World.pressedButton, this.gameButton.getX(), this.gameButton.getY(), this.gameButton.getWidth(), this.gameButton.getHeight());
		else if(this.languageButtonPressed == true) super.batch.draw(World.pressedButton, this.languageButton.getX(), this.languageButton.getY(), this.languageButton.getWidth(), this.languageButton.getHeight());
		else if(this.shortCutButtonPressed == true) super.batch.draw(World.pressedButton, this.shortCutButton.getX(), this.shortCutButton.getY(), this.shortCutButton.getWidth(), this.shortCutButton.getHeight());
		
		if(this.initialConfigurationButton.isPressed()) super.batch.draw(World.pressedButton, this.initialConfigurationButton.getX(), this.initialConfigurationButton.getY(), this.initialConfigurationButton.getWidth(), this.initialConfigurationButton.getHeight());
		else if(this.cancelButton.isPressed()) super.batch.draw(World.pressedButton, this.cancelButton.getX(), this.cancelButton.getY(), this.cancelButton.getWidth(), this.cancelButton.getHeight());
		else if(this.applyButton.isPressed()) super.batch.draw(World.pressedButton, this.applyButton.getX(), this.applyButton.getY(), this.applyButton.getWidth(), this.applyButton.getHeight());
		else if(this.acceptButton.isPressed()) super.batch.draw(World.pressedButton, this.acceptButton.getX(), this.acceptButton.getY(), this.acceptButton.getWidth(), this.acceptButton.getHeight());
		else if(this.backMainMenuButton.isPressed()) super.batch.draw(World.pressedButton, this.backMainMenuButton.getX(), this.backMainMenuButton.getY(), this.backMainMenuButton.getWidth(), this.backMainMenuButton.getHeight());
		
		super.font.draw(super.batch, "VIDEO", 435, 870);
		super.font.draw(super.batch, "VOLUME", 420, 790);
		super.font.draw(super.batch, "GAME", 435, 710);
		super.font.draw(super.batch, "LANGUAGE", 410, 630);
		super.font.draw(super.batch, "SHORTCUTS", 400, 550);
		super.font.draw(super.batch, "INITIAL CONFIGURATION", 335, 210);
		super.font.draw(super.batch, "CANCEL", 830, 210);
		super.font.draw(super.batch, "APPLY", 1140, 210);
		super.font.draw(super.batch, "ACCEPT", 1440, 210);
		super.font.draw(super.batch, "BACK TO MAIN MENU", 85, 70);
		super.font.draw(super.batch, "OPTIONS", 930, 950);
		super.batch.end();
		
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

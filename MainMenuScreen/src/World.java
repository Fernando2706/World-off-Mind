package com.worldoffmind.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

public class World extends Game{
	
	public static Sound clickSound;
	private Cursor cursor;
	public static AbstractScreen MainMenuScreen, OptionsMenuScreen, StartGameScreen;
	public static Texture mainPicture, darkButton, lightButton, titleButton, pressedButton, topframe, rightFrame, bottomFrame, leftFrame, topLeftFrame, topRightFrame, bottomLeftFrame, bottomRightFrame,
						  topConection, rightConection, bottomConection, leftConection, backFrame, secondBackFrame, topLittleFrame, topLeftLittleFrame, leftLittleFrame, bottomLeftLittleFrame, bottomLittleFrame,
						  bottomRightLittleFrame, rightLittleFrame, topRightLittleFrame, leftMarker, rightMarker, thirdBackFrame;
	
	@Override
	public void create () {
		
		MainMenuScreen = new MainMenuScreen();
		OptionsMenuScreen = new OptionsMenuScreen();
		StartGameScreen = new StartGameScreen();
		
		// Cursor
		this.cursor = Gdx.graphics.newCursor(new Pixmap(Gdx.files.internal("WorldTextures/dwarven_gauntlet.png")), 0, 0);
		Gdx.input.setCursorPosition(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
		Gdx.graphics.setCursor(this.cursor);
		
		clickSound = Gdx.audio.newSound(Gdx.files.internal("WorldTextures/clickSound.wav"));
		clickSound.setVolume(0, 0.3f);
		
		mainPicture = new Texture(Gdx.files.internal("WorldTextures/mainPicture.jpg"));
		darkButton = new Texture(Gdx.files.internal("WorldTextures/darkButton.png"));
		lightButton = new Texture(Gdx.files.internal("WorldTextures/lightButton.png"));
		titleButton = new Texture(Gdx.files.internal("WorldTextures/titleButton.png"));
		pressedButton = new Texture(Gdx.files.internal("WorldTextures/pressedButton.png"));
		topframe = new Texture(Gdx.files.internal("WorldTextures/topFrame.png"));
		rightFrame = new Texture(Gdx.files.internal("WorldTextures/rightFrame.png"));
		bottomFrame = new Texture(Gdx.files.internal("WorldTextures/bottomFrame.png"));
		leftFrame = new Texture(Gdx.files.internal("WorldTextures/leftFrame.png"));
		topLeftFrame = new Texture(Gdx.files.internal("WorldTextures/topLeftFrame.png"));
		topRightFrame = new Texture(Gdx.files.internal("WorldTextures/topRightFrame.png"));
		bottomLeftFrame = new Texture(Gdx.files.internal("WorldTextures/bottomLeftFrame.png"));
		bottomRightFrame = new Texture(Gdx.files.internal("WorldTextures/bottomRightFrame.png"));
		topConection = new Texture(Gdx.files.internal("WorldTextures/topConection.png"));
		rightConection = new Texture(Gdx.files.internal("WorldTextures/rightConection.png"));
		bottomConection = new Texture(Gdx.files.internal("WorldTextures/bottomConection.png"));
		leftConection = new Texture(Gdx.files.internal("WorldTextures/leftConection.png"));
		backFrame = new Texture(Gdx.files.internal("WorldTextures/backFrame.png"));
		secondBackFrame = new Texture(Gdx.files.internal("WorldTextures/secondBackFrame.png"));
		topLittleFrame = new Texture(Gdx.files.internal("WorldTextures/topLittleFrame.png"));
		topLeftLittleFrame = new Texture(Gdx.files.internal("WorldTextures/topLeftLittleFrame.png"));
		leftLittleFrame = new Texture(Gdx.files.internal("WorldTextures/leftLittleFrame.png"));
		bottomLeftLittleFrame = new Texture(Gdx.files.internal("WorldTextures/bottomLeftLittleFrame.png"));
		bottomLittleFrame = new Texture(Gdx.files.internal("WorldTextures/bottomLittleFrame.png"));
		bottomRightLittleFrame = new Texture(Gdx.files.internal("WorldTextures/bottomRightLittleFrame.png"));
		rightLittleFrame = new Texture(Gdx.files.internal("WorldTextures/rightLittleFrame.png"));
		topRightLittleFrame = new Texture(Gdx.files.internal("WorldTextures/topRightLittleFrame.png"));
		leftMarker = new Texture(Gdx.files.internal("WorldTextures/leftMarker.png"));
		rightMarker = new Texture(Gdx.files.internal("WorldTextures/rightMarker.png"));
		thirdBackFrame = new Texture(Gdx.files.internal("WorldTextures/thirdBackFrame.png"));
		
		ScreenManager.getInstance().initialize(this);
		ScreenManager.getInstance().showScreen(MainMenuScreen);
	}
	
	public static void setVSync(boolean VSync) {
		Gdx.graphics.setVSync(VSync);
	}
	
	public static void setCursorCatched(boolean cursorCatched) {
		Gdx.input.setCursorCatched(cursorCatched);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		Gdx.app.exit();
	}
}

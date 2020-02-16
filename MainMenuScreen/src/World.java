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
	public static AbstractScreen MainMenuScreen, OptionsMenuScreen;
	public static Texture mainPicture, darkButton, lightButton, titleButton, pressedButton;
	
	@Override
	public void create () {
		
		MainMenuScreen = new MainMenuScreen();
		OptionsMenuScreen = new OptionsMenuScreen();
		
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
		
		ScreenManager.getInstance().initialize(this);
		ScreenManager.getInstance().showScreen(MainMenuScreen);
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

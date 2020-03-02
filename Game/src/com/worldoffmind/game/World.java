package com.worldoffmind.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

public class World extends Game{
	
	public static Sound clickSound;
	private Cursor cursor;
	public static AbstractScreen MainMenuScreen, OptionsMenuScreen, StartGameScreen;
	public static AbstractGameScreen ForestOfSoulsScreen;
	public static Texture mainPicture, darkButton, lightButton, titleButton, pressedButton, topframe, rightFrame, bottomFrame, leftFrame, topLeftFrame, topRightFrame, bottomLeftFrame, bottomRightFrame,
						  topConection, rightConection, bottomConection, leftConection, backFrame, secondBackFrame, topLittleFrame, topLeftLittleFrame, leftLittleFrame, bottomLeftLittleFrame, bottomLittleFrame,
						  bottomRightLittleFrame, rightLittleFrame, topRightLittleFrame, leftMarker, rightMarker, thirdBackFrame;
	public FileHandle fileGame1, fileGame2, fileGame3, fileGame4, fileGame5;
	private String finalStringGame1, finalStringGame2, finalStringGame3, finalStringGame4, finalStringGame5;
	@Override
	public void create () {
		
		MainMenuScreen = new MainMenuScreen();
		OptionsMenuScreen = new OptionsMenuScreen();
		StartGameScreen = new StartGameScreen();
		ForestOfSoulsScreen = new ForestOfSoulsScreen();
		
		this.fileGame1 = Gdx.files.local("FilesForGames/Game1.txt");
		this.fileGame2 = Gdx.files.local("FilesForGames/Game2.txt");
		this.fileGame3 = Gdx.files.local("FilesForGames/Game3.txt");
		this.fileGame4 = Gdx.files.local("FilesForGames/Game4.txt");
		this.fileGame5 = Gdx.files.local("FilesForGames/Game5.txt");
		
		this.finalStringGame1 = "";
		this.finalStringGame2 = "";
		this.finalStringGame3 = "";
		this.finalStringGame4 = "";
		this.finalStringGame5 = "";
		
		this.decodificateFile();
		
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
	
	public void decodificateFile() {
		StartGameScreen startGameScreen = (StartGameScreen) StartGameScreen;
		
		this.finalStringGame1 = this.fileGame1.readString();
		this.finalStringGame2 = this.fileGame2.readString();
		this.finalStringGame3 = this.fileGame3.readString();
		this.finalStringGame4 = this.fileGame4.readString();
		this.finalStringGame5 = this.fileGame5.readString();
		
		int semicolon = 0;
		String gameStarted = "";
		
		for(int i = 0; i < this.finalStringGame1.length(); i++) {
			if(this.finalStringGame1.charAt(i) == ';') {
				semicolon += 1;
			}
			
			if(semicolon == 0) gameStarted += this.finalStringGame1.charAt(i);
		}
		if(gameStarted.equals("true")) startGameScreen.setGame1Started(true);
		else startGameScreen.setGame1Started(false);
		
		semicolon = 0;
		gameStarted = "";
		for(int i = 0; i < this.finalStringGame2.length(); i++) {
			if(this.finalStringGame2.charAt(i) == ';') {
				semicolon += 1;
			}
			
			if(semicolon == 0) gameStarted += this.finalStringGame2.charAt(i);
		}
		if(gameStarted.equals("true")) startGameScreen.setGame2Started(true);
		else startGameScreen.setGame2Started(false);
		
		semicolon = 0;
		gameStarted = "";
		for(int i = 0; i < this.finalStringGame3.length(); i++) {
			if(this.finalStringGame3.charAt(i) == ';') {
				semicolon += 1;
			}
			
			if(semicolon == 0) gameStarted += this.finalStringGame3.charAt(i);
		}
		if(gameStarted.equals("true")) startGameScreen.setGame3Started(true);
		else startGameScreen.setGame3Started(false);
		
		semicolon = 0;
		gameStarted = "";
		for(int i = 0; i < this.finalStringGame4.length(); i++) {
			if(this.finalStringGame4.charAt(i) == ';') {
				semicolon += 1;
			}
			
			if(semicolon == 0) gameStarted += this.finalStringGame4.charAt(i);
		}
		if(gameStarted.equals("true")) startGameScreen.setGame4Started(true);
		else startGameScreen.setGame4Started(false);
		
		semicolon = 0;
		gameStarted = "";
		for(int i = 0; i < this.finalStringGame5.length(); i++) {
			if(this.finalStringGame5.charAt(i) == ';') {
				semicolon += 1;
			}
			
			if(semicolon == 0) gameStarted += this.finalStringGame5.charAt(i);
		}
		if(gameStarted.equals("true")) startGameScreen.setGame5Started(true);
		else startGameScreen.setGame5Started(false);
		
		this.finalStringGame1 = "";
		this.finalStringGame2 = "";
		this.finalStringGame3 = "";
		this.finalStringGame4 = "";
		this.finalStringGame5 = "";
	}
	
	public void instanciateFile() {
		StartGameScreen startGameScreen = (StartGameScreen) StartGameScreen;
		
		this.finalStringGame1 += startGameScreen.getGame1Started();
		this.finalStringGame2 += startGameScreen.getGame2Started();
		this.finalStringGame3 += startGameScreen.getGame3Started();
		this.finalStringGame4 += startGameScreen.getGame4Started();
		this.finalStringGame5 += startGameScreen.getGame5Started();
		
		this.fileGame1.writeString(this.finalStringGame1, false);
		this.fileGame2.writeString(this.finalStringGame2, false);
		this.fileGame3.writeString(this.finalStringGame3, false);
		this.fileGame4.writeString(this.finalStringGame4, false);
		this.fileGame5.writeString(this.finalStringGame5, false);
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
		instanciateFile();
		Gdx.app.exit();
	}
}

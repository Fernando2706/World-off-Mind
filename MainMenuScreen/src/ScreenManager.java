package com.worldoffmind.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class ScreenManager {
	 
	// Singleton: unique instance
	private static ScreenManager instance;
	//Reference to game
	private Game game;
	
	// Singleton: private constructor
	private ScreenManager() {
		super();
	}
	
	// Singleton: retrieve instance
	public static ScreenManager getInstance() {
		if(instance == null) {
			instance = new ScreenManager();
		}
		
		return instance;
	}
	
	// Initialization with the game class
	public void initialize(Game game) {
		this.game = game;
	}
	
	// Show in the game the screen which enum type is received
	public void showScreen(AbstractScreen newScreen, Object... params) {
		// Get current screen to dispose it
		Screen currentScreen = this.game.getScreen();
		
		// Show new screen
		newScreen.buildStage();
		this.game.setScreen(newScreen);
		
		// Dispose previous screen
		if(currentScreen != null) {
			currentScreen.dispose();
		}
	}
}

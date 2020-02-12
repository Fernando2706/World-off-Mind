package com.worldoffmind.game;

public enum ScreenEnum {

	MainMenuScreen{
		public AbstractScreen getScreen(Object... params) {
			return new MainMenuScreen();
		}
	},
	
	OptionsMenuScreen{
		public AbstractScreen getScreen(Object... params) {
			return new OptionsMenuScreen();
		}
	};
	
	public abstract AbstractScreen getScreen(Object... params);
}

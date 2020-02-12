package com.worldoffmind.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Pixmap;

public class World extends Game{
	
	private Cursor cursor;
	
	@Override
	public void create () {
		// Cursor
		this.cursor = Gdx.graphics.newCursor(new Pixmap(Gdx.files.internal("MainMenuTextures/Cursor/dwarven_gauntlet.png")), 0, 0);
		Gdx.graphics.setCursor(this.cursor);
		
		ScreenManager.getInstance().initialize(this);
		ScreenManager.getInstance().showScreen(ScreenEnum.MainMenuScreen);
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

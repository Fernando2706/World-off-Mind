package com.worldoffmind.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class World extends Game{
	
	public SpriteBatch batch;
	public BitmapFont font;
	private MainMenuScreen mainMenuScreen;
	
	@Override
	public void create () {
		this.batch = new SpriteBatch();
		this.font = new BitmapFont();
		this.font.setColor(Color.GOLDENROD);
		this.font.getData().setScale(1.5f, 1.5f);
		this.mainMenuScreen = new MainMenuScreen(this);
		this.setScreen(mainMenuScreen);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		this.batch.dispose();
		this.font.dispose();
	}
}

package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class AbstractScreen implements Screen{
	
	public SpriteBatch batch;
	public BitmapFont font;
	public OrthographicCamera camera;
	public Sound clickSound;
	
	protected AbstractScreen() {
		this.batch = new SpriteBatch();
		this.font = new BitmapFont();
		this.camera = new OrthographicCamera();
		this.clickSound = Gdx.audio.newSound(Gdx.files.internal("clickSound.wav"));
		this.clickSound.setVolume(0, 0.4f);
	}

	// Subclasses must load actors in this method
	public abstract void buildStage();

	@Override
	public abstract void render(float delta);

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
		this.batch.dispose();
		this.font.dispose();
		this.clickSound.dispose();
	}
}

package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public abstract class AbstractScreen implements Screen{
	
	public SpriteBatch batch;
	public BitmapFont font;
	public OrthographicCamera camera;
	private ExtendViewport viewport;
	
	protected AbstractScreen() {
		this.batch = new SpriteBatch();
		this.font = new BitmapFont();
		this.camera = new OrthographicCamera();
		
		this.viewport = new ExtendViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), this.camera);
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
		this.viewport.update(width, height, true);
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

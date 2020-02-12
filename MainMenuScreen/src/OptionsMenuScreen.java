package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class OptionsMenuScreen extends AbstractScreen{
	
	private Texture background;
	
	public OptionsMenuScreen() {
		this.background = new Texture(Gdx.files.internal("OptionsMenuTextures/GrayBackground.jpg"));
	}
	
	@Override
	public void buildStage() {
		
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		super.camera.update();
		super.batch.setProjectionMatrix(super.camera.combined);
		super.camera.setToOrtho(false, 1920, 1080);
		
		super.batch.begin();
		super.batch.draw(this.background, 0, 0);
		super.batch.end();
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
		this.background.dispose();
		super.dispose();
	}
}

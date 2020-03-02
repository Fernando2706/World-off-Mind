package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import Attacks.Attack;

public class ForestOfSoulsScreen extends AbstractGameScreen{

	@Override
	public void buildStage() {
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		super.handleInput(delta);
		super.update(delta);
		
		super.camera.position.x = super.principalPlayer.position.x;
		super.camera.update();
		super.batch.setProjectionMatrix(super.camera.combined);
		super.camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		super.batch.begin();
		super.batch.draw(super.principalPlayer.currentFrame, super.principalPlayer.position.x, super.principalPlayer.position.y);
		for(Attack spell : super.attacks) {
			super.batch.draw(spell.currentFrame, spell.position.x, spell.position.y);
		}
		super.batch.end();
	}
}

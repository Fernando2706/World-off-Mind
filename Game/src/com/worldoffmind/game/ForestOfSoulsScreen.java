package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;

import Attacks.Attack;

public class ForestOfSoulsScreen extends AbstractGameScreen{
	
	private Stage buttonsStage;
	private Group buttonsGroup;
	
	public ForestOfSoulsScreen() {
		super.font.setColor(Color.GOLDENROD);
		super.font.getData().setScale(Gdx.graphics.getWidth()/1280f, Gdx.graphics.getHeight()/720f);
	}

	@Override
	public void buildStage() {
		Gdx.input.setCursorCatched(true);
	}

	@Override
	public void render(float delta) {
		switch(super.screenState) {
		case RUNNING:
			Gdx.gl.glClearColor(1, 1, 1, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			
			super.handleInput(delta);
			super.update(delta);
			
			super.camera.position.x = super.principalPlayer.position.x;
			super.camera.update();
			super.batch.setProjectionMatrix(super.camera.combined);
			super.camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
			
			super.batch.begin();
			super.batch.draw(super.principalPlayer.currentFrame, super.principalPlayer.position.x, super.principalPlayer.position.y, 150, 150);
			for(Attack spell : super.attacks) {
				super.batch.draw(spell.currentFrame, spell.position.x, spell.position.y);
			}
			super.batch.end();
			break;
		case PAUSED:
			
		}
		
	}
}

package com.worldoffmind.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class UIFactory{
	
	public static InputListener createListener(final AbstractScreen dstScreen, final Object... params) {
		return new InputListener() {
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				ScreenManager.getInstance().showScreen(dstScreen, params);
				return false;
			}
		};
	}
	
	public static InputListener createGameListener(final AbstractGameScreen dstScreen, final Object... params) {
		return new InputListener() {
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				ScreenManager.getInstance().showGameScreen(dstScreen, params);
				return false;
			}
		};
	}
	
	public static InputListener touchDraggedFPSButton() {
		return new InputListener() {
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				return true;
			}
			
			@Override
			public void touchDragged(InputEvent event, float x, float y, int pointer) {
				OptionsMenuScreen.scrollFPSButton.setPosition(Gdx.input.getX(), 425);
			}
		};
	}
	
	public static InputListener touchDraggedMasterAudioButton() {
		return new InputListener() {
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				return true;
			}
			
			@Override
			public void touchDragged(InputEvent event, float x, float y, int pointer) {
				OptionsMenuScreen.scrollMasterAudioButton.setPosition(Gdx.input.getX(), 785);
			}
		};
	}
	
	public static InputListener touchDraggedEffectsAudioButton() {
		return new InputListener() {
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				return true;
			}
			
			@Override
			public void touchDragged(InputEvent event, float x, float y, int pointer) {
				OptionsMenuScreen.scrollEffectsAudioButton.setPosition(Gdx.input.getX(), 675);
			}
		};
	}
	
	public static InputListener touchDraggedEnvironmentalAudioButton() {
		return new InputListener() {
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				return true;
			}
			
			@Override
			public void touchDragged(InputEvent event, float x, float y, int pointer) {
				OptionsMenuScreen.scrollEnvironmentalAudioButton.setPosition(Gdx.input.getX(), 565);
			}
		};
	}
	
	public static InputListener touchDraggedMusicAudioButton() {
		return new InputListener() {
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				return true;
			}
			
			@Override
			public void touchDragged(InputEvent event, float x, float y, int pointer) {
				OptionsMenuScreen.scrollMusicAudioButton.setPosition(Gdx.input.getX(), 455);
			}
		};
	}
}

package com.worldoffmind.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.worldoffmind.game.WorldOffMind;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "World off Mind";
		config.width = 1200;
		config.height = 700;
		new LwjglApplication(new WorldOffMind(), config);
	}
}

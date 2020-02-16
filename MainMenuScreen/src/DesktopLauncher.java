package com.worldoffmind.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.worldoffmind.game.World;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "World off Mind";
		config.width = 1920;
		config.height = 1080;
		config.fullscreen = true;
		config.resizable = false;
		new LwjglApplication(new World(), config);
	}
}

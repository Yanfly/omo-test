package com.swhite.Omo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.swhite.Omo.Omo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Omo.WIDTH;
		config.height = Omo.HEIGHT;
		config.title = Omo.TITLE;
		new LwjglApplication(new Omo(), config);
	}
}

package com.swhite.Omo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.swhite.Omo.states.GSM;
import com.swhite.Omo.states.PlayState;

public class Omo extends ApplicationAdapter {

	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;
	public static final String TITLE = "Omo";
	
	private GSM gsm;
	private SpriteBatch sb;
	
	public void create () {

		Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
		
		gsm = new GSM();
		sb = new SpriteBatch();
		gsm.push(new PlayState(gsm));
		
	}

	public void render () {
	
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(sb);
		
	}
}

package com.swhite.Omo.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class State {

	protected GSM gsm;
	
	protected State(GSM gsm) {
		this.gsm = gsm;
	}
	
	public abstract void update(float dt);
	public abstract void render(SpriteBatch sb);
	public abstract void handleInput();
	
}

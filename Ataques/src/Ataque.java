package ataqueJugador;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.WorldOffMind;

public abstract class Ataque implements Screen{
	Animation animationDerecha;
	Animation animationIzquierda;
	Animation animationArriba;
	Animation animationAbajo;
	public Vector2 position;
	public Rectangle rect;
	float stateTime;
	public TextureRegion currentFrame;
	final protected WorldOffMind game;
	public Ataque(final WorldOffMind game) {
		this.game=game;
	}
	public abstract void render();
}

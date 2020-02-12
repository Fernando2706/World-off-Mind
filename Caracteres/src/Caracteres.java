package personajes;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.worldoffmind.game.WorldOffMind;

public abstract class Caracteres implements Screen{
	public boolean dead;
	public int hp;
	public float damage;
	public float defensa;
	public Vector2 position;
	public Rectangle rect;
	float stateTime;
	Animation animationDerecha;
	Animation animationIzquierda;
	Animation animationArriba;
	Animation animationAbajo;
	Animation animationParadoD;
	Animation animationParadoI;
	Animation animationParadoAr;
	Animation animationParadoAb;


	public TextureRegion currentFrame;
	final protected WorldOffMind game;
	public Caracteres(final WorldOffMind game) {
		this.game=game;
	}
	public abstract void render();
}
//Manu tonto, es bromi , tkm <3

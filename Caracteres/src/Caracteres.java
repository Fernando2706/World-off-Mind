package personajes;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.WorldOffMind;

public abstract class Caracteres implements Screen{
	public boolean dead;
	public int hp;
	public float damage;
	public float defensa;
	public Vector2 position;
	public Rectangle rect;
	float stateTime;
	Animation animationRight;
	Animation animationLeft;
	Animation animationUp;
	Animation animationDown;
	Animation animationIdleRight;
	Animation animationIdleLeft;
	Animation animationIdleUp;
	Animation animationIdleDown;
	//YA ME JODERIA


	public TextureRegion currentFrame;
	final protected WorldOffMind game;
	public Caracteres(final WorldOffMind game) {
		this.game=game;
	}
	public abstract void render();
}
//Manu tonto, es bromi , tkm <3

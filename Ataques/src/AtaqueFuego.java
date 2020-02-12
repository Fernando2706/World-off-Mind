package ataqueJugador;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.WorldOffMind;


public class AtaqueFuego extends Ataque{
	public static final float SPEED = 200f;

	public enum State{
		RIGHT, LEFT, UP, DOWN, IDLELeft, IDLERight, IDLEUp, IDLEDown, attackRight, attackLeft, attackUp, attackDown
	}
	public State state;
	public void move(Vector2 movement) {

		movement.scl(SPEED);
		position.add(movement);
	}

	public AtaqueFuego(WorldOffMind game,float x, float y) {
		super(game);
		position=new Vector2(x,y);
		animationDerecha=new Animation(0.25f,animacionDerecha);

		// TODO Auto-generated constructor stub
	}
	public void render() {
		//this.game.batch.begin();
		game.batch.draw(currentFrame, position.x, position.y);
		//this.game.batch.end();
	}

	TextureRegion [] animacionDerecha= {
			new Sprite(new Texture(Gdx.files.internal("AnimacionFuego/Effects_Fire_0_02.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimacionFuego/Effects_Fire_0_06.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimacionFuego/Effects_Fire_0_10.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimacionFuego/Effects_Fire_0_14.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimacionFuego/Effects_Fire_0_18.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimacionFuego/Effects_Fire_0_22.png"))),
			new Sprite(new Texture(Gdx.files.internal("AnimacionFuego/Effects_Fire_0_26.png")))
			
	};
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void update(float dt) {
		stateTime+=dt;
		currentFrame = (TextureRegion) animationDerecha.getKeyFrame(stateTime, true); 
		
	}

}

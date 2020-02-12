package Attack;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.worldoffmind.game.WorldOffMind;


public class AtaqueFuego extends Ataque{
	public static final float SPEED = 200f;

	public enum State{
		RIGHT, LEFT, UP, DOWN
	}
	public State state;
	public void move(Vector2 movement) {

		movement.scl(SPEED);
		position.add(movement);
	}

	public AtaqueFuego(WorldOffMind game,float x, float y) {
		super(game);
		x0=x;
		y0=y;
		position=new Vector2(x,y);
		animationDerecha=new Animation(0.25f,animacionRight);
		animationIzquierda=new Animation(0.25f,animacionLeft);
		animationArriba=new Animation(0.25f,animacionUp);
		animationAbajo=new Animation(0.25f,animacionDown);
		keep=true;
		rect=new Rectangle(x, y, 20, 34);
		

		// TODO Auto-generated constructor stub
	}
	public void keepA() {
		if(this.state==this.state.RIGHT) {
			if(position.x>=(x0+500)) {
				keep=false;
			}
		}
		if(this.state==this.state.LEFT) {
			if(position.x<=(x0-500)) {
				keep=false;
			}
		}
		if(this.state==this.state.UP) {
			if(position.y>=(y0+500)) {
				keep=false;
			}
		}
		if(this.state==this.state.DOWN) {
			if(position.y>=(y0-500)) {
				keep=false;
			}
		}
		
	}
	public void render() {

		game.batch.draw(currentFrame, position.x, position.y);
	}

	TextureRegion [] animacionRight= {
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBalls/Effects_Fire_0_02.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBalls/Effects_Fire_0_06.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBalls/Effects_Fire_0_10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBalls/Effects_Fire_0_14.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBalls/Effects_Fire_0_18.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBalls/Effects_Fire_0_22.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBalls/Effects_Fire_0_26.png")))
			
	};
	TextureRegion [] animacionLeft= {
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsLeft/Effects_Fire_0_02.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsLeft/Effects_Fire_0_06.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsLeft/Effects_Fire_0_10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsLeft/Effects_Fire_0_14.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsLeft/Effects_Fire_0_18.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsLeft/Effects_Fire_0_22.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsLeft/Effects_Fire_0_26.png")))
			
	};
	TextureRegion [] animacionUp= {
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsUp/Effects_Fire_0_02.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsUp/Effects_Fire_0_06.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsUp/Effects_Fire_0_10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsUp/Effects_Fire_0_14.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsUp/Effects_Fire_0_18.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsUp/Effects_Fire_0_22.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsUp/Effects_Fire_0_26.png")))
			
	};
	TextureRegion [] animacionDown= {
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsDown/Effects_Fire_0_02.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsDown/Effects_Fire_0_06.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsDown/Effects_Fire_0_10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsDown/Effects_Fire_0_14.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsDown/Effects_Fire_0_18.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsDown/Effects_Fire_0_22.png"))),
			new Sprite(new Texture(Gdx.files.internal("Attack/FireBallsDown/Effects_Fire_0_26.png")))
			
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



	@Override
	public void update(float dt) {
		keepA();
		rect.setPosition(position);
		stateTime+=dt;
		switch (state) {
		case RIGHT:
			currentFrame= (TextureRegion) animationDerecha.getKeyFrame(stateTime, true); 
			move(new Vector2(dt,0));
			break;
		case LEFT:
			currentFrame=(TextureRegion) animationIzquierda.getKeyFrame(stateTime, true);
			move(new Vector2(-dt,0));

			break;
		case UP:
			currentFrame= (TextureRegion) animationArriba.getKeyFrame(stateTime, true); 
			move(new Vector2(0,dt));

			break;
		case DOWN:
			currentFrame=(TextureRegion) animationAbajo.getKeyFrame(stateTime, true); 
			move(new Vector2(0,-dt));

			break;
		default:
			currentFrame= (TextureRegion) animationDerecha.getKeyFrame(stateTime, true); 

			break;
		}
		
	}

}

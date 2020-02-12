package personajes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.worldoffmind.game.WorldOffMind;

public class JugadorPrincipal extends Caracteres {
	Animation animationAArriba;
	Animation animationAAbajo;
	Animation animationADerecha;
	Animation animationAIzquierda;
	public static final float SPEED = 200f;

	public enum State{
		RIGHT, LEFT, UP, DOWN, IDLELeft, IDLERight, IDLEUp, IDLEDown, attackRight, attackLeft, attackUp, attackDown
	}
	public State state;
	public void move(Vector2 movement) {

		movement.scl(SPEED);
		position.add(movement);
	}
	TextureRegion animacionParadoD= new Sprite(new Texture(Gdx.files.internal("Player/ParadoDerecha.png")));
	TextureRegion animacionParadoI= new Sprite(new Texture(Gdx.files.internal("Player/ParadoIzquierda.png")));
	TextureRegion animacionParadoAr= new Sprite(new Texture(Gdx.files.internal("Player/ParadoArriba.png")));
	TextureRegion animacionParadoAb= new Sprite(new Texture(Gdx.files.internal("Player/ParadoAbajo.png")));

	TextureRegion [] animacionDerecha= {
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha8.png")))

	};
	TextureRegion [] animacionIzquierda= {
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera8.png")))

	};
	TextureRegion [] animacionAbajo= {
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo8.png")))

	};
	TextureRegion [] animacionArriba= {
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba8.png")))

	};
	TextureRegion [] animacionAArriba= {
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArrib3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba6.png")))
	};
	TextureRegion [] animacionAAbajo= {
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo6.png")))
	};
	TextureRegion [] animacionADerecha= {
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha6.png")))
	};
	TextureRegion [] animacionAIzquierda= {
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda6.png")))
	};

	public JugadorPrincipal(WorldOffMind game,float x,float y) {
		super(game);
		position=new Vector2(x,y);
		animationDerecha=new Animation(0.15f,animacionDerecha);
		animationAbajo=new Animation(0.15f,animacionAbajo);
		animationArriba=new Animation(0.15f,animacionArriba);
		animationIzquierda=new Animation(0.15f,animacionIzquierda);
		animationParadoAb=new Animation(0.15f,animacionParadoAb);
		animationParadoAr=new Animation(0.15f,animacionParadoAr);
		animationParadoD=new Animation(0.15f,animacionParadoD);
		animationParadoI=new Animation(0.15f,animacionParadoI);
		animationAAbajo=new Animation(0.1f,animacionAAbajo);
		animationAArriba=new Animation(0.1f,animacionAArriba);
		animationADerecha=new Animation(0.1f,animacionADerecha);
		animationAIzquierda=new Animation(0.1f,animacionAIzquierda);
		this.state=state.IDLERight;
		rect=new Rectangle(x,y,45,45);



	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

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
	public void render() {
		game.batch.draw(currentFrame, position.x, position.y);


	}

	@Override
	public void render(float delta) {


	}

	public void update (float dt) {
		//System.out.println("x:"+ position.x+" y: "+position.y);
		stateTime += dt;
		if (position.x <= 0)
			position.x = 0;
		if(position.y<=0)
			position.y=0;
		if(position.x>=Gdx.graphics.getWidth()-51)
			position.x=Gdx.graphics.getWidth()-51;
		if(position.y>=Gdx.graphics.getHeight()-58)
			position.y=Gdx.graphics.getHeight()-58;
		rect.setPosition(position);
		switch (this.state) {
		case RIGHT:
			currentFrame = (TextureRegion) animationDerecha.getKeyFrame(stateTime, true);
			break;
		case LEFT:
			currentFrame = (TextureRegion) animationIzquierda.getKeyFrame(stateTime, true);
			break;
		case UP:
			currentFrame = (TextureRegion) animationArriba.getKeyFrame(stateTime, true);
			break;
		case DOWN:
			currentFrame = (TextureRegion) animationAbajo.getKeyFrame(stateTime, true);
			break;
		case IDLEDown:
			currentFrame = (TextureRegion) animationParadoAb.getKeyFrame(stateTime, true);
			break;
		case IDLELeft:
			currentFrame = (TextureRegion) animationParadoI.getKeyFrame(stateTime, true);
			break;
		case IDLEUp:
			currentFrame = (TextureRegion) animationParadoAr.getKeyFrame(stateTime, true);
			break;
		case IDLERight:
			currentFrame = (TextureRegion) animationParadoD.getKeyFrame(stateTime, true);
			break;
		case attackDown:
			currentFrame = (TextureRegion) animationAAbajo.getKeyFrame(stateTime, true);
			break;
		case attackLeft:
			currentFrame = (TextureRegion) animationAIzquierda.getKeyFrame(stateTime, true);
			break;
		case attackRight:
			currentFrame = (TextureRegion) animationADerecha.getKeyFrame(stateTime, true);
			break;
		case attackUp:
			currentFrame = (TextureRegion) animationAArriba.getKeyFrame(stateTime, true);
			break;
		default:
			currentFrame = (TextureRegion) animationParadoD.getKeyFrame(0, true);
		}
		

	}
}




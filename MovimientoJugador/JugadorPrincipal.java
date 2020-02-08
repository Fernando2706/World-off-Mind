package personajes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.worldoffmind.game.WorldOffMind;

public class JugadorPrincipal extends Caracteres {
	public static final float SPEED = 400f;

	public enum State{
		RIGHT, LEFT, UP, DOWN, IDLELeft, IDLERight, IDLEUp, IDLEDown
	}
	public State state;
	public void move(Vector2 movement) {

		movement.scl(SPEED);
		position.add(movement);
	}
	TextureRegion animacionParadoD= new Sprite(new Texture(Gdx.files.internal("Parado.png")));
	TextureRegion animacionParadoI= new Sprite(new Texture(Gdx.files.internal("ParadoIzquierda.png")));
	TextureRegion animacionParadoAr= new Sprite(new Texture(Gdx.files.internal("ParadoArriba.png")));
	TextureRegion animacionParadoAb= new Sprite(new Texture(Gdx.files.internal("ParadoAbajo.png")));

	TextureRegion [] animacionDerecha= {
			new Sprite(new Texture(Gdx.files.internal("AndarDerecha1.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarDerecha2.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarDerecha3.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarDerecha4.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarDerecha5.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarDerecha6.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarDerecha7.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarDerecha8.png")))

	};
	TextureRegion [] animacionIzquierda= {
			new Sprite(new Texture(Gdx.files.internal("AndarIzquierda1.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarIzquierda2.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarIzquierda3.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarIzquierda4.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarIzquierda5.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarIzquierda6.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarIzquierda7.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarIzquierda8.png")))

	};
	TextureRegion [] animacionAbajo= {
			new Sprite(new Texture(Gdx.files.internal("AndarAbajo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarAbajo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarAbajo3.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarAbajo4.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarAbajo5.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarAbajo6.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarAbajo7.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarAbajo8.png")))

	};
	TextureRegion [] animacionArriba= {
			new Sprite(new Texture(Gdx.files.internal("ParadoArriba1.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarArriba1.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarArriba2.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarArriba3.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarArriba4.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarArriba5.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarArriba6.png"))),
			new Sprite(new Texture(Gdx.files.internal("AndarArriba7.png")))

	};

	public JugadorPrincipal(WorldOffMind game,float x,float y) {
		super(game);
		position=new Vector2(x,y);
		animationDerecha=new Animation(0.25f,animacionDerecha);
		animationAbajo=new Animation(0.25f,animacionAbajo);
		animationArriba=new Animation(0.25f,animacionArriba);
		animationIzquierda=new Animation(0.25f,animacionIzquierda);
		animationParadoAb=new Animation(0.25f,animacionParadoAb);
		animationParadoAr=new Animation(0.25f,animacionParadoAr);
		animationParadoD=new Animation(0.25f,animacionParadoD);
		animationParadoI=new Animation(0.25f,animacionParadoI);

		this.state=state.RIGHT;



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
		if (position.x <= 0)
			position.x = 0;
		if(position.y<=0)
			position.y=0;
		if(position.x>=1200-51)
			position.x=1200-51;
		if(position.y>=700-58)
			position.y=700-58;

	}

	@Override
	public void render(float delta) {


	}

	public void update (float dt) {

		// Calcula el tiempo para cargar el frame que proceda de la animación
		stateTime += dt;

		// Carga el frame según su posición y el momento del juego

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
		default:
			currentFrame = (TextureRegion) animationParadoD.getKeyFrame(0, true);
		}
		

	}
}




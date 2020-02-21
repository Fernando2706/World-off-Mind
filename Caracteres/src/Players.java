package personajes;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.WorldOffMind;

public class Players extends Caracteres {
	Animation<?> animationAUp;
	Animation<?> animationADown;
	Animation<?> animationARight;
	Animation<?> animationALeft;
	public static final float SPEED = 200f;

	public enum State{
		RIGHT, LEFT, UP, DOWN, IDLELeft, IDLERight, IDLEUp, IDLEDown, attackRight, attackLeft, attackUp, attackDown
	}
	public State state;
	public void move(Vector2 movement) {

		movement.scl(SPEED);
		position.add(movement);
	}
	TextureRegion animationir= new Sprite(new Texture(Gdx.files.internal("Player/ParadoDerecha.png")));
	TextureRegion animationil= new Sprite(new Texture(Gdx.files.internal("Player/ParadoIzquierda.png")));
	TextureRegion animationiu= new Sprite(new Texture(Gdx.files.internal("Player/ParadoArriba.png")));
	TextureRegion animationid= new Sprite(new Texture(Gdx.files.internal("Player/ParadoAbajo.png")));

	TextureRegion [] animationR= {
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarDerecha8.png")))

	};
	TextureRegion [] animationL= {
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarIzquiera8.png")))

	};
	TextureRegion [] animationD= {
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarAbajo8.png")))

	};
	TextureRegion [] animationU= {
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AndarArriba8.png")))

	};
	TextureRegion [] animationau= {
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArrib3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarArriba6.png")))
	};
	TextureRegion [] animationad= {
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarAbajo6.png")))
	};
	TextureRegion [] animationar= {
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarDerecha6.png")))
	};
	TextureRegion [] animational= {
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Player/AtacarIzquierda6.png")))
	};
	TextureRegion currentHp;

	public Players(WorldOffMind game,float x,float y) {
		super(game);
		position=new Vector2(x,y);
		animationRight=new Animation<TextureRegion>(0.15f,animationR);
		animationDown=new Animation<TextureRegion>(0.15f,animationD);
		animationUp=new Animation<TextureRegion>(0.15f,animationU);
		animationLeft=new Animation<TextureRegion>(0.15f,animationL);
		animationIdleDown=new Animation<TextureRegion>(0.15f,animationid);
		animationIdleUp=new Animation<TextureRegion>(0.15f,animationiu);
		animationIdleRight=new Animation<TextureRegion>(0.15f,animationir);
		animationIdleLeft=new Animation<TextureRegion>(0.15f,animationil);
		animationADown=new Animation<TextureRegion>(0.1f,animationad);
		animationAUp=new Animation<TextureRegion>(0.1f,animationau);
		animationARight=new Animation<TextureRegion>(0.1f,animationar);
		animationALeft=new Animation<TextureRegion>(0.1f,animational);
		this.state=State.IDLERight;
		rect=new Rectangle(x,y,45,45);
		hp=100;

		printHp();

	}
	Array<Hearts> hearts=new Array<Hearts>();
	float xh=0;
	float yh=Gdx.graphics.getHeight();
	public void printHp() {
		int n_hp=hp/10;
		for(int i=0;i<n_hp;i++) {
			this.hearts.add(new Hearts(game, xh+36, 36, false));
			xh+=36;
		}
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
		for(Hearts h:this.hearts) {
			h.render();
		}
		game.batch.draw(currentFrame, position.x, position.y);


	}

	@Override
	public void render(float delta) {


	}

	public void update (float dt) {
		//printHp();

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
			currentFrame = (TextureRegion) animationRight.getKeyFrame(stateTime, true);
			break;
		case LEFT:
			currentFrame = (TextureRegion) animationLeft.getKeyFrame(stateTime, true);
			break;
		case UP:
			currentFrame = (TextureRegion) animationUp.getKeyFrame(stateTime, true);
			break;
		case DOWN:
			currentFrame = (TextureRegion) animationDown.getKeyFrame(stateTime, true);
			break;
		case IDLEDown:
			currentFrame = (TextureRegion) animationIdleDown.getKeyFrame(stateTime, true);
			break;
		case IDLELeft:
			currentFrame = (TextureRegion) animationIdleLeft.getKeyFrame(stateTime, true);
			break;
		case IDLEUp:
			currentFrame = (TextureRegion) animationIdleUp.getKeyFrame(stateTime, true);
			break;
		case IDLERight:
			currentFrame = (TextureRegion) animationIdleRight.getKeyFrame(stateTime, true);
			break;
		case attackDown:
			currentFrame = (TextureRegion) animationADown.getKeyFrame(stateTime, true);
			break;
		case attackLeft:
			currentFrame = (TextureRegion) animationALeft.getKeyFrame(stateTime, true);
			break;
		case attackRight:
			currentFrame = (TextureRegion) animationARight.getKeyFrame(stateTime, true);
			break;
		case attackUp:
			currentFrame = (TextureRegion) animationAUp.getKeyFrame(stateTime, true);
			break;
		default:
			currentFrame = (TextureRegion) animationIdleRight.getKeyFrame(0, true);
		}
		

	}
}



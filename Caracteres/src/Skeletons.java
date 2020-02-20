package personajes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.worldoffmind.game.WorldOffMind;


public class Skeletons extends Caracteres{
	public static final float SPEED = 200f;

	public enum State{
		Dead, RIGHT, LEFT, UP, DOWN, IDLELeft, IDLERight, IDLEUp, IDLEDown, attackRight, attackLeft, attackUp, attackDown
	}
	public State state;
	public void move(Vector2 movement) {

		movement.scl(SPEED);
		position.add(movement);
	}
	TextureRegion [] SkeletonsDown= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/AbajoEsqueletoEscudo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/AbajoEsqueletoEscudo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/AbajoEsqueletoEscudo3.png"))),
	};
	TextureRegion [] SkeletonsUp= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/ArribaEsqueletoEscudo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/ArribaEsqueletoEscudo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/ArribaEsqueletoEscudo3.png"))),
	};
	TextureRegion [] SkeletonsRight= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/DerechaEsqueletoEscudo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/DerechaEsqueletoEscudo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/DerechaEsqueletoEscudo3.png"))),
	};
	TextureRegion [] SkeletonsLeft= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/IzquierdaEsqueletoEscudo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/IzquierdaEsqueletoEscudo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/IzquierdaEsqueletoEscudo3.png"))),
	};
	TextureRegion SkeletonsIdleDown= new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/AbajoEsqueletoEscudo2.png")));
	TextureRegion SkeletonsIdleUp= new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/ArribaEsqueletoEscudo2.png")));
	TextureRegion SkeletonsIdleRight= new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/DerechaEsqueletoEscudo2.png")));
	TextureRegion SkeletonsIdleLeft= new Sprite(new Texture(Gdx.files.internal("EsqueletoEscudo/IzquierdaEsqueletoEscudo2.png")));

	TextureRegion [] SkeletonsDownR= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/AbajoEsqueletoRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/AbajoEsqueletoRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/AbajoEsqueletoRojo3.png"))),
	};
	TextureRegion [] SkeletonsUpR= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/ArribaEsqueletoRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/ArribaEsqueletoRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/ArribaEsqueletoRojo3.png"))),
	};
	TextureRegion [] SkeletonsRightR= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/DerechaEsqueletoRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/DerechaEsqueletoRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/DerechaEsqueletoRojo3.png"))),
	};
	TextureRegion [] SkeletonsLeftR= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/IzquierdaEsqueletoRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/IzquierdaEsqueletoRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/IzquierdaEsqueletoRojo3.png"))),
	};
	TextureRegion SkeletonsIdleDownR= new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/AbajoEsqueletoRojo2.png")));
	TextureRegion SkeletonsIdleUpR= new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/ArribaEsqueletoRojo2.png")));
	TextureRegion SkeletonsIdleRightR= new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/DerechaEsqueletoRojo2.png")));
	TextureRegion SkeletonsIdleLeftR= new Sprite(new Texture(Gdx.files.internal("EsqueletoRojo/IzquierdaEsqueletoRojo2.png")));
	
	TextureRegion [] SkeletonsDownRE= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/AbajoEsqueletoOjosRojos1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/AbajoEsqueletoOjosRojos2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/AbajoEsqueletoOjosRojos3.png"))),
	};
	TextureRegion [] SkeletonsUpRE= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/ArribaEsqueletoOjosRojos1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/ArribaEsqueletoOjosRojos2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/ArribaEsqueletoOjosRojos3.png"))),
	};
	TextureRegion [] SkeletonsRightRE= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/DerechaEsqueletoOjosRojos1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/DerechaEsqueletoOjosRojos2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/DerechaEsqueletoOjosRojos3.png"))),
	};
	TextureRegion [] SkeletonsLeftRE= {
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/IzquierdaEsqueletoOjosRojos1.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/IzquierdaEsqueletoOjosRojos2.png"))),
			new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/IzquierdaEsqueletoOjosRojos3.png"))),
	};
	TextureRegion SkeletonsIdleDownRE= new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/AbajoEsqueletoOjosRojos2.png")));
	TextureRegion SkeletonsIdleUpRE= new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/ArribaEsqueletoOjosRojos2.png")));
	TextureRegion SkeletonsIdleRightRE= new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/DerechaEsqueletoOjosRojos2.png")));
	TextureRegion SkeletonsIdleLeftRE= new Sprite(new Texture(Gdx.files.internal("EsqueletoOjosRojos/IzquierdaEsqueletoOjosRojos2.png")));
	
	public Skeletons(WorldOffMind game,float x, float y, boolean shield) {
		super(game);
		position=new Vector2(x,y);
		rect=new Rectangle(x+10,y,35,54);
		if(shield) {
			animationRight=new Animation<TextureRegion>(0.20f,SkeletonsRight);
			animationDown=new Animation<TextureRegion>(0.20f,SkeletonsDown);
			animationUp=new Animation<TextureRegion>(0.20f,SkeletonsUp);
			animationLeft=new Animation<TextureRegion>(0.20f,SkeletonsLeft);
			animationIdleDown=new Animation<TextureRegion>(0.20f,SkeletonsIdleDown);
			animationIdleUp=new Animation<TextureRegion>(0.20f,SkeletonsIdleUp);
			animationIdleRight=new Animation<TextureRegion>(0.20f,SkeletonsIdleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.20f,SkeletonsIdleLeft);
			hp=500;
		}else {
			int a=MathUtils.random(0, 1);
			if(a==0) {
				animationRight=new Animation<TextureRegion>(0.20f,SkeletonsRightR);
				animationDown=new Animation<TextureRegion>(0.20f,SkeletonsDownR);
				animationUp=new Animation<TextureRegion>(0.20f,SkeletonsUpR);
				animationLeft=new Animation<TextureRegion>(0.20f,SkeletonsLeftR);
				animationIdleDown=new Animation<TextureRegion>(0.20f,SkeletonsIdleDownR);
				animationIdleUp=new Animation<TextureRegion>(0.20f,SkeletonsIdleUpR);
				animationIdleRight=new Animation<TextureRegion>(0.20f,SkeletonsIdleRightR);
				animationIdleLeft=new Animation<TextureRegion>(0.20f,SkeletonsIdleLeftR);
				hp=300;
			}else {
				animationRight=new Animation<TextureRegion>(0.20f,SkeletonsRightRE);
				animationDown=new Animation<TextureRegion>(0.20f,SkeletonsDownRE);
				animationUp=new Animation<TextureRegion>(0.20f,SkeletonsUpRE);
				animationLeft=new Animation<TextureRegion>(0.20f,SkeletonsLeftRE);
				animationIdleDown=new Animation<TextureRegion>(0.20f,SkeletonsIdleDownRE);
				animationIdleUp=new Animation<TextureRegion>(0.20f,SkeletonsIdleUpRE);
				animationIdleRight=new Animation<TextureRegion>(0.20f,SkeletonsIdleRightRE);
				animationIdleLeft=new Animation<TextureRegion>(0.20f,SkeletonsIdleLeftRE);
				hp=300;	
			}
		}
		this.state=State.LEFT;
	}

	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void render() {
		game.batch.draw(currentFrame, position.x, position.y);

	}
	public void update(float dt) {
		if(hp<=0) {
			dead=true;
		}
		stateTime+=dt;
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
		default:
			currentFrame = (TextureRegion) animationIdleRight.getKeyFrame(0, true);
	}

}

}

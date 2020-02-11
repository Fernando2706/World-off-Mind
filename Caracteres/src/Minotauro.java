package personajes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.worldoffmind.game.WorldOffMind;


public class Minotauro extends Caracteres {
	
	public static final float SPEED = 100f;

	public enum State{
		RIGHT, LEFT, UP, DOWN, IDLELeft, IDLERight, IDLEUp, IDLEDown, attackRight, attackLeft, attackUp, attackDown
	}
	public State state;
	public void move(Vector2 movement) {

		movement.scl(SPEED);
		position.add(movement);
	}
	TextureRegion animacionParadoD= new Sprite(new Texture(Gdx.files.internal("DerechaMinotauroRojo2.png")));
	TextureRegion animacionParadoI= new Sprite(new Texture(Gdx.files.internal("IzquierdaMinotauroRojo2.png")));
	TextureRegion animacionParadoAr= new Sprite(new Texture(Gdx.files.internal("ArribaMinotauroRojo2.png")));
	TextureRegion animacionParadoAb= new Sprite(new Texture(Gdx.files.internal("AbajoMinotauroRojo2.png")));
	
	TextureRegion [] animacionDerecha= {
			new Sprite(new Texture(Gdx.files.internal("DerechaMinotauroRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("DerechaMinotauroRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("DerechaMinotauroRojo3.png")))
	};
	TextureRegion [] animacionIzquierda= {
			new Sprite(new Texture(Gdx.files.internal("IzquierdaMinotauroRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("IzquierdaMinotauroRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("IzquierdaMinotauroRojo3.png")))
	};
	TextureRegion [] animacionArriba= {
			new Sprite(new Texture(Gdx.files.internal("ArribaMinotauroRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("ArribaMinotauroRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("ArribaMinotauroRojo3.png")))
	};
	TextureRegion [] animacionAbajo= {
			new Sprite(new Texture(Gdx.files.internal("AbajoMinotauroRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("AbajoMinotauroRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("AbajoMinotauroRojo3.png")))
	};
	public Minotauro(WorldOffMind game,float x, float y) {
		super(game);
		hp=1000;
		damage=50;
		defensa=5;
		dead=false;
		position=new Vector2(x,y);
		animationDerecha=new Animation(0.25f,animacionDerecha);
		animationAbajo=new Animation(0.25f,animacionAbajo);
		animationArriba=new Animation(0.25f,animacionArriba);
		animationIzquierda=new Animation(0.25f,animacionIzquierda);
		animationParadoAb=new Animation(0.25f,animacionParadoAb);
		animationParadoAr=new Animation(0.25f,animacionParadoAr);
		animationParadoD=new Animation(0.25f,animacionParadoD);
		animationParadoI=new Animation(0.25f,animacionParadoI);
		this.state=state.IDLELeft;
		rect=new Rectangle(x,y,49,64);
		currentFrame = (TextureRegion) animationParadoD.getKeyFrame(0, true);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void render(float delta) {
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
	public void update(float dt) {
		System.out.println(dt);
		if(position.x<=(700)) {
			move(new Vector2(dt, 0));
			state=state.RIGHT;
		}
		if(position.x>=(300)) {
			move(new Vector2(-dt, 0));
			state=state.LEFT;
		}
		rect.setPosition(position);
		stateTime += dt;
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

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
	TextureRegion animacionParadoD= new Sprite(new Texture(Gdx.files.internal("MinotaurRed/DerechaMinotauroRojo2.png")));
	TextureRegion animacionParadoI= new Sprite(new Texture(Gdx.files.internal("MinotaurRed/IzquierdaMinotauroRojo2.png")));
	TextureRegion animacionParadoAr= new Sprite(new Texture(Gdx.files.internal("MinotaurRed/ArribaMinotauroRojo2.png")));
	TextureRegion animacionParadoAb= new Sprite(new Texture(Gdx.files.internal("MinotaurRed/AbajoMinotauroRojo2.png")));
	
	TextureRegion [] animacionDerecha= {
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/DerechaMinotauroRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/DerechaMinotauroRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/DerechaMinotauroRojo3.png")))
	};
	TextureRegion [] animacionIzquierda= {
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/IzquierdaMinotauroRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/IzquierdaMinotauroRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/IzquierdaMinotauroRojo3.png")))
	};
	TextureRegion [] animacionArriba= {
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/ArribaMinotauroRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/ArribaMinotauroRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/ArribaMinotauroRojo3.png")))
	};
	TextureRegion [] animacionAbajo= {
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/AbajoMinotauroRojo1.png"))),
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/AbajoMinotauroRojo2.png"))),
			new Sprite(new Texture(Gdx.files.internal("MinotaurRed/AbajoMinotauroRojo3.png")))
	};
	public Minotauro(WorldOffMind game,float x, float y) {
		super(game);
		hp=1000;
		damage=50;
		defensa=5;
		dead=false;
		position=new Vector2(x,y);
		animationDerecha=new Animation(0.35f,animacionDerecha);
		animationAbajo=new Animation(0.35f,animacionAbajo);
		animationArriba=new Animation(0.35f,animacionArriba);
		animationIzquierda=new Animation(0.35f,animacionIzquierda);
		animationParadoAb=new Animation(0.35f,animacionParadoAb);
		animationParadoAr=new Animation(0.35f,animacionParadoAr);
		animationParadoD=new Animation(0.35f,animacionParadoD);
		animationParadoI=new Animation(0.35f,animacionParadoI);
		this.state=state.IDLELeft;
		rect=new Rectangle(x,y,75,100);
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
		if(hp<=0) {
			dead=true;
		}
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
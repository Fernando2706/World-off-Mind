package personajes;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.worldoffmind.game.WorldOffMind;


public class Spider extends Caracteres{
	public static final float SPEED = 200f;
	Animation<TextureRegion> animationAUp;
	Animation<TextureRegion> animationADown;
	Animation<TextureRegion> animationARight;
	Animation<TextureRegion> animationALeft;
	Animation<TextureRegion> animationDead;
	public enum State{
		Dead, RIGHT, LEFT, UP, DOWN, IDLELeft, IDLERight, IDLEUp, IDLEDown, attackRight, attackLeft, attackUp, attackDown
	}
	public State state;
	public void move(Vector2 movement) {

		movement.scl(SPEED);
		position.add(movement);
	}
	TextureRegion [] Spider1Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Abajo1Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Abajo2Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Abajo3Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Abajo4Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Abajo5Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Abajo6Ara�a1.png"))),

	};
	TextureRegion [] Spider2Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Abajo1Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Abajo2Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Abajo3Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Abajo4Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Abajo5Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Abajo6Ara�a2.png"))),

	};
	TextureRegion [] Spider3Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Abajo1Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Abajo2Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Abajo3Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Abajo4Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Abajo5Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Abajo6Ara�a3.png"))),

	};
	TextureRegion [] Spider4Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Abajo1Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Abajo2Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Abajo3Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Abajo4Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Abajo5Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Abajo6Ara�a4.png"))),

	};
	TextureRegion [] Spider5Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Abajo1Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Abajo2Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Abajo3Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Abajo4Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Abajo5Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Abajo6Ara�a5.png"))),

	};
	TextureRegion [] Spider6Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Abajo1Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Abajo2Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Abajo3Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Abajo4Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Abajo5Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Abajo6Ara�a6.png"))),

	};
	TextureRegion [] Spider7Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Abajo1Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Abajo2Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Abajo3Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Abajo4Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Abajo5Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Abajo6Ara�a7.png"))),

	};
	TextureRegion [] Spider8Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Abajo1Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Abajo2Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Abajo3Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Abajo4Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Abajo5Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Abajo6Ara�a8.png"))),

	};
	TextureRegion [] Spider9Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Abajo1Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Abajo2Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Abajo3Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Abajo4Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Abajo5Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Abajo6Ara�a9.png"))),

	};
	TextureRegion [] Spider10Down= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Abajo1Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Abajo2Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Abajo3Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Abajo4Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Abajo5Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Abajo6Ara�a10.png"))),

	};
	TextureRegion [] Spider1Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Arriba1Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Arriba2Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Arriba3Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Arriba4Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Arriba5Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Arriba6Ara�a1.png"))),
	};
	
	TextureRegion [] Spider2Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Arriba1Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Arriba2Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Arriba3Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Arriba4Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Arriba5Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Arriba6Ara�a2.png"))),
	};
	TextureRegion [] Spider3Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Arriba1Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Arriba2Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Arriba3Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Arriba4Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Arriba5Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Arriba6Ara�a3.png"))),
	};
	TextureRegion [] Spider4Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Arriba1Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Arriba2Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Arriba3Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Arriba4Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Arriba5Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Arriba6Ara�a4.png"))),
	};
	TextureRegion [] Spider5Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Arriba1Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Arriba2Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Arriba3Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Arriba4Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Arriba5Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Arriba6Ara�a5.png"))),
	};
	TextureRegion [] Spider6Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Arriba1Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Arriba2Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Arriba3Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Arriba4Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Arriba5Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Arriba6Ara�a6.png"))),
	};
	TextureRegion [] Spider7Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Arriba1Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Arriba2Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Arriba3Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Arriba4Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Arriba5Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Arriba6Ara�a7.png"))),
	};
	TextureRegion [] Spider8Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Arriba1Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Arriba2Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Arriba3Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Arriba4Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Arriba5Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Arriba6Ara�a8.png"))),
	};
	TextureRegion [] Spider9Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Arriba1Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Arriba2Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Arriba3Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Arriba4Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Arriba5Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Arriba6Ara�a9.png"))),
	};
	TextureRegion [] Spider10Up= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Arriba1Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Arriba2Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Arriba3Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Arriba4Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Arriba5Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Arriba6Ara�a10.png"))),
	};
	TextureRegion [] Spider1Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Derecha1Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Derecha2Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Derecha3Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Derecha4Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Derecha5Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Derecha6Ara�a1.png"))),
	};
	TextureRegion [] Spider2Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Derecha1Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Derecha2Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Derecha3Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Derecha4Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Derecha5Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Derecha6Ara�a2.png"))),
	};
	TextureRegion [] Spider3Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Derecha1Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Derecha2Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Derecha3Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Derecha4Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Derecha5Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Derecha6Ara�a3.png"))),
	};
	TextureRegion [] Spider4Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Derecha1Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Derecha2Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Derecha3Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Derecha4Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Derecha5Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Derecha6Ara�a4.png"))),
	};
	TextureRegion [] Spider5Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Derecha1Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Derecha2Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Derecha3Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Derecha4Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Derecha5Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Derecha6Ara�a5.png"))),
	};
	TextureRegion [] Spider6Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Derecha1Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Derecha2Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Derecha3Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Derecha4Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Derecha5Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Derecha6Ara�a6.png"))),
	};
	TextureRegion [] Spider7Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Derecha1Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Derecha2Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Derecha3Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Derecha4Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Derecha5Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Derecha6Ara�a7.png"))),
	};
	TextureRegion [] Spider8Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Derecha1Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Derecha2Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Derecha3Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Derecha4Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Derecha5Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Derecha6Ara�a8.png"))),
	};
	TextureRegion [] Spider9Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Derecha1Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Derecha2Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Derecha3Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Derecha4Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Derecha5Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Derecha6Ara�a9.png"))),
	};
	TextureRegion [] Spider10Right= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Derecha1Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Derecha2Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Derecha3Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Derecha4Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Derecha5Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Derecha6Ara�a10.png"))),
	};
	TextureRegion [] Spider1Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Izquierda1Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Izquierda2Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Izquierda3Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Izquierda4Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Izquierda5Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Izquierda6Ara�a1.png"))),
	};
		TextureRegion [] Spider2Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Izquierda1Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Izquierda2Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Izquierda3Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Izquierda4Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Izquierda5Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Izquierda6Ara�a2.png"))),
	};
	TextureRegion [] Spider3Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Izquierda1Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Izquierda2Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Izquierda3Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Izquierda4Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Izquierda5Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Izquierda6Ara�a3.png"))),
	};                                                      
	TextureRegion [] Spider4Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Izquierda1Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Izquierda2Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Izquierda3Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Izquierda4Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Izquierda5Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Izquierda6Ara�a4.png"))),
	};
	TextureRegion [] Spider5Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Izquierda1Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Izquierda2Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Izquierda3Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Izquierda4Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Izquierda5Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Izquierda6Ara�a5.png"))),
	};
	TextureRegion [] Spider6Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Izquierda1Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Izquierda2Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Izquierda3Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Izquierda4Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Izquierda5Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Izquierda6Ara�a6.png"))),
	};
	TextureRegion [] Spider7Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Izquierda1Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Izquierda2Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Izquierda3Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Izquierda4Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Izquierda5Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Izquierda6Ara�a7.png"))),
	};
	TextureRegion [] Spider8Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Izquierda1Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Izquierda2Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Izquierda3Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Izquierda4Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Izquierda5Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Izquierda6Ara�a8.png"))),
	};
	TextureRegion [] Spider9Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Izquierda1Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Izquierda2Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Izquierda3Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Izquierda4Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Izquierda5Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Izquierda6Ara�a9.png"))),
	};
	TextureRegion [] Spider10Left= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Izquierda1Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Izquierda2Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Izquierda3Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Izquierda4Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Izquierda5Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Izquierda6Ara�a10.png"))),
	};
	TextureRegion [] Spider1Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Muerte1Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Muerte2Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Muerte3Ara�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Muerte4Ara�a1.png"))),
			
	};
	TextureRegion [] Spider2Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Muerte1Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Muerte2Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Muerte3Ara�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Muerte4Ara�a2.png"))),
			                                                
	};
	TextureRegion [] Spider3Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Muerte1Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Muerte2Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Muerte3Ara�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Muerte4Ara�a3.png"))),
			
	};
	TextureRegion [] Spider4Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Muerte1Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Muerte2Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Muerte3Ara�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Muerte4Ara�a4.png"))),
			
	};
	TextureRegion [] Spider5Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Muerte1Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Muerte2Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Muerte3Ara�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Muerte4Ara�a5.png"))),
			
	};
	TextureRegion [] Spider6Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Muerte1Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Muerte2Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Muerte3Ara�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Muerte4Ara�a6.png"))),
			
	};
	TextureRegion [] Spider7Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Muerte1Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Muerte2Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Muerte3Ara�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Muerte4Ara�a7.png"))),
			
	};
	TextureRegion [] Spider8Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Muerte1Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Muerte2Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Muerte3Ara�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Muerte4Ara�a8.png"))),
			
	};
	TextureRegion [] Spider9Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Muerte1Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Muerte2Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Muerte3Ara�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Muerte4Ara�a9.png"))),
			
	};
	TextureRegion [] Spider10Dead= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Muerte1Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Muerte2Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Muerte3Ara�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Muerte4Ara�a10.png"))),
			
	};
	TextureRegion [] Spider1AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque2AbajoAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque3AbajoAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque4AbajoAra�a1.png"))),
	};

	TextureRegion [] Spider2AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque1ParadaAbajoAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque2AbajoAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque3AbajoAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque4AbajoAra�a2.png"))),
	};
	TextureRegion [] Spider3AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque1ParadaAbajoAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque2AbajoAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque3AbajoAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque4AbajoAra�a3.png"))),
	};
	TextureRegion [] Spider4AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque1ParadaAbajoAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque2AbajoAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque3AbajoAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque4AbajoAra�a4.png"))),
	};
	TextureRegion [] Spider5AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque1ParadaAbajoAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque2AbajoAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque3AbajoAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque4AbajoAra�a5.png"))),
	};
	TextureRegion [] Spider6AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque1ParadaAbajoAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque2AbajoAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque3AbajoAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque4AbajoAra�a6.png"))),
	};
	TextureRegion [] Spider7AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque1ParadaAbajoAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque2AbajoAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque3AbajoAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque4AbajoAra�a7.png"))),
	};
	TextureRegion [] Spider8AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque1ParadaAbajoAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque2AbajoAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque3AbajoAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque4AbajoAra�a8.png"))),
	};
	TextureRegion [] Spider9AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque1ParadaAbajoAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque2AbajoAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque3AbajoAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque4AbajoAra�a9.png"))),
	};
	TextureRegion [] Spider10AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque1ParadaAbajoAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque2AbajoAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque3AbajoAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque4AbajoAra�a10.png"))),
	};
	TextureRegion [] Spider1AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque2ArribaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque3ArribaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque4ArribaAra�a1.png"))),
	};

	TextureRegion [] Spider2AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque1ParadaArribaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque2ArribaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque3ArribaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque4ArribaAra�a2.png"))),
	};
	TextureRegion [] Spider3AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque1ParadaArribaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque2ArribaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque3ArribaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque4ArribaAra�a3.png"))),
	};
	TextureRegion [] Spider4AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque1ParadaArribaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque2ArribaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque3ArribaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque4ArribaAra�a4.png"))),
	};
	TextureRegion [] Spider5AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque1ParadaArribaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque2ArribaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque3ArribaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque4ArribaAra�a5.png"))),
	};
	TextureRegion [] Spider6AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque1ParadaArribaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque2ArribaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque3ArribaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque4ArribaAra�a6.png"))),
	};
	TextureRegion [] Spider7AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque1ParadaArribaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque2ArribaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque3ArribaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque4ArribaAra�a7.png"))),
	};
	TextureRegion [] Spider8AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque1ParadaArribaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque2ArribaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque3ArribaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque4ArribaAra�a8.png"))),
	};
	TextureRegion [] Spider9AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque1ParadaArribaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque2ArribaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque3ArribaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque4ArribaAra�a9.png"))),
	};
	TextureRegion [] Spider10AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque1ParadaArribaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque2ArribaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque3ArribaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque4ArribaAra�a10.png"))),
	};
	TextureRegion [] Spider1AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque2DerechaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque3DerechaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque4DerechaAra�a1.png"))),
	};

	TextureRegion [] Spider2AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque1ParadaDerechaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque2DerechaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque3DerechaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque4DerechaAra�a2.png"))),
	};
	TextureRegion [] Spider3AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque1ParadaDerechaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque2DerechaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque3DerechaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque4DerechaAra�a3.png"))),
	};
	TextureRegion [] Spider4AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque1ParadaDerechaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque2DerechaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque3DerechaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque4DerechaAra�a4.png"))),
	};
	TextureRegion [] Spider5AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque1ParadaDerechaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque2DerechaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque3DerechaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque4DerechaAra�a5.png"))),
	};
	TextureRegion [] Spider6AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque1ParadaDerechaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque2DerechaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque3DerechaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque4DerechaAra�a6.png"))),
	};
	TextureRegion [] Spider7AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque1ParadaDerechaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque2DerechaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque3DerechaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque4DerechaAra�a7.png"))),
	};
	TextureRegion [] Spider8AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque1ParadaDerechaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque2DerechaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque3DerechaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque4DerechaAra�a8.png"))),
	};
	TextureRegion [] Spider9AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque1ParadaDerechaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque2DerechaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque3DerechaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque4DerechaAra�a9.png"))),
	};
	TextureRegion [] Spider10AttackRight={
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque1ParadaDerechaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque2DerechaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque3DerechaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque4DerechaAra�a10.png"))),
	};
	
	TextureRegion [] Spider1AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque2IzquierdaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque3IzquierdaAra�a1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque4IzquierdaAra�a1.png"))),
	};

	TextureRegion [] Spider2AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque1ParadaIzquierdaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque2IzquierdaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque3IzquierdaAra�a2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a2/Ataque4IzquierdaAra�a2.png"))),
	};
	TextureRegion [] Spider3AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque1ParadaIzquierdaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque2IzquierdaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque3IzquierdaAra�a3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a3/Ataque4IzquierdaAra�a3.png"))),
	};
	TextureRegion [] Spider4AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque1ParadaIzquierdaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque2IzquierdaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque3IzquierdaAra�a4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a4/Ataque4IzquierdaAra�a4.png"))),
	};
	TextureRegion [] Spider5AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque1ParadaIzquierdaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque2IzquierdaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque3IzquierdaAra�a5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a5/Ataque4IzquierdaAra�a5.png"))),
	};
	TextureRegion [] Spider6AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque1ParadaIzquierdaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque2IzquierdaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque3IzquierdaAra�a6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a6/Ataque4IzquierdaAra�a6.png"))),
	};
	TextureRegion [] Spider7AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque1ParadaIzquierdaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque2IzquierdaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque3IzquierdaAra�a7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a7/Ataque4IzquierdaAra�a7.png"))),
	};
	TextureRegion [] Spider8AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque1ParadaIzquierdaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque2IzquierdaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque3IzquierdaAra�a8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a8/Ataque4IzquierdaAra�a8.png"))),
	};
	TextureRegion [] Spider9AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque1ParadaIzquierdaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque2IzquierdaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque3IzquierdaAra�a9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a9/Ataque4IzquierdaAra�a9.png"))),
	};
	TextureRegion [] Spider10AttackLeft={
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque1ParadaIzquierdaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque2IzquierdaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque3IzquierdaAra�a10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Ara�a10/Ataque4IzquierdaAra�a10.png"))),
	};
	TextureRegion Spider1dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider2dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider3dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider4dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider5dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider6dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider7dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider8dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider9dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider10dleDown=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaAbajoAra�a1.png")));
	TextureRegion Spider1dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider2dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider3dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider4dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider5dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider6dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider7dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider8dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider9dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider10dleUp=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaArribaAra�a1.png")));
	TextureRegion Spider1dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider2dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider3dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider4dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider5dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider6dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider7dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider8dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider9dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider10dleRight=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaDerechaAra�a1.png")));
	TextureRegion Spider1dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider2dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider3dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider4dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider5dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider6dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider7dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider8dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider9dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	TextureRegion Spider10dleLeft=new Sprite(new Texture(Gdx.files.internal("Ara�a1/Ataque1ParadaIzquierdaAra�a1.png")));
	public Spider(WorldOffMind game, String type, float x, float y) {
		super(game);
		position=new Vector2(x,y);
		rect=new Rectangle(x,y+10,46,30);
		hp=400;
		if(type.equals("Poisson1")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider1Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider1Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider1Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider1Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider1dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider1dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider1dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider1dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider1AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider1AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider1AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider1AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider1Dead);
		}else if(type.equals("Ice1")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider2Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider2Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider2Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider2Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider2dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider2dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider2dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider2dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider2AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider2AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider2AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider2AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider2Dead);
		}else if(type.equals("Fire1")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider3Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider3Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider3Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider3Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider3dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider3dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider3dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider3dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider3AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider3AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider3AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider3AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider3Dead);
		}else if(type.equals("Fire2")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider4Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider4Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider4Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider4Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider4dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider4dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider4dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider4dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider4AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider4AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider4AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider4AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider4Dead);
		}else if(type.equals("Ice2")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider5Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider5Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider5Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider5Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider5dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider5dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider5dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider5dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider5AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider5AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider5AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider5AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider5Dead);
		}else if(type.equals("Ice3")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider6Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider6Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider6Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider6Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider6dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider6dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider6dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider6dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider6AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider6AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider6AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider6AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider6Dead);
		}else if(type.equals("Ice4")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider7Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider7Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider7Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider7Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider7dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider7dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider7dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider7dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider7AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider7AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider7AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider7AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider7Dead);
		}else if(type.equals("Ice5")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider8Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider8Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider8Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider8Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider8dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider8dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider8dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider8dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider8AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider8AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider8AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider8AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider8Dead);
		}else if(type.equals("Golden")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider9Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider9Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider9Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider9Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider9dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider9dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider9dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider9dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider9AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider9AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider9AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider9AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider9Dead);
		}
		else if(type.equals("GoldenPoisson")) {
			animationRight=new Animation<TextureRegion>(0.15f,Spider10Right);
			animationLeft=new Animation<TextureRegion>(0.15f,Spider10Left);
			animationUp=new Animation<TextureRegion>(0.15f,Spider10Up);
			animationDown=new Animation<TextureRegion>(0.15f,Spider10Down);
			animationIdleDown=new Animation<TextureRegion>(0.15f,Spider10dleDown);
			animationIdleUp=new Animation<TextureRegion>(0.15f,Spider10dleUp);
			animationIdleRight=new Animation<TextureRegion>(0.15f,Spider10dleRight);
			animationIdleLeft=new Animation<TextureRegion>(0.15f,Spider10dleLeft);
			animationADown=new Animation<TextureRegion>(0.15f,Spider10AttackDown);
			animationAUp=new Animation<TextureRegion>(0.15f,Spider10AttackUp);
			animationALeft=new Animation<TextureRegion>(0.15f,Spider10AttackLeft);
			animationARight=new Animation<TextureRegion>(0.15f,Spider10AttackRight);
			animationDead=new Animation<TextureRegion>(0.15f,Spider10Dead);
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
			this.state=State.Dead;
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
		case Dead:
			currentFrame = (TextureRegion) animationDead.getKeyFrame(stateTime, false);
			break;
		default:
			currentFrame = (TextureRegion) animationIdleRight.getKeyFrame(0, true);
	}

}
}

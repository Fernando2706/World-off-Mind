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
			new Sprite(new Texture(Gdx.files.internal("Araña1/Abajo1Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Abajo2Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Abajo3Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Abajo4Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Abajo5Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Abajo6Araña1.png"))),

	};
	TextureRegion [] Spider2Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Abajo1Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Abajo2Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Abajo3Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Abajo4Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Abajo5Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Abajo6Araña2.png"))),

	};
	TextureRegion [] Spider3Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Abajo1Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Abajo2Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Abajo3Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Abajo4Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Abajo5Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Abajo6Araña3.png"))),

	};
	TextureRegion [] Spider4Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Abajo1Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Abajo2Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Abajo3Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Abajo4Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Abajo5Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Abajo6Araña4.png"))),

	};
	TextureRegion [] Spider5Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Abajo1Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Abajo2Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Abajo3Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Abajo4Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Abajo5Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Abajo6Araña5.png"))),

	};
	TextureRegion [] Spider6Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Abajo1Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Abajo2Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Abajo3Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Abajo4Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Abajo5Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Abajo6Araña6.png"))),

	};
	TextureRegion [] Spider7Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Abajo1Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Abajo2Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Abajo3Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Abajo4Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Abajo5Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Abajo6Araña7.png"))),

	};
	TextureRegion [] Spider8Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Abajo1Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Abajo2Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Abajo3Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Abajo4Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Abajo5Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Abajo6Araña8.png"))),

	};
	TextureRegion [] Spider9Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Abajo1Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Abajo2Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Abajo3Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Abajo4Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Abajo5Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Abajo6Araña9.png"))),

	};
	TextureRegion [] Spider10Down= {
			new Sprite(new Texture(Gdx.files.internal("Araña10/Abajo1Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Abajo2Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Abajo3Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Abajo4Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Abajo5Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Abajo6Araña10.png"))),

	};
	TextureRegion [] Spider1Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña1/Arriba1Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Arriba2Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Arriba3Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Arriba4Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Arriba5Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Arriba6Araña1.png"))),
	};
	
	TextureRegion [] Spider2Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Arriba1Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Arriba2Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Arriba3Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Arriba4Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Arriba5Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Arriba6Araña2.png"))),
	};
	TextureRegion [] Spider3Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Arriba1Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Arriba2Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Arriba3Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Arriba4Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Arriba5Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Arriba6Araña3.png"))),
	};
	TextureRegion [] Spider4Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Arriba1Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Arriba2Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Arriba3Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Arriba4Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Arriba5Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Arriba6Araña4.png"))),
	};
	TextureRegion [] Spider5Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Arriba1Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Arriba2Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Arriba3Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Arriba4Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Arriba5Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Arriba6Araña5.png"))),
	};
	TextureRegion [] Spider6Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Arriba1Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Arriba2Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Arriba3Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Arriba4Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Arriba5Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Arriba6Araña6.png"))),
	};
	TextureRegion [] Spider7Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Arriba1Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Arriba2Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Arriba3Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Arriba4Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Arriba5Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Arriba6Araña7.png"))),
	};
	TextureRegion [] Spider8Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Arriba1Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Arriba2Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Arriba3Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Arriba4Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Arriba5Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Arriba6Araña8.png"))),
	};
	TextureRegion [] Spider9Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Arriba1Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Arriba2Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Arriba3Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Arriba4Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Arriba5Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Arriba6Araña9.png"))),
	};
	TextureRegion [] Spider10Up= {
			new Sprite(new Texture(Gdx.files.internal("Araña10/Arriba1Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Arriba2Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Arriba3Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Arriba4Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Arriba5Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Arriba6Araña10.png"))),
	};
	TextureRegion [] Spider1Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña1/Derecha1Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Derecha2Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Derecha3Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Derecha4Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Derecha5Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Derecha6Araña1.png"))),
	};
	TextureRegion [] Spider2Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Derecha1Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Derecha2Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Derecha3Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Derecha4Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Derecha5Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Derecha6Araña2.png"))),
	};
	TextureRegion [] Spider3Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Derecha1Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Derecha2Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Derecha3Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Derecha4Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Derecha5Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Derecha6Araña3.png"))),
	};
	TextureRegion [] Spider4Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Derecha1Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Derecha2Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Derecha3Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Derecha4Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Derecha5Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Derecha6Araña4.png"))),
	};
	TextureRegion [] Spider5Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Derecha1Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Derecha2Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Derecha3Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Derecha4Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Derecha5Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Derecha6Araña5.png"))),
	};
	TextureRegion [] Spider6Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Derecha1Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Derecha2Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Derecha3Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Derecha4Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Derecha5Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Derecha6Araña6.png"))),
	};
	TextureRegion [] Spider7Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Derecha1Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Derecha2Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Derecha3Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Derecha4Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Derecha5Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Derecha6Araña7.png"))),
	};
	TextureRegion [] Spider8Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Derecha1Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Derecha2Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Derecha3Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Derecha4Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Derecha5Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Derecha6Araña8.png"))),
	};
	TextureRegion [] Spider9Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Derecha1Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Derecha2Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Derecha3Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Derecha4Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Derecha5Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Derecha6Araña9.png"))),
	};
	TextureRegion [] Spider10Right= {
			new Sprite(new Texture(Gdx.files.internal("Araña10/Derecha1Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Derecha2Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Derecha3Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Derecha4Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Derecha5Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Derecha6Araña10.png"))),
	};
	TextureRegion [] Spider1Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña1/Izquierda1Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Izquierda2Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Izquierda3Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Izquierda4Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Izquierda5Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Izquierda6Araña1.png"))),
	};
		TextureRegion [] Spider2Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Izquierda1Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Izquierda2Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Izquierda3Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Izquierda4Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Izquierda5Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Izquierda6Araña2.png"))),
	};
	TextureRegion [] Spider3Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Izquierda1Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Izquierda2Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Izquierda3Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Izquierda4Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Izquierda5Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Izquierda6Araña3.png"))),
	};                                                      
	TextureRegion [] Spider4Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Izquierda1Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Izquierda2Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Izquierda3Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Izquierda4Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Izquierda5Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Izquierda6Araña4.png"))),
	};
	TextureRegion [] Spider5Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Izquierda1Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Izquierda2Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Izquierda3Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Izquierda4Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Izquierda5Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Izquierda6Araña5.png"))),
	};
	TextureRegion [] Spider6Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Izquierda1Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Izquierda2Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Izquierda3Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Izquierda4Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Izquierda5Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Izquierda6Araña6.png"))),
	};
	TextureRegion [] Spider7Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Izquierda1Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Izquierda2Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Izquierda3Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Izquierda4Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Izquierda5Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Izquierda6Araña7.png"))),
	};
	TextureRegion [] Spider8Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Izquierda1Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Izquierda2Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Izquierda3Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Izquierda4Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Izquierda5Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Izquierda6Araña8.png"))),
	};
	TextureRegion [] Spider9Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Izquierda1Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Izquierda2Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Izquierda3Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Izquierda4Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Izquierda5Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Izquierda6Araña9.png"))),
	};
	TextureRegion [] Spider10Left= {
			new Sprite(new Texture(Gdx.files.internal("Araña10/Izquierda1Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Izquierda2Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Izquierda3Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Izquierda4Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Izquierda5Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Izquierda6Araña10.png"))),
	};
	TextureRegion [] Spider1Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña1/Muerte1Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Muerte2Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Muerte3Araña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Muerte4Araña1.png"))),
			
	};
	TextureRegion [] Spider2Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Muerte1Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Muerte2Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Muerte3Araña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Muerte4Araña2.png"))),
			                                                
	};
	TextureRegion [] Spider3Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Muerte1Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Muerte2Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Muerte3Araña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Muerte4Araña3.png"))),
			
	};
	TextureRegion [] Spider4Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Muerte1Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Muerte2Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Muerte3Araña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Muerte4Araña4.png"))),
			
	};
	TextureRegion [] Spider5Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Muerte1Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Muerte2Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Muerte3Araña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Muerte4Araña5.png"))),
			
	};
	TextureRegion [] Spider6Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Muerte1Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Muerte2Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Muerte3Araña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Muerte4Araña6.png"))),
			
	};
	TextureRegion [] Spider7Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Muerte1Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Muerte2Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Muerte3Araña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Muerte4Araña7.png"))),
			
	};
	TextureRegion [] Spider8Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Muerte1Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Muerte2Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Muerte3Araña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Muerte4Araña8.png"))),
			
	};
	TextureRegion [] Spider9Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Muerte1Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Muerte2Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Muerte3Araña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Muerte4Araña9.png"))),
			
	};
	TextureRegion [] Spider10Dead= {
			new Sprite(new Texture(Gdx.files.internal("Araña10/Muerte1Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Muerte2Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Muerte3Araña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Muerte4Araña10.png"))),
			
	};
	TextureRegion [] Spider1AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque2AbajoAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque3AbajoAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque4AbajoAraña1.png"))),
	};

	TextureRegion [] Spider2AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque1ParadaAbajoAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque2AbajoAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque3AbajoAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque4AbajoAraña2.png"))),
	};
	TextureRegion [] Spider3AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque1ParadaAbajoAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque2AbajoAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque3AbajoAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque4AbajoAraña3.png"))),
	};
	TextureRegion [] Spider4AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque1ParadaAbajoAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque2AbajoAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque3AbajoAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque4AbajoAraña4.png"))),
	};
	TextureRegion [] Spider5AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque1ParadaAbajoAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque2AbajoAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque3AbajoAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque4AbajoAraña5.png"))),
	};
	TextureRegion [] Spider6AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque1ParadaAbajoAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque2AbajoAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque3AbajoAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque4AbajoAraña6.png"))),
	};
	TextureRegion [] Spider7AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque1ParadaAbajoAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque2AbajoAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque3AbajoAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque4AbajoAraña7.png"))),
	};
	TextureRegion [] Spider8AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque1ParadaAbajoAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque2AbajoAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque3AbajoAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque4AbajoAraña8.png"))),
	};
	TextureRegion [] Spider9AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque1ParadaAbajoAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque2AbajoAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque3AbajoAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque4AbajoAraña9.png"))),
	};
	TextureRegion [] Spider10AttackDown= {
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque1ParadaAbajoAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque2AbajoAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque3AbajoAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque4AbajoAraña10.png"))),
	};
	TextureRegion [] Spider1AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque2ArribaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque3ArribaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque4ArribaAraña1.png"))),
	};

	TextureRegion [] Spider2AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque1ParadaArribaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque2ArribaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque3ArribaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque4ArribaAraña2.png"))),
	};
	TextureRegion [] Spider3AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque1ParadaArribaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque2ArribaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque3ArribaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque4ArribaAraña3.png"))),
	};
	TextureRegion [] Spider4AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque1ParadaArribaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque2ArribaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque3ArribaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque4ArribaAraña4.png"))),
	};
	TextureRegion [] Spider5AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque1ParadaArribaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque2ArribaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque3ArribaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque4ArribaAraña5.png"))),
	};
	TextureRegion [] Spider6AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque1ParadaArribaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque2ArribaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque3ArribaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque4ArribaAraña6.png"))),
	};
	TextureRegion [] Spider7AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque1ParadaArribaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque2ArribaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque3ArribaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque4ArribaAraña7.png"))),
	};
	TextureRegion [] Spider8AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque1ParadaArribaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque2ArribaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque3ArribaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque4ArribaAraña8.png"))),
	};
	TextureRegion [] Spider9AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque1ParadaArribaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque2ArribaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque3ArribaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque4ArribaAraña9.png"))),
	};
	TextureRegion [] Spider10AttackUp= {
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque1ParadaArribaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque2ArribaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque3ArribaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque4ArribaAraña10.png"))),
	};
	TextureRegion [] Spider1AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque2DerechaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque3DerechaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque4DerechaAraña1.png"))),
	};

	TextureRegion [] Spider2AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque1ParadaDerechaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque2DerechaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque3DerechaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque4DerechaAraña2.png"))),
	};
	TextureRegion [] Spider3AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque1ParadaDerechaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque2DerechaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque3DerechaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque4DerechaAraña3.png"))),
	};
	TextureRegion [] Spider4AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque1ParadaDerechaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque2DerechaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque3DerechaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque4DerechaAraña4.png"))),
	};
	TextureRegion [] Spider5AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque1ParadaDerechaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque2DerechaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque3DerechaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque4DerechaAraña5.png"))),
	};
	TextureRegion [] Spider6AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque1ParadaDerechaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque2DerechaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque3DerechaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque4DerechaAraña6.png"))),
	};
	TextureRegion [] Spider7AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque1ParadaDerechaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque2DerechaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque3DerechaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque4DerechaAraña7.png"))),
	};
	TextureRegion [] Spider8AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque1ParadaDerechaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque2DerechaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque3DerechaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque4DerechaAraña8.png"))),
	};
	TextureRegion [] Spider9AttackRight= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque1ParadaDerechaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque2DerechaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque3DerechaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque4DerechaAraña9.png"))),
	};
	TextureRegion [] Spider10AttackRight={
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque1ParadaDerechaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque2DerechaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque3DerechaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque4DerechaAraña10.png"))),
	};
	
	TextureRegion [] Spider1AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque2IzquierdaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque3IzquierdaAraña1.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque4IzquierdaAraña1.png"))),
	};

	TextureRegion [] Spider2AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque1ParadaIzquierdaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque2IzquierdaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque3IzquierdaAraña2.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña2/Ataque4IzquierdaAraña2.png"))),
	};
	TextureRegion [] Spider3AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque1ParadaIzquierdaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque2IzquierdaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque3IzquierdaAraña3.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña3/Ataque4IzquierdaAraña3.png"))),
	};
	TextureRegion [] Spider4AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque1ParadaIzquierdaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque2IzquierdaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque3IzquierdaAraña4.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña4/Ataque4IzquierdaAraña4.png"))),
	};
	TextureRegion [] Spider5AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque1ParadaIzquierdaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque2IzquierdaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque3IzquierdaAraña5.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña5/Ataque4IzquierdaAraña5.png"))),
	};
	TextureRegion [] Spider6AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque1ParadaIzquierdaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque2IzquierdaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque3IzquierdaAraña6.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña6/Ataque4IzquierdaAraña6.png"))),
	};
	TextureRegion [] Spider7AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque1ParadaIzquierdaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque2IzquierdaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque3IzquierdaAraña7.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña7/Ataque4IzquierdaAraña7.png"))),
	};
	TextureRegion [] Spider8AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque1ParadaIzquierdaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque2IzquierdaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque3IzquierdaAraña8.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña8/Ataque4IzquierdaAraña8.png"))),
	};
	TextureRegion [] Spider9AttackLeft= {
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque1ParadaIzquierdaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque2IzquierdaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque3IzquierdaAraña9.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña9/Ataque4IzquierdaAraña9.png"))),
	};
	TextureRegion [] Spider10AttackLeft={
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque1ParadaIzquierdaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque2IzquierdaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque3IzquierdaAraña10.png"))),
			new Sprite(new Texture(Gdx.files.internal("Araña10/Ataque4IzquierdaAraña10.png"))),
	};
	TextureRegion Spider1dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider2dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider3dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider4dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider5dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider6dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider7dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider8dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider9dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider10dleDown=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaAbajoAraña1.png")));
	TextureRegion Spider1dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider2dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider3dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider4dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider5dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider6dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider7dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider8dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider9dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider10dleUp=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaArribaAraña1.png")));
	TextureRegion Spider1dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider2dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider3dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider4dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider5dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider6dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider7dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider8dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider9dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider10dleRight=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaDerechaAraña1.png")));
	TextureRegion Spider1dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider2dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider3dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider4dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider5dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider6dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider7dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider8dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider9dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
	TextureRegion Spider10dleLeft=new Sprite(new Texture(Gdx.files.internal("Araña1/Ataque1ParadaIzquierdaAraña1.png")));
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

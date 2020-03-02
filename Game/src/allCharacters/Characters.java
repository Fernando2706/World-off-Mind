package allCharacters;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Characters {

	public boolean dead;
	public int hp;
	public float damage;
	public float defense;
	public Vector2 position;
	public Rectangle rect;
	float stateTime;
	Animation<TextureRegion> animationRight;
	Animation<TextureRegion> animationLeft;
	Animation<TextureRegion> animationUp;
	Animation<TextureRegion> animationDown;
	Animation<TextureRegion> animationIdleRight;
	Animation<TextureRegion> animationIdleLeft;
	Animation<TextureRegion> animationIdleUp;
	Animation<TextureRegion> animationIdleDown;
	public TextureRegion currentFrame;
	
	public Characters() {
		
	}
	
	public abstract void render();
	
	public abstract void update(float dt);
}

package Attacks;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Attack {
	Animation<TextureRegion> animationRight;
	Animation<TextureRegion> animationLeft;
	Animation<TextureRegion> animationUp;
	Animation<TextureRegion> animationDown;
	public Vector2 position;
	public Rectangle rect;
	float stateTime;
	public TextureRegion currentFrame;
	public boolean keep;
	float x0,y0;
	
	public Attack() {
		
	}
	
	public abstract void render();
	
	public abstract void update(float dt);
}

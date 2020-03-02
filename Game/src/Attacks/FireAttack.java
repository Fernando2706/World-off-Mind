package Attacks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class FireAttack extends Attack{

	public static final float SPEED = 200f;
	TextureRegion [] textureRegionRight, textureRegionLeft, textureRegionUp, textureRegionDown;
	public State state;
	public enum State{
		RIGHT, LEFT, UP, DOWN
	}

	public FireAttack(float x, float y) {
		this.textureRegionRight = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsRight/Effects_Fire_0_02.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsRight/Effects_Fire_0_06.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsRight/Effects_Fire_0_10.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsRight/Effects_Fire_0_14.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsRight/Effects_Fire_0_18.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsRight/Effects_Fire_0_22.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsRight/Effects_Fire_0_26.png")))
		};
		
		this.textureRegionLeft = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsLeft/Effects_Fire_0_02.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsLeft/Effects_Fire_0_06.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsLeft/Effects_Fire_0_10.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsLeft/Effects_Fire_0_14.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsLeft/Effects_Fire_0_18.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsLeft/Effects_Fire_0_22.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsLeft/Effects_Fire_0_26.png")))
		};
		
		this.textureRegionUp = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsUp/Effects_Fire_0_02.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsUp/Effects_Fire_0_06.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsUp/Effects_Fire_0_10.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsUp/Effects_Fire_0_14.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsUp/Effects_Fire_0_18.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsUp/Effects_Fire_0_22.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsUp/Effects_Fire_0_26.png")))
		};
		
		this.textureRegionDown = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsDown/Effects_Fire_0_02.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsDown/Effects_Fire_0_06.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsDown/Effects_Fire_0_10.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsDown/Effects_Fire_0_14.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsDown/Effects_Fire_0_18.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsDown/Effects_Fire_0_22.png"))),
				new Sprite(new Texture(Gdx.files.internal("Attacks/FireBalls/FireBallsDown/Effects_Fire_0_26.png")))
		};
		
		super.x0 = x;
		super.y0 = y;
		super.position = new Vector2(x, y);
		super.animationRight = new Animation<TextureRegion> (0.25f, this.textureRegionRight);
		super.animationLeft = new Animation<TextureRegion> (0.25f, this.textureRegionLeft);
		super.animationUp = new Animation<TextureRegion> (0.25f, this.textureRegionUp);
		super.animationDown = new Animation<TextureRegion> (0.25f, this.textureRegionDown);
		super.keep = true;
		super.rect = new Rectangle(x, y, 20, 34);
	}
	
	public void keepA() {
		if(this.state == this.state.RIGHT) {
			if(position.x >= (x0 + 500)) {
				keep = false;
			}
		}
		
		if(this.state == this.state.LEFT) {
			if(position.x <= (x0 - 500)) {
				keep=false;
			}
		}
		
		if(this.state == this.state.UP) {
			if(position.y >= (y0 + 500)) {
				keep=false;
			}
		}
		
		if(this.state == this.state.DOWN) {
			if(position.y >= (y0 - 500)) {
				keep=false;
			}
		}
	}
	
	public void move(Vector2 movement) {
		movement.scl(SPEED);
		position.add(movement);
	}
	
	public void render() {
		
	}

	@Override
	public void update(float dt) {
		this.keepA();
		super.rect.setPosition(position);
		super.stateTime += dt;
		
		switch(this.state) {
		case RIGHT:
			super.currentFrame = (TextureRegion) super.animationRight.getKeyFrame(super.stateTime, true);
			this.move(new Vector2(dt, 0));
			break;
		case LEFT:
			super.currentFrame = (TextureRegion) super.animationLeft.getKeyFrame(super.stateTime, true);
			this.move(new Vector2(-dt, 0));
			break;
		case UP:
			super.currentFrame = (TextureRegion) super.animationUp.getKeyFrame(super.stateTime, true);
			this.move(new Vector2(0, dt));
			break;
		case DOWN:
			super.currentFrame = (TextureRegion) super.animationDown.getKeyFrame(super.stateTime, true);
			this.move(new Vector2(0, -dt));
			break;
		default:
			super.currentFrame = (TextureRegion) super.animationRight.getKeyFrame(super.stateTime, true);
			break;
		}
	}
}

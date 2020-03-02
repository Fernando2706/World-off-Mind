package allCharacters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class PrincipalPlayer extends Characters{

	public static final float SPEED = 200f;
	public enum State{
		RIGHT, LEFT, UP, DOWN, IDLELeft, IDLERight, IDLEUp, IDLEDown, attackRight, attackLeft, attackUp, attackDown
	}
	public State state;
	Animation<TextureRegion> animationAttackUp, animationAttackDown, animationAttackRight, animationAttackLeft;
	TextureRegion [] textureRegionRight, textureRegionLeft, textureRegionDown, textureRegionUp, textureRegionAttackUp, textureRegionAttackDown, textureRegionAttackRight, textureRegionAttackLeft;
	TextureRegion textureRegionIdleRight, textureRegionIdleLeft, textureRegionIdleUp, textureRegionIdleDown;

	public PrincipalPlayer(float x, float y) {
		
		this.textureRegionIdleRight = new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/IdlePosition/IdleRight.png")));
		this.textureRegionIdleLeft = new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/IdlePosition/IdleLeft.png")));
		this.textureRegionIdleUp = new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/IdlePosition/IdleUp.png")));
		this.textureRegionIdleDown = new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/IdlePosition/IdleDown.png")));
		
		this.textureRegionRight = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkRight/WalkRight1.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkRight/WalkRight2.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkRight/WalkRight3.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkRight/WalkRight4.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkRight/WalkRight5.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkRight/WalkRight6.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkRight/WalkRight7.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkRight/WalkRight8.png")))
		};
		
		this.textureRegionLeft = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkLeft/WalkLeft1.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkLeft/WalkLeft2.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkLeft/WalkLeft3.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkLeft/WalkLeft4.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkLeft/WalkLeft5.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkLeft/WalkLeft6.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkLeft/WalkLeft7.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkLeft/WalkLeft8.png")))
		};
		
		this.textureRegionDown = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkDown/WalkDown1.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkDown/WalkDown2.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkDown/WalkDown3.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkDown/WalkDown4.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkDown/WalkDown5.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkDown/WalkDown6.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkDown/WalkDown7.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkDown/WalkDown8.png")))
		};
		
		this.textureRegionUp = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkUp/WalkUp1.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkUp/WalkUp2.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkUp/WalkUp3.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkUp/WalkUp4.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkUp/WalkUp5.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkUp/WalkUp6.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkUp/WalkUp7.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/WalkUp/WalkUp8.png")))
		};
		
		this.textureRegionAttackUp = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackUp/AttackUp1.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackUp/AttackUp2.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackUp/AttackUp3.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackUp/AttackUp4.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackUp/AttackUp5.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackUp/AttackUp6.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackUp/AttackUp7.png")))
		};
		
		this.textureRegionAttackDown = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackDown/AttackDown1.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackDown/AttackDown2.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackDown/AttackDown3.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackDown/AttackDown4.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackDown/AttackDown5.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackDown/AttackDown6.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackDown/AttackDown7.png")))
		};
		
		this.textureRegionAttackRight = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackRight/AttackRight1.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackRight/AttackRight2.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackRight/AttackRight3.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackRight/AttackRight4.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackRight/AttackRight5.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackRight/AttackRight6.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackRight/AttackRight7.png")))
		};
		
		this.textureRegionAttackLeft = new TextureRegion[] {
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackLeft/AttackLeft1.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackLeft/AttackLeft2.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackLeft/AttackLeft3.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackLeft/AttackLeft4.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackLeft/AttackLeft5.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackLeft/AttackLeft6.png"))),
				new Sprite(new Texture(Gdx.files.internal("PrincipalPlayer/AttackLeft/AttackLeft7.png")))
		};
		
		super.position = new Vector2(x,y);
		
		super.animationRight = new Animation<TextureRegion>(0.15f, this.textureRegionRight);
		super.animationDown = new Animation<TextureRegion>(0.15f, this.textureRegionDown);
		super.animationUp = new Animation<TextureRegion>(0.15f, this.textureRegionUp);
		super.animationLeft = new Animation<TextureRegion>(0.15f, this.textureRegionLeft);
		super.animationIdleDown = new Animation<TextureRegion>(0.15f, this.textureRegionIdleDown);
		super.animationIdleUp = new Animation<TextureRegion>(0.15f, this.textureRegionIdleUp);
		super.animationIdleRight = new Animation<TextureRegion>(0.15f, this.textureRegionIdleRight);
		super.animationIdleLeft = new Animation<TextureRegion>(0.15f, this.textureRegionIdleLeft);
		this.animationAttackDown = new Animation<TextureRegion>(0.1f, this.textureRegionAttackDown);
		this.animationAttackUp = new Animation<TextureRegion>(0.1f, this.textureRegionAttackUp);
		this.animationAttackRight = new Animation<TextureRegion>(0.1f, this.textureRegionAttackRight);
		this.animationAttackLeft = new Animation<TextureRegion>(0.1f, this.textureRegionAttackLeft);
		
		this.state = this.state.IDLERight;
		
		super.rect = new Rectangle(x, y, 45, 45);
	}
	
	public void update(float dt) {
		//System.out.println("x:"+ position.x+" y: "+position.y);
		super.stateTime += dt;
		
		if(super.position.x <= 0) super.position.x = 0;
		if(super.position.y <= 0) super.position.y = 0;
		if(super.position.x >= Gdx.graphics.getWidth() - 51) super.position.x = Gdx.graphics.getWidth() - 51;
		if(super.position.y >= Gdx.graphics.getHeight() - 58) super.position.y = Gdx.graphics.getHeight() - 58;
		
		super.rect.setPosition(super.position);
		
		switch (this.state) {
		case RIGHT:
			super.currentFrame = (TextureRegion) super.animationRight.getKeyFrame(super.stateTime, true);
			break;
		case LEFT:
			super.currentFrame = (TextureRegion) super.animationLeft.getKeyFrame(super.stateTime, true);
			break;
		case UP:
			super.currentFrame = (TextureRegion) super.animationUp.getKeyFrame(super.stateTime, true);
			break;
		case DOWN:
			super.currentFrame = (TextureRegion) super.animationDown.getKeyFrame(super.stateTime, true);
			break;
		case IDLEDown:
			super.currentFrame = (TextureRegion) super.animationIdleDown.getKeyFrame(super.stateTime, true);
			break;
		case IDLELeft:
			super.currentFrame = (TextureRegion) super.animationIdleLeft.getKeyFrame(super.stateTime, true);
			break;
		case IDLEUp:
			super.currentFrame = (TextureRegion) super.animationIdleUp.getKeyFrame(super.stateTime, true);
			break;
		case IDLERight:
			super.currentFrame = (TextureRegion) super.animationIdleRight.getKeyFrame(super.stateTime, true);
			break;
		case attackDown:
			super.currentFrame = (TextureRegion) this.animationAttackDown.getKeyFrame(super.stateTime, true);
			break;
		case attackLeft:
			super.currentFrame = (TextureRegion) this.animationAttackLeft.getKeyFrame(super.stateTime, true);
			break;
		case attackRight:
			super.currentFrame = (TextureRegion) this.animationAttackRight.getKeyFrame(super.stateTime, true);
			break;
		case attackUp:
			super.currentFrame = (TextureRegion) this.animationAttackUp.getKeyFrame(super.stateTime, true);
			break;
		default:
			super.currentFrame = (TextureRegion) super.animationIdleRight.getKeyFrame(0, true);
		}
	}
	
	public void move(Vector2 movement) {
		movement.scl(SPEED);
		super.position.add(movement);
	}

	@Override
	public void render() {
		
	}
}

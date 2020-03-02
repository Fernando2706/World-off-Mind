package com.worldoffmind.game;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import Attacks.Attack;
import Attacks.FireAttack;
import Attacks.FireAttack.State;
import allCharacters.Characters;
import allCharacters.PrincipalPlayer;

public abstract class AbstractGameScreen implements Screen{
	public SpriteBatch batch;
	public BitmapFont font;
	public OrthographicCamera camera;
	public Vector2 cameraSize;
	private ExtendViewport viewport;
	public PrincipalPlayer principalPlayer;
	private String state;
	private boolean touching, attacking;
	private long lastSpell;
	public Array<Attack> attacks;
	private Array<Characters> enemies;
	
	protected AbstractGameScreen() {
		this.batch = new SpriteBatch();
		this.font = new BitmapFont();
		
		this.cameraSize = new Vector2(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		this.camera = new OrthographicCamera(this.cameraSize.x, this.cameraSize.y);
		this.camera.position.set(this.camera.viewportWidth/2f, this.camera.viewportHeight/2f, 0);
		this.camera.update();
		
		this.viewport = new ExtendViewport(1920, 1080, this.camera);
		
		this.principalPlayer = new PrincipalPlayer(10, 10);
		this.attacks = new Array<Attack>();
		this.enemies = new Array<Characters>();
		
		this.state = "";
		
		this.touching = false;
		this.attacking = false;
		
		this.lastSpell = 0;
	}

	// Subclasses must load actors in this method
	public abstract void buildStage();

	@Override
	public abstract void render(float delta);
	
	public void handleInput(float dt) {
		if(Gdx.input.isKeyPressed(Keys.ESCAPE)) {
			this.dispose();
		}

		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			if(this.principalPlayer.position.x == 0.0 || this.touching == true) {
				this.principalPlayer.state = PrincipalPlayer.State.IDLELeft;
				this.state = "left";
			}else {
				this.principalPlayer.state = PrincipalPlayer.State.LEFT;
				this.principalPlayer.move(new Vector2(-dt, 0));
				this.state = "left";
				this.attacking = false;
			}
			if(this.touching) {
				
			}
		}else if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			if(this.principalPlayer.position.x == Gdx.graphics.getWidth() - 51 || this.touching == true) {
				this.principalPlayer.state = PrincipalPlayer.State.IDLERight;
				this.state = "right";
			}else {
				this.principalPlayer.state = PrincipalPlayer.State.RIGHT;
				this.principalPlayer.move(new Vector2(dt, 0));
				this.state = "right";
				this.attacking = false;
			}
		}/*else if(Gdx.input.isKeyPressed(Keys.UP)) {
			if(this.principalPlayer.position.y == Gdx.graphics.getHeight() - 58 || this.touching == true) {
				this.principalPlayer.state = PrincipalPlayer.State.IDLEUp;
				this.state = "up";
			}else {
				this.principalPlayer.state = PrincipalPlayer.State.UP;
				this.principalPlayer.move(new Vector2(0, dt));
				this.state = "up";
				this.attacking = false;
			}
		}else if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			if(this.principalPlayer.position.y == 0 || this.touching == true) {
				this.principalPlayer.state = PrincipalPlayer.State.IDLEDown;
				this.state = "down";
			}else {
				this.principalPlayer.state = PrincipalPlayer.State.DOWN;
				this.principalPlayer.move(new Vector2(0, -dt));
				this.state = "down";
				this.attacking = false;
			}
		}*/else if(Gdx.input.isKeyPressed(Keys.Q)){
			if(this.state.contentEquals("left")) {
				this.principalPlayer.state = PrincipalPlayer.State.attackLeft;
				if(TimeUtils.nanoTime() - this.lastSpell > 500000000) {
					this.createAttack("left");
				}
			}else if(this.state.contentEquals("right")) {
				this.principalPlayer.state = PrincipalPlayer.State.attackRight;
				if(TimeUtils.nanoTime() - this.lastSpell > 500000000) {
					this.createAttack("right");
				}
			}else if(this.state.contentEquals("up")) {				
				this.principalPlayer.state = PrincipalPlayer.State.attackUp;
				if(TimeUtils.nanoTime() - this.lastSpell > 500000000) {
					this.createAttack("up");
				}
			}else if(this.state.contentEquals("down")) {
				this.principalPlayer.state = PrincipalPlayer.State.attackDown;
				if(TimeUtils.nanoTime() - this.lastSpell > 500000000) {
					this.createAttack("down");
				}
			}
		}else if(this.attacking == true) {
			this.attacking = false;
		}else {
			this.attacking = false;
			if(this.state.contentEquals("left")) {
				this.principalPlayer.state = PrincipalPlayer.State.IDLELeft;
			}else if(this.state.contentEquals("right")) {
				this.principalPlayer.state = PrincipalPlayer.State.IDLERight;
			}else if(this.state.contentEquals("up")) {
				this.principalPlayer.state = PrincipalPlayer.State.IDLEUp;
			}else if(this.state.contentEquals("down")) {
				this.principalPlayer.state = PrincipalPlayer.State.IDLEDown;
			}
		}
		this.touching=false;
	}
	
	public void createAttack(String direction) {
		FireAttack spell= new FireAttack(this.principalPlayer.position.x + 20, this.principalPlayer.position.y + 20);
		if(direction.equals("left")) {
			spell.state = State.LEFT;
		}else if(direction.equals("right")) {
			spell.state = State.RIGHT;
		}else if(direction.equals("up")) {
			spell.state = State.UP;
		}else if(direction.equals("down")){
			spell.state = State.DOWN;
		}
		
		this.lastSpell = TimeUtils.nanoTime();
		this.attacks.add(spell);
	}
	
	public void update(float dt) {
		Iterator<Attack> iter = this.attacks.iterator();
		while(iter.hasNext()) {
			Attack spell = iter.next();
			if(spell.keep == false) {
				iter.remove();
			}
			for(Characters character : this.enemies) {
				if(spell.rect.overlaps(character.rect)) {
					spell.keep = false;
					iter.remove();
					character.hp -= 50;
				}
			}
		}
		
		Iterator<Characters> iter2 = this.enemies.iterator();
		while(iter2.hasNext()) {
			Characters character = iter2.next();
			character.update(dt);
			if(character.dead == true) {
				iter2.remove();
			}
		}
		this.principalPlayer.update(dt);
		
		for(Attack spell: this.attacks) spell.update(dt);
	}

	@Override
	public void show() {
		
	}
	
	@Override
	public void resize(int width, int height) {
		this.viewport.update(width, height, true);
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
		//this.batch.dispose();
		//this.font.dispose();
	}
}

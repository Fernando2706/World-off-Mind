package personajes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.WorldOffMind;

public class Hearts implements Screen{
	TextureRegion currentFrame;
	Vector2 position;
	boolean halfHeart;
	float stateTime;
	WorldOffMind game;
	public Hearts(WorldOffMind game,float x, float y,boolean half) {
		this.position=new Vector2(x,y);
		this.game=game;
		this.halfHeart=half;
		if(this.halfHeart==true) {
			this.currentFrame=new Sprite(new Texture(Gdx.files.internal("Hearts/0.png")));
		}else {
			this.currentFrame=new Sprite(new Texture(Gdx.files.internal("Hearts/1.png")));
		}
	}
	public void update(float dt) {
		stateTime+=dt;
	}
	public void render() {
		this.game.batch.draw(this.currentFrame,this.position.x,this.position.y);
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

}

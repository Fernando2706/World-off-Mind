package com.worldoffmind.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import personajes.Caracteres;
import personajes.JugadorPrincipal;

public class WorldOffMind extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	JugadorPrincipal jugador;


	@Override
	public void create () {
		this.batch=new SpriteBatch();
		this.font=new BitmapFont();
		jugador=new JugadorPrincipal(this, 10, 10);
	}
	String estado="";
	boolean atacando=false;
	private void handleInput(float dt) {

		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			jugador.state=	jugador.state.LEFT;
			jugador.move(new Vector2(-dt, 0));
			estado="izq";
			atacando=false;


		}
		
		else if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			jugador.state=	jugador.state.RIGHT;
			jugador.move(new Vector2(dt, 0));
			estado="derecha";
			atacando=false;


		}
		
		else if (Gdx.input.isKeyPressed(Keys.UP)) {
			jugador.state=	jugador.state.UP;
			jugador.move(new Vector2(0, dt));
			estado="arriba";
			atacando=false;



		}
		
		else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			jugador.state=	jugador.state.DOWN;
			jugador.move(new Vector2(0, -dt));
			estado="abajo";
			atacando=false;



		}
		
		else if(Gdx.input.isKeyPressed(Keys.Q)){
			if(estado.contentEquals("izq")) {
				jugador.state=jugador.state.attackLeft;
			}else if(estado.contentEquals("derecha")) {
				jugador.state=jugador.state.attackRight;
			}
			else if(estado.contentEquals("arriba")) {
				jugador.state=jugador.state.attackUp;
			}else if(estado.contentEquals("abajo")) {
				jugador.state=jugador.state.attackDown;
			}
		}
		else if(atacando==true) {
			
			atacando =false;
		}
		else {
			atacando=false;
			if(estado.contentEquals("izq")) {
				jugador.state=jugador.state.IDLELeft;
			}else if(estado.contentEquals("derecha")) {
				jugador.state=jugador.state.IDLERight;
			}
			else if(estado.contentEquals("arriba")) {
				jugador.state=jugador.state.IDLEUp;
			}else if(estado.contentEquals("abajo")) {
				jugador.state=jugador.state.IDLEDown;
			}
		}
		
		


	}

	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	public void render () {
		float dt = Gdx.graphics.getDeltaTime();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		handleInput(dt);
		update(dt);
		batch.begin();
		jugador.render();
		batch.end();


	}

	public void update(float dt) {
		jugador.update(dt);
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();

	}



}

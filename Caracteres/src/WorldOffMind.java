package com.mygdx.game;

import java.util.Vector;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import ataqueJugador.Ataque;
import ataqueJugador.AtaqueFuego;
import personajes.Araña;
import personajes.JugadorPrincipal;
import personajes.Minotauro;
import com.badlogic.gdx.math.Rectangle;


public class WorldOffMind extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	JugadorPrincipal jugador;
	Minotauro minotauro;
	AtaqueFuego fuego;
	Array<Rectangle> ataques;

	@Override
	public void create () {
		this.batch=new SpriteBatch();
		this.font=new BitmapFont();
		jugador=new JugadorPrincipal(this, 10, 10);
		minotauro=new Minotauro(this, 500, 500);
		fuego=new AtaqueFuego(this,100,100);
		ataques=new Array<Rectangle>();

	}

	String estado="";
	boolean atacando=false;
	boolean tocando=false;

	private void handleInput(float dt) {



		if(Gdx.input.isKeyPressed(Keys.ESCAPE)) {
			Gdx.app.exit();
		}

		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			if(jugador.position.x==0.0||tocando==true) {
				jugador.state=jugador.state.IDLELeft;
				estado="izquierda";
			}
			else {
				jugador.state=	jugador.state.LEFT;
				jugador.move(new Vector2(-dt, 0));
				estado="izq";
				atacando=false;
			}
			if(tocando) {

			}


		}

		else if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			if(jugador.position.x==Gdx.graphics.getWidth()-51||tocando==true) {
				jugador.state=jugador.state.IDLERight;
				estado="derecha";
			}else {
				jugador.state=	jugador.state.RIGHT;
				jugador.move(new Vector2(dt, 0));
				estado="derecha";
				atacando=false;
			}


		}

		else if (Gdx.input.isKeyPressed(Keys.UP)) {
			if(jugador.position.y==Gdx.graphics.getHeight()-58||tocando==true) {
				jugador.state=jugador.state.IDLEUp;
				estado="arriba";
			}else {
				jugador.state=	jugador.state.UP;
				jugador.move(new Vector2(0, dt));
				estado="arriba";
				atacando=false;

			}

		}

		else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			if(jugador.position.y==0||tocando==true) {
				jugador.state=jugador.state.IDLEDown;
				estado="abajo";
			}else {
				jugador.state=	jugador.state.DOWN;
				jugador.move(new Vector2(0, -dt));
				estado="abajo";
				atacando=false;
			}



		}

		else if(Gdx.input.isKeyPressed(Keys.Q)){
			//font.draw(batch, "Manu Guapeton", this.jugador.position.x+20, this.jugador.position.y+20);this.batch.end();	
			//this.fuego.render();
			if(estado.contentEquals("izq")) {
				jugador.state=jugador.state.attackLeft;
				//this.batch.end();	
			}else if(estado.contentEquals("derecha")) {
				jugador.state=jugador.state.attackRight;
				//his.batch.end();	
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


		tocando=false;

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
		this.batch.begin();
		this.jugador.render();
		this.minotauro.render();
		this.fuego.render();
		this.batch.end();
	}

	public void update(float dt) {
		jugador.update(dt);
		minotauro.update(dt);
		fuego.update(dt);
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



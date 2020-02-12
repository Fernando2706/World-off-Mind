package com.worldoffmind.game;

import java.util.Iterator;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;

import Attack.Ataque;
import Attack.AtaqueFuego;
import personajes.Caracteres;
import personajes.JugadorPrincipal;
import personajes.Minotauro;

public class WorldOffMind extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	JugadorPrincipal jugador;
	Minotauro minotauro;
	Array<Ataque> ataques;
	Array<Caracteres> enemies;
	long lastSpell;
	public void createAttack(String dire) {
		AtaqueFuego a= new AtaqueFuego(this, this.jugador.position.x+20, this.jugador.position.y+20);
		if(dire.equals("izquierda")) {
			a.state=a.state.LEFT;
		}else if(dire.equals("derecha")) {
			a.state=a.state.RIGHT;
		}else if(dire.equals("arriba")) {
			a.state=a.state.UP;
		}else if(dire.equals("abajo")){
			a.state=a.state.DOWN;
		}
		lastSpell=TimeUtils.nanoTime();
		ataques.add(a);

	}
	@Override
	public void create () {
		this.batch=new SpriteBatch();
		this.font=new BitmapFont();
		jugador=new JugadorPrincipal(this, 10, 10);
		minotauro=new Minotauro(this, 500, 500);
		ataques=new Array<Ataque>();
		enemies=new Array<Caracteres>();
		enemies.add(minotauro);

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
				estado="izquierda";
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

			if(estado.contentEquals("izquierda")) {
				jugador.state=jugador.state.attackLeft;
				if(TimeUtils.nanoTime()-lastSpell>500000000) {
					createAttack("izquierda");
				}
			
			}else if(estado.contentEquals("derecha")) {
				jugador.state=jugador.state.attackRight;
				if(TimeUtils.nanoTime()-lastSpell>500000000) {
					createAttack("derecha");
				}
			}
			else if(estado.contentEquals("arriba")) {				
				jugador.state=jugador.state.attackUp;
				if(TimeUtils.nanoTime()-lastSpell>500000000) {
					createAttack("arriba");

				}
			}
			else if(estado.contentEquals("abajo")) {
				jugador.state=jugador.state.attackDown;
				if(TimeUtils.nanoTime()-lastSpell>500000000) {
					createAttack("abajo");
				}

			}
		}
		else if(atacando==true) {

			atacando =false;
		}
		else {
			atacando=false;
			if(estado.contentEquals("izquierda")) {
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
		for(Caracteres a:enemies) {
			a.render();
		}
		for(Ataque a:ataques) {
			a.render();
		}
			
		this.batch.end();
	}

	public void update(float dt) {
		Iterator<Ataque> iter=ataques.iterator();
		while(iter.hasNext()) {
			Ataque a=iter.next();
			if(a.keep==false) {
				iter.remove();
			}
			for(Caracteres b:enemies) {
				if(a.rect.overlaps(b.rect)) {
					a.keep=false;
					iter.remove();
					minotauro.hp-=50;
				}
			}
		}
		Iterator<Caracteres> iter2=enemies.iterator();
		while(iter2.hasNext()) {
			Caracteres a=iter2.next();
			if(a.dead==true) {
				iter2.remove();
			}
			
		}
		jugador.update(dt);
		minotauro.update(dt);
		for(Ataque a: ataques)
			a.update(dt);
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

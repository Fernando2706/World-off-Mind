package com.worldoffmind.game;

import java.util.Iterator;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;

import Attack.Ataque;
import Attack.AtaqueFuego;
import Attack.AtaqueFuego.State;
import personajes.Caracteres;
import personajes.Players;
import personajes.Skeletons;
import personajes.Spider;
import personajes.Minotauro;

public class WorldOffMind extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	Players jugador;
	Minotauro minotauro;
	Spider spider;
	Array<Ataque> ataques;
	Array<Caracteres> enemies;
	long lastSpell;
	public void createAttack(String dire) {
		AtaqueFuego a= new AtaqueFuego(this, this.jugador.position.x+20, this.jugador.position.y+20);
		if(dire.equals("izquierda")) {
			a.state=State.LEFT;
		}else if(dire.equals("derecha")) {
			a.state=State.RIGHT;
		}else if(dire.equals("arriba")) {
			a.state=State.UP;
		}else if(dire.equals("abajo")){
			a.state=State.DOWN;
		}
		lastSpell=TimeUtils.nanoTime();
		ataques.add(a);

	}
	@Override
	public void create () {
		this.batch=new SpriteBatch();
		this.font=new BitmapFont();
		jugador=new Players(this, 10, 10);
		minotauro=new Minotauro(this, 900, 1000);
		spider=new Spider(this,"Ice2",1250,1000);
		ataques=new Array<Ataque>();
		enemies=new Array<Caracteres>();
		enemies.add(minotauro);
		enemies.add(spider);
		enemies.add(new Spider(this,"Ice2",1250,1000));
		enemies.add(new Spider(this,"Ice1",1300,1000));
		enemies.add(new Spider(this,"Ice3",1350,1000));
		enemies.add(new Spider(this,"Ice4",1400,1000));
		enemies.add(new Spider(this,"Fire1",1450,1000));
		enemies.add(new Spider(this,"Golden",1500,1000));
		enemies.add(new Spider(this,"GoldenPoisson",1550,1000));
		enemies.add(new Skeletons(this, 1050, 1000, true));
		enemies.add(new Skeletons(this, 1100, 1000, false));
		enemies.add(new Skeletons(this, 1150, 1000, false));
		enemies.add(new Skeletons(this, 1200, 1000, false));


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
				jugador.state=Players.State.IDLELeft;
				estado="izquierda";
			}
			else {
				jugador.state=	Players.State.LEFT;
				jugador.move(new Vector2(-dt, 0));
				estado="izquierda";
				atacando=false;
			}
			if(tocando) {

			}


		}

		else if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			if(jugador.position.x==Gdx.graphics.getWidth()-51||tocando==true) {
				jugador.state=Players.State.IDLERight;
				estado="derecha";
			}else {
				jugador.state=	Players.State.RIGHT;
				jugador.move(new Vector2(dt, 0));
				estado="derecha";
				atacando=false;
			}


		}

		else if (Gdx.input.isKeyPressed(Keys.UP)) {
			if(jugador.position.y==Gdx.graphics.getHeight()-58||tocando==true) {
				jugador.state=Players.State.IDLEUp;
				estado="arriba";
			}else {
				jugador.state=	Players.State.UP;
				jugador.move(new Vector2(0, dt));
				estado="arriba";
				atacando=false;

			}

		}

		else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			if(jugador.position.y==0||tocando==true) {
				jugador.state=Players.State.IDLEDown;
				estado="abajo";
			}else {
				jugador.state=	Players.State.DOWN;
				jugador.move(new Vector2(0, -dt));
				estado="abajo";
				atacando=false;
			}
		}

		else if(Gdx.input.isKeyPressed(Keys.Q)){

			if(estado.contentEquals("izquierda")) {
				jugador.state=Players.State.attackLeft;
				if(TimeUtils.nanoTime()-lastSpell>500000000) {
					createAttack("izquierda");
				}
			
			}else if(estado.contentEquals("derecha")) {
				jugador.state=Players.State.attackRight;
				if(TimeUtils.nanoTime()-lastSpell>500000000) {
					createAttack("derecha");
				}
			}
			else if(estado.contentEquals("arriba")) {				
				jugador.state=Players.State.attackUp;
				if(TimeUtils.nanoTime()-lastSpell>500000000) {
					createAttack("arriba");

				}
			}
			else if(estado.contentEquals("abajo")) {
				jugador.state=Players.State.attackDown;
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
				jugador.state=Players.State.IDLELeft;
			}else if(estado.contentEquals("derecha")) {
				jugador.state=Players.State.IDLERight;
			}
			else if(estado.contentEquals("arriba")) {
				jugador.state=Players.State.IDLEUp;
			}else if(estado.contentEquals("abajo")) {
				jugador.state=Players.State.IDLEDown;
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
					b.hp-=50;
				}
			}
		}
		Iterator<Caracteres> iter2=enemies.iterator();
		while(iter2.hasNext()) {
			Caracteres a=iter2.next();
			a.update(dt);
			if(a.dead==true) {
				iter2.remove();
			}
			
		}
		jugador.update(dt);
		
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
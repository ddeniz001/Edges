package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class Spawn {
	private Handler handler;
	private HUD hud;
	private int scoreKeep = 0;
	private Random r = new Random();
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeep++;
		
		//Spawning system
		if(scoreKeep >= 100) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);

			
			if (hud.getLevel() == 2) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.BasicEnemy, handler));
			} 
			else if (hud.getLevel() == 3) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.BasicEnemy, handler));
			}
			else if (hud.getLevel() == 4) {
				handler.addObject(new FastEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.FastEnemy, handler));
			}
			else if (hud.getLevel() == 5) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.FastEnemy, handler));
			}
			else if (hud.getLevel() == 6) {
				handler.addObject(new FastEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.FastEnemy, handler));	
			}
			else if (hud.getLevel() == 7) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.BasicEnemy, handler));
			}
			else if (hud.getLevel() == 8) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.BasicEnemy, handler));
			}
			else if (hud.getLevel() == 9) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.BasicEnemy, handler));
			}
			else if (hud.getLevel() == 10) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.BasicEnemy, handler));
			}
			else if (hud.getLevel() == 11) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.BasicEnemy, handler));
			}
			else if (hud.getLevel() == 12) {
				handler.addObject(new FastEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.FastEnemy, handler));
			}
			else if (hud.getLevel() == 13) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.HEIGHT - 50), r.nextInt(Game.WIDTH - 50), ID.BasicEnemy, handler));
			}
			else if (hud.getLevel() == 14) {
				handler.clearEnemies();
				handler.addObject(new EnemyBoss((Game.WIDTH/2) - 100, -120,ID.EnemyBoss, handler));
	
			}
		
		}
	
	}
	
}
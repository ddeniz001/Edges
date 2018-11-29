package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DeathScreen {
	private HUD hud;
	private Game game;
	private Handler handler;
	
	public DeathScreen(Game game, Handler handler, HUD hud) {
		this.game = game;
		this.handler = handler;
		this.hud = hud;
	}

	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 16);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("GAME OVER :(", 170, 200);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawString("You lost with a score of: " + hud.getScore(), 200, 300);
		 
	}

}

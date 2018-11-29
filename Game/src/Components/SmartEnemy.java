package Components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SmartEnemy extends GameObject {
	
	private Handler handler;
	private GameObject player;
	

	public SmartEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		for(int i = 0; i < handler.object.size(); i++) {  
			if(handler.object.get(i).getId() == ID.Player) player = handler.object.get(i);
		}
		velX = 10; 
		velY = 10;
	}
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 20, 20);
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		float diffX = x - player.getX() - 8;
		float diffY = y - player.getY() - 8;
		
//		Distance algorithm
		float distance = (float) Math.sqrt((x - player.getX()) * (x - player.getX()) + (y - player.getY()) * (y- player.getY()));
		
		velX = (int) ((-1.0/distance) * diffX);
		velY = (int) ((-1.0/distance) * diffY);
		
//		Trail for the BasicEnemy object
		handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.pink, 16, 16, 0.2f, handler));
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, 16 , 16);
	}
	
}

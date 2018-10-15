package Components;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i); //Pretend tempObject is every object in game.
			
		
			if(tempObject.getId() == ID.Player) {
				//Key events for Player1
				
				if(key == KeyEvent.VK_W) tempObject.setVelY(-6);
				if(key == KeyEvent.VK_S) tempObject.setVelY(6);
				if(key == KeyEvent.VK_D) tempObject.setVelX(6);
				if(key == KeyEvent.VK_A) tempObject.setVelX(-6);
				
				
			}	
		
	}
	
	if(key == KeyEvent.VK_ESCAPE) System.exit(key);
}
			
	
		
	
	public void KeyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i); //Pretend tempObject is every object in game.
			
		
			if(tempObject.getId() == ID.Player) {
				//Key events for Player1
				if(key == KeyEvent.VK_W) tempObject.setVelY(0);
				if(key == KeyEvent.VK_S) tempObject.setVelY(0);
				if(key == KeyEvent.VK_D) tempObject.setVelX(0);
				if(key == KeyEvent.VK_A) tempObject.setVelX(0);
				
			}
				
			
			

			
		

			
		}
	}
}
				
	

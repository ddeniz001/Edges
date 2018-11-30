package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	//Loops through and updates every single game object
	public void tick() {
		//Loops all game objects
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	public void clearEnemies() {
		for(int i = 0; i <= object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			if(tempObject.getId() != ID.Player) {
				object.clear(); 
				addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player, this));

			}
			
		}
	}
		
	
	//Adds objects to the screen
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	//Removes objects 
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}

	

}

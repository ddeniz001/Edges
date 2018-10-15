package Components;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	//Loops through and updates every single game object
	public void tick() {
		//Loops through every single game object
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
	
	//Adds objects to the screen
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	//Removes objects 
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}

}

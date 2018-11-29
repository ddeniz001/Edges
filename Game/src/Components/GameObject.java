package Components;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {
	
	protected float x, y;
	protected ID id;
	protected float velX, velY;
	
	//Constructor for GameObject 
	public GameObject(float x, float y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds(); //We use rectangles to handle collision

	//	Gitters & Sitters
		public void setX(int x) {
		this.x = x;  // "this." refers to the instance above
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX() {
		return (int) x;
	}
	public int getY() {
		return (int) y;
	}
	public void setID(ID id) {
		this.id = id;
	}
	public ID getId() {
		return id;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public void setVelY(int velY) {
		this.velY = velY;
	}
	public int getVelX() {
		return (int) velX;
	}
	public int getVelY() {
		return (int) velY;
	}

}

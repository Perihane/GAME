package model.world;
import java.awt.Point;

public class Cover {
	private int currentHP;
	private Point location;
	
	public Cover(int x, int y) {
		super();
		currentHP = (int)(Math.random()*((1000-100)+1)) + 100 ;
		location = new Point(x,y) ;//x and y are coordinates
	}
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public Point getLocation() {
		return location;
	}
	
}


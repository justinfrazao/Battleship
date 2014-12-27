import java.awt.Point;

public class Ship {
	
	private Point firstCoordinate;
	private Point lastCoordinate;
	
	public Ship(Point a, Point b){
		if (a.x == b.x || a.y == b.y) {	
			firstCoordinate = a;
			lastCoordinate = b;
		}
		else {
			System.out.println("ERROR!!!");
		}
	}
	
	public Point getFirstCoordinate() {
		return firstCoordinate;
	}
	
	public Point getLastCoordinate() {
		return lastCoordinate;
	}
}

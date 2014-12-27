import java.awt.Point;

public class Ship {
	public Point firstCoordinate;
	public Point secondCoordinate;
	public Ship(Point a, Point b){
		if (a.x == b.x || a.y == b.y) {	
			firstCoordinate = a;
			secondCoordinate = b;
		}
		else {
			System.out.println("ERROR!!!");
		}
		
	}
}

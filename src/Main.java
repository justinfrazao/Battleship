import java.awt.Point;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
//		Point a = new Point(1, 1);
//		Point b = new Point(4, 1);
//		Point c = new Point(2, 1);
//		Point d = new Point(3, 1);
//		Ship ship1 = new Ship(a, b);
//		Ship ship2 = new Ship(c,d);
//		BattleshipGame game = new BattleshipGame();
//		game.addship(1, ship1);
//		game.addship(1, ship2);
//		game.fireMissile(2, b);
		
		
		System.out.println("Enter the first coordinate of the ship: '(x,y)'");
		Scanner scan = new Scanner(System.in);
		String firstScan = scan.next();
		System.out.println("Enter the second coordinate of the ship: '(x,y)'");
		String secondScan = scan.next();
		Point a = pointFromString(firstScan);
		Point b = pointFromString(secondScan);
		Ship ship1 = new Ship(a, b);
		System.out.println(ship1.getFirstCoordinate());
		System.out.println(ship1.getLastCoordinate());
		
	}
	public void gameLoop(){
		
	}
	private static Point pointFromString(String coordsString) {
		
		int commaLocation = coordsString.indexOf(',');
		int endLocation = coordsString.indexOf(')');
		String firstCoordString = coordsString.substring(1, commaLocation);
		String secondCoordString = coordsString.substring(commaLocation+1, endLocation);
		int firstCoord = Integer.parseInt(firstCoordString);
		int secondCoord = Integer.parseInt(secondCoordString);
		Point userCoords = new Point(firstCoord, secondCoord);
		return userCoords;
	}

}

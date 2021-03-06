import java.awt.Point;
import static java.lang.Math.*;

public class BattleshipGame {
	
	public PlayedMovesGrid player1PlayedMovesGrid = new PlayedMovesGrid();
	public PlayedMovesGrid player2PlayedMovesGrid = new PlayedMovesGrid();
	
	public Ship[] player1Ships = new Ship[5];
	public Ship[] player2Ships = new Ship[5];
	
	public void addship(int player, Ship s) {
		Ship[] array;
		if (player == 1) {
			array = player1Ships;
		}
		else {
			array = player2Ships;
		}
		
		for(int i = 0; i < array.length; i++) {
			
			if (array[i] == null) {
				array[i] = s;
				break;
			}
			else {
				Point firstPointAdded = s.getFirstCoordinate();
				Point lastPointAdded = s.getLastCoordinate();
			
				Point firstPointExisting = array[i].getFirstCoordinate();
				Point lastPointExisting = array[i].getLastCoordinate();
			
				double lowerBoundXAdded = Math.min(firstPointAdded.getX(), lastPointAdded.getX());
				double upperBoundXAdded = Math.max(firstPointAdded.getX(), lastPointAdded.getX());
				double lowerBoundYAdded = Math.min(firstPointAdded.getY(), lastPointAdded.getY());
				double upperBoundYAdded = Math.max(firstPointAdded.getY(), lastPointAdded.getY());
				
				double lowerBoundXExisting = Math.min(firstPointExisting.getX(), lastPointExisting.getX());
				double upperBoundXExisting = Math.max(firstPointExisting.getX(), lastPointExisting.getX());
				double lowerBoundYExisting = Math.min(firstPointExisting.getY(), lastPointExisting.getY());
				double upperBoundYExisting = Math.max(firstPointExisting.getY(), lastPointExisting.getY());
				
				if (lowerBoundXAdded <= upperBoundXExisting &&
					upperBoundXAdded >= lowerBoundXExisting &&
					lowerBoundYAdded <= upperBoundYExisting &&
					upperBoundYAdded >= lowerBoundYExisting) {
				
					System.out.println("Error! This ship overlaps another ship.");
					break;
				}
			}
		}
	}
	
	public void fireMissile(int player, Point p) {
		Ship[] array;
		PlayedMovesGrid grid;
		if (player == 1) {
			array = player2Ships;
			grid = player1PlayedMovesGrid;
		}
		else {
			array = player1Ships;
			grid = player2PlayedMovesGrid;
		}
		
		for(int i = 0; i < array.length; i++) {
			Point first = array[i].getFirstCoordinate();
			Point last = array[i].getLastCoordinate();
			
			double lowerBoundX = Math.min(first.getX(), last.getX());
			double upperBoundX = Math.max(first.getX(), last.getX());
			double lowerBoundY = Math.min(first.getY(), last.getY());
			double upperBoundY = Math.max(first.getY(), last.getY());
			
			if (p.getX() >= lowerBoundX && p.getX() <= upperBoundX &&
				p.getY() >= lowerBoundY && p.getY() <= upperBoundY) {
				grid.setCellState(p, PlayedMovesGrid.CellState.Hit);
				System.out.println("Hit!");
				break;
			}
			else {
				grid.setCellState(p, PlayedMovesGrid.CellState.Missed);
				System.out.println("Miss!");
				break;
			}
		}
	}
}

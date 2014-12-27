import java.awt.Point;

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
			if(array[i] == null) {
				array[i] = s;
				break;
			}
		}
	}
	
	public void fireMissile(int player, Point p) {
		
	}
}

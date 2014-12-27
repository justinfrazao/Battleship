import java.awt.Point;

public class PlayedMovesGrid {
	
	public enum CellState {
	    Unplayed, 
	    Missed, 
	    Hit
	}
	
	private CellState[][] cellStates = new CellState[10][10];
	
	public PlayedMovesGrid() {
		for(int i = 0; i < cellStates.length; i++) {
			for(int j = 0; j < cellStates[i].length; j++) {
				cellStates[i][j] = CellState.Unplayed;
			}
		}
	}
	
	public CellState[][] getAllCellStates() {
		return cellStates;
	}
	
	public void setCellState(Point p, CellState s) {
		if(p.x < cellStates.length && p.y < cellStates[0].length)
		{
			cellStates[p.x][p.y] = s;
		}
	}
	
	public CellState getCellState(Point p) {
		return cellStates[p.x][p.y];
	}
}
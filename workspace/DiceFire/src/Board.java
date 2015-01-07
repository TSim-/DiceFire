// Timothy Simmons

public class Board {

	private int[][] theBoard = new int[2][2];

	// public void main(String[] args){}
	
	// Parameters: the height and width of a new board
	// Post-Condition: changes theBoard to an empty board of the given dimensions
	public void newBoard(int height, int width) {
		theBoard = new int[height][width];
	}
	
	// Post-Condition: sets theBoard as an empty 4x8 board with a single '1'
	public void setTestBoard(){
		newBoard(4, 8);
		theBoard[1][2] = 1;
		theBoard[2][5] = 5;
	}

	// Parameters: the piece being moved, the direction being moved
	// Post-Condition: the piece will be moved in the given direction if possible
	public void movePiece(int piece, char direction){
		int[] startLocation = findPiece(piece);
		// If the piece is not on the board, do nothing
		if(startLocation[0] == -1)
			return;
		int[] endLocation = new int[] {startLocation[0], startLocation[1]};
		switch(direction){
			case 'w': endLocation[0] -= 1;
			break;
			case 's': endLocation[0] += 1;
			break;
			case 'a': endLocation[1] -= 1;
			break;
			case 'd': endLocation[1] += 1;
			break;
		}
		// If it goes off the board, do not move
		if(endLocation[0] < 0 || endLocation[1] < 0 || endLocation[0] > theBoard.length
				|| endLocation[1] > theBoard[0].length)
			return;
		// If the space is not open, do nothing
		if(theBoard[endLocation[0]][endLocation[1]] != 0)
			return;
		// If allowed, then move piece
		theBoard[startLocation[0]][startLocation[1]] = 0;
		theBoard[endLocation[0]][endLocation[1]] = piece;
	}

	// Parameter: the piece being located
	// Returns: the coordinates of the piece
	public int[] findPiece(int piece){
		for(int height = 0; height < theBoard.length; height++)
			for(int width = 0; width < theBoard[height].length; width++)
				if(theBoard[height][width] == piece)
					return new int[] {height, width};
		return new int[] {-1, -1};
	}

	// Returns: theBoard as a String
	public String toString(){
		if(theBoard == null)
			return "Error: theBoard is null";
		String output = "";
		for(int height = 0; height < theBoard.length; height++){
			for(int width = 0; width < theBoard[height].length; width++)
				output += theBoard[height][width];
			output += '\n';
		}
		return output;
	}
}

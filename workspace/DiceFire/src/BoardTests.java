// Timothy Simmons

public class BoardTests {

	private static Board b = new Board();
	
	public static void main(String[] args) {
		b.setTestBoard();
		// Type and run test method below
		movePieceTest();
		//System.out.println(b);
	}

	// Should end with '1' at coordinates [1, 3]
	// Testing...
	public static void movePieceTest(){
		System.out.println(b);
		b.movePiece(1, 's');
		System.out.println(b);
	}
	
	// Should return [1, 2]
	// Test completed
	public static int[] findPieceTest(){
		return b.findPiece(1);
		//int[] foo = findPieceTest();
		//System.out.println(foo[0] + ", " + foo[1]);
	}
}

// Timothy Simmons
import java.util.*;

public class GameTurn {

	public static void main(String[] args) {
		Board b = new Board();
		b.setTestBoard();
		System.out.println(b);
		System.out.println("Please make a move (w/a/s/d):");
		Scanner sc = new Scanner(System.in);
		boolean escape = false;
		while(!escape){
			char command = sc.next().toLowerCase().charAt(0);
			if(command == 'x')
				escape = true;
			b.movePiece(1, command);
			System.out.println(b);
		}
		sc.close();
	}

}

package oldChess;

/**
* bases level - Сomplete
* hard level (rules) - In developing
*/
import java.util.Scanner;

public class OldChess {

	static String[][] chessBoard;
	static final String[] PIECES = { "[WP]", "[WR]", "[WH]", "[WB]", "[WQ]", "[WK]", "[BP]", "[BR]", "[BH]", "[BB]",
			"[BQ]", "[BK]" };

	@SuppressWarnings("resource") // чтобы не ругалось на сканер
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		initBoad();
		printBord();

		while (true) {// TODO заметить на переменную в условиии
			String move;
			System.out.println();
			System.out.println("Choise move (b1-g1):");
			// input
			move = scanner.nextLine();
			if (move.charAt(0) == '0') {
				System.out.println("End game");
				break;
			}
			// action
			if (makeMove(move)) {
				printBord();
			}
		}
	}

	public static void initBoad() {
		chessBoard = new String[8][8];
		for (int i = 0; i < 8; i++) {
			chessBoard[1][i] = PIECES[0];
			chessBoard[6][i] = PIECES[6];
		}
		for (int i = 0; i < 5; i++) {
			chessBoard[0][i] = PIECES[i + 1];
			chessBoard[7][i] = PIECES[i + 7];
		}
		chessBoard[0][5] = PIECES[3];
		chessBoard[7][5] = PIECES[2];
		chessBoard[0][6] = PIECES[1];
		chessBoard[7][6] = PIECES[9];
		chessBoard[0][7] = PIECES[8];
		chessBoard[7][7] = PIECES[7];
	}

	public static void printBord() {
		System.out.println();
		System.out.print("    ");
		for (char i = 'a'; i != ('h' + 1); i++) {
			System.out.print(" \"" + i + "\"   ");

		}
		System.out.println();
		for (int i = 0; i < chessBoard.length; i++) {
			System.out.println();
			for (int j = 0; j < chessBoard[i].length; j++) {
				if (j == 0) {
					System.out.print("\"" + (i + 1) + "\" ");
				}
				if (chessBoard[i][j] == null) {
					System.out.print("     | ");
				} else {
					System.out.print(chessBoard[i][j] + " | ");
				}
				if (j == 7) {
					System.out.println("\"" + (i + 1) + "\"");
				}
			}

			System.out.println();
		}
		System.out.print("    ");
		for (char i = 'a'; i != ('h' + 1); i++) {
			System.out.print(" \"" + i + "\"   ");

		}
		System.out.println();

	}

	public static boolean makeMove(String move) {

		if (ValidateMove(move) == false) {
			System.out.println("Bad step");
			return false;
		}
		int fromRow, fromColum, toRow, toColum;
		fromRow = move.charAt(0) - 97;
		toRow = move.charAt(3) - 97;
		fromColum = move.charAt(1) - 49;
		toColum = (int) move.charAt(4) - 49;
		chessBoard[toColum][toRow] = chessBoard[fromColum][fromRow];
		chessBoard[fromColum][fromRow] = null;
		return true;

	}

	private static boolean ValidateMove(String move) {
		if (move.length() != 5) {
			return false;
		}
		if (move.charAt(0) < 'a' || move.charAt(0) > 'h' || move.charAt(3) < 'a' || move.charAt(3) > 'h') {
			return false;
		}
		if (move.charAt(1) < '1' || move.charAt(1) > '8' || move.charAt(4) < '1' || move.charAt(4) > '8') {
			return false;
		}
		return true;
	}
}

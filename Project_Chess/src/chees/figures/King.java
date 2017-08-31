package chees.figures;

import chees.Board;
import chees.Piece;

public class King extends Piece {

	public King(boolean color) {
		super("KING", color);
	}

	@Override
	public boolean checkMove(int startX, int startY, int finishX, int finishY, Board board) {
		// TODO Auto-generated method stub
		return false;
	}

}

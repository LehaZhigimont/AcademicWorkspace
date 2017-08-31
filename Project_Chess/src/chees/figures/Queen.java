package chees.figures;

import chees.Board;
import chees.Piece;

public class Queen extends Piece {

	public Queen(boolean color) {
		super("QUEEN", color);
	}

	@Override
	public boolean checkMove(int startX, int startY, int finishX, int finishY, Board board) {
		// TODO Auto-generated method stub
		return false;
	}

}

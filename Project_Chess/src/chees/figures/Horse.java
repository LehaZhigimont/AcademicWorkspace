package chees.figures;

import chees.Board;
import chees.Piece;

public class Horse extends Piece {

	public Horse(boolean color) {
		super("HORSE", color);

	}

	@Override
	public boolean checkMove(int startX, int startY, int finishX, int finishY, Board board) {
		// TODO Auto-generated method stub
		return false;
	}
}

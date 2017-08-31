package chees.figures;

import chees.Board;
import chees.Piece;

public class Bishop extends Piece {

	public Bishop(boolean color) {
		super("BISHOP", color);
	}

	@Override
	public boolean checkMove(int startX, int startY, int finishX, int finishY, Board board) {
		// TODO Auto-generated method stub
		return false;
	}

}

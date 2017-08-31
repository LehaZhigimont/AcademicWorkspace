package chees.figures;

import chees.Board;
import chees.Piece;

public class Rook extends Piece {

	public Rook(boolean color) {
		super("ROOK", color);
	}

	@Override
	public boolean checkMove(int startX, int startY, int finishX, int finishY, Board board) {
		// TODO Auto-generated method stub
		return false;
	}

}

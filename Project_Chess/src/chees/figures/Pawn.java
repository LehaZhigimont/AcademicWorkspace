package chees.figures;

import chees.Board;
import chees.Piece;

public class Pawn extends Piece {

	public Pawn(boolean color) {
		super("PAWN", color);
	}

	@Override
	public boolean checkMove(int startX, int startY, int finishX, int finishY, Board board) {
		// TODO Auto-generated method stub
		return false;
	}

}

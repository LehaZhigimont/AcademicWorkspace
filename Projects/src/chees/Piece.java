package chees;

 public abstract class Piece {
	public static final boolean WHITE = true;
	public static final boolean BLACK = false;
	 

	private final String name;
	private final boolean color;

	public Piece (String name, boolean color){
		this.name = name;
		this.color = color;
	}
	
	public abstract boolean checkMove(int startX,int startY, int finishX,int finishY, Board board);
	
	public String getName() {
		return name;
	}

	public boolean isColor() {
		return color;
	}
 
 
 }

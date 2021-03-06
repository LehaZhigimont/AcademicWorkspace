package composition;

public class Wheel {
	public String description = "R16";
	int bolts = 4;
	boolean casted;
	Tire tireOnThisWheel = null;

	public Wheel() {
	}


	public Wheel(String description, boolean putTiresOn) {
		this.description = description;
		if(putTiresOn){
			tireOnThisWheel = new Tire("Tire On "+description);
		}
	}
	
	public Wheel(boolean putTiresOn) {
		if(putTiresOn){
			tireOnThisWheel = new Tire("Tire For Wheel "+description);
		}
	}
}
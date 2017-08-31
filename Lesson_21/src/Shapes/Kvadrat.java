package Shapes;

public class Kvadrat extends Shape {
	private double side;
	Kvadrat(){
		super("Kvadrat");
			side = Math.random()*10;
	}
	
	public double getPerimetr() {
		return side*4;
	}

	@Override
	public double getArea() {
		return side*4;
	}
	
}

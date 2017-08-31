package Shapes;

public class Shape {

	private String color = "Red";
	private String name = "Father shape";
	Shape(){
		System.err.println("Insyde constructor Shape");
	}
	Shape(String name){
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public double getArea() {
		return 0.0;
	}

	public double getPerimetr() {
		return 0.0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("I'm " + getName() 
				+ " color is " + getColor() 
				+ " area is " + getArea() 
				+ " perimetr " + getPerimetr());
	}
}

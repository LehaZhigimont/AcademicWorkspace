package Shapes;

public class Krug  extends Shape{

	private double r;
	
	public Krug(){
		super("Krug");
		System.err.println("Insyde constructor circle");
		r = Math.random()*10;	}


	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	/*public String getName() {
		return "Krug";
	}*/
	
	public double getPerimetr() {
		return r*(Math.PI*2);
	}
	
	public void print() {
		super.print();
		System.out.println("My r = " + r);
		
		
		/*System.out.println("I'm " + getName() 
				+ " color is " + getColor() 
				+ " area is " + getArea() 
				+ " perimetr " + getPerimetr()
				+ " radius is " + r);*/
	}
	
}

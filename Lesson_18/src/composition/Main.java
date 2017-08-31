package composition;

public class Main {

	public static void main(String[] args) {
		Wheel wheel = new Wheel("Kvadratnoe koleso", true);
		Wheel wheel2 = new Wheel();
		System.out.println(wheel.tireOnThisWheel.description);
		if(wheel2.tireOnThisWheel != null){
		System.out.println(wheel2.tireOnThisWheel.description);
		}
		else{
			System.out.println(wheel2.description+" dont have tire");
		}
		
		Human h = new Human("Alex");
		h.buyAuto("Alex's car", true);
		System.out.println(h.auto.wheelOnThisCar[2].description);
	}

}

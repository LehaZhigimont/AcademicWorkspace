package composition;

public class Auto {
	Wheel[] wheelOnThisCar = {new Wheel(),null,null,null};
	String description = "Matroshka";
	public Auto(String description, boolean buyTires){
		this.description = description;
		for(int i=0;i<wheelOnThisCar.length;i++){
			
			wheelOnThisCar[i] = new Wheel("Wheel" + (i+1)+ "for car " + description, true);
			buyTires = true;
		}
	}


}
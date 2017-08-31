package staticOrObject;

public class Auto {
	String color;
	int HorsePower;
	int number;
	static String classDesription = "this is auto class";
	
	
	
	
	public Auto(String initColor, int initHorsePower) {
		this.color = initColor;
		//this переменая для объекта, ссылающеся на самого себя.
		HorsePower = initHorsePower;
	}

	
	public Auto() {
		// если есть иной конструктор не по умолчанию, то нужно создать поумолчанию конструктор 
		
		this.color = "black";
		this.HorsePower = (int)(Math.random()* 1200) + 1;	
		if((int)(Math.random()*10) < 5) {
			this.color = "black";
		}
		else{
			this.color = "pink";
		}
		
		this.number = (int)(Math.random()*10000);
	}
	
	public Auto(Auto original) {
		//this = original;
		//не будет работать
		original = this;
	}
}


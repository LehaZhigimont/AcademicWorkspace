package staticOrObject;

public class JastMain {

	public static void main(String[] args) {
		// код делиться на два типа
		// статический - процедурное програмирование
		// и объектный - объектно ориентированое
		// Внутри объекта
		/// class AUTO
		/// String color
		/// int HorsePower

		Auto veryPowerfulAuto, veryWeakAuto;
		
		System.out.println("Description = " + Auto.classDesription);
		//create objective
		veryPowerfulAuto = new Auto();
		veryWeakAuto = new Auto();

		System.out.println("Power = " + veryPowerfulAuto.HorsePower);
		System.out.println("Color = " + veryPowerfulAuto.color);
		
		System.out.println(veryWeakAuto.HorsePower == veryPowerfulAuto.HorsePower);
		//знак равенства сравнивает ссылки на объекты, а не значения объекта
		
		//Initialization 
		veryPowerfulAuto.HorsePower = 1200;
		veryWeakAuto.HorsePower = 35;
		
		System.out.println(veryWeakAuto.HorsePower == veryPowerfulAuto.HorsePower);
		
		Auto oneMoreAuto;
		oneMoreAuto = veryPowerfulAuto;
		System.out.println(oneMoreAuto.HorsePower == veryPowerfulAuto.HorsePower);
		//true т.к. это две ссылки на один и тотже объект
		
		
		oneMoreAuto.HorsePower = 1250;
		System.out.println("Power = " + veryPowerfulAuto.HorsePower);
		//измениться в обоих сылках на 1250 т.к. объект один
		
		
		veryPowerfulAuto.color = "black";
		
		
		Auto[] autopark = new Auto[50];
		
		//выделить память на 50 сылок обектов
		
		for(int i=0; i < autopark.length;i++){
			autopark[i] = new Auto();
		}
		
		
		printAutopark(autopark);
		sortAutoPower(autopark);
		System.out.println();
		printAutopark(autopark);
		
	}

	private static void sortAutoPower(Auto[] autopark) {
		for(int i = 0; i<autopark.length;i++){
			for(int j = i; j<autopark.length;j++){
				if (autopark[i].HorsePower < autopark[j].HorsePower){
					int temp = autopark[j].HorsePower;
					autopark[j].HorsePower = autopark[i].HorsePower;
					autopark[i].HorsePower = temp;
				}
			}
		}
	}

	private static void printAutopark(Auto[] autopark) {
		for(int i=0; i < autopark.length;i++){
			System.out.print("Auto nuber "+autopark[i].number+"\t"+autopark[i].color + "\t");
			System.out.println(autopark[i].HorsePower + "\t");
		}
	}

}

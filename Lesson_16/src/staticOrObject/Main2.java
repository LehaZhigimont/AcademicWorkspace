package staticOrObject;

public class Main2 {
	@SuppressWarnings("unused")//отключает подсказку неиспользованых переменных
	
	public static void Main() {
		Auto veryPowerfulAuto, veryWeakAuto;	
		veryPowerfulAuto = new Auto("black", 1200);		
		veryWeakAuto = new Auto("pink", 35);	
		Auto oneMoreAuto = new Auto();		
		Auto autoNr4 = new Auto(veryWeakAuto);
		
		Auto[] autopark = new Auto[50];
		
		//выделить память на 50 сылок обектов
		
		for(int i=0; i < autopark.length;i++){
			autopark[i] = new Auto();
		}
		for(int i=0; i < autopark.length;i++){
			System.out.println(autopark[i] + "\t");
		}
		
	}

}

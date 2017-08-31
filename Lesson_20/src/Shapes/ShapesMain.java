package Shapes;

public class ShapesMain {

	public static void main(String[] args) {
		/*Treugolnik t = new Treugolnik();
		Kvadrat kv = new Kvadrat();
		Krug kr = new Krug();
		Shape sh = new Shape();*/
		
		//kr.print();
		//kv.print();

		Shape[]shapes =new Shape[5];
		
		for(int i = 0; i< shapes.length;i++){
			shapes[i] = Math.random()>0.5 ? new Kvadrat() : new Krug();
		}
		for(int i = 0; i< shapes.length;i++){
			shapes[i].print();
			System.out.println("\r");
		}
		
		

	}

}

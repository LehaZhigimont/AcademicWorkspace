package Shapes;

public class ShapesMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Treugolnik t = new Treugolnik();
		Treugolnik t3 = new Treugolnik();
		Kvadrat kv = new Kvadrat();
		Krug kr = new Krug();
		//Shape sh = new Shape();
		PramoyTrugolnik pTr = new PramoyTrugolnik();
		
	/*	kr.print();
		kv.print();

		Shape[]shapes =new Shape[5];
		
		for(int i = 0; i< shapes.length;i++){
			shapes[i] = Math.random()>0.5 ? new Kvadrat() : new Krug();
		}
		for(int i = 0; i< shapes.length;i++){
			shapes[i].print();
			System.out.println("\r");
		}*/
		/*System.out.println(t);
		System.out.println(t.hashCode());
		System.out.println(t.equals(t3));//t==t3 без переопределения
*/
		System.out.println(t.equals(pTr));
	}

}

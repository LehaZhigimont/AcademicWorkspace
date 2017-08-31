package WeddingSerch;

public class HumanMain {

	public static void main(String[] args) {
		Human[] peoples = new Human[4];
		for (int i = 0; i < peoples.length; i++) {
			peoples[i] = new Human();
			
		}
		
		for (int i = 0; i < peoples.length; i++) {
			peoples[i].print();
		}
		
		for (int i = 0; i < peoples.length; i++) {
			int randomRelation = (int)(Math.random()*peoples.length);
			if (peoples[i].getSex() == peoples[randomRelation].getSex()){
				i--;
				continue;
			}
			peoples[i].setWhoHeLike(peoples[randomRelation]);
		}
		
		System.out.println("\r \r \r ");
		
		for (int i = 0; i < peoples.length; i++) {
			peoples[i].print();
		}

	}

}

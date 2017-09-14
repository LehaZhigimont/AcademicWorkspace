package zoo;

import zoo.domain.Elephant;

public class Application {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		for (int i = 0; i < 500; i++) {
			zoo.buyElephant(new Elephant("Слон" + i % 10));
		}
		
		zoo.feedElephants();
		zoo.feedElephants();
	}

}

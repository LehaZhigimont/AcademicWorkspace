package zoo;

import zoo.domain.Elephant;

public class Zoo {

	private BeastSet<Elephant> elephants = new ElephantSet();

	public void feedElephants() {
		int size = elephants.getSize();
		for (int i = 0; i < size; i++) {
			Elephant slon = elephants.next();
			System.out.println(slon.getName() + " кушает");
		}
	}

	/**
	 * Don't used!NEVER!!!
	 */
	public void kupiSlona() {
		boolean firstCall = false;
		if (!firstCall) {
			System.out.println("Купи слона");
			firstCall = true;
		}else{
			System.out.println("Все так говорят, а ты купи слона");
		}
		kupiSlona();
	}

	public void buyElephant(Elephant elephant) {
		elephants.add(elephant);
	}

}

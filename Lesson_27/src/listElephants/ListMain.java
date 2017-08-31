package listElephants;

import java.util.Comparator;
import java.util.LinkedList;

public class ListMain {

	private static class Elephant {
		public int hobot = (int) (Math.random() * 50);

		@Override
		public String toString() {
			return "I'am Elephant, my size hobot " + this.hobot + "\r";
		}

		/*
		 * @Override public int compare(Elephant o1, Elephant o2) { if (o1.hobot
		 * > o2.hobot) { return 1; } else { if (o1.hobot == o2.hobot) { return
		 * 0; } } return -1; }
		 */
	}

	/*
	 * private static class ElephantComparator implements Comparator<Elephant> {
	 * private int order = 1;
	 * 
	 * public ElephantComparator(int order) { this.order = order; }
	 * 
	 * @Override public int compare(Elephant o1, Elephant o2) { if (o1.hobot >
	 * o2.hobot) { return 1 * order; } else { if (o1.hobot == o2.hobot) { return
	 * 0; } } return -1 * order; } }
	 */

	public static void main(String[] args) {
		LinkedList<Elephant> stado = new LinkedList<Elephant>();

		for (int i = 0; i < 5; i++) {
			stado.add(new Elephant());
		}

		// создание компаратора в анонимном классе, на основе каласса "слона"
		// в метод сорт передаётся компаратор из анонимного класса
		stado.sort(new Comparator<Elephant>() {

			private int order = (int) (Math.random() * 10) - 5;

			@Override
			public int compare(Elephant o1, Elephant o2) {
				if (o1.hobot > o2.hobot) {
					return 1 * order;
				} else {
					if (o1.hobot == o2.hobot) {
						return 0;
					}
				}
				return -1 * order;
			}
		});

		// лямбда-выражение(подходит для преопрделения одного
		// метода в интерфейсе с одним методом)
		stado.sort((el, e2) -> {
			return 0;
		});
		System.out.println(stado);
		System.out.println(hobotSub(stado));
		
	}

	//List d = new List();
	
	// доделать
	static int hobotSub(Iterable<? extends Elephant> stado) {
		
		int sum=0;
		for( Elephant i:stado){
			sum+=i.hobot;
		}
		return sum;
	}
}

package listElephants;

import java.util.Comparator;
import java.util.LinkedList;

public class ListMain {
	private static class Elephant {
		public int hobot = (int) (Math.random() * 50);
		public int name = (int) (Math.random() * 10);

		@Override
		public String toString() {
			return "Elephant" + name + ": my size hobot " + this.hobot + "\r";
		}
	}

	private static class ElephantComparator implements Comparator<Elephant> {
		private int order = 1;

		public ElephantComparator(int order) {
			this.order = order;
		}

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
	}

	public static void main(String[] args) {
		LinkedList<Elephant> stado = new LinkedList<Elephant>();

		for (int i = 0; i < 10; i++) {
			stado.add(new Elephant());
		}

		System.out.println(stado);
		stado.sort(new ElephantComparator(-1));
		System.out.println(stado);
	}

	static int hobotSub(Iterable<? extends Elephant> stado) {

		return 0;
	}

}

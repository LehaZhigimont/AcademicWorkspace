package algoritms;


import java.util.Collection;

@SuppressWarnings("unused")//отключает подсказку неиспользованых переменных
public class Algoritms2 {

	public static void main(String[] args) {
		/*
		 * double a = 3, b = 4, c = 4, D; D = (b * b) - 4 * a * c; if (D < (0 +
		 * 0)) { System.out.println("D<0"); } else if (D == 0) {
		 * System.out.println("x=" + (-b / 2 * a)); } else {
		 * System.out.println("x1=" + (-b + Math.sqrt(D)) / 2 * a);
		 * System.out.println("x2=" + (-b - Math.sqrt(D)) / 2 * a);
		 * 
		 * 
		 * }
		 */
		
		/*
		 * int i = 0; while (i < 10) { i++; System.out.println("."); }
		 * System.out.println("posle cikla"); // do {
		 * System.out.println("choto"); } while (false); // for (int a = 0; i <
		 * 10; i++) { System.out.println("choto"); } // Collection<Integer>
		 * kCollection = new ArrayList();
		 * 
		 * for (Integer k : kCollection) {
		 * 
		 * }
		 */
		// четные числа от нуля до ста
		
		int i = 0;
		while (true) {
			if ((i % 2) == 0)
				System.out.println(i);
			i++;
			if(i<=100)continue;
			else break;
		}

	}
}


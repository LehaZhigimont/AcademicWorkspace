package array;


public class Masiv {
	@SuppressWarnings("unused")//отключает подсказку неиспользованых переменных
	public static void main(String[] args) {
		// Объявление
		int[] i, c, b;//масив интов
		double[] d;//масив даблов
		int i2[];
		//инициализация
		int[] g = {12,4,5,17};
		int[] h = new int[10000];
		boolean[]boolArray = new boolean[10];
		//read
		//System.out.println(g[2]);
		//System.out.println(h[2]);
		//System.out.println(boolArray[2]);
		//System.out.println(c[2]);
		
		System.out.println(h.length);
		System.out.println(g.length);
		
		h=g;
		g[1]=h[100];
		int[][] dvoinoi = new int [10][10];
	}

}

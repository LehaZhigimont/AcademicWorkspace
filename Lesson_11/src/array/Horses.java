package array;

public class Horses {

	public static void main(String[] args) {
		int N = 5;

		int D = 1000;

		double[] speed = { 20, 30, 10, 11, 12 };

		double[] positions = { 200, 250, 310, 500, 550 };

		double maxTime = 0;

		for (int i = 0; i < N; i++) {
			if ((D - positions[i]) / speed[i] > maxTime) {
				maxTime = (D - positions[i]) / speed[i];
			}
		}
		System.out.println(maxTime);

	}

}

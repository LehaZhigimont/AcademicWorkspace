package perfomanseTest;

public class PerfomanseTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long sum = 0;
		int progress = 0;
		for (long i = 0; i <= 3000000000L; i++) {
			if ((i % 30000000) == 0) {
				System.out.println(progress++ + " %");
			}
			sum += i;
		}
		System.out.println("Sum = " + sum);
		System.out.println("Run time = " + (System.currentTimeMillis() - startTime) / 1000f + " seconds");
	}
}

package recursia;

public class Recursia {
	public static void method(int i) {
		System.out.println(i + " nachalo");
		if (i > 1) {
			// System.out.println(i);
			// i++;
			method(i - 1);
			System.out.println(i + " konec");
		}
	}

	// public static void method2() {
	// method(5);
	// }
	public static void main(String[] args) {
		System.out.println("pred");
		method(5);
		System.out.println("posle");
		// method(11);
		// method(13);
		// method2();
	}

}

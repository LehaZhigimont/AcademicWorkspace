package factorial;

public class Factorial {
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(fac(n));
	}
	
	/**
	 * <b>This method don't used for minus number</b>
	 * @param n - Integer
	 */
	public static int fac(int n) {
		if (n > 1) {
			return n * fac(n - 1);
		} else {
			return 1;
		}
	}
}
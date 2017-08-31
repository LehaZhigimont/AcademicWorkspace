package generics;

/*
 * @conspect
 * Generics - это способ работать с обопщёными данными.
 * 
 * 
 * 
 */

public class MainGenerics {

	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		@SuppressWarnings("unused")
		int s = sum(a, b);
	}

	private static <T extends Number> T sum(T a, T b) {
		return a;
	}

}

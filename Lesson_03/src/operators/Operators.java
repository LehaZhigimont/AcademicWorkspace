package operators;

public class Operators {

	@SuppressWarnings("unused")//отключает подсказку неиспользованых переменных
	public static void main(String[] args) {
		int i = 130;
		char c = 'a';
		byte b = 12;
		long l = 3000000000L;
		float f = 3.1f;
		double d = 3000000000.1d;
		boolean bool = true;
		
		bool = c < b;
		System.out.println(i == c);
		
	}

}
package stroki;

public class Stroki {
	@SuppressWarnings("unused")//отключает подсказку неиспользованых переменных
	public static void main(String[] args) {
		String stroka = "Hello World";
		int[] a = { 1, 2 };
		char[] cmass = stroka.toCharArray();
		int dlina = stroka.length();
		char simwol = stroka.charAt(1);// 'e'
		String strokaIsMassiva0 = new String(cmass);
		
		
		char[] strokaIsMassiva = new char[stroka.length()+1];
		for (int i = 0; i<stroka.length();i++){
			strokaIsMassiva[i]=stroka.charAt(i);
		}
		strokaIsMassiva[strokaIsMassiva.length-1] = '!';
		String stroka2 = new String(strokaIsMassiva);
		System.out.println(stroka2);
		
		
	}

}

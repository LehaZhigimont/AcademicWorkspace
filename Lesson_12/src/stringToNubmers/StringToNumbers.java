package stringToNubmers;

public class StringToNumbers {

	public static void main(String[] args) {
		String asInt = "12";
		char c = 'a';
		int i = Integer.parseInt(asInt);
		long l = Long.parseLong(asInt);
		double d = Double.parseDouble(asInt);
		float f = Float.parseFloat(asInt);
		byte b = Byte.parseByte(asInt);
		boolean bool = Boolean.parseBoolean(asInt);
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
		System.out.println(bool);
		
		//обратное преобразование
		
		Integer.toString(i);
		Long.toString(l);
		Double.toString(d);
		Float.toString(f);
		Byte.toString(b);
		Boolean.toString(bool);
		Character.toString(c);
		System.out.println();
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
		System.out.println(bool);
		System.out.println(c+1);	
	}
}


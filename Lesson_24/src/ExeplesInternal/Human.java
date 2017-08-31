package ExeplesInternal;

public class Human {
	private char sex;
	public String name;
	protected Human whoHeLike;
	private static int someStatic = 4;
	
	public static class Soul{
		void anyMethod(){
			System.out.println(someStatic);
		}
	}
	
	@SuppressWarnings("unused")
	private class Body{
	}
	
	protected class Head {
		Head(){
			System.out.println(sex);
		}
	}
	
	
}

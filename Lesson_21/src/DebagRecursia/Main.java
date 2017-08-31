
package DebagRecursia;

public class Main {
	
	static public int sum(int a){
		if(a == 1){
			
			return 1;
		}
		
		return a+sum(a-1);
	}

	public static void main(String[] args) {
		sum(5);
	}
	
}

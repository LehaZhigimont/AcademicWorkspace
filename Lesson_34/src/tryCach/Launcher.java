package tryCach;

public class Launcher {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int el;
		try {
			el = getArr(arr,10);
		} catch (Exception e) {
			
			el = 100;
		}
		System.out.println(el);
		
	}

	private static int getArr(int[] arr, int i) throws Exception {
		try{
			return arr[i];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User foolish, get last element");
			throw new Exception ("User foolish");
			//return arr[arr.length-1];
		}
		
	}

}

package array;

public class MirrorArray {
	
	public static void printMassiv(int[] massiv) {
		for (int i = 0; i < massiv.length; i++) {
			System.out.print(massiv[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		
		printMassiv(array);
		System.out.println();
		for(int i=0;i<array.length/2;i++) {
			int temp = array[i];
			array[i]=array[(array.length-1)-i];
			array[((array.length-1)-i)] = temp;
			printMassiv(array);
		}
		//printMassiv(array);
	}

}

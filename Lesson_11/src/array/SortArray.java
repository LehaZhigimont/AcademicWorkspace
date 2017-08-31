package array;


//сортировка выборкой
public class SortArray {

/*	public static void printArray(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}*/

	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	public static void sortArray(int array[]){
		// sort bubble
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++)
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
		}
 }

	public static void main(String[] args) {
		int[] array;
		int rows = 4;
		array = new int[rows];
		// write
		for (int i = 0; i < rows; i++) {
			array[i] = (int) (Math.random() * 21 - 10);
		}
		//body
		printArray(array);
		System.out.println();
		sortArray(array);		
		printArray(array);
	}

}

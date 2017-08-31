package array;


//Дана вещественная матрица размером 3 x 4. Упорядочить ее строки по не
//убыванию наибольших элементов в строках матрицы.
public class Array2dTask1 {

	public static void printArray2D(int array2D[][]) {
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void sortArray(int array[]) {
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

	public static void sortArrayByMaxElement(int array2d[][]) {

		for (int i = 0; i < array2d.length; i++) {
			for (int j = i; j < array2d.length; j++)
				if (maxElement(array2d, i) > maxElement(array2d, j)) {
					int [] temp = array2d[i];
					array2d[i] = array2d[j];
					array2d[j] = temp;
				}
		}
	}

	private static int maxElement(int[][] array2d, int i) {
		int maxElement = array2d[i][0];
		for (int j = 0; j < array2d[i].length; j++) {
			if (array2d[i][j] > maxElement) {
				maxElement = array2d[i][j];
			}
		}
		return maxElement;
	}

	public static void main(String[] args) {
		int[][] array2d;
		int rows = 4, colums = 3;
		array2d = new int[rows][colums];
		

		// write
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				array2d[i][j] = (int) (Math.random() * 21 - 10);
			}
		}
		printArray2D(array2d);
		// body
		sortArrayByMaxElement(array2d);
		System.out.println();
		printArray2D(array2d);
	}

}


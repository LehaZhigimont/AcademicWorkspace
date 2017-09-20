package array;

/// есть масив, сдвинуть каждый элемент на K позиций
public class Task {

	public static void printMassiv(int[] massiv) {
		for (int i = 0; i < massiv.length; i++) {
			System.out.print(massiv[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// int[] array = new int((int)(Math.random()*10));

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		printMassiv(array);
		int k = 2;

		int j = 0;
		while (j != k) {
			int temp = array[array.length -1];
			for (int i = array.length - 2; i >= 0; i--) {
				array[i + 1] = array[i];
			}
			array[0] = temp;
			//System.out.print("in  ");
			//printMassiv(array);
			j++;
		}
		//System.out.print("final  ");
		printMassiv(array);

	}

}


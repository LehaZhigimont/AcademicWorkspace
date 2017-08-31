package array;


public class Sort {

	public static void printMassiv(int[] massiv) {
		for (int i = 0; i < massiv.length; i++) {
			System.out.print(massiv[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 7, 9, 2, 3, 1 };
		int n = (int) arr.length;
		printMassiv(arr);
		for (int i = 0; i < n - 1; i++) {
			int min = arr[i];
			int indexMin = i;
			for (int j = i; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					indexMin = j;
				}

			}
			int temp = arr[i];
			arr[i] = min;
			arr[indexMin] = temp;
		}
		printMassiv(arr);
	}

}

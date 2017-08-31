package array;


public class Array2D {

	public static void printArray2D(int array2D[][]) {
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + "|");
			}
			System.out.println();
		}

		
	}
	public static void printArray2Dv2(int array2D[][]) {
		for (int i = 0; i < array2D[i].length; i++)
		 {
			for (int j = 0; j < array2D.length; j++) {
				System.out.print(array2D[i][j] + "|");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] array2D;
		int rows =5, colums =3;
		array2D = new int[rows][colums];
		int sum=0;
		
		//write
		for (int i=0;i<rows;i++){
			for (int j=0;j<colums;j++){
				array2D[i][j]=(int)(Math.random()*201 - 100);
			}
		}
	
		//sum
		for (int i=0;i<rows;i++){
			for (int j=0;j<colums;j++){
				sum= sum + array2D[i][j];
			}
		}
		printArray2D(array2D);
		System.out.println();
		printArray2Dv2(array2D);
		System.out.println("sum = "+sum);
	}

}

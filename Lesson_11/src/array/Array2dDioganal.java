package array;

public class Array2dDioganal {
	public static void printArray2D(int array2D[][]) {
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
			int[][] array2D;
			int rows =5, colums =5;
			array2D = new int[rows][colums];
			int sum=0;
			
			//write
			for (int i=0;i<rows;i++){
				for (int j=0;j<colums;j++){
					array2D[i][j]=(int)(Math.random()*2001 - 1000);
				}
			}
			
			//sum
			//главная диогональ
			/*for (int i=0;i<rows;i++){
				for (int j=0;j<colums;j++){
					if(i==j)sum= sum + array2D[i][j];
				}
			}*/
			
			//sum быстрее
			/*for (int i=0;i<rows;i++){
					sum= sum + array2D[i][i];
				}*/
			
			//побочная диогональ
			for (int i=0;i<rows;i++){
				for (int j=array2D[i].length-1;j!=0;j--){
					sum= sum + array2D[i][i];
				}
			}
			
			printArray2D(array2D);
			System.out.println("sum = "+sum);
		
		}
}


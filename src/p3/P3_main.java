package p3;

public class P3_main {

	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
	
		ausgabe(matrix);	
	
		int[][] a = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
	
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = a[i][j] + 1;
			}
		}
	
		System.out.println();
		ausgabe(a);
		
		int[][] b = matrix;
		int sum = 0; 
	
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sum = sum + b[i][j]; 
			}
		}
	
		System.out.println();
		System.out.println("Summe der Elemente: " + sum);
	
	
		int[][] c = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		//c[0][2] = matrix[0][0];
		//c[1][2] = matrix[0][1];
		//c[2][2] = matrix[0][2];
		
		//c[0][1] = matrix[1][0];
		//c[1][1] = matrix[1][1];
		//c[2][1] = matrix[1][2];
		
		//c[0][0] = matrix[2][0];
		//c[1][0] = matrix[2][1];
		//c[2][0] = matrix[2][2];
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[j][i] = matrix[2 - i][j];
			}
		}
		System.out.println();
		ausgabe(c);
	
	
	
	
	
	}
	public static void ausgabe(int[][] myArray) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}

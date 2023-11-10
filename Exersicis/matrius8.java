package Exersicis;

public class matrius8 {
	public static void main(String[] args) {
		  int[][] arrayOriginal = {
		            {7, 7, 3, 1, 10},
		            {2, 8, 8, 3, 9},
		            {2, 5, 5, 8, 3},
		            {10, 5, 4, 4, 6},
		            {4, 3, 1, 6, 5},
		            {6, 2, 7, 8, 10},
		            {3, 10, 4, 3, 9},
		            {2, 3, 5, 8, 1},
		            {9, 6, 8, 3, 9}
		        };
	        int files = arrayOriginal.length;
	        int columnes = arrayOriginal[0].length;

	        int[][] arrayFinal = new int[columnes][files];

	        for (int i = 0; i < files; i++) {
	            for (int j = 0; j < columnes; j++) {
	                arrayFinal[j][i] = arrayOriginal[i][j];
	            }
	        }

	        System.out.println("Array original:");
	        for (int i = 0; i < files; i++) {
	            for (int j = 0; j < columnes; j++) {
	                System.out.print(arrayOriginal[i][j] + " ");
	            }
	            System.out.println();
	        }

	        System.out.println("Array transposada:");
	        for (int i = 0; i < columnes; i++) {
	            for (int j = 0; j < files; j++) {
	                System.out.print(arrayFinal[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
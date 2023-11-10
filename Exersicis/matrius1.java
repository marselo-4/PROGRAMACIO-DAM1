package Exersicis;

public class matrius1 {
	/*Ejercicio 1. Realiza un programa en Java que inicialice un array bidimensional de números
	enteros de 3x3, asígnale valores de manera manual y que muestre los valores por consola.*/

	public static void main(String[] args) {
		int[][] matriu = new int[3][3];
		
		 matriu[0][0] = 1;
		 matriu[0][1] = 2;
		 matriu[0][2] = 3;
		 matriu[1][0] = 4;
		 matriu[1][1] = 5;
		 matriu[1][2] = 6;
		 matriu[2][0] = 7;
		 matriu[2][1] = 8;
		 matriu[2][2] = 9;
		 
		 for(int i = 0; i < 3; i++) {
			 for(int j = 0; j < 3; j++) {
				 System.out.println(matriu[i][j]+" ");
			 }
		 }
		 
		 /*
		  * OUTPUT:
		  * [1][2][3]
		  * [4][5][6]
		  * [7][8][9]
		  * 
		  */
		 
	}
}

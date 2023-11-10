package Exersicis;
import java.util.Scanner;

public class matrius2 {
	public static void main(String[] args) {
		/*Ejercicio 2. Realiza un programa en Java que inicialice un array bidimensional de números
		enteros de 3x3 pidiéndole los números al usuario y que muestre los valores por consola.*/
		
		//Farem exactament el mateix codi que al exersici 1 pero afegint un scanner
		Scanner scan = new Scanner(System.in);
		int[][] matriu = new int[3][3];
		
		System.out.println("Introduce 9 números integros.");
		 matriu[0][0] = scan.nextInt();
		 matriu[0][1] = scan.nextInt();
		 matriu[0][2] = scan.nextInt();
		 matriu[1][0] = scan.nextInt();
		 matriu[1][1] = scan.nextInt();
		 matriu[1][2] = scan.nextInt();
		 matriu[2][0] = scan.nextInt();
		 matriu[2][1] = scan.nextInt();
		 matriu[2][2] = scan.nextInt();
		 
		 for(int i = 0; i < 3; i++) {
			 for(int j = 0; j < 3; j++) {
				 System.out.println(matriu[i][j]+" ");
			 }
		 }
		 
		 /*
		  * OUTPUT random: 
		  * [32][765][1]
		  * [56][789][77]
		  * [222][367][112]
		  * 
		  */
		 
		
	}
}

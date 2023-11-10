package Exersicis;
import java.util.Scanner;
import java.util.Random;

public class matrius3 {
	public static void main(String[] args) {
		/*Ejercicio 3. Realiza un programa en Java que cree un array bidimensional de 5 filas y n
		columnas (se pide al usuario). Rellenarlo con números aleatorios del 0 al 10. PISTA: Utilizar
		clase Random.*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Indica el numero de columnas que desees: ");
		int n = scan.nextInt();
		Random rand = new Random(); 
		int[][] matriu = new int[5][n];
		
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = rand.nextInt(11); // Números aleatorios entre 0 y 10
            }
        }
		 
		 for(int i = 0; i < 5; i++) {
			 for(int j = 0; j < n; j++) {
				 System.out.println(matriu[i][j]+" ");
			 }
		 }
		 
		 /*
		  * OUTPUT random: 
		  * [32][765]
		  * [56][789]
		  * [222][367]
		  * [56][789]
		  * [222][367]
		  * 
		  */
	}
}

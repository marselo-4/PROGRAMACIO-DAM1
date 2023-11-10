package Exersicis;
import java.util.Scanner;

public class matrius12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
	        int[][] array = new int[8][8];
	
	        System.out.println("Introdueix els valors de l'array:");
	        
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	            	
	                System.out.print("\nIntrodueix el valor de la fila " + (i + 1) + ", i columna " + (j + 1) + ": ");
	                array[i][j] = scan.nextInt();
	            }
	        }
	  
	        System.out.print("\nIntrodueix l'index de la primera fila (0-7): ");
	        int c1 = scan.nextInt();
	        System.out.print("\nIntrodueix l'index de la segona fila (0-7): ");
	        int c2 = scan.nextInt();

	        if (c1 >= 0 && c1 < 8 && c2 >= 0 && c2 < 8) {
	            int sumaColumna1 = 0;
	            int sumaColumna2 = 0;

	            for (int i = 0; i < 8; i++) {
	                sumaColumna1 += array[i][c1];
	                sumaColumna2 += array[i][c2];
	            }

	            System.out.println("La suma dels valors de la columna " + c1 + " es: " + sumaColumna1);
	            System.out.println("La suma dels valors de la columna " + c2 + " es: " + sumaColumna2);

	            if (sumaColumna1 == sumaColumna2) {
	                System.out.println("\nLes dos files sumen el mateix.");
	            } else {
	                System.out.println("\nLes dos files NO sumen el mateix.");
	            }
	        } else {
	            System.out.println("\nHi ha algun error.");
	        }

	        scan.close();
	    }
}

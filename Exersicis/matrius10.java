package Exersicis;
import java.util.Scanner;

public class matrius10 {
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

	        boolean diagonalPrincipal = true;
	        for (int i = 0; i < 8; i++) {
	            if (array[i][i] != 0) {
	                diagonalPrincipal = false;
	                break;
	            }
	        }

	        System.out.println("\nL'array és:");
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                System.out.print(array[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        if (diagonalPrincipal) {
	            System.out.println("\nLa diagonal principal conte zeros.");
	        } else {
	            System.out.println("\nLa diagonal principal NO conte zeros.");
	        }
	        scan.close();
	    }
}

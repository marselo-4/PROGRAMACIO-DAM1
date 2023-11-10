package Exersicis;
import java.util.Scanner;
public class matrius11 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        
	        int[][] array = new int[8][8];
	
	        System.out.println("Introdueix els valors de l'array:");
	        
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	            	
	                System.out.print("\nIntrodueix el valor de la fila " + (i + 1) + ", i columna " + (j + 1) + ": ");
	                array[i][j] = scan.nextInt();
	            }
	        }
	        
	        System.out.print("\nIntrodueix l'index de la primera fila (0-7): ");
	        int index1 = scan.nextInt();
	        System.out.print("\nIntrodueix l'index de la segona fila (0-7): ");
	        int index2 = scan.nextInt();

	        if (index1 >= 0 && index1 < 8 && index2 >= 0 && index2 < 8) {
	            int sumaf1 = 0;
	            int sumaf2 = 0;

	            for (int j = 0; j < 8; j++) {
	            	sumaf1 += array[index1][j];
	            	sumaf2 += array[index2][j];
	            }

	            System.out.println("\nLa suma dels valors de la fila " + index1 + " és: " + sumaf1);
	            System.out.println("\nLa suma dels valors de la fila " + index2 + " és: " + sumaf2);

	            if (sumaf1 == sumaf2) {
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

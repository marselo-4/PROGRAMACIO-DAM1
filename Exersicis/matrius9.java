package Exersicis;
import java.util.Scanner;

public class matrius9 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] array = new int[8][8];

        System.out.println("Introdueix els valors de l'array:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("\nIntrodueix el valor de la fila " + (i + 1) + " i columna " + (j + 1) + ": ");
                array[i][j] = scan.nextInt();
            }
        }

        int valorMaxArray = array[0][0];
        for (int i = 1; i < 8; i++) {
            if (array[i][i] > valorMaxArray) {
                valorMaxArray = array[i][i];
            }
        }

        System.out.println("\nL'array original és:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nEl valor maxim de la diagonal es: " + valorMaxArray);
        
        scan.close();
    }
}

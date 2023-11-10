package Exersicis;
import java.util.Scanner;

public class matrius5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[5][5];

        // Solicitem al usuari que ingressi el valor del array
        System.out.println("Introdueix a continuacio els valors del array");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Introdueix el valor de la fila " + (i + 1) + " i columna " + (j + 1) + ": ");
                array[i][j] = scan.nextInt();
            }
        }

        // Calculem i mostrem els resultats dels valors de cada fila
        System.out.println("Suma dels valors de cada fila:");

        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += array[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        scan.close();
    }
}
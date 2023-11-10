package Exersicis;
import java.util.Scanner;

public class matrius6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[5][5];

        // Solicitem al usuari que ingressi el valor del array
        System.out.println("Introdueix a continuacio els valors del array:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Introdueix el valor de la fila " + (i + 1) + " y columna " + (j + 1) + ": ");
                array[i][j] = scan.nextInt();
            }
        }

        // Calcular y mostrar la suma de los valores de cada columna
        System.out.println("Suma dels valors de cada columna:");

        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumna += array[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }

        scan.close();
    }
}
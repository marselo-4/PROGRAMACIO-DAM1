package Exersicis;
import java.util.Scanner;

public class tresenjava {

    public static void main(String[] args) {
        // Inicialización del tablero y variables
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jugadorActual = 'X';
        boolean juegoEnCurso = true;
        Scanner scan = new Scanner(System.in);

        // Bucle principal
        while (juegoEnCurso) {
            // Print Estado actual
            mostrarTablero(tablero);
            // Turno actual
            System.out.println("Turno de la " + jugadorActual);

            // Introducir posicion ficha
            System.out.print("Ingrese la fila (0-2): ");
            int fila = scan.nextInt();
            System.out.print("Ingrese la columna (0-2): ");
            int columna = scan.nextInt();

            // Validar input
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                // Actualizar tablero
                tablero[fila][columna] = jugadorActual;

                // Verificar si jugador-haGanado
                if (haGanado(tablero, jugadorActual)) {
                    mostrarTablero(tablero);
                    System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                    juegoEnCurso = false;
                } else if (tableroLleno(tablero)) {
                    // Verificar empates
                    mostrarTablero(tablero);
                    System.out.println("¡Empate!");
                    juegoEnCurso = false;
                } else {
                    // Cambio jugador
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("No puedes realizar este movimiento. Intentalo de nuevo.");
            }
        }
        scan.close();
    }

    // Función estado actualizado tablero
    public static void mostrarTablero(char[][] tablero) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
        System.out.println();
    }

    // Función verificar si algun jugador ha ganado
    public static boolean haGanado(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }

        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }

        return false;
    }

    // Función verificar si el tablero está lleno
    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

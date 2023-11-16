package Exersicis;

import java.util.Scanner;

public class random {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        jugar();
    }

    // Metode on comença el joc
    public static void jugar() {

        // Representem els jugadors i el valor buit
        char J1 = 'X';
        char J2 = 'O';
        char vacio = '-';

        // torn actual
        // true = J1, false = J2
        boolean turno = true;

        // Matriu Tablero
        char tablero[][] = new char[3][3];

        // Omplim les caselles buides
        rellenarMatriz(tablero, vacio);

        int fila, columna;
        boolean posValida, correcto;

        // No sortim fins que guanyi algu o ens quedem sense caselles
        while (!finPartida(tablero, vacio)) {

            do {

                // Mostrem torn
                mostrarTurnoActual(turno);

                // Mostrem tablero
                mostrarMatriz(tablero);

                correcto = false;
                fila = pedirInteger("Dame la fila (0-2)");
                columna = pedirInteger("Dame la columna (0-2)");

                // Validem posició
                posValida = validarPosicion(tablero, fila, columna);

                // Si és vàlid, comprobem que no estigui ocupada
                if (posValida) {

                    //Si no hi ha marca, significa que es correcte
                    if (!hayValorPosicion(tablero, fila, columna, vacio)) {
                        correcto = true;
                    } else {
                        System.out.println("Ya hay una ficha en esa posicion");
                    }
                } else {
                    System.out.println("La posicion no es válida");
                }

                // Mentre no sigui correcte no sortim d'aquest bucle
            } while (!correcto);

            // Depenent del torn, insertem X/O
            if (turno) {
                insertarEn(tablero, fila, columna, J1);
            } else {
                insertarEn(tablero, fila, columna, J2);
            }

            // Cambiem torn
            turno = !turno;
        }

        // Mostra tablero
        mostrarMatriz(tablero);

        // Mostrem el guanyador
        mostrarGanador(tablero, J1, J2, vacio);

    }

    // Funció mostrar el guanyador
    public static void mostrarGanador(char[][] matriz, char J1, char J2, char simDef) {

        char simbolo = coincidenciaLinea(matriz, simDef);

        if (simbolo != simDef) {

            ganador(simbolo, J1, J2, 1);

            return;

        }

        simbolo = coincidenciaColumna(matriz, simDef);

        if (simbolo != simDef) {

            ganador(simbolo, J1, J2, 2);

            return;

        }

        simbolo = coincidenciaDiagonal(matriz, simDef);

        if (simbolo != simDef) {

            ganador(simbolo, J1, J2, 3);

            return;

        }

        System.out.println("Hay empate");

    }

    // Funció auxiliar anterior
    public static void ganador(char simbolo, char J1, char J2, int tipo) {

        switch (tipo) {
            case 1:
                if (simbolo == J1) {
                    System.out.println("Ha ganado el Jugador 1 por linea");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por linea");
                }

                break;
            case 2:
                if (simbolo == J1) {
                    System.out.println("Ha ganado el Jugador 1 por columna");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por columna");
                }
                break;
            case 3:
                if (simbolo == J1) {
                    System.out.println("Ha ganado el Jugador 1 por diagonal");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por diagonal");
                }
                break;
        }

    }

    // Insertamos en una posicion de la matriz un símbolo en concreto
    public static void insertarEn(char[][] matriz, int fila, int columna, char simbolo) {
        matriz[fila][columna] = simbolo;
    }

    // Imprimimos el turno actual
    public static void mostrarTurnoActual(boolean turno) {

        if (turno) {
            System.out.println("Le toca al jugador 1");
        } else {
            System.out.println("Le toca al jugador 2");
        }

    }

    // Pedimos un numero aleatorio
    public static int pedirInteger(String mensaje) {

        System.out.println(mensaje);
        int numero = scan.nextInt();

        return numero;

    }

    // Rellenamos la matriz con un simbolo
    public static void rellenarMatriz(char[][] matriz, char simbolo) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = simbolo;
            }
        }

    }

    // Validamos la posicion en la que insertamos
    public static boolean validarPosicion(char[][] tablero, int fila, int columna) {

        if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero.length) {
            return true;
        }
        return false;

    }

    // Indiquem si a una posició hi ha una marca
    public static boolean hayValorPosicion(char[][] matriz, int fila, int columna, char simboloDef) {
        if (matriz[fila][columna] != simboloDef) {
            return true;
        }

        return false;
    }

    // Mostra la matriu
    public static void mostrarMatriz(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    // Indica si la matriu esta plena si hi ha el simbol per defecte
    public static boolean matrizLlena(char[][] matriz, char simboloDef) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == simboloDef) {
                    return false;
                }
            }
        }

        return true;

    }

    // La partida acaba quan la matriu esta plena o si hi ha algun guanyador
    public static boolean finPartida(char[][] matriz, char simboloDef) {

        if (matrizLlena(matriz, simboloDef)
                || coincidenciaLinea(matriz, simboloDef) != simboloDef
                || coincidenciaColumna(matriz, simboloDef) != simboloDef
                || coincidenciaDiagonal(matriz, simboloDef) != simboloDef) {
            return true;
        }

        return false;
    }

    // Indica si hi ha un guanyador a una línea
    public static char coincidenciaLinea(char[][] matriz, char simboloDef) {

        char simbolo;
        boolean coincidencia;

        for (int i = 0; i < matriz.length; i++) {

            // Reiniciem la coincidencia
            coincidencia = true;
            // Agafem el simbol de la fila
            simbolo = matriz[i][0];
            if (simbolo != simboloDef) {
                for (int j = 1; j < matriz[0].length; j++) {
                    // Si no coincideix ja no hi haura guanyador a aquesta fila
                    if (simbolo != matriz[i][j]) {
                        coincidencia = false;
                    }
                }

                // Si no entra al if retorna el símbol guanyador
                if (coincidencia) {
                    return simbolo;
                }

            }

        }

        // Si no hi ha guanyador retornem el símbol per defecte
        return simboloDef;

    }

    public static char coincidenciaColumna(char[][] matriz, char simboloDef) {

        char simbolo;
        boolean coincidencia;

        for (int j = 0; j < matriz.length; j++) {

            // Reiniciem la coincidencia
            coincidencia = true;
            // Agafem el símbol de la columna
            simbolo = matriz[0][j];
            if (simbolo != simboloDef) {
                for (int i = 1; i < matriz[0].length; i++) {
                    // Si no coincideix ja no hi haura guanyador a aquesta fila
                    if (simbolo != matriz[i][j]) {
                        coincidencia = false;
                    }
                }

                // Si no entra al if retorna el símbol guanyador
                if (coincidencia) {
                    return simbolo;
                }

            }

        }

        // Si no hi ha guanyador retornem el símbol per defecte
        return simboloDef;

    }

    public static char coincidenciaDiagonal(char[][] matriz, char simboloDef) {

        char simbolo;
        boolean coincidencia = true;

        // Diagonal principal
        simbolo = matriz[0][0];
        if (simbolo != simboloDef) {
            for (int i = 1; i < matriz.length; i++) {
                // Si no coincideix no hi han guanyadors a la diagonal
                if (simbolo != matriz[i][i]) {
                    coincidencia = false;
                }
            }

            // Si no entra al if retorna el símbol guanyador
            if (coincidencia) {
                return simbolo;
            }

        }

        // Diagonal inversa
        simbolo = matriz[0][2];
        if (simbolo != simboloDef) {
            for (int i = 1, j = 1; i < matriz.length; i++, j--) {
                // Si no coincideix no hi han guanyadors a la diagonal
                if (simbolo != matriz[i][j]) {
                    coincidencia = false;
                }
            }

            // Si no entra al if retorna el símbol guanyador
            if (coincidencia) {
                return simbolo;
            }
        }

        // Si no hi ha guanyador retorna el símbol per defecte
        return simboloDef;

    }

}
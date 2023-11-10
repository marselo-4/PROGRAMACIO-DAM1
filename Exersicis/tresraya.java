package Exersicis;

import java.util.Scanner;

public class tresraya {
	private final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[][] tablero = new String[3][3];
		startingGame(tablero);
	}

	private static String[] askName() {
		System.out.println("Starting game...\n");
		System.out.println("Bienvenido al juego de tres en raya !\n");
		System.out.print("Introduce el nombre del primer jugador:");
		String jugador1 = sc.next();
		System.out.print("Introduce el nombre del segundo jugador:");
		String jugador2 = sc.next();
		System.out.println("Que jugador quiere empezar 1-2 ?");
		int starts = sc.nextInt();
		System.out.println();
		while (starts != 1 && starts != 2) {
			System.out.println("Que jugador quiere empezar 1-2 ?");
			starts = sc.nextInt();
			System.out.println();
		}
		return starts == 1 ? new String[] { jugador1, jugador2 } : new String[] { jugador2, jugador1 };
	}

	private static void startingGame(String[][] tablero) {
		boolean win = false;
		int countmovements = 0;
		String[] j = askName(); // j[0] = player1 j[1] = player2
		String ficha = askForXO(j); // Pregunto con que quiere jugar ('x' o 'o')
		while (ficha != "x" && ficha != "o") {
			ficha = askForXO(j);
		}
		showtablero(tablero); // Muestro el tablero
		while (!win && countmovements != 9) {
			int[] movements = askMovement(); // Pregunto el movimiento
			boolean checkMovement = checkMovement(movements[0], movements[1], tablero, ficha);// Compruebo el movimiento
			while (!checkMovement) {
				movements = askMovement();
				checkMovement = checkMovement(movements[0], movements[1], tablero, ficha);
			}
			tablero[movements[0]][movements[1]] = ficha; // Realiza el movimiento
			updatedMatrix(tablero); // Muestro el movimiento en la matriz
			countmovements++;
			win = checkWinners(tablero, ficha);
			if (!win && countmovements != 9) {// Si alguien a ganado no cambia la ficha
				ficha = changeXO(ficha); // Cambia la ficha
			}
		}
		results(win, ficha, countmovements, j);
	}

	public static void showtablero(String[][] tablero) {
		System.out.println("\nEste es el tablero:\n");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = "-";
				if (j == 0 || j == tablero.length - 1) {
					if (j == 0) {
						System.out.print("| " + tablero[i][j]);
					}
					if (j == tablero.length - 1) {
						System.out.print(tablero[i][j] + " |");
					}
				} else {
					System.out.print(" " + tablero[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	private static String askForXO(String[] j) {
		String ficha;
		System.out.print(j[0] + " quieres jugar con 'x' o con 'o':");
		ficha = sc.next();
		switch (ficha) {
		case "x":
			ficha = "x";
			break;
		case "o":
			ficha = "o";
			break;
		default:
			System.out.println("\nERROR :Caracter no reoconocido ");
		}
		return ficha;
	}

	private static String changeXO(String ficha) {
		switch (ficha) {
		case "x":
			System.out.println("Ahora le toca a la 'o'");
			ficha = "o";
			break;
		case "o":
			System.out.println("Ahora le toca a la 'x'");
			ficha = "x";
			break;
		}
		return ficha;
	}

	private static boolean checkMovement(int f1, int c1, String[][] tablero, String ficha) {
		if (f1 >= 0 && f1 < 3 && c1 >= 0 && c1 < 3) {
			if (tablero[f1][c1] == "x" || tablero[f1][c1] == "o") {
				System.out.println("\nLa casilla esta ocupada. Prueba con una que no lo este!\n");
				return false;
			}

			return true;
		}
		System.out.println("\nFuera de los valores 0-2\n");
		return false;
	}

	private static int[] askMovement() {
		int f1, c1;
		System.out.print("Introduce la fila:");
		f1 = sc.nextInt();
		System.out.println();
		System.out.print("Introduce la columna:");
		c1 = sc.nextInt();
		System.out.println();
		return new int[] { f1, c1 };
	}

	public static boolean checkWinners(String[][] tablero, String x) {
		// Comprueba diagonal a la derecha
		if (tablero[0][0].equals(x) && tablero[1][1].equals(x) && tablero[2][2].equals(x))
			return true;
		// Comprueba diagonal a la izquierda
		if (tablero[0][2].equals(x) && tablero[1][1].equals(x) && tablero[2][0].equals(x))
			return true;

		// Comprueba filas y columnas
		for (int i = 0; i < 3; i++) {// Comprueba filas
			if (tablero[i][0].equals(x) && tablero[i][1].equals(x) && tablero[i][2].equals(x))
				return true;
			// Comprueba columnas
			if (tablero[0][i].equals(x) && tablero[1][i].equals(x) && tablero[2][i].equals(x))
				return true;
		}
		return false;
	}

	private static void updatedMatrix(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (j == 0) {
					System.out.print("| " + tablero[i][j]);
				} else if (j == tablero.length - 1) {
					System.out.print(tablero[i][j] + " |");
				} else {
					System.out.print(" " + tablero[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	private static void results(boolean win, String ficha, int countmovements, String[] j) {
		if (win && countmovements % 2 == 0) {
			System.out.println("\nHa ganado " + j[0]);
		} else if (win && countmovements % 2 != 0) {
			System.out.println("\nHa ganado " + j[1]);
		} else if (!win && countmovements == 9) {
			System.out.println("\nEl resultado es empate");
		}
	}
}


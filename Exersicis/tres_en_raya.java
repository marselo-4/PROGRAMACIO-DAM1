package Exersicis;
import java.util.Scanner;

public class tres_en_raya {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nIntroduce el nombre del jugador 1: ");
		String J1 = scan.nextLine();
		boolean finjuego = false;
		int[][] tablero = new int[3][3];
		System.out.println("Debes introducir las posiciones de la siguiente manera. Ejemplo -> [0][1]");
		
		while(finjuego = false) {
			System.out.println("Introduce la primera posición "+ J1 +":");
			String eleccion1 = scan.nextLine();
			if (eleccion1 == "[0][0]"){
			tablero[0][0] = 1;
		}
			
		}
		
		
		String eleccion2;
		

		 tablero[0][0] = 1;
		 tablero[0][1] = 2;
		 tablero[0][2] = 3;
		 tablero[1][0] = 4;
		 tablero[1][1] = 5;
		 tablero[1][2] = 6;
		 tablero[2][0] = 7;
		 tablero[2][1] = 8;
		 tablero[2][2] = 9;
		
		
		/* OUTPUT
		 * [][][]
		 * [][][]
		 * [][][]
		 * 
		 */
	}
}

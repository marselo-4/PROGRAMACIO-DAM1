package Exersicis;
import java.util.Scanner;

public class matrius15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	       int[][] array = new int[8][8];

	        System.out.println("Introdueix els valors de l'array:");
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                array[i][j] = scan.nextInt();
	            }
	        }

	        boolean esSimetrica = true;
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                if (array[i][j] != array[j][i]) {
	                    esSimetrica = false;
	                    break;
	                }
	            }
	        }

	        if (esSimetrica) {
	            System.out.println("L'array es simètrica.");
	        } else {
	            System.out.println("L'array no es simètrica.");
	        }
	        scan.close();
	    }
}

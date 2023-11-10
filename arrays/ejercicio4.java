package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner scan_p = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);
		String bucle = "S";

		System.out.println("Bienvenido a el programa!!!");
		while ((bucle.equals("S")) || (bucle.equals("s"))) {

			System.out.println("Introduceme el tamaño del array");
			double[] arrays = new double[scan_n.nextInt()];
			
			System.out.println("El multiplo que quieras guardar");
			double multiplo = scan_n.nextInt();
			for (int i = 0; i < arrays.length; i++) {
				arrays[i] = multiplo*(i+1);
				System.out.println("" + arrays[i]);
			}

			System.out.println("Deseas repetir esta aplicacion? S o deseas salir N/exit");
			bucle = scan_p.nextLine();
		}

		System.out.println("Finalizando programa");
	}
}

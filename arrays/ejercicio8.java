package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner scan_p = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);
		String bucle = "S";

		System.out.println("Bienvenido a el programa!!!");
		while ((bucle.equals("S")) || (bucle.equals("s"))) {

			System.out.println("Introduceme el tamaño del array");
			double[] arrays = new double[scan_n.nextInt()];
			
			System.out.println("Introduceme el contenido que quieras poner ");
			for (int i = 0; i < arrays.length; i++) {
				arrays[i] = scan_n.nextDouble();
				
			}
		
			for(int i = 0; i<arrays.length ;i++) {
				if(arrays[i] % 2 == 0) {
					System.out.println("La posicion: " + (i+1) + " con el contenido : " + arrays[i] + " es un numero par");
				}
			}
			
			System.out.println("Deseas repetir esta aplicacion? S o deseas salir N/exit");
			bucle = scan_p.nextLine();
		}

		System.out.println("Finalizando programa");
	}
}
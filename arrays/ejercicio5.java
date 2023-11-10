package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicio5 {
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
			System.out.println("Introduceme el numero que quieras buscar");
			double buscar = scan_n.nextDouble();
			
			int contador = 0;
			for(int i = 0; i<arrays.length ;i++) {
				if(arrays[i] == buscar) {
					System.out.println("En la posicion:"+(i+1)+" se encuentra un numero");
					contador++;
				}
			}
			System.out.println("El total de veces que ese numero se repite es:"+contador);
			System.out.println("Deseas repetir esta aplicacion? S o deseas salir N/exit");
			bucle = scan_p.nextLine();
		}

		System.out.println("Finalizando programa");
	}
}

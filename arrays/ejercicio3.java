package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scan_p = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);
		String bucle = "S";
		
		System.out.println("Bienvenido a el programa!!!");
		while ((bucle.equals("S")) || (bucle.equals("s"))) {		
			
			double total= 0;
			double [] arrays = new double[10];
			System.out.println("Introduceme los numeros que quieres que contenga el array.");
			for(int i = 0;i<arrays.length;i++) {
				arrays[i] = scan_n.nextInt();
				total = total + arrays[i];
			}
			
			System.out.println(total/10);
		
			System.out.println("Deseas repetir esta aplicacion? S o deseas salir N/exit");
			bucle = scan_p.nextLine();
	}

			System.out.println("Finalizando programa");	
	}
}

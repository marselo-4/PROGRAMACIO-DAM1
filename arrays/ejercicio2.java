package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner scan_p = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);
		String bucle = "S";
		
		System.out.println("Bienvenido a el programa!!!");
		while ((bucle.equals("S")) || (bucle.equals("s"))) {		
			
			int [] arrays = new int[5];
			System.out.println("Introduceme los numeros que quieres que contenga el array.");
			for(int i = 0;i<arrays.length;i++) {
				arrays[i] = scan_n.nextInt();
			}
			for(int i = 0;i<Array.getLength(arrays) ;i++) {
				System.out.println("La posicion:" + i + " Tiene como contenido:"+arrays[i]);
			}
		
			System.out.println("Deseas repetir esta aplicacion? S o deseas salir N/exit");
			bucle = scan_p.nextLine();
	}

			System.out.println("Finalizando programa");	
	}
}

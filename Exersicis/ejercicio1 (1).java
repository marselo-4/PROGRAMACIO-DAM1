package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner scan_p = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);
		String bucle = "S";
		
		System.out.println("Bienvenido a el programa!!!");
		while ((bucle.equals("S")) || (bucle.equals("s"))) {		
			
			int[]arrays = {1,2,3,4,5};
			
			for(int i = 0;i<Array.getLength(arrays) ;i++) {
				System.out.println(arrays[i]);
			}
		
			System.out.println("Deseas repetir esta aplicacion? S o deseas salir N/exit");
			bucle = scan_p.nextLine();
	}

			System.out.println("Finalizando programa");	
	}
}

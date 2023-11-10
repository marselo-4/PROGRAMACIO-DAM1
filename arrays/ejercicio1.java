package arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner scan_p = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);
		String bucle = "S";
		int[] numeros = new int[100];
		Random rand = new Random();
		
		System.out.println("Bienvenido a el programa!!!");
		while ((bucle.equals("S")) || (bucle.equals("s"))) {			 
		
			 
			 
			 for(int i = 0;i<100;i++) {
				 numeros[i] = rand.nextInt(100);
			 }
			 System.out.println("Introduceme el numero que tu quieras:");
			 int introducido = scan_n.nextInt();
			 int contador = 0;
			 for(int i = 0;i<100;i++) {
				 if(introducido == numeros[i]) {
					 contador++;
				 }
			 }
			System.out.println(contador);
			System.out.println("Deseas repetir esta aplicacion? S o deseas salir N/exit");
			bucle = scan_p.nextLine();
	}
		
			System.out.println("Finalizando programa");	
	}
}

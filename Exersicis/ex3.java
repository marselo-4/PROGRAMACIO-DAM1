package Exersicis;
import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime una frase: ");
		String frase = scan.nextLine();
		int palabras = contador_palabras(frase);
		System.out.println("Contiene "+ palabras + " palabras");
	}
	
	public static int contador_palabras(String frase) {
		if (frase == null || frase.isEmpty()) {
			return 0;
		}
		
		String[] contador = frase.split("\\s+");
		return contador.length;
	}
}

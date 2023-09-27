package Exersicis;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan_1 = new Scanner(System.in);
		Scanner scan_2 = new Scanner(System.in);
		/*
		 * Parte 1
		 * Realiza un programa donde se le pida al usuario una palabra por consola, 
		 * comprobad su longitud, si la palabra es menor a 10 caracteres indicaremos al usuario que la palabra es valida,
		 * en cualquier otro caso le indicaremos que la palabra no es valida.
		 */	
		System.out.println("Parte 1");
		System.out.println("Dime una palabra: ");
		String palabra = scan_1.nextLine();
		int longitud = palabra.length();
		if (longitud <= 10) {
			System.out.println("La palabra es válida");
		}else {
			System.out.println("La palabra no es válida");
		}
		
		/*
		 * Parte 2
		 * Realiza un programa donde se le pida al usuario una palabra por consola, 
		 * supondremos que nos escribirá siempre una palabra completamente en MAYÚSCULAS o en minúsculas, 
		 * comprueba si la palabra esta en mayúscula o en minúscula, si esta en mayúscula transforma la palabra en minúscula, 
		 * si esta en minúscula transforma la palabra en mayúscula.
		 */
		System.out.println("Parte 2");	
		System.out.println("Dime una palabra: ");
		String palabra2 = scan_1.nextLine();
		if (palabra2.equals(palabra2.toLowerCase())) {
			System.out.println(palabra2.toUpperCase());
		}else {
			System.out.println(palabra2.toLowerCase());
		}
		/*
		 * Parte 3
		 * Realiza un programa donde se le pida al usuario una palabra por consola,
		 * comprobaremos si esta palabra contiene una 'a', si la contiene imprimiremos la palabra del usuario en mayúscula.
		 * En caso contrario si contiene una 'e' mostrar cual es la primera letra de la palabra del usuario.
		 */
		System.out.println("Parte 3");
		System.out.println("Dime una palabra: ");
		String palabra3 = scan_1.nextLine();
		if (palabra3.contains("a") || palabra3.contains("A")) {
			System.out.println(palabra3.toUpperCase());
		}else if (palabra3.contains("e") || palabra3.contains("E")) {
			System.out.println(palabra3.charAt(0));
		}
		
		scan_1.close();
		scan_2.close();
	}
}

package Examen;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// Abrimos un scanner

		System.out.println("Dime una palabra: "); //Pedimos una palabra al usuario
		String palabra2 = scan.nextLine(); //Recogemos la palabra en un string
		if (palabra2.equals(palabra2.toLowerCase())) { //Si la palabra equivale a la misma palabra convertida a minúscula significa que la palabra está en minúscula
			System.out.println(palabra2.toUpperCase()); //Al ser minúscula convertimos la palabra a mayúscula
		}else {
			System.out.println(palabra2.toLowerCase()); //Como no cumple el condicional del if interpretamos que es una frase en mayúscula por lo cual lo convertimos a minúscula
		}
		
		scan.close();// Cerramos scanner (No es necesario pero me da toc ver el warning :))
	}
}

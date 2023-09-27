package Practiques;

//Para importar funciones de las librerias de Java
import java.util.Scanner;

public class clase2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * Scanner test = new Scanner(System.in);
		 * 
		 * System.out.print("Dime tu nombre: "); String frase = test.nextLine();
		 * System.out.print("Cual es tu numero favorito: "); int num = test.nextInt();
		 * 
		 * System.out.println("Tu nombre es " + frase);
		 * System.out.println("Tu numero favorito es " + num);
		 */
		Scanner calculadora = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);
		
		/*
		 * Per fer bucles hem de posar el codi dins de while
		 * En aquest cas l'hi assignem el valor "S" abans de començar perque executi el while
		 * Al arribar al final del while tornem a fer la pregunta de si vol seguir o parar
		 * Sempre que la variable segueixi tenint el valor "S", seguira executant-se
		*/
		String eleccion = "S";
		while (eleccion.equals("S")) {
			System.out.println("Bienvenido a la Calculadora, que quieres hacer?");
			System.out.println("1 = Sumar");
			System.out.println("2 = Restar");
			System.out.println("3 = Multiplicar");
			System.out.println("4 = Dividir");

			int operacion = calculadora.nextInt();
			if ((operacion != 1) && (operacion != 2) && (operacion != 3) && (operacion != 4)) {
				System.out.println("El valor que es introducido es incorrecto.");
				System.exit(0);
			}
			System.out.print("Dime un numero: ");

			int num1 = calculadora.nextInt();

			System.out.print("Dime otro numero: ");

			int num2 = calculadora.nextInt();

			// int resultado = (num1+num2);
			int suma = (num1 + num2);
			int resta = (num1 - num2);
			int mult = (num1 * num2);
			int div = (num1 / num2);

			if (operacion == 1) {
				System.out.println("La suma de " + num1 + " + " + num2 + " es " + suma);
				if (suma >= 100) {
					System.out.println("El resultado es mayor que 100!");
				} else {
					System.out.println("El resultado es menor que 100");
				}
			}
			if (operacion == 2) {
				System.out.println("La resta de " + num1 + " - " + num2 + " es " + resta);
				if (resta >= 100) {
					System.out.println("El resultado es mayor que 100!");
				} else {
					System.out.println("El resultado es menor que 100");
				}
			}
			if (operacion == 3) {
				System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es " + mult);
				if (mult >= 100) {
					System.out.println("El resultado es mayor que 100!");
				} else {
					System.out.println("El resultado es menor que 100");
				}
			}
			if (operacion == 4) {
				System.out.println("La division de " + num1 + " / " + num2 + " es " + div);
				if (div >= 100) {
					System.out.println("El resultado es mayor que 100!");
				} else {
					System.out.println("El resultado es menor que 100");
				}
			}else {
				System.out.println("El valor introducido no es válido");
				
			}

			//////////////////
			//////////////////
			///// NO FUNCA/////
			//////////////////
			//////////////////

			System.out.println();
			System.out.println("Quieres realizar otra operación? ");
			System.out.println("S / N");
			eleccion = strings.nextLine();

			//
			//
			//
		}

	}

}
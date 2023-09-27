package Exersicis;
import java.util.Scanner;

public class Calculadora {
	public static void main (String[]args) {
		Scanner scan_s = new Scanner(System.in);
		Scanner scan_i = new Scanner(System.in);
		String bucle = "S";
		while (bucle.equals("S")){
			int resultado = 0;
			System.out.println("Dime los dos numeros que quieres calcular: ");
			System.out.print("Numero 1: ");
			int num_1 = scan_i.nextInt();
			System.out.print("Numero 2: ");
			int num_2 = scan_i.nextInt();
			System.out.println("Que quieres hacer? (+ - * /)");
			String op = scan_s.nextLine();
			
			if(op.equals("+")) {
				resultado = num_1 + num_2;
				System.out.println("El resultado es: "+resultado);
			}else if(op.equals("-")) {
				resultado = num_1 - num_2;
				System.out.println("El resultado es: "+resultado);
			}else if(op.equals("*")) {
				resultado = num_1 * num_2;
				System.out.println("El resultado es: "+resultado);
			}else if(op.equals("/")) {
				resultado = num_1 / num_2;
				System.out.println("El resultado es: "+resultado);
			}
			
			System.out.println("Quieres realizar otra operación? ( S/N )");
			bucle = scan_s.nextLine();
		}
			
		scan_s.close();
		scan_i.close();
	}
	
}

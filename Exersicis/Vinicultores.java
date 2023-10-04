package Exersicis;
import java.util.Scanner;

public class Vinicultores {

	public static void main(String[] args) {
	
		//Declarem els ints
		String tipo = "";
		int tam = 0;
		double precio = 0;
		double total = 0;
		
		//Preguntem al client
		Scanner scan = new Scanner(System.in);
		System.out.println("De que tipo es la uva? [ A / B ]");
		tipo = scan.nextLine();
		System.out.println("De que tamaño es la uva? [ 1 / 2 ]");
		tam = scan.nextInt();
		
		if(tipo.equals("A") || tipo.equals("a")) {
			if(tam == 1) {
				System.out.println("El precio de la uva es de 20 céntimos/kg");
				precio = 0.2;
			}else if(tam == 2) {
				System.out.println("El precio de la uva es de 30 céntimos/kg");
				precio = 0.3;
			}else {
				System.out.println("Error");
			}
		}
		if(tipo.equals("B") || tipo.equals("b")) {
			if(tam == 1) {
				System.out.println("El precio de la uva es de 30 céntimos/kg");
				precio = 0.3;
			}else if(tam == 2) {
				System.out.println("El precio de la uva es de 50 céntimos/kg");
				precio = 0.5;
			}else {
				System.out.println("Error");
			}
		}
		System.out.println("Cuantos kg necesitas? ");
		total = scan.nextDouble();
		System.out.println("El precio total es de "+total+"€");
		scan.close();
	}
	
}

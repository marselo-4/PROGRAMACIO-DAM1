package Practiques;
import java.util.Scanner;

public class clase3 {

	public static void main (String[] args) {
		Scanner scan_i = new Scanner(System.in);
		Scanner scan_s = new Scanner(System.in);
		
		/*System.out.println("Dime tu nombre: ");
		String nombre = scan_i.nextLine();
		
		System.out.println("Dime tu edad: ");
		int edad = scan_s.nextInt();
		
		System.out.println("Tu nombre es "+nombre+" Y tienes "+edad+" años.");
		
		
		
		if (edad >= 18) {
			boolean mayor_edad = true;
			System.out.println("Eres mayor de edad!");
		}else {
			boolean mayor_edad = false;
			System.out.println("Eres menor de edad.");
		}*/
		String bucle = "S";
		
		while (bucle.equals("S")) {
			System.out.println("Dime un nombre: ");
			String nombre_1 = scan_s.nextLine();
			System.out.println("Dime otro nombre: ");
			String nombre_2 = scan_s.nextLine();
		
			if (nombre_1.equals(nombre_2)){
				System.out.println("Los dos nombres son iguales");
			}else {
				System.out.println("Los nombres no son iguales");
			}
			System.out.println("Quieres volver a empezar?");
			System.out.println(" S / N ");
			bucle = scan_s.nextLine();
		}
		
		
		scan_i.close();
		scan_s.close();
	}
	
	
}
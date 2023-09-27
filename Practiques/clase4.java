package Practiques;
import java.util.Scanner;

public class clase4 {
	
	public static void main (String[] args) {
		Scanner scan_s = new Scanner(System.in);
	Scanner scan_i = new Scanner(System.in);
	
	System.out.println("Bienvenido al programa de temperatura. ");

	String bucle = "S";
	while (bucle.equals("S")){
		System.out.println("Indicanos la temperatura actual");
		Double temperatura = scan_i.nextDouble();

		if (temperatura <= 10){
			System.out.println("Hace frio");
		}else if ((10 < temperatura) && (temperatura <= 20)){
			System.out.println("El día está nublado");
		}else if ((20 < temperatura) && (temperatura <= 30)){
			System.out.println("Parece un día caluroso");
		}else if (temperatura > 30) {
			System.out.println("Clima Tropical");
		}

		System.out.println("Quieres volver a empezar? ");
		System.out.println(" S / N ");
		bucle = scan_s.nextLine();
	}
	scan_s.close();
	scan_i.close();
	}
	
}
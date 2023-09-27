package Exersicis;
import java.util.Scanner;

public class Timofonica {

	public static void main (String[] args) throws InterruptedException{
		Scanner scan_s = new Scanner(System.in);
		Scanner scan_i = new Scanner(System.in);
		
		System.out.println("Bienvenidos a la calculadora de costes por llamada de Timofónica! ");
		Thread.sleep(1000);
		System.out.println("A continuación les pediremos varios datos para poder darles el coste total de su llamada. ");
		Thread.sleep(1000);
		String bucle = "S";
				
		while (bucle.equals("S")) {
			System.out.println("Cual ha sido la duración de su llamada? (Indica tu respuesta en minutos) ");
			
			double duracion = scan_s.nextDouble();
			System.out.println();
			
			if (duracion <= 5) {
				double precio = (duracion * 1) + (duracion * 0.05);
				System.out.println("El precio de tu llamada es de "+precio+"€");
			}else if ((duracion >= 5) && (duracion <= 8)) {
				double precio = 5+((duracion-5)*0.8) + (duracion * 0.05);
				System.out.println("El precio de tu llamada es de "+precio+"€");
			}else if ((duracion >= 8) && (duracion <= 10)) {
				double precio = 7.4+((duracion-8)*0.7) + (duracion * 0.05);
				System.out.println("El precio de tu llamada es de "+precio+"€");
			}else if (duracion >= 10) {
				double precio = 8.8+((duracion-10)*0.5) + (duracion * 0.05);
				System.out.println("El precio de tu llamada es de "+precio+"€");
			}
			
			System.out.println();
			System.out.println("Quieres calcular otra llamada? (S / N)");
			bucle = scan_i.nextLine();
		}
		
		scan_s.close();
		scan_i.close();
	}
}
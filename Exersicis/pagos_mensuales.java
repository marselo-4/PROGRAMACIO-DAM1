package Exersicis;
import java.util.Scanner;
public class pagos_mensuales {

	public static void main(String[] args) {
		Scanner scan_1 = new Scanner(System.in); 
		Scanner scan_2 = new Scanner(System.in);
		int total = 0;
		int deuda = 10;
		int vueltas = 0;
		String bucle = "S";
		while(bucle.equals("S")) {
			System.out.println("Indica en cuantos meses quieres pagar");
			int totalvueltas = scan_1.nextInt();
			System.out.println("Es el mes 1 y tienes que pagar 10€");
			for(vueltas = 1; vueltas < totalvueltas; vueltas++) {
				total = deuda*2;
				deuda = total;
				
				System.out.println();
				System.out.println("Es el mes "+(vueltas+1)+" y tienes que pagar "+ deuda+"€");
			}
			System.out.println("El precio total a pagar es de "+deuda+"€");
			System.out.println();
			System.out.print("Quieres realizar otro cálculo? [ S / N ]");
			bucle = scan_2.nextLine();
		}
		scan_1.close();
		scan_2.close();
	}
}

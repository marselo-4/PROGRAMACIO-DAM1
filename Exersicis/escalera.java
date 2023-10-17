package Exersicis;
import java.util.Scanner;

public class escalera {
	public static void main(String[] args) {
		Scanner scan_1 = new Scanner(System.in);
		
		
		//hecho con strings
		System.out.println("Cuantas escaleras quieres? ");
		int totalvueltas = scan_1.nextInt();
		int vueltas = 0;
		for(vueltas=0;vueltas<(totalvueltas+1);vueltas++) {
			String escalera = "123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789";
			String total = escalera.substring(0,vueltas);
			System.out.println(total);
			
		}
		
		//hecho con int
		System.out.println("Cuantas escaleras quieres? ");
		int escaleras = scan_1.nextInt();
        for (int vuelta = 5; vuelta <= escaleras; vuelta++) {
            for (int vuelta2 = 1; vuelta2 <= vuelta; vuelta2++) {
                System.out.print(vuelta2);
            }
            System.out.println();
         }
	}
}

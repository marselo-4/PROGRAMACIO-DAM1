package Exersicis;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan_1 = new Scanner(System.in);
		
		int vueltas = 0;
		int num1 = 0;
		int num2 = 1;
		
		int total = 0;
		System.out.println("Introduce cuantos pasos quieres dar: ");
		int totalvueltas = scan_1.nextInt();
		for(vueltas = 0; vueltas < totalvueltas; vueltas++) {
			total = num2+num1;
			num1 = num2;
			num2=total;
			System.out.println(num1);
			scan_1.close();
		}
		
		
	}
	
}

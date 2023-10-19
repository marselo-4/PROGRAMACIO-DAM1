package Exersicis;
import java.util.Scanner;
public class ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime dos palabras para comparar.");
		System.out.println("Palabra 1: ");
		String p1 = scan.next();
		System.out.println("Palabra 2: ");
		String p2 = scan.next();
		
		if(p1.equals(p2)) {System.out.println("Las palabras son iguales");}else {System.out.println("Las palabras no son iguales");}
		
	}

}

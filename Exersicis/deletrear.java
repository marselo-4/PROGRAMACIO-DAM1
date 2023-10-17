package Exersicis;
import java.util.Scanner;
public class deletrear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una palabra para deletrear: ");
		String palabra = scan.nextLine();
		System.out.println(palabra);
		System.out.println();
		for(int i = 0; i<=palabra.length(); i++) {
			System.out.println(palabra.substring(i, i+1));
		}
		scan.close();
	}
}

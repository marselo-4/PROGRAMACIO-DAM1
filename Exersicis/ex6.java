package Exersicis;
import java.util.Scanner;
public class ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime una frase: ");
		String frase = scan.nextLine();
		String frase2 = frase.replace(" ", "");
		System.out.println(frase2);
	}
}

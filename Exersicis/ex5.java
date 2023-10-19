package Exersicis;
import java.util.Scanner;
public class ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = scan.next();
		String frase2 = frase.replace("a", "e");
		frase2 = frase.replace("A", "E");
		System.out.println(frase2);
	}
}

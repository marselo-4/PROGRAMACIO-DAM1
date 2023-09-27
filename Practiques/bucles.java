package Practiques;
import java.util.Scanner;

public class bucles {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
//		for(numero a declarar; condicion; funcion a ejecutar;) {
//			codigo a repetir
//		}
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		scan.close();
	}
}

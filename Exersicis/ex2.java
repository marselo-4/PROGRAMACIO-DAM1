package Exersicis;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan_i = new Scanner(System.in);
		System.out.print("Cuantas palabras quieres concadenar? ");
		int e = scan.nextInt();
		System.out.println();
		String p = "";
		for(int i = 0; i<e;i++) {
			System.out.println("Dime la palabra numero "+i);
			p = p + scan.nextLine() + " ";
		}
		
		System.out.println(p);
		scan.close();
		scan_i.close();
	}
}

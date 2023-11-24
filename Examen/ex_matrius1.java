package Examen;
import java.util.Scanner;
public class ex_matrius1 {

	public static void main(String[] args) {
		Scanner scan_n = new Scanner(System.in);
		Scanner scan_i = new Scanner(System.in);
		
		System.out.println("Cuantas palabras: ");
		String [] array = new String[scan_n.nextInt()];
		System.out.println("Dame palabras: ");
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].contains("u")) {
				System.out.println("La palabra "+array[i]+" es pentavocalica");
			}else {System.out.println("No lo es");}
		}
	}
}

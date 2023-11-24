package Examen;
import java.util.Iterator;
import java.util.Scanner;
public class ex_matrius4 {
	public static void main(String[] args) {
		String[] s = {"hola", "que", "patata", "macarena", "palomo"};
		int media = 0;
		int long_mayor = s[0].length();
		int long_menor = s[0].length();
		String mayor = "";
		String menor = "";
		
		for (int i = 0; i < s.length; i++) {
			media = media + s[i].length();
		}
		
		media = media / s.length;
		
		System.out.println("La media es"+ media);
		
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()> long_mayor) {
				long_mayor = s[i].length();
				mayor = s[i];
			
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()< long_menor) {
				long_menor = s[i].length();
				menor = s[i];
			
			}
		}
		System.out.println("la palabra más larga es " + mayor);
		System.out.println("La palabra más larga es " + menor);
	}
}

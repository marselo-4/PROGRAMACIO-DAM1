package Practiques;
import java.util.Scanner;
public class resolucio_escalera {

	public static void main(String[] args) {
		//Una manera de pedir un numero al usuario
		Scanner scan = new Scanner(System.in);
		int pasos = scan.nextInt();
		String s = "";
		//Una manera de imprimir tantos pasos como quiera el usuario
		for(int i = 0; i < pasos; i++) {
		//Una manera de actualizar el paso en el que estamos
		s = s + (i+1);
		//Una manera de saber en que peldaño estamos
		System.out.println(s);

		}
	}
	
}

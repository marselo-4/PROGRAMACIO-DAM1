package Practiques;
import java.util.Scanner;

public class resolucio_fibonacci {
//La secuencia de fibonacci es --> 0, 1, 1, 2, 3, 5, 8..	
	public static void main(String[] args) {
		//Una manera de poder guardar el numero siguiente, el actual y el anterior
		int siguiente = 0;
		int actual = 1;
		int anterior = 0;
	
		//Una manera de recibir del usuario cuantos pasos quiere
		System.out.print("Cuantos pasos quieres dar en la secuencia de Fibonacci? ");
		Scanner scan = new Scanner(System.in);
		int pasos = scan.nextInt();
		
		//Una manera de repetir este codigo tantos pasos como me digan
		for(int i = 0; i < pasos; i++) {
		
		//Calcular el siguiente, que es el actual mas el anterior
		siguiente = actual + anterior;
		
		//Alguna manera de actualizar los valores, moviendo un paso a la derecha
		anterior = actual;
		actual = siguiente;
		
		//Imprimir cada resultado
		//System.out.println(siguiente);
		//System.out.println(actual);
		System.out.println("Anterior: "+anterior);
		}
		
		scan.close();
	}
	
}

package Examen;
import java.util.Scanner;
public class ex2 {
	public static void main (String []args) {
		
		Scanner scan = new Scanner(System.in);// Abrimos un scanner
		System.out.println("Dime un numero: "); // Pedimos un numero al usuario
		int numero = scan.nextInt(); // Lo guardamos en la variable numero

        for (int i = 1; i <= numero; i++) { // Hacemos que la variable i haga vueltas hasta llegar a el valor de numero. En cada vuelta calcularemos el factorial del valor de la variable i
            int factorial = 1; // Hacemos una variable con valor 1 para calcular el factorial ya que necesitaremos multiplicar por 1
            for (int a = 1; a <= i; a++) {// Utilitzamos este for para calcular el factorial del valor actual de i
                factorial *= a;// Multiplicamos 1 por cada numero anterior a el valor que tengamos en i.
            }
            System.out.println(i + " = " + factorial); // Imprimimos en cada vuelta el valor del factorial
        }
		
		
		
		scan.close();// Cerramos scanner (No es necesario pero me da toc ver el warning :))
	}
}

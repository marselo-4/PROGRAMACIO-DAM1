package Examen;
import java.util.Scanner;

public class ex3 {
	public static void main (String []args) {

        Scanner scan = new Scanner(System.in); // Abrimos un scanner
        
        System.out.println("Dime una palabra"); // Pedimos una palabra al usuario
        String palabra = scan.nextLine(); // Guardamos el usuario en un string
        
        char char1 = palabra.charAt(0); // Guardamos el primer carácter de "palabra" en una variable
        
        if (vocal(char1)) { // Creamos una función que veremos más abajo para saber si "char1" es vocal
            if (palabra.length() > 10) { // Comprobamos que aparte de ser vocal tenga una longitud superior a 10
                System.out.println(palabra.toUpperCase()); // En caso de serlo la convertimos en mayúscula
            }else {System.out.println("La palabra tiene una longitud menor a 10");} // Si no lo es mostramos este print
        } else if (consonante(char1)) { // Creamos una función llamada consonante que se basa en no ser vocal, si no lo es realizamos la siguiente tarea
            System.out.println("La palabra tiene "+palabra.length()+" carácteres"); // Imprimimos los carácteres/longitud de nuestra palabra
        } else {
            System.out.println("Error"); // Creamos este else por si hubiese algun problema en el código
        }

        scan.close(); // Cerramos scanner (No es necesario pero me da toc ver el warning :))
	}
    public static boolean vocal(char i) { // Creamos una función para comprovar si es vocal
        return "AEIOUaeiou".indexOf(i) != -1; // Coge un carácter y comprueba si es vocal. Devuelve true en caso de ser vocal, en caso contrario false
    }

    public static boolean consonante(char i) { // Creamos una función para comprovar si es consonante
        return Character.isLetter(i) && !vocal(i); // Usamos el atributo isLetter para comprobar que sea una letra y en caso de que lo sea pasa a un comparativo que comprueba que no sea una vocal
    }
}

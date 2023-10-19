package Exersicis;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scan.nextLine();

        int numVocales = contarVocales(frase);
        int numConsonantes = contarConsonantes(frase);

        System.out.println("Esta frase contiene " + numConsonantes + " consonantes y " + numVocales + " vocales.");
    }

    public static int contarVocales(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < frase.length(); i++) {
            if (vocales.indexOf(frase.charAt(i)) != -1) {
            	contador++;
            }
        }
        return contador;
    }

    public static int contarConsonantes(String frase) {
        int contador = 0;
        String consonantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < frase.length(); i++) {
            if (consonantes.indexOf(frase.charAt(i)) != -1) {
            	contador++;
            }
        }
        return contador;
    }
}
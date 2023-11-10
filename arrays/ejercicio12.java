package arrays;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la altura de 10 personas:");

        double[] alturas = new double[10];
        double sumaAlturas = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            alturas[i] = scan.nextDouble();
            sumaAlturas += alturas[i];
        }

        double alturaMedia = sumaAlturas / 10;
        System.out.println("La altura media es: " + alturaMedia);

        int personasAlturaSuperior = 0;
        int personasAlturaInferior = 0;

        for (int i = 0; i < 10; i++) {
            if (alturas[i] > alturaMedia) {
                personasAlturaSuperior++;
            } else if (alturas[i] < alturaMedia) {
                personasAlturaInferior++;
            }
        }

        System.out.println("Personas con altura superior a la media: " + personasAlturaSuperior);
        System.out.println("Personas con altura inferior a la media: " + personasAlturaInferior);

        scan.close();
    }
}
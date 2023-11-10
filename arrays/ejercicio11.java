package arrays;

public class ejercicio11 {
	    public static void main(String[] args) {
	        int[] array1 = {10, 25, 15, 30, 5, 54, 29};
	        int[] array_filtrada = new int[array1.length];

	        // Fem servir for per calcular els numeros pars i mes grans que 25
	        int index = 0;
	        for (int i = 0; i < array1.length; i++) {
	            if (array1[i] % 2 == 0 && array1[i] > 25) {
	            	array_filtrada[index] = array1[i];
	                index++;
	            }
	        }

	        // Imprimim resultats
	        System.out.println("Resultats:");
	        for (int j = 0; j < index; j++) {
	            System.out.print(array_filtrada[j] + " ");
	        }

	    }
}

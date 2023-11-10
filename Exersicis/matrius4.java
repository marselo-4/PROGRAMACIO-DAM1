package Exersicis;
import java.util.Arrays;

public class matrius4 {
	public static void main (String[] args) {
        int[][] matriz = new int[7][7];
        int f;
        //Posem valor 1 a la primera columna
        //Busquem que el numero de la columna sigui el mateix que el de la fila [1][1], [2][2])
        for (f=0 ; f < matriz.length ; f++){
            matriz[f][f]=1;                           
        }
        
        //Imprimim les files fent servir la utilitat Arrays
        for (f=0 ; f < matriz.length ; f++){
            System.out.println(Arrays.toString(matriz[f]));
        }
		 
		 /*
		  * OUTPUT:
		  * [1][0][0][0][0][0][0]
		  * [0][1][0][0][0][0][0]
		  * [0][0][1][0][0][0][0]
		  * [0][0][0][1][0][0][0]
		  * [0][0][0][0][1][0][0]
		  * [0][0][0][0][0][1][0]
		  * [0][0][0][0][0][0][1]
		  * 
		  */
	}
}

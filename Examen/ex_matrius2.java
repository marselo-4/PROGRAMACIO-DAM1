package Examen;
import java.util.Random;
public class ex_matrius2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if(i>=j) {
					matriz[i][j] = rand.nextInt(9)+1;
				}
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; i < matriz.length; j++) {
				System.out.println(matriz[i][j]);
				
				System.out.println();
			}
		}
		
	}
}

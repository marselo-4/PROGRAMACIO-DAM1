package Exersicis;
import java.util.Scanner;

public class matrius14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		 int[][] array = new int[8][8];

	        System.out.println("Introdueix els valors de l'array:");
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                array[i][j] = scan.nextInt();
	            }
	        }

	        System.out.print("Introdueix el valor de c1: ");
	        int c1 = scan.nextInt();
	        System.out.print("Introdueix el valor de c2: ");
	        int c2 = scan.nextInt();
	        scan.close();//Tel tanco aqui que sino me surt advertencia i me done toc
	        if (c1 < 0 || c1 > 7 || c2 < 0 || c2 > 7) {
	            System.out.println("Els valors de c1 i c2 han d'estar entre 0 i 7.");
	            return;
	        }

	        for (int i = 0; i < 8; i++) {
	            int temp = array[i][c1];
	            array[i][c1] = array[i][c2];
	            array[i][c2] = temp;
	        }

	        System.out.println("Array final:");
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }

	    }
}

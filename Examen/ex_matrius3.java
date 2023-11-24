package Examen;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class ex_matrius3 {
	public static void main(String[] args) {
		int[] numeros = {4,5,2,1,3};
		int[] numeros_r = new int[numeros.length];
		Arrays.sort(numeros);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}
		
		for(int i = 0; i<numeros.length; i++) {
			numeros_r[4-i] = numeros[i];
		}
		System.out.println();
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros_r[i]);
		}
	}
}

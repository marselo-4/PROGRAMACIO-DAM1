package Exersicis;
import java.util.Random;
import java.util.Scanner;
public class numeros_aleatorios {

	public static void main(String[] args) {
	     Random rand = new Random(); 
	     int upperbound = 0;
	     int i = 0;
	     int intentos = 0;
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Pon un numero máximo para generar tu numero aleatorio: ");
	     upperbound = scan.nextInt();
	     //Pedimos al usuario cuantos intentos quiere
	     System.out.println("En que modo quieres jugar? [1-Fácil 2-Intermedio 3-Difícil] ");
	     int modo = scan.nextInt();
	     int numero = rand.nextInt(upperbound); 
	     System.out.println(numero);
	     
	     if(modo==1) {
	    	 intentos = 5;
	     }else if(modo==2) {
	    	 intentos = 4;
	     }else if(modo==3) {
	    	 intentos = 3;
	     }
	     
	     for(i = 0; i < intentos; i++) {
	    	 System.out.println("Intenta adivinar el numero!");
		     int eleccion = scan.nextInt();
	    	 if(numero == eleccion) {
	    		 System.out.println("Lo has adivinado!");
	    	 }else if(numero < eleccion) {
	    		 System.out.println("Te has pasado");
	    	 }else if(numero > eleccion) {
	    		 System.out.println("Te has quedado corto");
	    	 }
	     }
	     if(i == intentos) {
	    	 System.out.println("Has perdido :( ");
	     }else System.out.println("Has ganado! ");
	     
	}
	
}

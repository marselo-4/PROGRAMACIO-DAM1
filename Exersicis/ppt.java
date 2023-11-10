package Exersicis;

import java.util.Scanner;
import java.util.Random;

public class ppt {
	public static void main (String []arg) {
		Random rand = new Random();
		String eleccion;
		String jugador1;
		String jugador2;
		String eleccion1;
		String eleccion2 = "";
		int eleccion_ia;
		Scanner scan = new Scanner (System.in);
		System.out.println("1=Juego normal 2=IA");
		eleccion = scan.next();
		
		while(eleccion.equals("1")) {
			System.out.println("Cual es nombre del jugador1?");
			jugador1 = scan.next();
			System.out.println("Cual es el nombre del jugador2?");
			jugador2 = scan.next();
			System.out.println("Eleccion de "+ jugador1+ "?"); 
			eleccion1 = scan.next();
			System.out.println("Eleccion de "+jugador2+"?");
			eleccion2 = scan.next();

			if (eleccion1.equals("piedra") && eleccion2.equals("tijeras")) {
				System.out.println(jugador1 + " ha elegido " + eleccion1 +" y " + jugador2 + " ha elegido "+ eleccion2);
				System.out.println("El ganador es " + jugador1);
			}
			
			else if(eleccion1.equals("piedra") && eleccion2.equals("papel")) {
				System.out.println("El ganador es "+ jugador2);
			}else if(eleccion1.equals("piedra") && eleccion2.equals("piedra")) {
				System.out.println("Habeis empatado");
			}
		
			else if(eleccion1.equals("papel") && eleccion2.equals("piedra")) {
				System.out.println("El ganado es r"+ jugador1);
			}else if(eleccion1.equals("papel") && eleccion2.equals("tijeras")) {
				System.out.println("El ganador es " + jugador2);
			}else if(eleccion1.equals("papel") && eleccion2.equals("papel")) {
				System.out.println("Empate");
			}
		
			else if(eleccion1.equals("tijeras") && eleccion2.equals("tijeras")) {
				System.out.println("Empate");
			}else if(eleccion1.equals("tijeras") && eleccion2.equals("piedra")) {
				System.out.println("El ganador es "+ jugador2);
			}else if(eleccion1.equals("tijeras") && eleccion2.equals("papel")) {
				System.out.println("El ganador es "+ jugador1);}
			
			
			else {
				System.out.println("Ha habido un error.");	
				}
			eleccion = "";
		} 
		
		while(eleccion.equals("2")) {
			System.out.println("Cual es nombre del jugador1?");
			jugador1 = scan.next();
			jugador2 = "Inteligencia Artificial";
			System.out.println("Eleccion de "+ jugador1+ "?"); 
			eleccion1 = scan.next();
			eleccion_ia = rand.nextInt(3);
			
			if(eleccion_ia == 0) {
				eleccion2 = "piedra";
				System.out.println("La inteligencia artificial ha elegido "+eleccion2);
			}if(eleccion_ia == 1) {
				eleccion2 = "papel";
				System.out.println("La inteligencia artificial ha elegido "+eleccion2);
			}if(eleccion_ia == 2) {
				eleccion2 = "tijera";
				System.out.println("La inteligencia artificial ha elegido "+eleccion2);
			}

			if (eleccion1.equals("piedra") && eleccion2.equals("tijeras")) {
				System.out.println(jugador1 + " ha elegido " + eleccion1 +" y " + jugador2 + " ha elegido "+ eleccion2);
				System.out.println("El ganador es " + jugador1);
			}
			
			else if(eleccion1.equals("piedra") && eleccion2.equals("papel")) {
				System.out.println("El ganador es "+ jugador2);
			}else if(eleccion1.equals("piedra") && eleccion2.equals("piedra")) {
				System.out.println("Habeis empatado");
			}
		
			else if(eleccion1.equals("papel") && eleccion2.equals("piedra")) {
				System.out.println("El ganador es "+ jugador1);
			}else if(eleccion1.equals("papel") && eleccion2.equals("tijeras")) {
				System.out.println("El ganador es " + jugador2);
			}else if(eleccion1.equals("papel") && eleccion2.equals("papel")) {
				System.out.println("Empate");
			}
		
			else if(eleccion1.equals("tijeras") && eleccion2.equals("tijeras")) {
				System.out.println("Empate");
			}else if(eleccion1.equals("tijeras") && eleccion2.equals("piedra")) {
				System.out.println("El ganador es "+ jugador2);
			}else if(eleccion1.equals("tijeras") && eleccion2.equals("papel")) {
				System.out.println("El ganador es "+ jugador1);}
			
			
			else {
				System.out.println("Ha habido un error.");	
				}
			eleccion="";
		}
		
		
		
		
		scan.close();
	
	}


}



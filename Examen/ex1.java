package Examen;
import java.util.Scanner;


public class ex1 {
	public static void main(String[] args) {
		//Inicializamos strings y int
		String eleccion = "1";
		String jugador1 = "";
		String jugador2 = "";
		int score1 = 0;
		int score2 = 0;
		int empates = 0;
		int rondas_p1 = 0;
		int rondas_p2 = 0;
		String eleccion1 = "";
		String eleccion2 = "";
		Scanner scan = new Scanner(System.in);
		Scanner scan_i = new Scanner(System.in);
		
			System.out.println("Cual es nombre del jugador1?");
			jugador1 = scan.next();
			System.out.println("Cual es el nombre del jugador2?");
			jugador2 = scan.next();
			
		while(eleccion.equals("1")) {//Por defecto empezamos en un bucle que simula un juego donde no salimos de él hasta que no coincida rondas_p1 con rondas_p2
			System.out.println("Cuantas rondas quieres jugar, "+jugador1+"?");
			rondas_p1= scan_i.nextInt();
			System.out.println("Cuantas rondas quieres jugar, "+jugador2+"?");
			rondas_p2= scan_i.nextInt();
			if(rondas_p1 == rondas_p2) {//si coincide el valor de eleccion cambia y nos vamos al otro while
				eleccion = "2";
				System.out.println("Habeis escogido el mismo numero de rondas, Empezamos!");
			}else {System.out.println("Hasta que no querais el mismo numero de rondas no podemos empezar! :/");}
		} 
		
		while(eleccion.equals("2")) {
			
			for(int i = 1; i<=rondas_p1; i++) { // Usamos for para que haya tantas partidas como rondas hayan elegido
				System.out.println("Ronda "+i); // Mostramos ronda actual
				System.out.println("Eleccion de "+ jugador1+ "?"); 
				eleccion1 = scan.next();
				System.out.println("Eleccion de "+jugador2+"?");
				eleccion2 = scan.next();
				//Este juego ya lo hemos visto, pero tiene una pequeña modificación que es que cada vez que alguien gane se le suma un valor a un int para luego saber quien ha ganado
				if (eleccion1.equals("piedra") && eleccion2.equals("tijeras")) {
					System.out.println(jugador1 + " ha elegido " + eleccion1 +" y " + jugador2 + " ha elegido "+ eleccion2);
					System.out.println("El ganador es " + jugador1);
					score1++;
				}
				
				else if(eleccion1.equals("piedra") && eleccion2.equals("papel")) {
					System.out.println("El ganador es "+ jugador2);
					score2++;
				}else if(eleccion1.equals("piedra") && eleccion2.equals("piedra")) {
					System.out.println("Habeis empatado");
					empates++;
				}
			
				else if(eleccion1.equals("papel") && eleccion2.equals("piedra")) {
					System.out.println("El ganador es "+ jugador1);
					score1++;
				}else if(eleccion1.equals("papel") && eleccion2.equals("tijeras")) {
					System.out.println("El ganador es " + jugador2);
					score2++;
				}else if(eleccion1.equals("papel") && eleccion2.equals("papel")) {
					System.out.println("Empate");
					empates++;
				}
			
				else if(eleccion1.equals("tijeras") && eleccion2.equals("tijeras")) {
					System.out.println("Empate");
					empates++;
				}else if(eleccion1.equals("tijeras") && eleccion2.equals("piedra")) {
					System.out.println("El ganador es "+ jugador2);
					score2++;
				}else if(eleccion1.equals("tijeras") && eleccion2.equals("papel")) {
					System.out.println("El ganador es "+ jugador1);
					score1++;}
				
				
				else {
					System.out.println("Ha habido un error.");	
					}
			}

			System.out.println(jugador1+" ha ganado "+score1+" rondas."); // puntos p1
			System.out.println(jugador2+" ha ganado "+score2+" rondas."); // puntos p2
			System.out.println("Habéis empatado "+empates+" veces."); // cuantos empates
			if(score1>score2) {//Calculamos quien ha ganado usando comparativos
				System.out.println(jugador1+" ha ganado a "+jugador2);
			}else if(score1 == score2) {
				System.out.println("Habeis empatado!");
			}else if(score1<score2) {
				System.out.println(jugador2+" ha derrotado a "+jugador1);
			}
			eleccion = "";//Dejamos la variable eleccion con valor nulo para que finalize el programa
		}			
	scan.close();// Cerramos scanner (No es necesario pero me da toc ver el warning :))
	scan_i.close();// Cerramos scanner (No es necesario pero me da toc ver el warning :))
	}
}

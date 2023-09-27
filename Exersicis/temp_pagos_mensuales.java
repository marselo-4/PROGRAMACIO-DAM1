package Exersicis;

public class temp_pagos_mensuales {

	public static void main(String[] args) {
		

		
		int total = 0;
		int deuda = 10;
		int vueltas = 0;
		System.out.println("Es el mes 1 y tienes que pagar 10€");
		for(vueltas = 0; vueltas <= 18; vueltas++) {
			total = deuda*2;
			deuda = total;
			
			//System.out.println(total);
			System.out.println("Es el mes "+(vueltas+2)+" y tienes que pagar "+ deuda+"€");
		}
		System.out.println("El precio total a pagar es de "+deuda+"€");
		
	}
	
}

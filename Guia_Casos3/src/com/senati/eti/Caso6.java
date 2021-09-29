package com.senati.eti;

import java.util.Scanner;


public class Caso6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		//objeto de tipo String
		String nombre= "", estado = "", rp = "s";
		
		int edad = 0, nr = 0, n_apto =0;
		
		while (rp.equals("S")||rp.equals("s")) {
		nr++;
		

		System.out.println("---------------");
		System.out.println("Reguistro N. "+ nr);
		System.out.println("---------------");
		System.out.println("Participante....: ");
		nombre = sc.nextLine();
		System.out.println("Edad----------:");
		edad= sc.nextInt();
		
		if( edad >= 18) {
			estado = "Apto para votar";
			n_apto++;
		}
		else
			estado= "Menor de edad";
		
		System.out.println("estado....: "+ estado);
		
		//reiniciar el bufeer de lectura
		sc.nextLine();
		
		System.out.println("¿desea registrar otro participante? <S/N>:");
		rp =sc.nextLine();
	}
		

	System.out.println("\nRESUMEN");
	System.out.println("---------------");
	System.out.println("Numero de participantes..........: " +nr);
	System.out.println("aptos para votar.................: " +n_apto);
	}

}

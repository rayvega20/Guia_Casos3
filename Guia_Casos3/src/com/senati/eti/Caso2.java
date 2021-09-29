package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese un numero :");
		int n= sc.nextInt();
		
		int s = 0, i = 1;
		
		while (i <= n) {
			s+= i; // s = s +i;
			i++;
		}

		System.out.println("\nRESULTADOS");
		System.out.println("---------------");
		System.out.println("Sumatoria de........: " + n + " es " + s );
		
		
	}

}

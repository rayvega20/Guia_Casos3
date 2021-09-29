package com.senati.eti;

import java.util.Scanner;


public class Caso7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
	     System.out.print("nombre: ");
		 String nombre= sc.nextLine();
		 
		 //for acendente en 1 en  1
	   for ( int x = 1; x <= 0;x++) {
		     System.out.print(x + "bienvenido(a)"+ nombre+ " al curso.");     
	   }//for descendente en dos en dos
	   for ( int x = 20; x >= 0; x -= 2) {
		   System.out.print("valor: "+ x);
		   
	   }
		     

	}

}

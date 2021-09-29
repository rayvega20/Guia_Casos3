package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n=0 , i =1, num_mayor =0;
	        
	       while(i <= 4) {
	        System.out.print("ingrese un numero :");
			n = sc.nextInt();
			
			if (n > num_mayor)
				num_mayor = n;
			i++;
			
	       }
	       

			System.out.println("\nRESULTADOS");
			System.out.println("---------------");
			System.out.println("Empleado..........: " + num_mayor);
			
	}

}

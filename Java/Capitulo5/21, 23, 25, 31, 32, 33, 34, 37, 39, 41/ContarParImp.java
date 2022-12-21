/*
 * ContarParImp.java
 * 
 * Este programa dice cuantos dígitos pares e impares hay dentro de un número.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class ContarParImp {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un número entero positivo: ");
		
		long numIntrod = s.nextLong();
		long n = numIntrod;
		int numPar = 0;
		int numImp = 0;
		
		while (n > 0) {
			if ((n % 10) % 2 == 0) {
				numPar++;
			} else {
				numImp++;
			}
			n /= 10;
		}
		
		System.out.printf("El %s contiene %s dígitos pares y %s dígitos impares.", numIntrod, numPar, numImp);
	}
}

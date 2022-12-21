/*
 * ContarNumConFactorial.java
 * 
 * Este programa pide un número entero positivo y muestra los números desde el 1 hasta el introducido junto con su factorial.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class ContarNumConFactorial {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero positivo: ");
		int numIntrod = s.nextInt();
		
		for (int n = 1; n <= numIntrod; n++) {
			int fact = n;
			
			for (int i = 1; i < n; i++) {
				fact *= i;
			}
			
			System.out.println(n + "! = " + fact);
		}
	}
}


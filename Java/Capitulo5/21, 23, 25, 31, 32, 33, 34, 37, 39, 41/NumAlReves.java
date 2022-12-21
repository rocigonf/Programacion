/*
 * NumAlReves.java
 * 
 * Este programa pide un número por teclado y lo muestra al revés.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class NumAlReves {
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		
		
		int numIntrod = s.nextInt();
		int num = numIntrod;
		int alReves = 0;
		
		
		while (num > 0) {
		alReves = (alReves * 10) + (num % 10);
		num /= 10;
		}
		
		
		System.out.printf("El número que has introducido: %s, al revés es: %s", numIntrod, alReves);
	}
}

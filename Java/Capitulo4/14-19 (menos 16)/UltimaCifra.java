/*
 * UltimaCifra.java
 * 
 * Este programa muestra la última cifra de un número entero introducido por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;


public class UltimaCifra {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero.");
		int num = s.nextInt();
		
		
		int ult = num % 10;
		
		
		System.out.printf("La última cifra del número es %s", ult);
		
	}
}


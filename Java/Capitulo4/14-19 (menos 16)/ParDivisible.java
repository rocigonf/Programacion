/*
 * ParDivisible.java
 * 
 * Este programa indica si el número introducido por teclado es par o divisible entre 5.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class ParDivisible {
	
	public static void main (String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		int num = s.nextInt();
		
		
		if ((num % 2) == 0) {
			System.out.println("El número es par. ");
		} else {
			System.out.println("El número es impar. ");
		}
		
		
		if ((num % 5) == 0) {
			System.out.println("Y es divisible entre 5.");
		} else {
			System.out.println("Y no es divisible entre 5.");
		}
		
	}
}


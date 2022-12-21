/*
 * MezclarParImpar.java
 * 
 * Este programa pide dos números por teclado y luego mezcla en dos números diferentes los dígitos pares e impares.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class MezclarParImpar {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un número: ");
		long numIntrod1 = s.nextLong();
		
		System.out.print("Introduzca otro número: ");
		long numIntrod2 = s.nextLong();
		
		long num = numIntrod1;
		long alReves1 = 0;
		int longitud = 0;
		
		
		if (num == 0) {
			longitud = 1;
		}

		while (num > 0) {
			alReves1 = (alReves1 * 10) + (num % 10);
			num /= 10;
			longitud++;
		}
		
		num = numIntrod2;
		long alReves2 = 0;
		
		while (num > 0) {
			alReves2 = (alReves2 * 10) + (num % 10);
			num /= 10;
		}
		
		long resultPar = 0;
		long resultImp = 0;
		int digito;
		
		for (int i = 0; i < longitud; i++) {
			digito = (int)(alReves1 % 10);
			
			if ((digito % 2) == 0) {
				resultPar = resultPar * 10 + digito;
			} else {
				resultImp = resultImp * 10 + digito;
			}
			
			digito = (int)(alReves2 % 10);
			
			if ((digito % 2) == 0) {
				resultPar = resultPar * 10 + digito;
			} else {
				resultImp = resultImp * 10 + digito;
			}
			
			alReves1 /= 10;
			alReves2 /= 10;
		}

		System.out.println("El número formado por los dígitos pares es: " + resultPar);
		System.out.println("El número formado por los dígitos impares es: " + resultImp);
	}
}


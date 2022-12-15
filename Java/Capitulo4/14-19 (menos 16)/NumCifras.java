/*
 * NumCifras.java
 * 
 * Este programa muestra el número de cifras de un número entero introducido por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class NumCifras {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduzca un número entero de máximo 5 cifras.");
		int num = s.nextInt();
		
		int cifras = 0;
		
		if ( num < 10 ) {
			cifras = 1;
		}
		
		if (( num  >= 10 ) && ( num < 100 )) {
			cifras = 2;
		}
		
		if (( num >= 100 ) && ( num < 1000 )) {
			cifras = 3;
		}
		
		if (( num >= 1000 ) && ( num < 10000 )) {
			cifras = 4;
		}
		
		if ( num >= 10000 ) {
			cifras = 5;
		}
		
		
		if (cifras == 1) {
			System.out.printf("El número introducido tiene %s cifra.", cifras);
		} else {
		System.out.printf("El número introducido tiene %s cifras.", cifras);
		}
	}
}


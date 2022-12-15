/*
 * PrimeraCifra.java
 * 
 * Este programa muestra la primera cifra de un número entero introducido por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class PrimeraCifra {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduzca un número entero de 5 cifras máximo.");
		int num = s.nextInt();
		
		int prim = 0;
		
		
		if ( num < 10 ) {
			prim = num;
		}
		
		if (( num >= 10 ) && ( num < 100 )) {
			prim = num / 10;
		}
		
		if (( num >= 100 ) && ( num < 1000 )) {
		prim = num / 100;
		}
		
		if (( num >= 1000 ) && ( num < 10000 )) {
		prim = num / 1000;
		}
		
		if ( num >= 10000 ) {
		prim = num / 10000;
		}
		
		
		System.out.println("La primera cifra del número es " + prim);
	}
}


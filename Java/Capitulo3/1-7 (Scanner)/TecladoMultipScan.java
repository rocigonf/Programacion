/*
 * TecladoMultipScan.java
 * 
 * Introducir 2 números por teclado con Scanner y multiplicar resultado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;


public class TecladoMultipScan {
	
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		//Pido por pantalla los dos números.
		System.out.print("Introduce dos números: ");
		
		
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();
		
		
		//La variable total es la multiplicación de los 2 números.
		double total = num1 * num2;
		
		
		System.out.println("La multiplicación de los dos números es: " + total);
	}
}


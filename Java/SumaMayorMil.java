/*
 * SumaMayorMil.java
 * 
 * Este programa pide números hasta que su suma sea mayor a diez mil.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class SumaMayorMil {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca números enteros.");
		System.out.println("El programa acabará cuando la suma de los números sea mayor que 10000.");
		
		
		int numIntrod;
		int suma = 0;
		int numElem = 0;
		
		
		do {
			numIntrod = s.nextInt();
			suma += numIntrod;
			numElem++;
			
		} while (suma <= 10000);
			System.out.println("Ha introducido un total de " + numElem + " números.");
			System.out.println("La suma total es " + suma + ".");
			System.out.println("La media es " + suma / numElem + ".");
	}
}

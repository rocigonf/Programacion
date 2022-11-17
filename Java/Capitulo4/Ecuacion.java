/*
 * Ecuacion.java
 * 
 * Este programa calcula una ecuación de primer grado del tipo ax + b = 0.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class Ecuacion {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Este programa calcula una ecuación de primer grado del tipo ax + b = 0");
		System.out.println("Introduzca el valor de a:");
		double a = s.nextDouble();
		
		
		System.out.println("Ahora introduzca el valor de b:");
		double b = s.nextDouble();
		
		
		if (a==0) {
			System.out.println("Esta ecuación no tiene solución real");
		} else {
			double total = b * -1 / a;
			System.out.println("x = " + total);
			}
		
	}
}


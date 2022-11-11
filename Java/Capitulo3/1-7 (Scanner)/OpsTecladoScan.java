/*
 * OpsTecladoScan.java
 * 
 * Introducir números por teclado y sus operaciones.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class OpsTecladoScan {
	
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		//Pido por pantalla los dos números.
		System.out.print("Introduce dos números: ");
		
		
		//Se pide por teclado el número.
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();
		
		
		//La variable mult es la multiplicación de los 2 números, div es la división, suma es la suma y resta es la resta.
		double mult = num1 * num2;
		
		double div = num1 / num2;
		
		double suma = num1 + num2;
		
		double resta = num1 - num2;
		
		
		System.out.println("La multiplicación de los dos números es: " + mult);
		System.out.println("La división de los dos números es: " + div);
		System.out.println("La suma de los dos números es: " + suma);
		System.out.println("La resta de los dos números es: " + resta);
	}
}

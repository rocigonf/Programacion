/*
 * ConversorMbKb.java
 * 
 * Conversor de Mb a Kb pidiendo la cantidad por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class ConversorMbKb {
	
 
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
	
		//Pido por pantalla la cantidad de Mbs.
		System.out.println("Introduce la cantidad de Mb que desea convertir: ");

	
		int mega = s.nextInt();
		//Un Mb equivale a 1000 Kb.
		int kilo = 1000;
	
	
		System.out.println(mega + " Mb equivalen a " + (mega * kilo) + " Kb");
		
	}
}

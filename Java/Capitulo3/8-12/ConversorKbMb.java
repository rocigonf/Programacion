/*
 * ConversorKbMb.java
 * 
 * Conversor de Kb a Mb pidiendo la cantidad por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class ConversorKbMb {
	
 
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
	
		//Pido por pantalla la cantidad de Kbs.
		System.out.println("Introduce la cantidad de Kb que desea convertir: ");

	
		int kilo = s.nextInt();
		//Un Mb equivale a 1000 Kb.
		double mega = 0.001;
	
	
		System.out.println(kilo + " Kb equivalen a " + (kilo * mega) + " Mb");
		
	}
}

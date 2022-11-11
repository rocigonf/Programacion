/*
 * EurosPesetasScan.java
 * 
 * Conversor de euros a pesetas con scanner pidiendo los euros por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class EurosPesetasScan {
 
	public static void main (String[] args) {
	
	
		Scanner s = new Scanner(System.in);
		
		
		//Pido por pantalla la cantidad de euros.
		System.out.println("Introduce la cantidad de euros que desea convertir a pesetas: ");
		
		
		double euros = s.nextDouble();
	
	
		//Un euro equivale aproximadamente a 166 pesetas.
		int pesetas = 166;
	
	
		System.out.println(euros + " euros equivalen a " + (euros * pesetas) + " pesetas");
		
	}
}

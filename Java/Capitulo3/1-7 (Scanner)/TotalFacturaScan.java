/*
 * TotalFacturaScan.java
 * 
 * Cálculo del total de una factura a partir de su base imponible.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class TotalFacturaScan {
	
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		//Se pide por pantalla la variable baseImp.
		System.out.print("Introduce la base imponible de la factura: ");
		
		
		//Se pide por teclado el número.
		double baseImp = s.nextDouble();
		
		double IVA = 1.21;
		
		double total = baseImp * IVA;
		
		System.out.println("El precio sin IVA es de " + baseImp + " euros y el precio con IVA es de " + total + " euros");
		
	}
}

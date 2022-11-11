/*
 * TotalFactura.java
 * 
 * Cálculo del total de una factura a partir de su base imponible.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class TotalFactura {
	
	public static void main (String[] args) {
		
		
		//Se pide por pantalla la variable baseImp.
		System.out.print("Introduce la base imponible de la factura: ");
		
		
		//Se pide por teclado el número.
		String linea = System.console().readLine();
		
		
		double baseImp = Double.parseDouble( linea );
		
		double IVA = 1.21;
		
		double total = baseImp * IVA;
		
		System.out.println("El precio sin IVA es de " + baseImp + " euros y el precio con IVA es de " + total + " euros");
		
	}
}

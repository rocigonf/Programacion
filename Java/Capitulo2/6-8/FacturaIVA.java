/*
 * FacturaIVA.java
 * 
 * Calculadora de IVA.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class FacturaIVA {
	
	public static void main (String[] args) {
		
		
		//Declaro las variables de la base imponible y otra del IVA.
		int baseImp = 657;
		double IVA = 1.21;
		
		int total;
		total = (int) (baseImp * IVA);
		
		System.out.println("El precio sin IVA es de " + baseImp + " euros y el precio con IVA es de " + total + " euros");
		
	}
}


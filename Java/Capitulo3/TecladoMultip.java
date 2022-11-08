/*
 * TecladoMultip.java
 * 
 * Introducir números por teclado y multiplicar resultado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class TecladoMultip {
	
	public static void main (String[] args) {
		
		System.out.print("Introduce un número: ");
		
		String linea = System.console().readLine();
		
		double num1 = Double.parseDouble( linea );
		
		System.out.println("Introduce otro número: ");
		
		linea = System.console().readLine();
		
		double num2 = Double.parseDouble( linea );
		
		double total = num1 * num2;
		
		System.out.println("La multiplicación de los dos números es: " + total);
	}
}


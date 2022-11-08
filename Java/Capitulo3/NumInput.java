/*
 * NumInput.java
 * 
 * Introducir números por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class NumInput {
	
	public static void main(String[] args) {
		
		//Imprimo por pantalla texto pidiendo que se introduzca un número.
		System.out.print("Por favor, introduce un número: ");
		
		//Declaro la variable linea para introducir por teclado.
		String linea = System.console().readLine();	
		
		//Creo la variable primerNumero que convierte la variable linea en número entero.
		double primerNumero = Double.parseDouble( linea );
		
		//Imprimo por pantalla texto pidiendo otro número.
		System.out.print("Introduce otro, por favor: ");
		
		//Pido otro número por teclado.
		linea = System.console().readLine();
		
		//Creo la variable segundoNumero que convierte la variable linea en número entero.
		double segundoNumero = Double.parseDouble( linea );
		
		//Creo la variable total que calcula el doble del primer número y lo suma con el segundo número.
		double total = (2 * primerNumero) + segundoNumero;
		
		
		//Imprimo por pantalla los resultados
		System.out.print("El primer número introducido es " + primerNumero);
		
		System.out.println(" y el segundo es " + segundoNumero);
		
		System.out.print("El doble del primer número mas el segundo es " + total);
	}
}


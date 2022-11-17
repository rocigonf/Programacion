/*
 * ConoVolumen.java
 * 
 * Este programa calcula volumen de un cono.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class ConoVolumen {
	
	public static void main (String[] args) {
		
		
		//Se pide por pantalla el radio del cono.
		System.out.println("Introduce el radio del cono en cm: ");
		String linea = System.console().readLine();
		
		
		//Se convierte la variable linea a decimal y el número se almacena en la variable radio.
		double radio = Double.parseDouble( linea );
		
		
		System.out.println("Introduce la altura del cono en cm: ");
		linea = System.console().readLine();
		
		
		//Se convierte la variable linea a decimal y el número pedido por teclado se almacena en la variable h (altura).
		double h = Double.parseDouble( linea );
		
		
		final double pi = 3.14;
				
		System.out.println("El volumen del cono es: " + ( pi * radio * radio * h ) / 3  );
		
	}
}


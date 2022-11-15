/*
 * ConoVolumen.java
 * 
 * Este programa calcula el salario semanal de un empleado en base a las horas trabajadas.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class ConoVolumen {
	
	public static void main (String[] args) {
		
		
		String linea = System.console().readLine();
		
		
		//Se pide por pantalla el radio del cono.
		System.out.print("Introduce el radio del cono en cm: ");
		
		
		//Se convierte la variable linea a decimal y el número se almacena en la variable radio.
		double radio = Double.parseDouble( linea );
		
		
		linea = System.console().readLine();
		
		
		//Se convierte la variable linea a decimal y el número pedido por teclado se almacena en la variable h (altura).
		double h = Double.parseDouble( linea );
		
		
		final double pi = 3.14;
				
		System.out.println("El volumen del cono es: " + ( pi * radio * radio * h ) / 3  );
		
	}
}


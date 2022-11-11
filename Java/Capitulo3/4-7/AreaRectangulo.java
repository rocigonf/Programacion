/*
 * AreaRectangulo.java
 * 
 * Cálculo del área de un rectángulo introduciendo las medidas por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class AreaRectangulo {
	
	public static void main (String[] args) {
		
		//Se pide por pantalla la base del rectángulo.
		System.out.print("Introduce la base del rectángulo en cm: ");
		
		
		//Se pide por teclado el número.
		String linea = System.console().readLine();
		
		
		//Se convierte la variable linea a decimal y el primer número se almacena en b (base).
		double b = Double.parseDouble( linea );
		
		
		//Se pide por pantalla la altura del rectángulo.
		System.out.println("Introduce la altura del rectángulo en cm: ");
		
		
		linea = System.console().readLine();
		
		
		//Igual que la línea 24 pero la variable se llama h (altura).
		double h = Double.parseDouble( linea );
		
		
		double area = b * h;
		
		
		System.out.println("El área del rectángulo es: " + area);
		
	}
}


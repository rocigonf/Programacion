/*
 * AreaTriangulo.java
 * 
 * Cálculo del área de un triangulo introduciendo las medidas por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class AreaTriangulo {
	
	public static void main (String[] args) {
		
		//Se pide por pantalla la base del triangulo.
		System.out.print("Introduce la base del triangulo en cm: ");
		
		
		//Se pide por teclado el número.
		String linea = System.console().readLine();
		
		
		//Se convierte la variable linea a decimal y el primer número se almacena en b (base).
		double b = Double.parseDouble( linea );
		
		
		//Se pide por pantalla la altura del triangulo.
		System.out.println("Introduce la altura del triangulo en cm: ");
		
		
		linea = System.console().readLine();
		
		
		//Igual que la línea 24 pero la variable se llama h (altura).
		double h = Double.parseDouble( linea );
		
		
		double area = (b * h) / 2;
		
		
		System.out.println("El área del triángulo es: " + area);
		
	}
}

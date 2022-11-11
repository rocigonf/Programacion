/*
 * OperacionesTeclado.java
 * 
 * Introducir números por teclado y sus operaciones.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class OperacionesTeclado {
	
	public static void main (String[] args) {
		
		//Pido por pantalla un número.
		System.out.print("Introduce un número: ");
		
		//Se pide por teclado el número.
		String linea = System.console().readLine();
		
		//Se convierte la variable linea a decimal y el primer número se almacena en num1.
		double num1 = Double.parseDouble( linea );
		
		//Se repiten los primeros 3 pasos.
		System.out.println("Introduce otro número: ");
		
		linea = System.console().readLine();
		
		double num2 = Double.parseDouble( linea );
		
		//La variable mult es la multiplicación de los 2 números, div es la división, suma es la suma y resta es la resta.
		double mult = num1 * num2;
		
		double div = num1 / num2;
		
		double suma = num1 + num2;
		
		double resta = num1 - num2;
		
		System.out.println("La multiplicación de los dos números es: " + mult);
		System.out.println("La división de los dos números es: " + div);
		System.out.println("La suma de los dos números es: " + suma);
		System.out.println("La resta de los dos números es: " + resta);
	}
}

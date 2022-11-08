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
		
		//La variable total es la multiplicación de los 2 números.
		double total = num1 * num2;
		
		System.out.println("La multiplicación de los dos números es: " + total);
	}
}


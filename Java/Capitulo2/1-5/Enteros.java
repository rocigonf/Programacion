/*
 * Enteros.java
 * 
 * Asignación de variables enteras y operaciones.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
 public class Enteros {
 
	public static void main (String[] args) {
	
		//Declaro las variables x e y según el enunciado del ejercicio.
		int x = 144;
		int y = 999;
		
		//Declaro las variables suma, resta, multiplicación y división para imprimir por pantalla formateando.
		int suma = (x + y);
		int resta = (x - y);
		double multiplicacion = (x * y);
		double division = (x / y);

		//Imprimo por pantalla los resultados por parejas formateando.
		System.out.printf("La variable 'x' vale: '%s' y la variable 'y' vale: '%s' \n", x, y );
		System.out.printf("La suma de las variables es: '%s' y la resta de las variables es: '%s' \n", suma, resta );
		System.out.printf("La multiplicación de las variables es: '%s' y la división de las variables es: '%s' \n", multiplicacion, division );
		
	}
}

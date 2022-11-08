/*
 * NombreInput.java
 * 
 * Introducir por teclado nombre y apellidos.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class NombreInput {
	
	public static void main(String[] args) {
		
		String nombre;
		
		System.out.print("Por favor, dime cómo te llamas: ");
		
		nombre = System.console().readLine();
		
		String apellido;
		
		System.out.println("Ahora dime tus apellidos");
		
		apellido = System.console().readLine();
		
		System.out.println("Hola " + nombre + " " + apellido + ", ¡encantado de conocerte!");
	}
}

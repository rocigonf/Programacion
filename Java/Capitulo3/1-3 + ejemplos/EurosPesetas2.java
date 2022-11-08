/*
 * EurosPesetas2.java
 * 
 * Conversor de euros a pesetas pidiendo los euros por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

public class EurosPesetas2 {
 
	public static void main (String[] args) {
	
	//Pido por pantalla la cantidad de euros.
		System.out.println("Introduce la cantidad de euros que desea convertir a pesetas: ");
		
		//Declaro la variable linea que pide la cantidad por teclado.
		String linea = System.console().readLine();
	
		double euros = Double.parseDouble( linea );
	
		//Un euro equivale aproximadamente a 166 pesetas.
		int pesetas = 166;
	
		System.out.println(euros + " euros equivalen a " + (euros * pesetas) + " pesetas");
		
	}
}

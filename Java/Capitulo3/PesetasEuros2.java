/* 
 * PesetasEuros2.java
 * 
 * Conversor de pesetas a euros pidiendo las pesetas por tecado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

public class PesetasEuros2 {
 
	public static void main (String[] args) {
	
		//Pido por pantalla la cantidad de pesetas.
		System.out.println("Introduce la cantidad de pesetas que desea convertir a euros: ");
		
		//Declaro la variable linea que pide la cantidad por teclado.
		String linea = System.console().readLine();
	
		int pesetas = Integer.parseInt( linea );
	
		//Una peseta equivale a 0,0060 euros.
		double euros = 0.0060;
	
		System.out.println(pesetas + " pesetas equivalen a " + (pesetas * euros) + " euros");
		
	}
}

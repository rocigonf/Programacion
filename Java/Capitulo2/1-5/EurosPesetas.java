/*
 * EurosPesetas.java
 * 
 * Conversor de euros a pesetas.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

public class EurosPesetas {
 
	public static void main (String[] args) {
	
	//Declaro la variable euros con la cantidad que deseo convertir.
	int euros = 34;
	
	//Un euro equivale a 166,386 pesetas.
	double pesetas = 166.386;
	
	System.out.println(euros + " euros equivalen a " + (euros * pesetas) + " pesetas");
		
	}
}

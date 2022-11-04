/*
 * PesetasEuros.java
 * 
 * Conversor de pesetas a euros.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

public class PesetasEuros {
 
	public static void main (String[] args) {
	
	//Declaro la variable pesetas con la cantidad que deseo convertir.
	int pesetas = 6000000;
	
	//Una peseta equivale a 0,0060 euros.
	double euros = 0.0060;
	
	System.out.println(pesetas + " pesetas equivalen a " + (pesetas * euros) + " euros");
		
	}
}

/* 
 * PesetasEurosScan.java
 * 
 * Conversor de pesetas a euros con scanner pidiendo las pesetas por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
 
import java.util.Scanner;


public class PesetasEurosScan {
	
 
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
	
		//Pido por pantalla la cantidad de pesetas.
		System.out.println("Introduce la cantidad de pesetas que desea convertir a euros: ");
		
		
		double pesetas = s.nextDouble();
	
	
		//Una peseta equivale a 0,0060 euros.
		double euros = 0.0060;
	
	
		System.out.println(pesetas + " pesetas equivalen a " + (pesetas * euros) + " euros");
		
	}
}

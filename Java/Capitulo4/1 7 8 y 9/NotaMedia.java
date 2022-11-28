/*
 * NotaMedia.java
 * 
 * Este programa calcula la media de 3 notas.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
import java.util.Scanner;

public class NotaMedia {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Por favor, introduzca la primera nota");
		double nota1 = s.nextDouble();
		
		System.out.println("A continuación introduzca la segunda nota");
		double nota2 = s.nextDouble();
		
		System.out.println("Ahora introduzca la tercera nota");
		double nota3 = s.nextDouble();
		
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("Su nota media es : %s", media);
		
		
	}
}


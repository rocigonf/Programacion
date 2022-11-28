/*
 * NotaBoletin.java
 * 
 * Este programa calcula la media de 3 notas y da la nota del boletín como resultado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
import java.util.Scanner;

public class NotaBoletin {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Por favor, introduzca la primera nota");
		double nota1 = s.nextDouble();
		
		System.out.println("A continuación introduzca la segunda nota");
		double nota2 = s.nextDouble();
		
		System.out.println("Ahora introduzca la tercera nota");
		double nota3 = s.nextDouble();
		
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		
		if ((media == 0) || (media < 5)) {
			System.out.println("Su nota es insuficiente.");
		} else if (media == 5) {
			System.out.println("Su nota es suficiente.");
		} else if (media == 6) {
			System.out.println("Su nota es bien.");
		} else if ((media == 7) || (media == 8)) {
			System.out.println("Su nota es notable.");
		} else if ((media == 9) || (media == 10)) {
			System.out.println("Su nota es sobresaliente.");
		} else {
			System.out.println("Por favor, introduzca notas correctas.");
		}
		
		
	}
}

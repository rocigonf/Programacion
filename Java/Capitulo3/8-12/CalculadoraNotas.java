/*
 * CalculadoraNotas.java
 * 
 * Calcula la nota que necesito en el segundo examen para sacar la nota que yo quiero.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;


public class CalculadoraNotas {
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduce la nota de tu primer exámen: ");
		double primerExamen = s.nextDouble();
		double nota1 = primerExamen * 0.4;
		
		
		System.out.println("Introduce la nota que quieres sacar en el trimestre: ");
		double notaTrimestre = s.nextDouble();
		
		
		double segundoExamen = 2 * notaTrimestre - primerExamen;
		segundoExamen = segundoExamen * 0.6;
		
		
		System.out.printf("Para obtener un %s, debes sacar un %s en el segundo exámen", notaTrimestre, segundoExamen);
		
	}
}


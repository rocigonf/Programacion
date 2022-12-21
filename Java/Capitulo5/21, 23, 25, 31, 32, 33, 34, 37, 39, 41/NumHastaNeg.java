/*
 * NumHastaNeg.java
 * 
 * Este programa pide números hasta que se introduzca uno en negativo y dice cuantos números se introdujeron, la media de los impares y el mayor de los pares.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
import java.util.Scanner;

public class NumHastaNeg {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Por favor, introduzca números enteros.");
		System.out.println("El programa terminará con la introducción de un número negativo.");
		
		
		int numIntrod;
		int numElem = 0;
		int sumaImp = 0;
		int numImp = 0;
		int maxPar = 0;
		
		
		do {
			numIntrod = s.nextInt();
			
			if (numIntrod >= 0) {
				numElem++;
				
				if ((numIntrod % 2) == 1) {
					sumaImp += numIntrod;
					numImp++;
				} else {
					if (numIntrod > maxPar)
						maxPar = numIntrod;
				}
			}
		} while (numIntrod >= 0);
			System.out.println("Ha introducido " + numElem + " números");
			System.out.println("La media de los impares es " + sumaImp/numImp);
			System.out.println("El máximo de los pares es " + maxPar);
	}
}

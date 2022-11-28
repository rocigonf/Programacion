/*
 * EcuacionSegundoGrado.java
 * 
 * Este programa calcula una ecuación de segundo grado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class EcuacionSegundoGrado {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el valor de a");
		double a = s.nextDouble();
		
		System.out.println("Ahora introduce el valor de b");
		double b = s.nextDouble();
		
		System.out.println("A continuación introduce el valor de c");
		double c = s.nextDouble();
		
		
		double cuadrado = Math.pow(b,2);
		double cuenta = cuadrado - 4 * a * c;
		double raiz = Math.sqrt(cuenta);
		double neg = (-b - cuenta) / (2 * a);
		double pos = (-b + cuenta) / (2 * a);
		
		
		if (a == 0) {
			System.out.print("La ecuación no es de segundo grado.");
		} else if (cuenta < 0) {
			System.out.print("La ecuación no tiene solución.");
		} else {
			System.out.printf("Hay dos soluciones: x1 = %s y x2 = %s", pos, neg);
		}
		
		
	}
}


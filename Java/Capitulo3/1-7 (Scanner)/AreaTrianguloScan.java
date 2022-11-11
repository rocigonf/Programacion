/*
 * AreaTrianguloScan.java
 * 
 * Cálculo del área de un triángulo introduciendo las medidas por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class AreaTrianguloScan {
	
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		//Se pide por pantalla la base y altura del triángulo.
		System.out.print("Introduce la base y la altura respectivamente del triángulo en cm: ");
		
		
		double b = s.nextDouble();
		double h = s.nextDouble();		
		
		
		double area = (b * h) / 2;
		
		
		System.out.println("El área del triángulo es: " + area);
		
	}
}

/*
 * AreaRectanguloScan.java
 * 
 * Cálculo del área de un rectángulo introduciendo las medidas por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class AreaRectanguloScan {
	
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		//Se pide por pantalla la base y altura del rectángulo.
		System.out.print("Introduce la base y la altura respectivamente del rectángulo en cm: ");
		
		double b = s.nextDouble();
		double h = s.nextDouble();		
		
		double area = b * h;
		
		
		System.out.println("El área del rectángulo es: " + area);
		
	}
}


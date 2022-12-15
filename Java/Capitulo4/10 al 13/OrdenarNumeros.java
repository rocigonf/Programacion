/*
 * OrdenarNumeros.java
 * 
 * Este programa ordena tres números enteros introducidos por teclado.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class OrdenarNumeros {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca un número entero.");
		int num1 = s.nextInt();
		System.out.println("Ahora introduzca otro número entero.");
		int num2 = s.nextInt();
		System.out.println("A continuación introduzca el último número entero.");
		int num3 = s.nextInt();
		
		int ord;
		
		
		
		if (num1 > num2) {
			
			ord = num1;
			num1 = num2;
			num2 = ord;
		}
		
		
		if (num2 > num3) {
			
			ord = num2;
			num2 = num3;
			num3 = ord;
		}
		
		
		if (num3 > num1) {
			
			ord = num3;
			num3 = num1;
			num1 = ord;
		}
		
		System.out.printf("Los números de mayor a menor son %s > %s > %s", num1, num2, num3);
	}
}


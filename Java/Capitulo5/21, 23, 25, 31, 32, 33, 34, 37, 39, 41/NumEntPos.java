/*
 * NumEntPos.java
 * 
 * Este programa pide un número entero positivo, dice cuáles son y cuánto suman los dígitos pares.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
import java.util.Scanner;

public class NumEntPos {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero positivo: ");
		
		long numIntrod = s.nextLong();
		long num = numIntrod;
		long alReves = 0;
		int longitud = 0;
		
		
		if (num == 0) {
			longitud = 1;
		}
		
		while (num > 0) {
			alReves = (alReves * 10) + (num % 10);
			num /= 10;
			longitud++;
		}
		
		
		System.out.print("Dígitos pares: ");
		
		
		int digito;
		int sumPar = 0;
		
		
		for (int i = 0; i < longitud; i++) {
			digito = (int)(alReves % 10);
			
			if ((digito % 2) == 0) {
				System.out.print(digito + " ");
				sumPar += digito;
			}
			
			alReves /= 10;
		}
		
		System.out.printf("\nLa suma de los dígitos pares es %s",sumPar);
	}
}

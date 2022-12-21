/*
 * ConversorPalotes.java
 * 
 * Este programa es un conversor del sistema decimal al sistema de "palotes".
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
import java.util.Scanner;

public class ConversorPalotes {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		long num;
		
		do {
			System.out.print("Introduce un número entero positivo: ");
			num = s.nextInt();
		} while (num < 1);
			System.out.print(num + " = ");
			
		int aux = (int) num;
		int numDig = 0;
		int numReves = 0;
			
		while (aux > 0){
			numReves = ((numReves*10) + (aux % 10));
			aux /=10;
			numDig++;
		}
			
		int cifra = 0;
			
		for (int i = 0; i < numDig; i++){
			cifra = numReves%10;
			numReves /= 10;
		for (int j = 0; j < cifra; j++){
			System.out.print("|");
		}
		if (i < numDig-1){
			System.out.print("-");
		}
		}
	}
}

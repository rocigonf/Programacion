/*
 * DibujarUnaU.java
 * 
 * Este programa pide una altura y dibuja por pantalla la letra U hecha con asteriscos.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
import java.util.Scanner;

public class DibujarUnaU {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de la U: ");
		
		int alt = s.nextInt();
		
		
		for (int i = 1; i < alt; i++) {
			System.out.print("* ");
			
			for (int j = 2; j < alt; j++) {
				System.out.print(" ");
			}
			
			System.out.println("*");
		}
		
		System.out.print(" ");
		
		for (int i = 2; i < alt; i++) {
			System.out.print("*");
		}
	}
}

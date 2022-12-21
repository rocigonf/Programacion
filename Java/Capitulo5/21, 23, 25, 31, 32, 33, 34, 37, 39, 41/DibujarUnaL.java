/*
 * DibujarUnaL.java
 * 
 * Este programa pide una altura y dibuja la letra L por pantalla hecha con asteriscos.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class DibujarUnaL {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de la L: ");
		
		int alt = s.nextInt();
		
		
		for (int i = 1; i < alt; i++) {
			System.out.println("*");
		}
		
		for (int i = 0; i < alt / 2 + 1; i++) {
			System.out.print("* ");
		}
	}
}

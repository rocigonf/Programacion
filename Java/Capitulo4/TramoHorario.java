/*
 * TramoHorario.java
 * 
 * Pide hora por teclado y da los buenos días/tardes/noches.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class TramoHorario {
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Dime qué hora es actualmente. (0-24)");
		int hora = s.nextInt();
		
		if ((hora >= 6) && (hora <= 12)) {
			System.out.println("Buenos días");
		} else if ((hora >= 13) && (hora <= 20)) {
			System.out.println("Buenas tardes");
		} else if ((hora >= 21) && (hora <= 24 )) {
			System.out.println("Buenas noches");
		} else if ((hora <= 5)) {
			System.out.println("Buenas noches");
		} else {
			System.out.println("Has introducido una hora incorrecta");
		}
	}
}


/*
 * PiramideRellena.java
 * 
 * Este programa muestra una piramide dibujada un caracter introducido por teclado y el usuario puede decidir si apunta arriba, abajo, a la izquierda, o a la derecha.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;


public class PiramideRellena {
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Este programa dibuja una pirámide; introduce el carácter con el que quieras que se dibuje.");
		String relleno = s.nextLine();
		
		
		System.out.println("Escoge el tipo de pirámide");
		System.out.println("1. Que apunte hacia arriba");
		System.out.println("2. Que apunte hacia abajo");
		System.out.println("3. Que apunte a la izquierda");
		System.out.println("4. Que apunte a la derecha");
		int opcion = s.nextInt();
		
		
		switch(opcion) {
			case 1:
				System.out.println(" " + " " + relleno);
				System.out.println(" " + relleno + relleno + relleno);
				System.out.println(relleno + relleno + relleno + relleno + relleno);
			break;
			case 2:
				System.out.println(relleno + relleno + relleno + relleno + relleno);
				System.out.println(" " + relleno + relleno + relleno);
				System.out.println(" " + " " + relleno);
			break;
			case 3:
				System.out.println(" " + " " + relleno);
				System.out.println(" " + relleno + relleno);
				System.out.println(relleno + relleno + relleno);
				System.out.println(" " + relleno + relleno);
				System.out.println(" " + " " + relleno);
			break;
			case 4:
				System.out.println(relleno);
				System.out.println(relleno + " " + relleno);
				System.out.println(relleno + " " + relleno + " " + relleno);
				System.out.println(relleno + " " + relleno);
				System.out.println(relleno);
			break;
			default:
				
				}
	}
}


/*
 * PiramideColores.java
 * 
 * Este programa es una pirámide coloreada hecha con asteriscos.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class PiramideColores {
	
	public static void main (String[] args) {
		
		String ANSI_RED = "\u001B[31m";
		String ANSI_GREEN = "\u001B[32m";
		String ANSI_YELLOW = "\u001B[33m";
		String ANSI_BLUE = "\u001B[34m";
		String ANSI_PURPLE = "\u001B[35m";
		String ANSI_RESET = "\u001B[0m";
		
		System.out.println(ANSI_PURPLE + "    *    ");
		System.out.println(ANSI_BLUE + "   ***   ");
		System.out.println(ANSI_YELLOW + "  *****  ");
		System.out.println(ANSI_GREEN + " ******* ");
		System.out.println(ANSI_RED + "*********" + ANSI_RESET);
		
	}
}


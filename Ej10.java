/*
 * Ej10.java
 * 
 * Este ejercicio es un corazón a color.
 * 
 * Copyright 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class Ej10 {
	
	public static void main (String[] args) {
		
		String ANSI_RED = "\u001B[31m";
		String ANSI_WHITE = "\u001B[37m";
		String ANSI_RESET = "\u001B[0m";
		
		System.out.println(ANSI_WHITE + "■■■■■■■■■■■■■");
		System.out.println(ANSI_WHITE + "■■■" + ANSI_RED + "■■■" + ANSI_WHITE + "■" + ANSI_RED + "■■■" + ANSI_WHITE + "■" + ANSI_WHITE + "■■" + ANSI_RESET);
		System.out.println(ANSI_WHITE + "■■" + ANSI_RED + "■" + ANSI_WHITE + "■■■" + ANSI_RED + "■" + ANSI_WHITE +  "■■■" + ANSI_RED + "■" + ANSI_WHITE + "■■" + ANSI_RESET);
		System.out.println(ANSI_WHITE + "■■" + ANSI_RED + "■" + ANSI_WHITE + "■■■■■■■" + ANSI_RED + "■" + ANSI_WHITE + "■■" + ANSI_RESET);
		System.out.println(ANSI_WHITE + "■■■" + ANSI_RED + "■" + ANSI_WHITE + "■■■■■" + ANSI_RED + "■" + ANSI_WHITE + "■■■" + ANSI_RESET);
		System.out.println(ANSI_WHITE + "■■■■" + ANSI_RED + "■" + ANSI_WHITE + "■■■" + ANSI_RED + "■" + ANSI_WHITE + "■■■■" + ANSI_RESET);
		System.out.println(ANSI_WHITE + "■■■■■" + ANSI_RED + "■" + ANSI_WHITE + "■" + ANSI_RED + "■" + ANSI_WHITE + "■■■■■" + ANSI_RESET);
		System.out.println(ANSI_WHITE + "■■■■■■" + ANSI_RED + "■" + ANSI_WHITE + "■■■■■■" + ANSI_RESET);
		System.out.println(ANSI_WHITE + "■■■■■■■■■■■■■");
	}
}


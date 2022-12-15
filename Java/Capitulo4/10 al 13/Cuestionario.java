/*
 * Cuestionario.java
 * 
 * Este programa es un cuestionario en el cual si aciertas se suma un punto.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;

public class Cuestionario {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		int puntos = 0;
		String respuesta;
		
		System.out.println("CUESTIONARIO JAVA");
		
		
		System.out.println("1º ¿Qué tipo de variable indica un número entero?");
		System.out.println("a)double    b)String     c)int");
		
		respuesta = s.nextLine();
		if (respuesta.equals("c")) {
			puntos++;
		}
		
		System.out.println("2º Para utilizar un Scanner correctamente, al principio de nuestro código debemos poner: ");
		System.out.println("a)import java.util.Scanner     b)insert java.util.Scanner     c)index java.util.Scanner");
		
		respuesta = s.nextLine();
		if (respuesta.equals("a")) {
			puntos++;
		}
		
		System.out.println("3º Se puede utilizar un if sin else:");
		System.out.println("a)Verdadero   b)Falso");
		
		respuesta = s.nextLine();
		if (respuesta.equals("a")) {
			puntos++;
		}
		
		System.out.println("4º ¿Qué debo poner tras el 'print' para formatear?");
		System.out.println("a)ln  b)f  c)Nada");
		
		respuesta = s.nextLine();
		if (respuesta.equals("b")) {
			puntos++;
		}
		
		System.out.println("5º ¿Qué se hace antes de ejecutar un código en Java?");
		System.out.println("a)Construir  b)Nada  c)Compilar");
		
		respuesta = s.nextLine();
		if (respuesta.equals("c")) {
			puntos++;
		}
		
		System.out.println("6º ¿Qué es lo primero que se suele aprender en Java?");
		System.out.println("a)A sumar  b)A imprimir texto  c)Bucles");
		
		respuesta = s.nextLine();
		if (respuesta.equals("b")) {
			puntos++;
		}
		
		System.out.println("7º Un switch fallará si al final no pones un:");
		System.out.println("a)default  b)break  c)if");
		
		respuesta = s.nextLine();
		if (respuesta.equals("a")) {
			puntos++;
		}
		
		System.out.println("8º ¿Puedo crear una variable con el nombre que quiera en minúsculas?");
		System.out.println("a)No  b)Si  c)Solo si la primera letra está en mayúsculas");
		
		respuesta = s.nextLine();
		if (respuesta.equals("b")) {
			puntos++;
		}
		
		System.out.println("9º ¿Qué tipo de variable se usa para un solo caracter de texto?");
		System.out.println("a)int  b)String  c)char");
		
		respuesta = s.nextLine();
		if (respuesta.equals("c")) {
			puntos++;
		}
		
		System.out.println("10º ¿Cómo se indica que dos números son distintos?");
		System.out.println("a)!=  b)==  c)<>");
		
		respuesta = s.nextLine();
		if (respuesta.equals("a")) {
			puntos++;
		}
		
		System.out.printf("Su puntuación es de %s.", puntos);
	}
}


/*
 * DiasSemana.java
 * 
 * Este programa indica el día de la semana según su número.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;


public class DiasSemana {
	public static void main (String[] args){
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduzca un número del 1 al 7 que corresponda con los días de la semana");
		int dia = s.nextInt();
		
		
		String nombreDia;
		
		switch (dia) {
			case 1:
				nombreDia = "lunes";
				break;
			case 2:
				nombreDia = "martes";
				break;
			case 3:
				nombreDia = "miércoles";
				break;
			case 4:
				nombreDia = "jueves";
				break;
			case 5:
				nombreDia = "viernes";
				break;
			case 6:
				nombreDia = "sábado";
				break;
			case 7:
				nombreDia = "domingo";
				break;
			default:
				nombreDia = "No existe ese día";
		}
		
		if  (nombreDia == "No existe ese día") {
			System.out.printf(nombreDia);
		} else {
			System.out.printf("El día número %s es el %s.", dia, nombreDia);
		}
	}
}

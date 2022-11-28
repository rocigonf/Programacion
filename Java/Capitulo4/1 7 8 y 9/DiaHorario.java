/*
 * DiaHorario.java
 * 
 * Este programa calcula el área de distintos polígonos dando a escoger éste con un menú.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
 import java.util.Scanner;
 
 public class DiaHorario {
 
	public static void main(String[] args){
		
		
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca un día de la semana");
		String dia = s.nextLine();
		
		
		String asignatura;
		
		
		switch (dia) {
			
			case "lunes":
			case "miércoles":
				asignatura = "Sistemas Informáticos";
			break;
			
			
			case "martes":
			case "jueves":
			case "viernes":
				asignatura = "Programación";
			break;
			
			
			default:
				asignatura = "inexistente";	
			
		}
		
		if (asignatura == "inexistente"){
			System.out.println("Este día no existe o no hay clase.");
		} else {
			System.out.printf("El %s hay %s a primera hora", dia, asignatura);
		}
	}
}

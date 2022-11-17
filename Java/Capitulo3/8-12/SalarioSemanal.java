/*
 * SalarioSemanal.java
 * 
 * Este programa calcula el salario semanal de un empleado en base a las horas trabajadas.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class SalarioSemanal {
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduzca el número de horas trabajadas semanalmente");
		int numHoras = s.nextInt();
		
		int euros = 12;
		
		int salario = euros * numHoras;
		
		System.out.printf("Tu sueldo por %s horas es de %s euros", numHoras, salario);
		
	}
}


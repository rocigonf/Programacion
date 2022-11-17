/*
 * SalarioSemanal2.java
 * 
 * Este programa calcula el salario semanal de un empleado considerando las horas extra trabajadas.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


import java.util.Scanner;


public class SalarioSemanal2 {
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduzca el número de horas trabajadas semanalmente");
		int numHoras = s.nextInt();
		
		
		int euros = 12;
		int eurosExtra = 16;
		
		
		int salario;
		if (numHoras >=41) {
			salario = numHoras * eurosExtra;
		} else {
			salario = numHoras * euros;
			}
		
		
		System.out.printf("El sueldo semanal que le corresponde por trabajar %s horas es de %s euros.", numHoras, salario);
		
		
	}
}


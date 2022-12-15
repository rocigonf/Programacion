/*
 * HoraMinSec.java
 * 
 * Este programa te dice los segundos que quedan hasta medianoche.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;


public class HoraMinSec {
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca la hora y minutos actuales en formato de 24h");
		
		System.out.println("Horas:");
		int horas = s.nextInt();
		
		System.out.println("Minutos:");
		int minutos = s.nextInt();
		
		
		int secTransc = (horas * 3600) + (minutos * 60);
		int secMedNoche = (24 * 3600) - secTransc;
		
		System.out.printf("Desde las %s y %s hasta la media noche quedan %s segundos", horas, minutos, secMedNoche);	
		
	}
}


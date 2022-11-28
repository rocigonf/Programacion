/*
 * EstacionesAño.java
 * 
 * Este programa indica la estación del año según su mes.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
 import java.util.Scanner;
 
 public class EstacionesAño {
	public static void main (String[] args){
		
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduzca el mes del año");
		String mes = s.nextLine();
		
		
		String estacion;
		
		switch (mes) {
			
			case "diciembre" :
			case "enero":
			case "febrero":
				estacion = "invierno";
				break;
				
				
			case "marzo":
			case "abril":
			case "mayo":
				estacion = "primavera";
				break;
				
				
			case "junio":
			case "julio":
			case "agosto":
				estacion = "verano";
				break;
				
				
			case "septiembre":
			case "octubre":
			case "noviembre":
				estacion = "otoño";
				break;
				
				
			default:
				estacion = "Mes inexistente.";
		}
		
		if (estacion == "Mes inexistente.") {
			System.out.println("Este mes no existe.");
		} else {
			System.out.printf("El mes %s corresponde a %s", mes, estacion);
			}
			
	}
}

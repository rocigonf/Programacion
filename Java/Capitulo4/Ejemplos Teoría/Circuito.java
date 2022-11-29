/*
 * Circuito.java
 * 
 * Este programa te dice las localidades por las que tienes que pasar para completar una ruta.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */

import java.util.Scanner;


public class Circuito {
	
	public static void main (String[] args) {
		
				
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("             MÁLAGA-VALENCIA             ");
		System.out.println("      Escoja su localidad de salida.     ");
		System.out.println(" --------------------------------------- ");
		System.out.println("             1. Málaga.                  ");
		System.out.println("             2. Almería.                 ");
		System.out.println("             3. Villarobledo.            ");
		System.out.println("             4. Guadix.                  ");
		System.out.println("             5. Requena.                 ");
		System.out.println(" --------------------------------------- ");
		System.out.println("       Elija una opción del 1 al 5       ");
		 
		int opcion = s.nextInt();
		
		
		String ruta = "La mejor ruta es la siguiente: ";
		String ciudades = "Las ciudades por las que pasarás son: ";
		
		//Se definen las ciudades.
		String ciud1 = "Málaga, ";
		String ciud2 = "Almería, ";
		String ciud3 = "Murcia, ";
		String ciud4 = "Elche, ";
		String ciud5 = "Guadix, ";
		String ciud6 = "Motril, ";
		String ciud7 = "Jaen, ";
		String ciud8 = "Valdepeñas, ";
		String ciud9 = "Valencia, ";
		String ciud10 = "Lorca, ";
		
		//Se definen las localidades por las que pasa la ruta.
		String loc1 = "Casabermeja, ";
		String loc2 = "Albolote, ";
		String loc3 = "Guadix, ";
		String loc4 = "Moixent, ";
		String loc5 = "Villarrobledo, ";
		String loc6 = "Requena, ";
		String loc7 = "Buñol, ";
		String loc8 = "Chiva, ";
		String loc9 = "Los Gallardos, ";
		String loc10 = "Níjar, ";
				
		switch (opcion) {
			
			case 1:
			
				ruta += (loc1 + loc2 + loc3 + loc4);
				ciudades += (ciud1 + ciud7 + ciud3 + ciud4 + ciud9);
				
				System.out.println(ciudades);
				System.out.println(ruta);
			break;
				
			case 2:
				
				ruta += (loc9 + loc10 + loc4);
				ciudades += (ciud2 + ciud10 + ciud3 + ciud4 + ciud9);
				
				System.out.println(ciudades);
				System.out.println(ruta);
				
			break;
			case 3:
				
				ruta += (loc5 + loc7 + loc8);
				ciudades += (ciud9);
				
				System.out.println(ciudades);
				System.out.println(ruta);
				
			break;
			case 4:
			
				ruta += (loc3 + loc4);
				ciudades += (ciud3 + ciud4 + ciud9);
				
				System.out.println(ciudades);
				System.out.println(ruta);
				
			break;
			case 5:
				
				ruta += (loc6 + loc7 + loc8);
				ciudades += (ciud9);
				
				System.out.println(ciudades);
				System.out.println(ruta);
				
			break;
			default:
			
				System.out.println("Introduce un dato válido.");
		}
		
		
	}
}


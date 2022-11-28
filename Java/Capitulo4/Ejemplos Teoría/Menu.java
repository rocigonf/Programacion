/*
 * Menu.java
 * 
 * Este programa calcula el área de distintos polígonos dando a escoger éste con un menú.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */
 
 import java.util.Scanner;
 
 public class Menu {
 
	public static void main(String[] args){
		
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("        CÁLCULO DE ÁREAS       ");
		System.out.println(" ----------------------------- ");
		System.out.println("          1. Triángulo.        ");
		System.out.println("          2. Rombo.            ");
		System.out.println("          3. Romboide.         ");
		System.out.println("          4. Trapecio.         ");
		System.out.println(" ----------------------------- ");
		System.out.println("  Elija una opción del 1 al 4  ");
		
		
		int opcion = s.nextInt();		
		double base, baseMayor, diagonal, diagonalMayor, altura;
		
		
		switch (opcion) {
			
			case 1:
				System.out.println("Introduzca la base del triángulo en cm");
				base = s.nextDouble();
				System.out.println("Introduzca la altura del triángulo en cm");
				altura = s.nextDouble();
				System.out.println("El área del triángulo es " + ((base * altura) / 2));
				break;
				
			case 2:
				System.out.println("Introduzca la diagonal en cm");
				diagonal = s.nextDouble();
				System.out.println("Introduzca la diagonal mayor en cm");
				diagonalMayor = s.nextDouble();
				System.out.println("El área del rombo es " + ((diagonal * diagonalMayor) / 2));
				break;
				
				
			case 3:
				System.out.println("Introduzca la base en cm");
				base = s.nextDouble();
				System.out.println("Introduzca la altura en cm");
				altura = s.nextDouble();
				System.out.println("El área del romboide es " + (base * altura));
				break;
				
				
			case 4: 
				System.out.println("Introduzca la base mayor en cm");
				baseMayor = s.nextDouble();
				System.out.println("Introduzca la base en cm");
				base = s.nextDouble();
				System.out.println("Introduzca la altura en cm");
				altura = s.nextDouble();
				System.out.println("El área del trapecio es " + (((baseMayor * base) / 2) * altura));
				break;
			
			
			default:
				System.out.println("Ha introducido un número inválido");
				
		}
	
	}
}

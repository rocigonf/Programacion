/*
 * ConcatenaChar.java
 * 
 * Conversión de variables tipo char a String.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class ConcatenaChar {
	
	public static void main (String[] args) {
		
		
		//Declaro las variables tipo char.
		char a1 = 'r';
		char a2 = 'a';
		char a3 = 't';
		char a4 = 'o';
		char a5 = 'n';
		
		//Declaro la variable resultado tipo String concatenando cada variable char con "" para dejar un caracter en blanco y se rellene en vez de sumar.
		String resultado;
		
		resultado = "" + a1 + "" + a2 + "" + a3 + "" + a4 + "" + a5;
		
		//Imprimo por pantalla las variables char por separado del resultado.
		System.out.printf("Las variables char son a1 = %s, a2 = %s, a3 = %s, a4 = %s, a5 = %s.\n", a1, a2, a3, a4, a5);
		System.out.println("El resultado de la concatenación de variables char es: " + resultado);
		
	}
}



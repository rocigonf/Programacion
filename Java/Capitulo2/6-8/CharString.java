/*
 * CharString.java
 * 
 * Concatenación de variables tipo char y String.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class CharString {
	
	public static void main (String[] args) {
		
		char a1 = 'h';
		char a2 = 'o';
		char a3 = 'l';
		char a4 = 'a';
		
		String frase1 = ", cómo estás?";
		
		
		//Imprimo el texto usando printf porque usando println no se pueden concatenar variables de tipo char ya que se suman.
		System.out.printf("%s%s%s%s", a1, a2, a3, a4 + frase1);
		
	}
}


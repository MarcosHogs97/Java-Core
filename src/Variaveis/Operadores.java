package Variaveis;

public class Operadores {

	public static void main(String[] args) {
		//Operador Unário.
		//int price = 10;
		//System.out.println(price++);
		//System.out.println(++price);
		//System.out.println(--price);
		//System.out.println(price--);
		
		//---------------------------------------------------------
		
		int valor1 = 10;
		int valor2 = 10;
		//int valor3 = 2;
		 
		//valor3 = valor1++;
		//System.out.println(valor3);
		
		System.out.println(valor1++ + ++ valor1); //22
		System.out.println(valor2++ + valor2++); //21
		System.out.println(valor2++ + ++valor1); //25
	}

}

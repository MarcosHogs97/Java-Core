package Exercicios;

public class Exercicio03DiferencaDeProdutos {

	public static void main(String[] args) {
		int produto01 = 5;
		int produto02 = 6;
		int valor01 = 0; // multiplicao do produto01 e produto02 
		
		int produto03 = 7;
		int produto04 = 8;
		int valor02 = 0;  // multiplicao do produto03 e produto04 
		
		double resutado = 0;
		
		valor01 = produto01 * produto02;
		valor02 = produto03 * produto04;
		
		resutado = valor01 - valor02;
		
		System.out.printf("DIFERENÇA = %.0f%n", resutado);
	}

}

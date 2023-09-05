package Exercicios;

public class Exercicio05CalcularValor {

	public static void main(String[] args) {
		//int codigoProduto01 = 0;
		int quantidadeProduto01 = 2;
		double valorProduto01 = 15.30;
				
		//int codigoProduto02 = 0;
		int quantidadeProduto02 = 4;
		double valorProduto02 = 5.20;

		double result = 0;
		
		result = (quantidadeProduto01*valorProduto01) + (quantidadeProduto02*valorProduto02);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", result);
	}

}

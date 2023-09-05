package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.ProdutoSP4;

public class Start_Produto4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProdutoSP4 produto = new ProdutoSP4(null, 0);
		
		System.out.println("Informe as informações do produto!");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		produto.setName(nome);
		
		System.out.println("Informe o preco do produto!");
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		produto.setPreco(preco);
		
		System.out.println("Informe a quantidade do produto que desja adcionar!");
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println(produto);
		
		System.out.println("Informe a quantidade do produto que desja subtrair!");
		System.out.print("Quantidade: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println(produto);
		
		sc.close();
	}

}

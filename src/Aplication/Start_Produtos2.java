package Aplication;

import java.util.Scanner;

import Entities.Produto;

public class Start_Produtos2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe as informações do produto");
		System.out.println("Nome: ");
		String nome = sc.next();
		
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome,preco,quantidade);
		
		System.out.println("Informações do produto: " + produto);
		System.out.println();
		
		System.out.println("Insira o nome de produtos a serem adicionados ao estoque: ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();
		
		System.out.println("Insira o numero de produtos a serem removidos do estoque");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();
		
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}

}

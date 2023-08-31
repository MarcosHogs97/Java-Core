package Entities;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	//colocar o metado set e get depois os atributos da classe
	
public String getName() {
		return nome;
	}
	
public String setName() {
	return nome;
}

public Produto(String nome,double preco,int quantidade) {	
	this.nome = nome;
	this.preco = preco;
	this.quantidade = quantidade;
}

public double valorTotalEmEstoque() {
	return preco * quantidade;
}

public void addProduto(int quantidade) {
	this.quantidade += quantidade;
}

public void removeProduto(int quantidade) {
	this.quantidade -= quantidade;
}
public String toString(){
	return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + " unidade, Total: R$ " + String.format("%.2f", valorTotalEmEstoque());
}
}

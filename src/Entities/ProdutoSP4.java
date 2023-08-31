package Entities;

public class ProdutoSP4 {
	private String nome;
	private double preco;
	private int quantidade;
	//colocar o metado set e get depois os atributos da classe
	
	//GET/SET NOME.
	public String getName() {
		return nome;
	}
	public void setName(String nome) {
		 this.nome = nome;
	}
	//GET/SET PREÇO.
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		 this.preco = preco;
	}
	//GET QUANTIDADE.
	public int getQuantidade() {
		return quantidade;
	}
	
	//construtor personalizado.
	public ProdutoSP4(String nome,double preco,int quantidade) {	
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	//construtor personalizado sobrecarga.
		public ProdutoSP4(String nome,double preco) {	
			this.nome = nome;
			this.preco = preco;
			
	}
	
	//Metodos gerais para modificaçao de preço e quantidade.
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	//toString para exibir as informacoes como string ao chamar (ProdutoSP4)
	public String toString(){
		return "Nome do produto: " + nome + ", R$ " + String.format("%.2f", preco) + ", " 
	+ quantidade + " unidade, Total: R$ " + String.format("%.2f", valorTotalEmEstoque()) + "\n";
	}
	
	
}

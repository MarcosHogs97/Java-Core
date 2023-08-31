package Entities;

public class Caminhao {
	private String marca;
	private int eixos;
	private int toneladas;
	private int quantidade;
	private double preco;
	
	/**Construtor personalizado para 3 parametros. **/
	
	public Caminhao(String marca, int eixos, int toneladas) {
		this.marca = marca;
		this.eixos = eixos;
		this.toneladas = toneladas;
	}
	
	public void addCaminhao(int quantidade){
		this.quantidade += quantidade;
	}
	public void addPreco(double preco){
		this.preco += preco;
	}
	public String toString(){
		return "Marca do caminhao " + marca + ", quantidade de eixos " + eixos + ", quantidade de toneladas " + toneladas + ", quantidade de caminhoes " + quantidade + ", preço do caminhao R$ " + preco;
	}
	
}

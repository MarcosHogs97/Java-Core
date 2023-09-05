package util;

public class Deslocamento {
	private double A1;
	private double A2;
	private double B1;
	private double B2;
	private double velocidade;
	
	public Deslocamento(double A1, double A2, double B1, double B2, double velocidade) {
		this.A1 = A1;
		this.A2 = A2;
		this.B1 = B1;
		this.B2 = B2;
		this.velocidade = velocidade;
	}
	//Get/Set A1
	public double getA1() {
		return A1;
	}
	public void setA1(double A1) {
		this.A1 = A1;
	}
	
	//Get/Set A2
	public double getA2() {
		return A2;
	}
	public void setA2(double A2) {
		this.A2 = A2;
	}
	
	//Get/Set B1
	public double getB1() {
		return B1;
	}
	public void setB1(double B1) {
		this.B1 = B1;
	}
	
	//Get/Set B2
	public double getB2() {
		return B2;
	}
	public void setB2(double B2) {
		this.B2 = B2;
	}
	
	//Get/Set velocidade
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
	//Metodos para calcular a distancia entre dois pontos
	
	public double calcularDistancia() {
		double distancia = Math.sqrt(((A1 - B1) * (A1 - B1)) + ((A2 - B2) * (A2 - B2))); 
		return distancia;
	}
	
	//Metodo para calcular o tempo de deslocamento
	
	public double calcularTempoDeslocamento() {
		double tempo = calcularDistancia() / velocidade;
		return tempo;
	}
	
	public String toString(){
		return "A distancia entre dois pontos é de " + String.format("%.2f", calcularDistancia()) +
				" e o tempo de deslocamento é de " + String.format("%.2f",calcularTempoDeslocamento());
	}
}

package Entities;

public class TesteExploradorRobor {
	public String status = "Explorando";
	public int velocidade;
	public double temperatura;
	public String nome;
	
	
	public void verificarTemperatura(){
		temperatura = (temperatura * (velocidade * 0.12));
		if(temperatura > 45) {
			status = "Retorne imediatamente para a base";
			velocidade = 7;
		}
		
	}	
	public void exibirAtributos(){
		verificarTemperatura();
		System.out.println("\n================================");
		System.out.println("Nome: " + nome);
		System.out.println("Status: " + status);
		System.out.println("Velocidade: " + velocidade);
		System.out.printf("Temperatura: %.2f %n",temperatura);
		System.out.println("================================");
		
	}
	
}

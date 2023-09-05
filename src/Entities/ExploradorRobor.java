package Entities;

public class ExploradorRobor {
	public String status;
	public int velocidade;
	public double temperatura;
	
	
	public void verificarTemperatura(){
		if(temperatura > 45) {
			status = "Retorne imediatamente para a base";
			velocidade = 5;
		}
	}	
	public void exibirAtributos(){
		verificarTemperatura();
		System.out.println("Status: " + status);
		System.out.println("Velocidade: " + velocidade);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("================================\n");
		
	}
	
}

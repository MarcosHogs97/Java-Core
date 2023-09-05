package Aplication;

import java.util.Scanner;

import Entities.ExploradorRobor;

public class StartrRobot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ExploradorRobor wally = new ExploradorRobor();

		wally.status = "Explorando";
		wally.velocidade = 7;
		wally.temperatura = 20;
		
		wally.exibirAtributos();
		
		System.out.println("Alterar a velocidade: ");
		wally.velocidade = sc.nextInt();
		System.out.println("Alterar a Temperatura: ");
		wally.temperatura = sc.nextDouble();
		wally.exibirAtributos();
		
		sc.close();
	}

}

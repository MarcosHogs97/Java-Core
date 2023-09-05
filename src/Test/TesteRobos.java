package Test;

import java.util.Scanner;

import Entities.TesteExploradorRobor;

public class TesteRobos {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
		
		TesteExploradorRobor beta = new TesteExploradorRobor();
		System.out.println("Informe o nome do 1º robor: ");
		beta.nome = sc.next();
		TesteExploradorRobor omega = new TesteExploradorRobor();
		System.out.println("Informe o nome do 2º robor: ");
		omega.nome = sc.next();
		
		System.out.println("Alterar a velocidade do 1ºrobor: ");
		beta.velocidade = sc.nextInt();
		System.out.println("Alterar a Temperatura do 1º robor: ");
		beta.temperatura = sc.nextDouble();

		System.out.println("Alterar a velocidade do 2ºrobor: ");
		omega.velocidade = sc.nextInt();
		System.out.println("Alterar a Temperatura do 2º robor: ");
		omega.temperatura = sc.nextDouble();
		
		beta.exibirAtributos();
		omega.exibirAtributos();
		
		sc.close();
		}

}

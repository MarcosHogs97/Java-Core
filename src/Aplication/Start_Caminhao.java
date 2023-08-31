package Aplication;

import java.util.Scanner;

import Entities.Caminhao;

public class Start_Caminhao {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Informe a marca do caminhao: ");
	String marca = sc.next();
	
	System.out.print("Informe a quantidade de eixos: ");
	int eixos = sc.nextInt();
	
	System.out.print("Informe a tonelada: ");
	int toneladas = sc.nextInt();
	
	Caminhao caminhao = new Caminhao(marca,eixos,toneladas);
	
	System.out.print("Informe a quantidade: ");
	int quantidade = sc.nextInt();
	caminhao.addCaminhao(quantidade);
	
	System.out.print("Informe a quantidade: ");
	double preco = sc.nextDouble();
	caminhao.addPreco(preco);
	
	System.out.println("Informacao do caminhao: " + caminhao);
	
	sc.close();
	}

}

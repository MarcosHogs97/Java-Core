package Aplication;

import java.util.Scanner;

import util.Deslocamento;

public class DistanciaTempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deslocamento deslocamento = new Deslocamento(0, 0, 0, 0, 0);
		
		System.out.print("Informe o distancia X1: ");
		double x1 = sc.nextDouble();
		deslocamento.setA1(x1);
		System.out.print("Informe o distancia Y1: ");
		double y1 = sc.nextDouble();
		deslocamento.setB1(y1);
		System.out.print("Informe o distancia X2: ");
		double x2 = sc.nextDouble();
		deslocamento.setA2(x2);
		System.out.print("Informe o distancia Y2: ");
		double y2 = sc.nextDouble();
		deslocamento.setB2(y2);
		System.out.print("Informe a velocidade: ");
		double velocidade = sc.nextDouble();
		deslocamento.setVelocidade(velocidade);
		
		System.out.println(deslocamento);
		
		sc.close();
	}

}

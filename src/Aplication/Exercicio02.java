package Aplication;

import java.util.Scanner;

import Entities.Empregado;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		empregado.pedidoDeDados(sc);
		empregado.exibirResultado();
		
		sc.close();
	}

}

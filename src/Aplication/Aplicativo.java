package Aplication;

import java.util.Scanner;
import Entities.Triangulo;

public class Aplicativo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Triangulo X,Y; 
	
	X = new Triangulo("X");
	Y = new Triangulo("Y");
		
	X.lerLados(sc);
	Y.lerLados(sc);	
	
	X.exibirResultado();
	Y.exibirResultado();
	
		sc.close();
	}

}
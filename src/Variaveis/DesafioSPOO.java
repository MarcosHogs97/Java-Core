package Variaveis;

import java.util.Scanner;

public class DesafioSPOO {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double valorA = 0,valorB = 0,valorC = 0,valorP = 0,areaX = 0,valorAY = 0,valorBY = 0,valorCY = 0,valorPY = 0,areaY = 0;
	
	System.out.println("Informe o valor do lada A do triangulo X: ");
	valorA = entrada.nextDouble();
	System.out.println("Informe o valor do lada B do triangulo X: ");
	valorB = entrada.nextDouble();
	System.out.println("Informe o valor do lada C do triangulo X: ");
	valorC = entrada.nextDouble();
	
	if (valorA + valorB > valorC && valorA + valorC > valorB && valorB + valorC > valorA) {
	    valorP = (valorA + valorB + valorC) / 2;
	    areaX = valorP * ((valorP - valorA) * (valorP - valorB) * (valorP - valorC));
	    areaX = Math.sqrt(areaX);
	} else {
	    System.out.println("Os lados informados não formam um triângulo válido para o Triângulo X.");
	    areaX = Double.NaN;
	}

	System.out.println("=============================================\n");
	System.out.println("Informe o valor do lada A do triangulo Y: ");
	valorAY = entrada.nextDouble();
	System.out.println("Informe o valor do lada B do triangulo Y: ");
	valorBY = entrada.nextDouble();
	System.out.println("Informe o valor do lada C do triangulo Y: ");
	valorCY = entrada.nextDouble();

	if (valorAY + valorBY > valorCY && valorAY + valorCY > valorBY && valorBY + valorCY > valorAY) {
	    valorPY = (valorAY + valorBY + valorCY) / 2;
	    areaY = valorPY * ((valorPY - valorAY) * (valorPY - valorBY) * (valorPY - valorCY));
	    areaY = Math.sqrt(areaY);
	} else {
	    System.out.println("Os lados informados não formam um triângulo válido para o Triângulo Y.");
	    areaY = Double.NaN;
	}

	System.out.println("=============================================\n");
	System.out.printf("A area do triangulo X é : %.3f %n",areaX);
	System.out.printf("A area do triangulo Y é : %.3f %n",areaY);
	System.out.println("=============================================\n");
	if(areaX > areaY) {
		System.out.printf("Triangulo X é maior com: %.3f", areaX);
	} else if(areaX == areaY) {
		System.out.println("A area dos triangulos sao iguais");
	}else {
	
		System.out.printf("Triangulo Y é maior com: %.3f", areaY);
	}
	
	
	entrada.close();
	
	}

}

package Exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double valorA = 3.0;
		double valorB = 4.0;
		double valorC = 5.2;
		
		final double pi = 3.14159;
		double triangulo =0;
		double circulo =0;
		double trapezio =0;
		double quadrado =0;
		double retangulo =0;
		
		triangulo = (valorA * valorC) / 2;
		circulo = pi*(valorC * valorC);
		trapezio = ((valorA + valorB) * valorC) / 2;
		quadrado = valorB * valorB;
		retangulo = valorA * valorB;
		
		System.out.printf("Triangulo = %.3f%nCirculo = %.3f%nTrapezio = %.3f%nQuadrado = %.3f%nRetangulo = %.3f%n", triangulo, circulo, trapezio, quadrado ,retangulo);
		
	}

}

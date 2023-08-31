package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class RaioSemMetodoNaPropriaClasse {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com valor de raio: ");
			double raio = sc.nextDouble();
			double c = Calculadora.cincunferencia(raio);
			double v = Calculadora.volume(raio);
			
			System.out.printf("Circumference : %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("PI value: %.2f", Calculadora.PI);
			
			sc.close();
		}
}
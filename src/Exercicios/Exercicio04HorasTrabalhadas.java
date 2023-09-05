package Exercicios;

import java.util.Locale;

public class Exercicio04HorasTrabalhadas {

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		Locale.setDefault(locale);
		
		int funcionario = 6;
		double horasTrabalhadas = 145;
		double valorHora = 15.55;
		double result = 0;
		
		
		result = valorHora*horasTrabalhadas;
		
		System.out.printf("NUMBER = %d %nSALARY = U$ %.2f%n", funcionario, result);
		
		
		
	}

}

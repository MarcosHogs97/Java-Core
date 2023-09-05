package EstruturaDecisao;

import java.util.Scanner;

public class SeProf {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int quantidade = 0;
		double valorInformado;
		
		System.out.println("Informe um valor: ");
		valorInformado = sc.nextDouble();
		if (quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			System.out.println("Quantidade de numeros digitados: " + quantidade);
		}
		sc.close();
	}

}

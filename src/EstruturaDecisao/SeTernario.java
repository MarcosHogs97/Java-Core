package EstruturaDecisao;

import java.util.Scanner;

public class SeTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int quantidade = 0;
		double valor;
		double result = 0;
		
		
			System.out.println("Infome um valor: ");
			valor = sc.nextDouble();
			
		if(quantidade != 5 && valor != 0) {
			
			System.out.println("Infome um valor: ");
			valor = sc.nextDouble();
			result += valor;
			quantidade++;
		}
		if(quantidade != 5 && valor != 0) {
			
			System.out.println("Infome um valor: ");
			valor = sc.nextDouble();
			result += valor; 
			quantidade++;
		}
		if(quantidade != 5 && valor != 0) {
			
			System.out.println("Infome um valor: ");
			valor = sc.nextDouble();
			result += valor; 
			quantidade++;
		}
		if(quantidade != 5 && valor != 0) {
			
			System.out.println("Infome um valor: ");
			valor = sc.nextDouble();
			result += valor; 
			System.out.println("O valor informado é: " + result);
		}else {
			System.out.println("Tente novamente");
		}
		
		
		
sc.close();
	}

}

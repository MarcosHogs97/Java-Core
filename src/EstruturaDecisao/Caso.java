package EstruturaDecisao;

import java.util.Scanner;

public class Caso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		var valor = 1;
		switch (valor) {
		  case 1: case 2: case 3: case 4: case 5:
			  System.out.println("O valor é diferente de 0");
		    break;
		  default:
			  System.out.println("O valor é 0");
		    break;
		}
		
		entrada.close();
	}

}

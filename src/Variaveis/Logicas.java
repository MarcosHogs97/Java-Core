package Variaveis;

import java.util.Scanner;

public class Logicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean result;
		System.out.println("Informe o valor de X: ");
		double X = sc.nextDouble();
		
		result = X <= 20 && X == 10;
		
		System.out.println(result);
		
		result = X > 0 && X != 0;
		
		System.out.println(result);
		
		result = X <= 0 || X != 3 && X != 5 || X == 5;
		
		System.out.println(result);
		
		sc.close();
	}

}

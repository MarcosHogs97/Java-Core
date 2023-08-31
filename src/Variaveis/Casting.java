package Variaveis;

public class Casting {

	public static void main(String[] args) {
		int a = 5, b = 2;
		double result = 0;
		
		result = (double) a / b;
		
		System.out.println(result);
		
		a =  (int) 5.0;
		b = a;
	
		System.out.println(b);
		
	}

}

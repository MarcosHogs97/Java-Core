package EstruturaDecisao;

public class Enquanto {

	public static void main(String[] args) {
		// Implementaçao da variavel n iniciada em 0.
		int n = 0;
		String rsult;
		
		//Imprimir na tela todos os numeros de 0 a 11;
		//while (n < 11){
	
		//	System.out.println(n);
		//	n++;
		//};
		
		
		//while (n % 2 == 0 && n < 11){			
		//	System.out.println(n);	
		//	n++;
		//};
		
		while(n < 11) {
		rsult = (n % 2 == 0)? "" : n + "";
		System.out.println(rsult);
		n++;
		}
	}

}
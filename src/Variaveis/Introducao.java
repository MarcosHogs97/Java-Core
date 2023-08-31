package Variaveis;

public class Introducao {

	public static void main(String[] args) {
		
		//Variáveis locais são declaradas dentro de um método e estão disponíveis apenas dentro desse método. As variáveis locais são inicializadas quando o método é chamado e são destruídas quando o método retorna.
		int lapis = 1, caneta = 2;
		System.out.println(lapis + caneta);
		//Variáveis de instância são declaradas dentro de uma classe, mas fora de qualquer método, e estão disponíveis para todos os métodos da classe.As variáveis de instância são inicializadas quando um objeto é criado e são destruídas quando o objeto é descartado.
		float leite = 3.48f, agua = 8.95f;
		System.out.println(leite + agua);
		
		double cafe = 4.5;
		System.out.println(cafe);
		//Variáveis estáticas são declaradas dentro de uma classe, mas com a palavra-chave static, e estão disponíveis para todos os objetos da classe.As variáveis estáticas são inicializadas quando a classe é carregada e são destruídas quando a classe é descarregada.
		
		
		double x = 10.35784;
		System.out.print(x+"/ ");
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.printf("RESUTADO =  %.2f metros%n",x);
		String nome = "Maria";
		int idade= 31;
		double renda = 4000.00;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		// %f = ponto flutuante, %d = inteiro, %s = texto, %n = quebra de linha
	}

}

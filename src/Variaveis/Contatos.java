package Variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 String name;
		 String email;
		 long telefone; //long = bit 64, int = 32 bit, short = 16
		 char genero; // charAT(0) para um caracteres exemplo: M, charAt(1) para dois caracteres exemplo: AL
		 
		 System.out.println("Insira seu nome: \n");
		 name = sc.next();
		 
		 System.out.println("Insira seu genero: \n");
		 genero = sc.next().charAt(0);
		 
		 System.out.println("Insira seu email: \n");
		 email = sc.next();
		 
		 System.out.println("Insira seu telefone: \n");
		 telefone = sc.nextLong();
		 
		 sc.close();

		 System.out.printf("Nome: %s%nEmail: %s%nTelefone: %d%nGenero: %s", name,email,telefone,genero);
		 
		
		
		 
		 
 	}

}

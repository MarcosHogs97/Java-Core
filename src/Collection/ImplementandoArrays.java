package Collection;

import java.util.Locale;
import java.util.Scanner;


public class ImplementandoArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Exemplo 01 array notas de um aluno.
		// Iniciando as posições.
//		double notas[] = {1.0,2.0,3.0,4.0};
		// declarando tamanho do array.
		double notasAluno[] = new double [4];
		notasAluno[0] = 5.5;
		notasAluno[1] = 9.5;
		notasAluno[2] = 8.5;
		notasAluno[3] = 7.5;
		
		//JOptionPane.showMessageDialog(null,);
		double somanotas = 0;
		for (double nota : notasAluno) {		
			somanotas += nota;
			System.out.println(somanotas);
			//JOptionPane.showMessageDialog(null,"Notas: " + somanotas);
		}
		System.out.printf("Media: %.2f",somanotas/4);
		sc.close();
		
	}

}

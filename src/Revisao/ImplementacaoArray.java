package Revisao;

import javax.swing.JOptionPane;

public class ImplementacaoArray {
	public String nome;
	public double notasAlunoA[] = new double [3];
	public double media;
	
	public void addNotas() {
		double soma = 0;
		nome = JOptionPane.showInputDialog("Informe o nome do Aluno");
		for (int i = 0; i < notasAlunoA.length; i++) {
			notasAlunoA[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i+1) + "º nota do Aluno"));
			soma += notasAlunoA[i];
		}
		media = media(soma);
	}
	
	public double media(double soma) {
		return soma = soma / notasAlunoA.length;
	}

	public String toString() {
		return "\nA media do aluno " + nome + " é: " + String.format("%.2f",media) + "\n";
	}
}

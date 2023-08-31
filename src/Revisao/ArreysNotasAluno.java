package Revisao;

import javax.swing.JOptionPane;

public class ArreysNotasAluno {

	public static void main(String[] args) {
		ImplementacaoArray[] alunoA = new ImplementacaoArray[2];
		
		for (int i = 0; i < alunoA.length; i++) {
			alunoA[i] = new ImplementacaoArray();
			alunoA[i].addNotas();
		}
		String informaçoes = "";
		for (ImplementacaoArray nota : alunoA) {
			informaçoes += nota.toString();
		

	}
		JOptionPane.showMessageDialog(null,"Informacões das notas dos alunos\n" + informaçoes);
	}

}

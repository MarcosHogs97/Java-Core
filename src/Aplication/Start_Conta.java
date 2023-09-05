package Aplication;

import Entities.Conta;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Start_Conta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta conta;
	
		int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da conta!", "Abertura da conta.",JOptionPane.PLAIN_MESSAGE));
		String proprietario = JOptionPane.showInputDialog(null, "Informe o nome do proprietario", "Abertura da conta.",JOptionPane.PLAIN_MESSAGE);
		String options[] = {"Sim","Nao"};
		int choice = JOptionPane.showOptionDialog(null, "Deseja iniciar seu primeiro deposito", "Deposito Inicial", JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, options, null);
		if(choice == 0) {		
			double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja Adicionar",0));
			conta = new Conta(numeroConta,proprietario,saldo);
			conta.startAplication();
		}else {
			conta = new Conta(numeroConta,proprietario);
			conta.startAplication();
		
		}
		
		
		
	}

}

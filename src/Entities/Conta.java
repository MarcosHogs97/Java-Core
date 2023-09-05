package Entities;

import javax.swing.JOptionPane;

public class Conta {
	private int numeroConta;
	private String donoConta;
	private double saldoConta;
	private static final double taxa = 5.00;
	

	// construtors.
	public Conta(int numeroConta, String donoConta, double saldoConta) {
		this.numeroConta = numeroConta;
		this.donoConta = donoConta;
		this.saldoConta = saldoConta;
	}

	public Conta(int numeroConta, String donoConta) {
		this.numeroConta = numeroConta;
		this.donoConta = donoConta;
	}

	// Gets / Sets.
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getDonoConta() {
		return donoConta;
	}
	
	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	// adcinar saldo conta.
	public void addDepositoConta(double depositoConta) {
		saldoConta += depositoConta;
	}
	public void addSaqueConta(double saqueConta) {
		saldoConta -= saqueConta + taxa;
	}
	
	//Metodo toString.
	public String toString() {
		return "Conta: " + numeroConta + "\nProprietario : " + donoConta + String.format("\nSaldo da Conta: R$ %.2f", saldoConta);
	}
	
	public void startAplication() {
		String options[] = {"Deposito","Saque","Visualizar saldo","Sair"};
		int escolha = JOptionPane.showOptionDialog(null, "Escolha oque deseja fazer.", "Menu", JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, options, null);
		switch (escolha) {
		case 0:
			depositar();
			startAplication();
			break;

		case 1:
			retirada();
			startAplication();
			break;
		case 2:
			JOptionPane.showMessageDialog(null,toString());
			startAplication();
			break;
		case 3:
			escolha = JOptionPane.showConfirmDialog(null, "Deseja sair?");
			if(escolha == 0) {
				JOptionPane.showMessageDialog(null,"Obrigado por utilizar nossa aplicação!!");
			}else {
				startAplication();
			}
			
			break;
		default:
			break;
		}
		
	}
	
	//metodo para depositar. 
		public void depositar() {
			double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja depositar",0));
			addDepositoConta(deposito);
			JOptionPane.showMessageDialog(null,"Deposito realizado com sucesso\nSaldo atual: R$ " + getSaldoConta());
		}
		
		//metodo para retirar. 
		public void retirada() {
			double retirada = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar",0));
			addSaqueConta(retirada);
			JOptionPane.showMessageDialog(null,"Saque realizado com sucesso\nSaldo atual: R$ " + getSaldoConta());

		}
	
}

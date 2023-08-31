package Revisao;

public class Agenda {
	// Atributos ou Variáveis da classe.
	private String nome;
	private String telefone;
	private String email;
	private String endereço;

	// Iniciar os atributos(Construtor).
	public Agenda(String nome, String telefone, String email, String endereço) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereço = endereço;
	}
	public void setAgenda(String nome, String telefone, String email, String endereço) {
		setNome(nome);
		setTelefone(telefone);
		setEmail(email);
		setEndereço(endereço);
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereço() {
		return endereço;
	}
	
	public String toString() {
		return "nome: " + getNome() + "\nTelefone: " + getTelefone() + "\nE-mail: " + getEmail() + "\nEndereço: " + getEndereço();
	}

}

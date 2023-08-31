package Entities;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {

	private ArrayList<Livro> listaLivros;

	public Biblioteca() {
		listaLivros = new ArrayList<>();
	}

	public int quantosLivros() {
		return listaLivros.size();
	}

	public void adicionarLivro(Livro livro) {
		listaLivros.add(livro);
	}

	public void listarLivros() {
		String informaçoes = "";
		for (Livro livro : listaLivros) {
			informaçoes += "============================\n" + livro.toString();
		}
		JOptionPane.showMessageDialog(null, informaçoes);
	}

	public void removerLivro(String titulo) {
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getTitulo().equals(titulo)) {
				listaLivros.remove(i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		int choice;
		do {
			String[] options = { "Adicionar livro", "Remover livro", "Listar livros", "Quantidade de Livros", "Sair" };
			choice = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
					JOptionPane.DEFAULT_OPTION, null, options, null);
			switch (choice) {
			case 0:
				String titulo = JOptionPane.showInputDialog("Digite o título do livro");
				String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
				String ano = JOptionPane.showInputDialog("Digite o ano do livro:");
				String genero = JOptionPane.showInputDialog("Digite o gênero do livro:");
				String editora = JOptionPane.showInputDialog("Digite a editora do livro:");
				String paginas = JOptionPane.showInputDialog("Digite o número de páginas do livro:");
				Livro livro = new Livro(titulo, autor, ano, genero, editora, paginas);
				biblioteca.adicionarLivro(livro);
				break;

			case 1:
				String tituloRemover = JOptionPane.showInputDialog("Digite o título do livro que deseja remover:");
				biblioteca.removerLivro(tituloRemover);
				break;

			case 2:
				biblioteca.listarLivros();
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Existem " + biblioteca.quantosLivros() + " Livros.");

				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Agradecemos por usar nossa aplicação!!");
				break;
			default:
				break;

			}
		} while (choice != 4);

	}
}

class Livro {

	private String titulo;
	private String autor;
	private String ano;
	private String genero;
	private String editora;
	private String paginas;

	public Livro(String titulo, String autor, String ano, String genero, String editora, String paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.genero = genero;
		this.editora = editora;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String toString() {
		return "\n" + "Titulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\nGênero: " + genero
				+ "\nEditora: " + editora + "\nPáginas: " + paginas + "\n";
	}
}
package Entities;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {
	// Armazena uma lista de livros.
	private ArrayList<Livro> listaLivros;
	// Armazena uma lista de livros que foram removidos.
	private ArrayList<Livro> livrosRemovidos;

	// Inicializa a lista de livros com uma nova lista vazia.
	public Biblioteca() {
		listaLivros = new ArrayList<>();
		livrosRemovidos = new ArrayList<Livro>();
	}

	// Get de livros removidos.
	public ArrayList<Livro> getLivrosRemovidos() {
		return livrosRemovidos;
	}

	// Retorna o número de livros na biblioteca.
	public int quantosLivros() {
		return listaLivros.size();
	}

	// Adiciona um livro à biblioteca.
	public void adicionarLivro(Livro livro) {
		listaLivros.add(livro);
	}

	// Exibe uma lista de todos os livros na biblioteca.
	public void exibirlistarLivros() {
		String informaçoes = "";
		for (Livro livro : listaLivros) {
			informaçoes += "============================\n" + livro.toString();
		}
		JOptionPane.showMessageDialog(null, informaçoes);
	}

	// Remove um livro da lista de Livros e adicona a lista de livros removidos(Por
	// Titulo).
	public void removerPorTitulo(String titulo) {
		boolean livroEncontrado = false;
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getTitulo().equals(titulo)) {
				livroEncontrado = true;
				livrosRemovidos.add(listaLivros.remove(i));
				break;
			}
		}

		if (livroEncontrado) {
			JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Livro não encontrado.");
		}

	}

	// Remove um livro da lista de Livros e adicona a lista de livros removidos(Por
	// ID).
	public void removerPorID(int id) {
		boolean livroEncontrado = false;
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getID() == id) {
				livroEncontrado = true;
				livrosRemovidos.add(listaLivros.remove(i));
				break;
			}
		}

		if (livroEncontrado) {
			JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Livro não encontrado.");
		}

	}

	// Exibe uma lista de todos os livros removidos na biblioteca.
	public void exibirLivrosRemovidos() {
		ArrayList<Livro> livrosRemovidos = getLivrosRemovidos();
		String informaçoes = "";
		for (Livro livro : livrosRemovidos) {
			informaçoes += "=====================\n" + "ID: " + livro.getID() + "\nTitulo: " + livro.getTitulo() + "\n";
		}
		JOptionPane.showMessageDialog(null, "Lista dos titulos removidos\n" + informaçoes);
	}

	// Medoto main
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		int choice;

		do {
			String[] opcoesMenu = { "Adicionar livro", "Remover livro", "Listar livros", "Quantidade de Livros",
					"Livros Removidos", "Sair" };
			choice = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
					JOptionPane.DEFAULT_OPTION, null, opcoesMenu, null);
			switch (choice) {
			// Adicionar livro
			case 0:
				String titulo = JOptionPane.showInputDialog("Digite o título do livro");
				String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
				String ano = JOptionPane.showInputDialog("Digite o ano do livro:");
				String genero = JOptionPane.showInputDialog("Digite o gênero do livro:");
				String editora = JOptionPane.showInputDialog("Digite a editora do livro:");
				String paginas = JOptionPane.showInputDialog("Digite o número de páginas do livro:");
				int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro:"));
				Livro livro = new Livro(id, titulo, autor, ano, genero, editora, paginas);
				biblioteca.adicionarLivro(livro);
				break;
			// Remover livro
			case 1:
				String[] opcoesRemover = { "Remover por titulo", "Remover por id", "Voltar" };
				choice = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
						JOptionPane.DEFAULT_OPTION, null, opcoesRemover, null);
				switch (choice) {
				// Remover livro por titulo
				case 0:
					String removerPorTitulo = JOptionPane
							.showInputDialog("Digite o título do livro que deseja remover:");
					biblioteca.removerPorTitulo(removerPorTitulo);
					break;
				/// Remover livro por ID
				case 1:
					int removerPorID = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o ID do livro que deseja remover:"));
					biblioteca.removerPorID(removerPorID);
					break;
				case 2:
					break;
				default:
					break;
				}

				break;
			// Listar livros
			case 2:
				biblioteca.exibirlistarLivros();
				break;
			// Quantidade de Livros
			case 3:
				JOptionPane.showMessageDialog(null, "Existem " + biblioteca.quantosLivros() + " Livros.");

				break;
			// Livros Removidos
			case 4:
				biblioteca.exibirLivrosRemovidos();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Agradecemos por usar nossa aplicação!!");
				break;
			default:
				break;

			}
		} while (choice != 5);

	}
}

//Esta classe representa um livro.
class Livro {

	private int id;
	private String titulo;
	private String autor;
	private String ano;
	private String genero;
	private String editora;
	private String paginas;

	// Inicializa os atributos com os valores fornecidos pelo usuário.
	public Livro(int id, String titulo, String autor, String ano, String genero, String editora, String paginas) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.genero = genero;
		this.editora = editora;
		this.paginas = paginas;
	}

	// Retorna o título do livro.
	public String getTitulo() {
		return titulo;
	}

	// Retorna o título do id.
	public int getID() {
		return id;
	}

	// Retorna uma representação textual do livro.
	public String toString() {
		return "\n" + "ID: " + id + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\nGênero: "
				+ genero + "\nEditora: " + editora + "\nPáginas: " + paginas + "\n";
	}
}
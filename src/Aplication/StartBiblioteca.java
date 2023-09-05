package Aplication;

import javax.swing.JOptionPane;

import Entities.Biblioteca;
import Entities.BibliotecaLivro;

public class StartBiblioteca {

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
				BibliotecaLivro livro = new BibliotecaLivro(id, titulo, autor, ano, genero, editora, paginas);
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

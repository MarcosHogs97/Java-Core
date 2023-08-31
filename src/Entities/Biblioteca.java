package Entities;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {
	// Armazena uma lista de livros.
	private ArrayList<BibliotecaLivro> listaLivros;
	// Armazena uma lista de livros que foram removidos.
	private ArrayList<BibliotecaLivro> livrosRemovidos;

	// Inicializa a lista de livros com uma nova lista vazia.
	public Biblioteca() {
		listaLivros = new ArrayList<>();
		livrosRemovidos = new ArrayList<BibliotecaLivro>();
	}

	// Get de livros removidos.
	public ArrayList<BibliotecaLivro> getLivrosRemovidos() {
		return livrosRemovidos;
	}

	// Retorna o número de livros na biblioteca.
	public int quantosLivros() {
		return listaLivros.size();
	}

	// Adiciona um livro à biblioteca.
	public void adicionarLivro(BibliotecaLivro livro) {
		listaLivros.add(livro);
	}

	// Exibe uma lista de todos os livros na biblioteca.
	public void exibirlistarLivros() {
		String informaçoes = "";
		for (BibliotecaLivro livro : listaLivros) {
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
		ArrayList<BibliotecaLivro> livrosRemovidos = getLivrosRemovidos();
		String informaçoes = "";
		for (BibliotecaLivro livro : livrosRemovidos) {
			informaçoes += "=====================\n" + "ID: " + livro.getID() + "\nTitulo: " + livro.getTitulo() + "\n";
		}
		JOptionPane.showMessageDialog(null, "Lista dos titulos removidos\n" + informaçoes);
	}

	
}

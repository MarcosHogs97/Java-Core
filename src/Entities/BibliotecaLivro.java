package Entities;

public class BibliotecaLivro {
	private int id;
	private String titulo;
	private String autor;
	private String ano;
	private String genero;
	private String editora;
	private String paginas;

	// Inicializa os atributos com os valores fornecidos pelo usuário.
	public BibliotecaLivro(int id, String titulo, String autor, String ano, String genero, String editora, String paginas) {
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

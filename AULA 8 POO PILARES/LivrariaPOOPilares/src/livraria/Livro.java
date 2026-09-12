package livraria;

public class Livro {

	// Atributos privados (Encapsulamento)
	private String titulo;
	private String autor;
	private String editora;
	private int numeroPaginas;
	private int anoPublicacao;

	// Construtor
	public Livro(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		this.anoPublicacao = anoPublicacao;
	}

	// Método para exibir dados bibliográficos
	public void exibirDados() {
		System.out.println("------------------------------------------");
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Editora: " + editora);
		System.out.println("Páginas: " + numeroPaginas);
		System.out.println("Ano de Publicação: " + anoPublicacao);
	}

	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}

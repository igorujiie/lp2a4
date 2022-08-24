

public class Livro {

	private int id;
	private Editora editora;
	private String titulo;
	private String autor;
	private double preco;
	private boolean disponivel;

	public Livro(int id, Editora editora, String titulo, String autor, double preco, boolean disponivel) {
		this.id = id;
		this.editora = editora;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.disponivel = disponivel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

}

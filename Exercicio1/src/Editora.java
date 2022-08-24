
public class Editora {

	private int id;
	private String nome;
	private String site;

	public Editora(int id, String nome, String site) {
		this.id = id;
		this.nome = nome;
		this.site = site;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

}

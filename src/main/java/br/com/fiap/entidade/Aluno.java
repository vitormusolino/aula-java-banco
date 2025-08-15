package br.com.fiap.entidade;

public class Aluno {
	
	private int id;
	
	private String nome;
	
	private Endereco endereco;

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
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		this.endereco.setIdAluno(this.id);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", " + (nome != null ? "nome=" + nome + ", " : "")
				+ (endereco != null ? "endereco=" + endereco : "") + "]";
	}
	
	
}

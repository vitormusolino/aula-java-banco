package br.com.fiap.entidade;

public class Endereco {

	 private int idEndereco;
	 
	 private String logradouro;
	 
	 private String numero;
	 
	 private String complemento;
	 
	 private String bairro;
	 
	 private String uf;
	 
	 private String cep;
	 
	 private int idAluno;

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", "
				+ (logradouro != null ? "logradouro=" + logradouro + ", " : "")
				+ (numero != null ? "numero=" + numero + ", " : "")
				+ (complemento != null ? "complemento=" + complemento + ", " : "")
				+ (bairro != null ? "bairro=" + bairro + ", " : "") + (uf != null ? "uf=" + uf + ", " : "")
				+ (cep != null ? "cep=" + cep + ", " : "") + "idAluno=" + idAluno + "]";
	}
	
	
	
}

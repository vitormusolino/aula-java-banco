package br.com.fiap.repositorio;

import java.util.List;

import br.com.fiap.entidade.Endereco;

public interface EnderecoRepositorio {

	public int criar(Endereco endereco); // Create

	public Endereco obter(int idAluno); // Read
		
	public int atualizar(Endereco endereco); // Update
	
	public int remover(int id); // Delete
	
	public int removerPorAluno(int idAluno);
	
	public List<Endereco> listar(int idAluno); 
	

}

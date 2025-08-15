package br.com.fiap.repositorio;

import java.util.List;

import br.com.fiap.entidade.Aluno;

public interface AlunoRepositorio {

	public int criar(Aluno aluno); // Create

	public Aluno obter(int id); // Read
		
	public int atualizar(Aluno aluno); // Update
	
	public int remover(int id); // Delete
	
	public List<Aluno> listar(); 
	

}

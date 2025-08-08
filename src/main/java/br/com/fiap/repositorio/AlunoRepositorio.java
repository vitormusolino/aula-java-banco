package br.com.fiap.repositorio;

import java.util.List;

import br.com.fiap.entidade.Aluno;

public interface AlunoRepositorio {
	
	public List<Aluno> listar();
	
	public int criar(Aluno aluno);

	public int atualizar(Aluno aluno);

	public int remover(int id);

}

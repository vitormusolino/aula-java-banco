package br.com.fiap.service;

import java.util.List;

import br.com.fiap.entidade.Aluno;
import br.com.fiap.excecao.IdInvalidoException;
import br.com.fiap.excecao.RegistroInvalidoException;
import br.com.fiap.repositorio.AlunoRepositorio;
import br.com.fiap.repositorio.EnderecoRepositorio;

public class AlunoService {

	private AlunoRepositorio alunoRepositorio;

	private EnderecoRepositorio enderecoRepositorio;

	public AlunoService(AlunoRepositorio alunoRepositorio, EnderecoRepositorio enderecoRepositorio) {
		super();
		this.alunoRepositorio = alunoRepositorio;
		this.enderecoRepositorio = enderecoRepositorio;
	}

	public int criar(Aluno aluno) throws RegistroInvalidoException {

		if (aluno == null) {
			throw new RegistroInvalidoException();
		}

		int resultado = this.alunoRepositorio.criar(aluno);

//		if (resultado == 1) {
//			this.enderecoRepositorio.criar(aluno.getEndereco());
//		}

		return resultado;
	}

	public Aluno obter(int id) throws IdInvalidoException {

		if (id <= 0) {
			throw new IdInvalidoException();
		}

		Aluno aluno = this.alunoRepositorio.obter(id);
		aluno.setEndereco(this.enderecoRepositorio.obter(aluno.getId()));
		
		return aluno;
	}

	public int atualizar(Aluno aluno) throws RegistroInvalidoException {

		if (aluno == null) {
			throw new RegistroInvalidoException();
		}

		return this.alunoRepositorio.atualizar(aluno);
	}

	public int remover(int id) throws IdInvalidoException {

		if (id <= 0) {
			throw new IdInvalidoException();
		}

		return this.alunoRepositorio.remover(id);
	}

	public List<Aluno> listar() {
		return this.alunoRepositorio.listar();
	}

}

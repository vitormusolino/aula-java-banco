package br.com.fiap.cliente;

import java.util.List;

import br.com.fiap.entidade.Aluno;
import br.com.fiap.repositorio.AlunoRepositorio;
import br.com.fiap.repositorio.AlunoRepositorioImpl;

public class Main {
	
	public static void main(String[] args) {
		
		AlunoRepositorio repositorio = new AlunoRepositorioImpl();
		
		List<Aluno> lista = repositorio.listar();
		
		for (Aluno aluno : lista) {
			System.out.println(aluno);
		}
		
		Aluno aluno2 = new Aluno();
		aluno2.setId(4);
		aluno2.setNome("Lucas Dias");
		
		repositorio.remover(4);
		
		lista = repositorio.listar();
		
		for (Aluno aluno : lista) {
			System.out.println(aluno);
		}
		
	}

}

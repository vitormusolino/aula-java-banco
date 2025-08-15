package br.com.fiap.cliente;

import br.com.fiap.entidade.Aluno;
import br.com.fiap.entidade.Endereco;
import br.com.fiap.entidade.Produto;
import br.com.fiap.excecao.IdInvalidoException;
import br.com.fiap.excecao.RegistroInvalidoException;
import br.com.fiap.repositorio.AlunoRepositorioImpl;
import br.com.fiap.repositorio.EnderecoRepositorioImpl;
import br.com.fiap.repositorio.ProdutoRepositorioImpl;
import br.com.fiap.service.AlunoService;

public class Main {
	
	public static void main(String[] args) {
		ProdutoRepositorioImpl produtoRepositorio = new ProdutoRepositorioImpl();


		System.out.println(produtoRepositorio.listar());



}}

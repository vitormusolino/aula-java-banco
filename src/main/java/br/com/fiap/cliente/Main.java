package br.com.fiap.cliente;

import java.util.List;

import br.com.fiap.entidade.Aluno;
import br.com.fiap.entidade.Endereco;
import br.com.fiap.repositorio.AlunoRepositorio;
import br.com.fiap.repositorio.AlunoRepositorioImpl;
import br.com.fiap.repositorio.EnderecoRepositorio;
import br.com.fiap.repositorio.EnderecoRepositorioImpl;

public class Main {
	
	public static void main(String[] args) {
		
		AlunoRepositorio repositorio = new AlunoRepositorioImpl();
		EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorioImpl();

		List<Endereco> listaEndereco = enderecoRepositorio.listar();
		for ( Endereco endereco : listaEndereco){
			System.out.println(endereco);

		}

		Endereco endereco = new Endereco();
		endereco.setId(1);
		endereco.setLogradouro("Lins de Vasconcelos");
		endereco.setNumero(65);

		enderecoRepositorio.criar(endereco);

		Endereco endereco2 = new Endereco();
		endereco2.setId(2);
		endereco2.setLogradouro("Heitor Peixoto");
		endereco2.setNumero(55);

		enderecoRepositorio.criar(endereco2);
	}

}

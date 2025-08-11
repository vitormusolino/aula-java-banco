package br.com.fiap.repositorio;

import br.com.fiap.entidade.Endereco;

import java.util.List;

public interface EnderecoRepositorio {

    public List<Endereco> listar();

    public int criar(Endereco endereco);

    public int atualizar(Endereco endereco);

    public int remover(int id);
}

package br.com.fiap.repositorio;

import br.com.fiap.entidade.Aluno;
import br.com.fiap.entidade.Produto;

import java.util.List;

public interface ProdutoRepositorio {

    public int criar(Produto produto);

    public List<Produto> listar();
}

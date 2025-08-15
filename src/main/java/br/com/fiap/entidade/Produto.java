package br.com.fiap.entidade;

import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void add(List<Produto> produto) {
    }

    @Override
    public String toString() {
        return "[produto =" + " id:"+ id + " nome: " + nome + " preço: " + preco + "];";
    }
}

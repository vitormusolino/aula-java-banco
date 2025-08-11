package br.com.fiap.entidade;

public class Endereco {

    private int id;
    private String logradouro;
    private int numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereço [id=" + id + ", " + (logradouro != null ? "logradouro=" + logradouro : "") + ", número=" + numero + "]";
    }
}

package br.com.fiap.repositorio;

import br.com.fiap.entidade.Aluno;
import br.com.fiap.entidade.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorioImpl implements ProdutoRepositorio {

    public int criar(Produto produto) {

        Connection conn = new Conexao().obterConexao();

        int resultado = 0;

        try {

            conn.setAutoCommit(true);

            PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO PRODUTOS (IDPRODUTOS, NOME, PRECO) VALUE (?, ?, ?)");

            pstmt.setInt(1, produto.getId());
            pstmt.setString(2, produto.getNome());
            pstmt.setDouble(3, produto.getPreco());

            resultado = pstmt.executeUpdate();

            pstmt.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return resultado;
    }

    public List<Produto> listar() {

        Connection conn = new Conexao().obterConexao();

        List<Produto> produtos = new ArrayList<Produto>();

        try {

            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM PRODUTOS");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt(1));
                produto.setNome(rs.getString(2));

                produtos.add(produto);

            }

            rs.close();
            pstmt.close();

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return produtos;

    }
}


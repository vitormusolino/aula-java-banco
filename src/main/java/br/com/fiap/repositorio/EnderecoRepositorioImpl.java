package br.com.fiap.repositorio;

import br.com.fiap.entidade.Aluno;
import br.com.fiap.entidade.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoRepositorioImpl implements EnderecoRepositorio{


    public List<Endereco> listar() {
        Connection conn = new Conexao().obterConexao();
        List<Endereco> enderecos = new ArrayList<Endereco>();

        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM ENDERECO");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Endereco endereco = new Endereco();

                endereco.setId(rs.getInt(1));
                endereco.setLogradouro(rs.getString(2));

                enderecos.add(endereco);
            }

            rs.close();
            pstmt.close();
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx.getMessage());
        } finally {
            try{
                conn.close();
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

        return enderecos;
    }

    public int criar(Endereco endereco) {

        Connection conn = new Conexao().obterConexao();

        int resultado = 0;

        try {

            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO ENDERECO (IDENDERECO, LOGRADOURO, NUMERO) VALUE (?, ?, ?)");

            pstmt.setInt(1, endereco.getId());
            pstmt.setString(2, endereco.getLogradouro());
            pstmt.setInt(3, endereco.getNumero());

            resultado = pstmt.executeUpdate();

            pstmt.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());			}
        }

        return resultado;
    }

    public int atualizar(Endereco endereco){
        Connection conn = new Conexao().obterConexao();

        int resultado = 0;

        try {

            PreparedStatement pstmt = conn.prepareStatement("UPDATE LOGRADOURO SET LOGRADOURO =? WHERE IDENDERECO = ?");

            pstmt.setInt(1, endereco.getId());
            pstmt.setString(2, endereco.getLogradouro());

            resultado = pstmt.executeUpdate();

            pstmt.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());			}
        }

        return resultado;
    }

    public int remover(int id){
        Connection conn = new Conexao().obterConexao();

        int resultado = 0;

        try {

            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM LOGRADOURO WHERE IDENDERECO = ?");

            pstmt.setInt(1, id);
            resultado = pstmt.executeUpdate();

            pstmt.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());			}
        }

        return resultado;
    }


}

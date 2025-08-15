package br.com.fiap.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.entidade.Endereco;

public class EnderecoRepositorioImpl implements EnderecoRepositorio {

	public int criar(Endereco endereco) {

		Connection conn = new Conexao().obterConexao();

		int resultado = 0;

		try {

			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO ENDERECO (IDENDERECO, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, UF, CEP, IDALUNO) "
							+ "VALUE (?, ?, ?, ?, ?, ?, ?, ?)");

			pstmt.setInt(1, endereco.getIdEndereco());
			pstmt.setString(2, endereco.getLogradouro());
			pstmt.setString(3, endereco.getNumero());
			pstmt.setString(4, endereco.getComplemento());
			pstmt.setString(5, endereco.getBairro());
			pstmt.setString(6, endereco.getUf());
			pstmt.setString(7, endereco.getCep());
			pstmt.setInt(8, endereco.getIdAluno());

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

	public Endereco obter(int idAluno) {

		Endereco endereco = null;

		Connection conn = new Conexao().obterConexao();

		try {

			PreparedStatement pstmt = conn.prepareStatement(
					"SELECT IDENDERECO, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, UF, CEP, IDALUNO FROM ENDERECO WHERE IDALUNO = ?");

			pstmt.setInt(1, idAluno);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				endereco = new Endereco();

				endereco.setIdEndereco(rs.getInt(1));
				endereco.setLogradouro(rs.getString(2));
				endereco.setNumero(rs.getString(3));
				endereco.setComplemento(rs.getString(4));
				endereco.setBairro(rs.getString(5));
				endereco.setUf(rs.getString(6));
				endereco.setCep(rs.getString(7));
				endereco.setIdAluno(rs.getInt(8));

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

		return endereco;

	}

	public int atualizar(Endereco endereco) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int remover(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int removerPorAluno(int idAluno) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Endereco> listar(int idAluno) {
		// TODO Auto-generated method stub
		return null;
	}

}

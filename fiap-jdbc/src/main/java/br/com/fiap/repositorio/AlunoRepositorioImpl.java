package br.com.fiap.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.entidade.Aluno;

public class AlunoRepositorioImpl implements AlunoRepositorio {

	
	public List<Aluno> listar() {
		
		Connection conn = new Conexao().obterConexao();
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try {

			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM ALUNO");
			//Statement pstmt = conn.createStatement();
			//pstmt.executeQuery("SELECT * FROM ALUNO");

			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Aluno aluno = new Aluno();
				
				aluno.setId(rs.getInt(1));
				aluno.setNome(rs.getString(2));
				
				alunos.add(aluno);
				
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
		
		return alunos;
		
	}

	public int criar(Aluno aluno) {
		
		Connection conn = new Conexao().obterConexao();

		int resultado = 0;
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO ALUNO (IDALUNO, NOME) VALUE (?, ?)");
			
			pstmt.setInt(1, aluno.getId());
			pstmt.setString(2, aluno.getNome());
			
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

	public int atualizar(Aluno aluno){
		Connection conn = new Conexao().obterConexao();

		int resultado = 0;

		try {

			PreparedStatement pstmt = conn.prepareStatement("UPDATE ALUNO SET  NOME =? WHERE IDALUNO = ?");

			pstmt.setString(1, aluno.getNome());
			pstmt.setInt(2, aluno.getId());

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

			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM ALUNO WHERE IDALUNO = ?");

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

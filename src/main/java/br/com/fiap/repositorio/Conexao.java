package br.com.fiap.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
		
	public Connection obterConexao() {
				
		String url = "jdbc:mysql://localhost:3306/fiap";
		String user = "root";
		String pwd = "fiap";
		
		Connection conn = null;
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, user, pwd);
			
			if (conn != null) {
				conn.setAutoCommit(false);
				System.out.println("Conexão estabelecida com sucesso!!");
			} else {
				System.out.println("Conexão não estabelecida!!");
			}
		} catch (SQLException sqlEx) {
			System.out.println(sqlEx.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		return conn;
		
	}
	
	public static void main(String[] args) {
		
		Conexao con = new Conexao();
		con.obterConexao();
		
	}
	

}

package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fabricaweb", "root", "diad45");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}

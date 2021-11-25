package br.com.cadastro_carro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.cadastro_carros.interfaces.ConexaoInterface;

public class ConexaoBanco implements ConexaoInterface {
	
	@Override
	public Connection ConexaoMYSQL() {
		// TODO Auto-generated method stub
		try {
			return DriverManager
					.getConnection("jdbc:mysql://localhost/db_cadastro_carros?" + "user=root&password=57585958");
		} catch (SQLException excecao) {
			throw new RuntimeException(excecao);
		}
	}

}

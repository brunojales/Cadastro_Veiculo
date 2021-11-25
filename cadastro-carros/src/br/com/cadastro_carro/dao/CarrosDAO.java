package br.com.cadastro_carro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cadastro_carro.ConexaoBanco;
import br.com.cadastro_carro.model.Carros;
import br.com.cadastro_carros.interfaces.CarrosDAOInterfa;

public class CarrosDAO extends Carros implements CarrosDAOInterfa {
	
	private Connection conn;
	
	public CarrosDAO() {
		this.conn = new ConexaoBanco().ConexaoMYSQL();	
	}

	@Override
	public void cadastrar(Carros carro) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO tb_carro (placa, renavam, marca, modelo, chassi, cor_carro, ano_modelo_carro, ano_fabricacao_carro) VALUES (?,?,?,?,?,?,?,?)";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);

			// repassa os valores para a consulta SQL
			stmt.setString(1, carro.getPlaca());
			stmt.setString(2, carro.getRenavam());
			stmt.setString(3, carro.getMarca());
			stmt.setString(4, carro.getModelo());
			stmt.setString(5, carro.getChassi());
			stmt.setString(6, carro.getCor());
			stmt.setInt(7, carro.getAnoModelo());
			stmt.setInt(8, carro.getAnoFabricacao());

			// executa a query
			stmt.execute();

			// fecha o objeto
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void pesquisarPlaca(Carros carro) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tb_carro WHERE placa = ?";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);

			// repassa os valores para a consulta SQL
			stmt.setString(1, carro.getPlaca());

			// executa a consulta SQL
			ResultSet resultado = stmt.executeQuery();

			// retorna o resultado e repassa para o objeto usuario
			while (resultado.next()) {
				carro.setIdCarro(resultado.getLong(1));
				carro.setPlaca(resultado.getString(2));
				carro.setRenavam(resultado.getString(3));
				carro.setMarca(resultado.getString(4));
				carro.setModelo(resultado.getString(5));
				carro.setChassi(resultado.getString(6));
				carro.setCor(resultado.getString(7));
				carro.setAnoModelo(resultado.getInt(8));
				carro.setAnoFabricacao(resultado.getInt(9));
			}
			// encerra os objetos
			resultado.close();
			stmt.close();

		} catch (SQLException e) {
			// retorna erro caso método não seja executado
			throw new RuntimeException(e);
		}
		
	}

}

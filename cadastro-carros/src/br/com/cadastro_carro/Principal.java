package br.com.cadastro_carro;

import javax.swing.JOptionPane;

import br.com.cadastro_carro.dao.CarrosDAO;
import br.com.cadastro_carro.model.Carros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variaveis
		String AnoModeloCarro;
		String AnoFabricacaoCarro;
		int anoModelo;
		int anoFabricacaoCarro;

		Carros carro = new Carros();
		CarrosDAO cadastro = new CarrosDAO();

		// Variaveis
		Object escolhaAcao;
		// Array
		Object[] OpcaoAcao = { "Cadastrar", "Pesquisar","Sair" };

		do {
			// janela de escolha de a��o do usu�rio
			escolhaAcao = JOptionPane.showInputDialog(null, "Escolha uma a��o:", "A��o", JOptionPane.QUESTION_MESSAGE,
					null, OpcaoAcao, OpcaoAcao[1]);

			if (escolhaAcao == "Cadastrar") {
				// input dos dados
				carro.setPlaca(JOptionPane.showInputDialog("Placa do Ve�culo:"));
				carro.setRenavam(JOptionPane.showInputDialog("Renavam do Ve�culo:"));
				carro.setMarca(JOptionPane.showInputDialog("Marca do Ve�culo:"));
				carro.setModelo(JOptionPane.showInputDialog("Modelo do Ve�culo:"));
				carro.setChassi(JOptionPane.showInputDialog("Chassi do Ve�culo:"));
				carro.setCor(JOptionPane.showInputDialog("Cor do Ve�culo:"));
				AnoModeloCarro = JOptionPane.showInputDialog("Ano Modelo do Ve�culo:");
				anoModelo = Integer.parseInt(AnoModeloCarro);
				carro.setAnoModelo(anoModelo);
				AnoFabricacaoCarro = JOptionPane.showInputDialog("Ano de Fabrica��o do Ve�culo:");
				anoFabricacaoCarro = Integer.parseInt(AnoFabricacaoCarro);
				carro.setAnoFabricacao(anoFabricacaoCarro);

				// cadastra o Aluno no banco
				cadastro.cadastrar(carro);

				// informa o sucesso do cadastro
				JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");

			} else if (escolhaAcao == "Pesquisar") {
				//
				carro.setPlaca(JOptionPane.showInputDialog("Placa do Ve�culo?"));
				// repassa o objeto para o m�todo de pesquisa
				cadastro.pesquisarPlaca(carro);

				JOptionPane.showMessageDialog(null,
						"ID: " + carro.getIdCarro() + "\nPlaca: " + carro.getPlaca() + "\nRenavam: "
								+ carro.getRenavam() + "\nMarca: " + carro.getMarca() + "\nModelo: " + carro.getModelo()
								+ "\nChassi: " + carro.getChassi() + "\nCor: " + carro.getCor() + "\n Ano do Modelo: "
								+ carro.getAnoModelo() + "\nAno de Fabrica��o: " + carro.getAnoFabricacao());

			}
		} while (escolhaAcao != "Sair");
		
	}
}
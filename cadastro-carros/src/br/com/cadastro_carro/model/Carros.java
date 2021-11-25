package br.com.cadastro_carro.model;

public class Carros {

	private Long idCarro;
	private String placa;
	private String renavam;
	private String marca;
	private String modelo;
	private String chassi;
	private String cor;
	private int anoModelo;
	private int anoFabricacao;
	public Long getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Long idCarro) {
		this.idCarro = idCarro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	
}

package br.edu.ifmt.sistemaGestaoVeiculos.main;

public class Veiculo {
	
	protected String placa;
	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	
	protected static int numeroVeiculos;

	public Veiculo(String placa, String marca, String modelo, int anoFabricacao) {
	
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		numeroVeiculos++;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public static int getNumeroVeiculos() {
		return numeroVeiculos;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao="
				+ anoFabricacao + "]";
	}

}
	
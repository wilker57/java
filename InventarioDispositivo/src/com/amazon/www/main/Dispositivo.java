package com.amazon.www.main;

    public class Dispositivo {
    	
	protected String codigoIdentificacao;
	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	
	public Dispositivo(String codigoIdentificacao, String marca, String modelo, int anoFabricacao) {
		
		this.codigoIdentificacao = codigoIdentificacao;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}

	public String getCodigoIdentificacao() {
		return codigoIdentificacao;
	}

	public void setCodigoIdentificacao(String codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
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

	@Override
	public String toString() {
		return "Dispositivo [codigoIdentificacao=" + codigoIdentificacao + ", marca=" + marca + ", modelo=" + modelo
				+ ", anoFabricacao=" + anoFabricacao + "]";
	}
	
}

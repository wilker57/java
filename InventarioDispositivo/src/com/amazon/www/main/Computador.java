package com.amazon.www.main;

public class Computador extends Dispositivo {
	
	private int capacidadeRam;

	public Computador(String codigoIdentificacao, String marca, String modelo, int anoFabricacao, int capacidadeRam) {
		
		super(codigoIdentificacao, marca, modelo, anoFabricacao);
		
		this.capacidadeRam = capacidadeRam;
	}

	public int getCapacidadeRam() {
		return capacidadeRam;
	}

	public void setCapacidadeRam(int capacidadeRam) {
		this.capacidadeRam = capacidadeRam;
	}

	@Override
	public String toString() {
		return "Computador [capacidadeRam=" + capacidadeRam + ", getCapacidadeRam()=" + getCapacidadeRam()
				+ ", getCodigoIdentificacao()=" + getCodigoIdentificacao() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getAnoFabricacao()=" + getAnoFabricacao() + "]";
	}
}

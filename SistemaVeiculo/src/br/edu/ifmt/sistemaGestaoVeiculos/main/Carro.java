package br.edu.ifmt.sistemaGestaoVeiculos.main;

public class Carro extends Veiculo{
	
	private int quantidadePortas;

	public Carro(String placa, String marca, String modelo, int anoFabricacao, int quantidadePortas) {
		super(placa, marca, modelo, anoFabricacao);
		
		this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	@Override
	public String toString() {
		return "Carro [quantidadePortas=" + quantidadePortas + ", getPlaca()=" + getPlaca() + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getAnoFabricacao()=" + getAnoFabricacao() + "]";
	}


}

	
	






package br.edu.ifmt.sistemaGestaoVeiculos.main;

public class Moto extends Veiculo{
	
	private int cilindradas;

	public Moto(String placa, String marca, String modelo, int anoFabricacao, int cilindradas) {
		super(placa, marca, modelo, anoFabricacao);
		this.cilindradas=cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + ", getPlaca()=" + getPlaca() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getAnoFabricacao()=" + getAnoFabricacao() + "]";
	}
	
	
}
	
	

	



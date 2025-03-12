package Encapsulamento;

public class Carro{
	
	
	
	String marca;
	
	int velocidade;
	
	public Carro(String pMarca, int pVelocidade) {
		
		marca = pMarca;
		velocidade = pVelocidade;
	}
	
	public Carro() {
		
		System.out.println("passei por aqui");
	}
	
	
	public void acelerar() {
		
		velocidade = velocidade + 10;
	}
	
	
	public void freiar() {
		
		velocidade = velocidade - 5;
		
	}
	
	public String verInfo() {
		
		return marca + " - " + velocidade;
	}

}

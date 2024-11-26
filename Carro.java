package wilker57;

public class Carro {
	
	
	String marca;
	
	int velocidade;
	
	
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

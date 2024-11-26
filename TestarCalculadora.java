package wilker57;

public class TestaCalculadora {
	
	public static void main(String [] args) {
		
		Calculadora calc = new Calculadora ();
		
		int resultadoSoma = calc.somar(10,90);
		
		int resultadoSubtrair = calc.somar(10,90);
		
		System.out.println("A soma é " + resultadoSoma + " A Subtração é " + resultadoSubtrair);
	}
	
	

}

package Conta;

public class Conta {

	String titular;
	String agencia;
	String dataDeAbertura;
	int numero;
	double saldo;

	class Data{
		
		int dia;
		int mes;
		int ano;
	}
	
	public Conta() {
		
	
		}
	
	public void sacar(double quantidade) {
	
	double novoSaldo = this.saldo - quantidade;
	
	this.saldo = novoSaldo;
	
		}
	
	public void depositar (double quantidade) {
		
		this.saldo += quantidade;
		
		}
	
	public void calculaRendimento (double calculaRendimento) {
		
		calculaRendimento = 0.1*saldo;
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c2.recuperaDadosParaImpressao());
	}
	
}
	

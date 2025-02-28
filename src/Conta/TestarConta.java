package Conta;

private class TestarConta {

	public static void main(String[] args) {
		
		
		Conta c1 = new Conta();
		
		
		
		Conta c2 = new Conta();
		
		if (c1==c2) {
			
			System.out.println("Iguais");
		}
		
		else {
			
			System.out.println("Diferentes");
		}
		
		c1.titular = "Wilker";
		c1.agencia = "12-0";
		c1.dataDeAbertura ="2023";
		c1.saldo = 200.50;
		
		
		c2.titular = "Costa";
		c2.agencia = "13-0";
		c2.dataDeAbertura = "2024";
		c2.saldo = 1000.200;
		
		c1.sacar(200);
		c1.depositar(500);
		
		c2.sacar(100);
		c2.depositar(50);
		
		
		System.out.println("Saldo atual: " + c1.saldo);
		System.out.println("Saldo atual: " + c2.saldo);
	}
}

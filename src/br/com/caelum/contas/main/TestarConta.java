package br.com.caelum.contas.main;

import Conta.Data;
import br.com.caelum.contas.modelo.Conta;

public class TestarConta {

	public static void main(String[] args) {
		
		
		Conta c1 = new Conta();
		c1.setTitular("Wilker");
		c1.setNumero(1234);
		c1.setAgencia("45678");
		c1.deposita(50);
		c1.setDataDeAbertura(new Data());
		
		c1.setDataDeAbertura(new Data());
		
		Conta c2 = new Conta();
		c2.setTitular("NJS");
		c2.setNumero(4321);
		c2.setAgencia("4321-9");
		c2.deposita(100.0);
		
				
		Data data1 = new Data();
		c2.setDataDeAbertura(data1);
		c2.getDataDeAbertura().preencherData(1, 7, 2009);

		
		c1.deposita(50);
		c2.deposita(100.00);
		
		if(c1==c2) {
			
			System.out.println("iguais");
		}else {
			
			System.out.println("diferentes");
		}
		
		
		System.out.println(c1.getTitular());
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());
		System.out.println(c2.getTitular());
		System.out.println(c2.recuperaDadosParaImpressao());
		System.out.println("Rendimento mensal: " + c2.calculaRendimento());
		
	}
}

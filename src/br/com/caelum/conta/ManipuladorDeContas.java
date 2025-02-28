package br.com.caelum.conta;

import br.com.caelum.contas.modelo.Conta;

public class ManipuladorDeContas {
	
	private Conta conta;
	
	public void criaConta(Evento evento) {
		this.conta = new Conta();
		this.conta.setTitular("Batman");
	}
	
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}

}

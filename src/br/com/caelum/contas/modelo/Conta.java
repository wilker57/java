package br.com.caelum.contas.modelo;

import Conta.Data;

public class Conta {
	
	private int identificador;
	public Conta() {}
	
	public Conta(String titular) {
		this.titular = titular;
	}
	
	public int getIdenficador() {
		return this.identificador;
	}
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
    
	public String recuperaDadosParaImpressao() {
    	
    	String dados = "Titular " + this.titular;
    	dados +="\nNumero: " + this.numero;
    	dados+="\nAgencia " + this.agencia;
    	dados+="\nSaldo " + this.saldo;
    	dados+="\nData de Abertura " + this.dataDeAbertura;
    	return dados;
    }
    
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
		
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
		
	}
   
	public String getAgencia() {
		
		return this.agencia;
		
	}
	
	public void setAgencia(String agencia) {
		
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return this.saldo;
		
	}
	public void saca (double valor) {
		
		this.saldo-=valor;
	}
	
	public void deposita(double valor) {
		this.saldo+=valor;
	}
	
	public double calculaRendimento() {
		
		return this.saldo*0.1;
			
	}
	
	public Data getDataDeAbertura() {
		return this.dataDeAbertura;
	}
	
	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
}
	

package com.talita.cursojava.aula33;

public class ContaCorrente {
	private long numeroConta;
	private long agencia;
	private double saldo;
	private boolean especial;
	private double limite;
	
	ContaCorrente(){}

	public ContaCorrente(long numeroConta, long agencia, double saldo, boolean especial, double limite) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public long getAgencia() {
		return agencia;
	}

	public void setAgencia(long agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
	public double sacar(double saque){
		if (saldo>=saque) {
			saldo=saldo-saque;
			System.out.println(" saque elfetuado com sucesso, saldo atual de "+ saldo);
		}else if(saldo<=0) {
			System.out.println("saldo insuficiente");
		}
		
		
		return saldo;
	}
	
	public double depositar(double valor) {
		
		saldo=saldo+valor;
		System.out.println(" deposito elfetuado com sucesso, saldo atual de "+ saldo);
		return saldo;
		
	}
	public void consultarSaldo() {
		 System.out.println(" saldo atual de "+saldo);
	 }
	 
	public boolean VerificarEspecial() {
		  if(saldo<0) {
			  especial=true;
			  System.out.println(" o cliente está usando o cheque especial");
		  }else {
			  especial=false;
			  System.out.println(" o cliente não está usando o cheque especial");
		  }
		 return especial;
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
}

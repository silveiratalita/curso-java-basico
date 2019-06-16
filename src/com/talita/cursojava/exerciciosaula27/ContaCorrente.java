package com.talita.cursojava.exerciciosaula27;

public class ContaCorrente {
	
	long numeroConta;
	long agencia;
	double saldo;
	boolean especial;
	double limite;
	
	
	
	double sacar(double saque){
		if (saldo>=saque) {
			saldo=saldo-saque;
			System.out.println(" saque elfetuado com sucesso, saldo atual de "+ saldo);
		}else if(saldo<=0) {
			System.out.println("saldo insuficiente");
		}
		
		
		return saldo;
	}
	
	double depositar(double valor) {
		
		saldo=saldo+valor;
		System.out.println(" deposito elfetuado com sucesso, saldo atual de "+ saldo);
		return saldo;
		
	}
	 void consultarSaldo() {
		 System.out.println(" saldo atual de "+saldo);
	 }
	 
	 boolean VerificarEspecial() {
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

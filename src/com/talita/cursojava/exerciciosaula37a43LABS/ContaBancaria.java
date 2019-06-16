package com.talita.cursojava.exerciciosaula37a43LABS;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double sacar(double valor) {
		if(saldo<valor) {
			System.out.println("não há saldo suficiente");
			return saldo;
			
		}else {
			saldo=saldo-valor;
			return saldo;
		}
	}
	
	public double depositar(double valor) {
		saldo=saldo+valor;
		return saldo;
	}
	
	

	public double calcularNovoSaldo(double taxa) {
	return 0;
	}	
public double atualizaSaldo() {
		
		
		return 0;
	}

@Override
public String toString() {
	return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo
			+ ", getNomeCliente()=" + getNomeCliente() + ", getNumConta()=" + getNumConta() + ", getSaldo()="
			+ getSaldo() + ", atualizaSaldo()=" + atualizaSaldo() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}




}
	
	

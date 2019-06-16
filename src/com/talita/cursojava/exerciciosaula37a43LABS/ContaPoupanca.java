package com.talita.cursojava.exerciciosaula37a43LABS;

public class ContaPoupanca extends ContaBancaria {

	private  double diaRendimento=0.5;
	
	
	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public double calcularNovoSaldo(double dias) {
		double saldo= getSaldo();
		saldo+=(diaRendimento*0.5);
		setSaldo(saldo);
		return this.getSaldo();
	}
	
	public double atualizaSaldo() {
		
		String s="o saldo atual da conta poupança é: ";
		s+=getSaldo();
		return getSaldo();
	}
}

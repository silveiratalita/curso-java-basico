package com.talita.cursojava.exerciciosaula37a43LABS;

public class TesteConta {

	public static void main(String[] args) {
		//Cria contas-cria casa uma das contas
		
		ContaBancaria conta = new ContaBancaria();
		ContaBancaria contaPoupanca=new ContaPoupanca();
		ContaBancaria contaEspecial=new ContaEspecial();
		conta.setSaldo(1000.00);
		conta.setNomeCliente("talita");
		conta.setNumConta("003");
		contaPoupanca.setNomeCliente("Andrey");
		contaPoupanca.setSaldo(100000.00);
		contaPoupanca.setNumConta("004");
		
		contaEspecial.setNomeCliente("andrey");
		contaEspecial.sacar(10);
		contaEspecial.setNumConta("000");
		
		
		//saca valores da conta
		
		conta.sacar(500.00);
		contaPoupanca.sacar(60000.00);
		contaEspecial.sacar(100);
		System.out.println(contaEspecial.atualizaSaldo());
		
		//deposita nas contas
		conta.depositar(1000.00);
		contaPoupanca.depositar(500.00);
		contaEspecial.depositar(500);
		
		//mostrar um novo saldo apartir de um rendimento
		contaPoupanca.calcularNovoSaldo(10);
		contaPoupanca.atualizaSaldo();
		
		//mostrar os dados da conta do cliente
//cc
		System.out.println(conta);
		
		System.out.println("\n"+contaPoupanca);
	}

}

package com.talita.cursojava.aula33;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		//ContaCorrente conta1=new ContaCorrente(0001,00012,1500,true,1000);//passado assim não funciona, pois precisa do get e set
		ContaCorrente conta1=new ContaCorrente();//desse jeito funciona primiero vc puxa os atibutos e depois vc atribui os valores.
		conta1.setNumeroConta(23236);
		conta1.setAgencia(0001);
		conta1.setLimite(1000);
		conta1.setSaldo(1500);
		conta1.setEspecial(true);
	
		
		/*
		 * public ContaCorrente(long numeroConta, long agencia, double saldo, boolean especial, double limite) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}
		 */
		System.out.println(conta1.getSaldo());
		Scanner scan= new Scanner(System.in);
		int opcao;
		double saque;
		double valor;
		
		do {
			
			System.out.println("informe:");
			System.out.println("1 para sacar");
			System.out.println("2 para depositar");
			System.out.println("3 para consultar saldo");
			System.out.println("4 para saber se entrou no cheque especial");
			System.out.println("0 pára sair");
			opcao=scan.nextInt();
			 switch(opcao) {
			 case 1://saque
				
				 System.out.println("quanto deseja sacar?"); 
				 saque=scan.nextDouble();
				 
				 conta1.sacar(saque);
				 System.out.println();
				 System.out.println();
			 break;
				 
			 case 2://deposito
				 System.out.println("quanto deseja depositar?"); 
				 valor=scan.nextDouble();
				 conta1.depositar(valor);
				 System.out.println();
				 System.out.println();
			 break;
			 
			 
			 case 3://consulta saldo
				 conta1.consultarSaldo();
				 System.out.println();
				 System.out.println();
			break;
			
			
			 case 4://cheque especial
				 conta1.VerificarEspecial();
				 System.out.println();
				 System.out.println();
				 break;
				 
			 case 0://sair
				 System.out.println("você saiu");
				 break;
			 default:System.out.println("opção invalida");
			 System.out.println();
			 System.out.println();
			 }
			
			
		}while (opcao!=0);
	
	System.out.println();

	}
		
		
		
	}



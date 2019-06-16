package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int i=0;
	double valorTotal=0;
	double produto=0;
	System.out.println("lojas tabajara");
	do {
		produto=scan.nextDouble();
		i++;
		System.out.println("produto "+i+"R$ "+produto);
		valorTotal=valorTotal+produto;
	}while(produto!=0);
	
	
	System.out.println("Total a pagar "+valorTotal);
	System.out.println("Insira o dinheiro");
	
	double dinheiro=scan.nextDouble();
	double troco = dinheiro-valorTotal;
	System.out.println("dinheiro: "+dinheiro);
	System.out.println("Troco: "+troco);

	}

}

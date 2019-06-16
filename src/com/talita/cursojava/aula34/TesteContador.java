package com.talita.cursojava.aula34;

import java.util.Scanner;

public class TesteContador {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Informe até quando deseja incrementar o contador");
		int num=scan.nextInt();
		Contador.metodoContador(num);
		Contador.zeraContador();
		Contador.mostraContador();

	}

}

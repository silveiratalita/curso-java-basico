package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Qual o preço do pão?");
		double precoDoPao=scan.nextDouble();
		double valorTotal=0;
		
		for(int i=1; i<=50;i++) {
			
			valorTotal=valorTotal+precoDoPao;
			System.out.println(i+ " : "+valorTotal);
		}

	}

}

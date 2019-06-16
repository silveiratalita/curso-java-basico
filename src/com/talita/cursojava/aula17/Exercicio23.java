package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		//System.out.println("a quantidade de produtos que o cliente está levando");
		//double numeroDeProdutos=scan.nextDouble();
		double numeroDeProdutos=50;
		double valorTotal=0;
		
		for (int i =1; i <=numeroDeProdutos;i++) {
			valorTotal=valorTotal+1.99;
			System.out.println(i+": "+valorTotal);
		}
		
		//System.out.println("O valor total dos produtos é de: "+valorTotal);
		
		
		
		
		
		
		
		
	}

}

package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("Informe a quantidade de temperatura");
		
		int qtdTemp=scan.nextInt();
		
		double temp=0;
		double soma=0;
		double maior=Double.MAX_VALUE;
		double menor=Double.MIN_VALUE;
		
		for (int i=1; i<=qtdTemp;i++) {
		
			System.out.println("Informe a temperatura");
		
			temp=scan.nextDouble();
			soma=soma+temp;
			
			if(temp>maior) {
				maior= temp;
			}
			if 	(temp<menor) {
				menor=temp;
			}
				
		}
	double media=soma/qtdTemp;
		
		System.out.println("o valor máximo inserido foi "+maior+" e o valor minímo inserido foi "+menor);
		 
		System.out.println("a temperatura média é "+media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}




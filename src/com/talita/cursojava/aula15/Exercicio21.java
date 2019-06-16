package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 1 para Gazolina e 2 para Álcool");
		int combustivel = scan.nextInt();
		System.out.println("Digite quantos litros deseja comprar");
		int qtdLitros = scan.nextInt();
		
		switch(combustivel) {
		//case 1 = gazolina
				case 1: 
					double valorTotalG=(qtdLitros*2.50);
					double valorComDesc4=((valorTotalG*4)/100);
					double valorComDesc6 = ((valorTotalG*6)/100);
					if(qtdLitros<=20) {
						
						System.out.println(valorComDesc4+" é o valor do desconto de 4%");
						System.out.println("O valor total a ser pago será de: "+(valorTotalG-valorComDesc4));
					
					} else if (qtdLitros>=21) {
						
						System.out.println(valorComDesc6+" é o valor do desconto de 6%");
						System.out.println("O valor total a ser pago será de: "+(valorTotalG-valorComDesc6));
					}
							break;
					
				case 2://alcool
					double valorTotalA=(qtdLitros*1.90);
					double valorComDesc3=((valorTotalA*3)/100);
					double valorComDesc5 = ((valorTotalA*5)/100);
					if(qtdLitros>=20) {
						
						System.out.println(valorComDesc3+" é o valor do desconto de 3%");
						System.out.println("O valor total a ser pago será de: "+(valorTotalA-valorComDesc3));
						
					}else if (qtdLitros>=21) {
						
						System.out.println(valorComDesc5+" é o valor do desconto de 5%");
						System.out.println("O valor total a ser pago será de: "+(valorTotalA-valorComDesc5));
					}
					
					break;
		}
		
		
		
		
		
		
		
		
		
			
		}

	}


package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros para fazer uma operação.");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		int resultadoSoma=(n1+n2);
		int resultadoSubtracao=(n1-n2);
		int resultadoMultiplicacao=(n1*n2);
		int resultadoDivisao=(n1/n2);
		//int resto =(resultado%2);
		
		System.out.println("Digite qual operação deseja realizar:");
		System.out.println("1 para soma");
		System.out.println("2 para subtração");
		System.out.println("3 para divisão");
		System.out.println("4 para multiplicação");
		 int operacao= scan.nextInt();
		switch(operacao) {
		case 1:System.out.println("A soma de "+n1+ " e " +n2+ " é de: "+resultadoSoma); 
			if((resultadoSoma%2)==0) {
				System.out.println(resultadoSoma+" é um numero par. ");
			} else {System.out.println(resultadoSoma + " é um numero ímpar");
			}break;
			
		case 2:System.out.println("A subtração de "+n1+ " e " +n2+ " é de: "+resultadoSubtracao); 
		if((resultadoSubtracao%2)==0) {
			System.out.println(resultadoSubtracao+" é um numero par. ");
		} else {System.out.println(resultadoSubtracao+ " é um numero ímpar");
		}break;
		
		case 3:System.out.println("A divisão de "+n1+ " por " +n2+ " é de: "+resultadoDivisao); 
		if((resultadoDivisao%2)==0) {
			System.out.println(resultadoDivisao+" é um numero par. ");
		} else {System.out.println(resultadoDivisao + " é um numero ímpar");
		}break;
		
		
		case 4:System.out.println("A multiplicação de "+n1+ " por  " +n2+ " é de: "+resultadoMultiplicacao);
		if((resultadoMultiplicacao%2)==0) {
		System.out.println(resultadoMultiplicacao+" é um numero par. ");
		} else {System.out.println(resultadoMultiplicacao + " é um numero ímpar");
		}break;
		
		}
		
		
		

	}

}

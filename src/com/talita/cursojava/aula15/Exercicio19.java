package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros para fazer uma opera��o.");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		int resultadoSoma=(n1+n2);
		int resultadoSubtracao=(n1-n2);
		int resultadoMultiplicacao=(n1*n2);
		int resultadoDivisao=(n1/n2);
		//int resto =(resultado%2);
		
		System.out.println("Digite qual opera��o deseja realizar:");
		System.out.println("1 para soma");
		System.out.println("2 para subtra��o");
		System.out.println("3 para divis�o");
		System.out.println("4 para multiplica��o");
		 int operacao= scan.nextInt();
		switch(operacao) {
		case 1:System.out.println("A soma de "+n1+ " e " +n2+ " � de: "+resultadoSoma); 
			if((resultadoSoma%2)==0) {
				System.out.println(resultadoSoma+" � um numero par. ");
			} else {System.out.println(resultadoSoma + " � um numero �mpar");
			}break;
			
		case 2:System.out.println("A subtra��o de "+n1+ " e " +n2+ " � de: "+resultadoSubtracao); 
		if((resultadoSubtracao%2)==0) {
			System.out.println(resultadoSubtracao+" � um numero par. ");
		} else {System.out.println(resultadoSubtracao+ " � um numero �mpar");
		}break;
		
		case 3:System.out.println("A divis�o de "+n1+ " por " +n2+ " � de: "+resultadoDivisao); 
		if((resultadoDivisao%2)==0) {
			System.out.println(resultadoDivisao+" � um numero par. ");
		} else {System.out.println(resultadoDivisao + " � um numero �mpar");
		}break;
		
		
		case 4:System.out.println("A multiplica��o de "+n1+ " por  " +n2+ " � de: "+resultadoMultiplicacao);
		if((resultadoMultiplicacao%2)==0) {
		System.out.println(resultadoMultiplicacao+" � um numero par. ");
		} else {System.out.println(resultadoMultiplicacao + " � um numero �mpar");
		}break;
		
		}
		
		
		

	}

}

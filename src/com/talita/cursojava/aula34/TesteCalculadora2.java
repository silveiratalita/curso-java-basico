package com.talita.cursojava.aula34;

import java.util.Scanner;

public class TesteCalculadora2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double num1;
		double num2;
		int num=0;
		int num3=0;
		System.out.println("Inform a opção desejada:");
		System.out.println("1 para soma");
		System.out.println("2 para subtração");
		System.out.println("3 para multiplicação");
		System.out.println("4 para divisão");
		System.out.println("5 para exponenciação");
		System.out.println("6 para fatorial de um numero");
		int opcao=scan.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("quais numeros deseja somar:");
			System.out.println(" desejo somar: ");
			num1=scan.nextDouble();
			System.out.println(" com : ");
			 num2=scan.nextDouble();
			Calculadora.soma(num1, num2);
			
			
			break;
		case 2:
			System.out.println("quais numeros deseja subtrair:");
			System.out.println(" desejo subtrair: ");
			num1=scan.nextDouble();
			System.out.println(" de : ");
			num2=scan.nextDouble();
			Calculadora.subtração(num1, num2);
			break;
		case 3:
			System.out.println("quais numeros deseja multiplicar:");
			System.out.println(" desejo multiplicar: ");
			num1=scan.nextDouble();
			System.out.println(" por : ");
			num2=scan.nextDouble();
			Calculadora.multiplicacao(num1, num2);
			break;
		case 4:
			System.out.println("quais numeros deseja dividir:");
			System.out.println(" desejo dividir: ");
			num1=scan.nextDouble();
			System.out.println(" por : ");
			num2=scan.nextDouble();
			Calculadora.divisao(num1, num2);
			break;
		case 5:
			System.out.println("que numero deseja elevar a potencia de qual numero:");
			System.out.println(" desejo elevar: ");
			num1=scan.nextInt();
			System.out.println(" a potencia de  : ");
			num2=scan.nextInt();
			Calculadora.potencia(num, num3);
			break;
		case 6:
			System.out.println("Informe o numero");
		    num=	scan.nextInt();
		    Calculadora.fatorial(num);
		    break;
		
		default:System.out.println("opção invalida");
				
			
		}
	}

}

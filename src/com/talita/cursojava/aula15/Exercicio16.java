package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Insira os 3 valores da equação");
		System.out.println("Insira o valor de a");
		double a = scan.nextDouble();
		
		if(a==0) {
			System.out.println("Você digitou um valor invalido, programa encerrado!");

			System.exit(0);
		} 
		System.out.println("Insira o valor de b");
		double b = scan.nextDouble();
		System.out.println("Insira o valor de c");
		double c = scan.nextDouble();
		
		double calcDelta=Math.pow(b, 2)-4*a*(c);
		if(calcDelta<0) {
			System.out.println("O valor de Delta é negativo, programa encerrado!");

			System.exit(0);
		} else {
			double raizSoma=((-b)+Math.sqrt(calcDelta))/(2*a);
			double raizSubtrai=(((-b) - Math.sqrt(calcDelta))/(2*a));
			//System.out.println("x1= " + raizSoma);
		//	System.out.println("x2= " + raizSubtrai);
			System.out.println("S={ " + raizSubtrai+" , "+raizSoma);


			System.exit(0);
		}
		

	}

}

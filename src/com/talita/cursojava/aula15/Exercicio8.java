package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro produto");
		double valor1 = scan.nextDouble();
		System.out.println("Informe o valor do segundo produto");
		double valor2 = scan.nextDouble();
		System.out.println("Informe o valor do terceiro produto");
		double valor3 = scan.nextDouble();
		
		if((valor1<valor2)&&(valor1 <valor3)) {
			System.out.println("Pode comprar o produto que custa "+valor1+ ", pois este é o preço mais barato" );
		}  else if ((valor2<valor1)&&(valor2 <valor3)) {
			System.out.println("Pode comprar o produto que custa "+valor2+ ", pois este é o preço mais barato" );
		} else if((valor3<valor2)&&(valor3 <valor1)) {
			System.out.println("Pode comprar o produto que custa "+valor3+ ", pois este é o preço mais barato" );
		}
		

	}

}

package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe um numero e descubra se ele � par ou impar:");
		int numero = scan.nextInt();
		int resto=(numero%2);
		 
		
		if(resto==0) {
			
			System.out.println("O numero digitado � par!");
			
		 }  else {
			 
			 
			 System.out.println("O numero digitado � impar!");
			 
			 
		}

	}

}

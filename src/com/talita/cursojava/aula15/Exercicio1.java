package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("	digite dois numeros e te direi qual é o maior numero digitado!"); 
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("o maior numero é o 	"+ numero1); 
		}else {
			System.out.println("o maior numero é o 	"+ numero2	); 
		}
		
		
		

	}

}

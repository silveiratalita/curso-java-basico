package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Informe o valor de n");
		int n=scan.nextInt();
		int i=0;
		int j=0;
		int soma=0;
		int somaTotal=0;
		
		for (i=1, j=1; i<n;i++) {
		
		
		soma=	i+j;
		somaTotal=somaTotal+soma;

		System.out.print( i+" / "+j+" + ");
		j=j+2;
		
		
		
		}
		
		System.out.println("A soma da sequencia é  "+soma);

	}

}

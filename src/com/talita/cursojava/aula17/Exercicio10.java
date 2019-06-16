package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("informe 2 numeros");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		for(int i = n1+1; i <= n2-1  ; i++) {
		
			System.out.println(i);
				
		}

	}

}

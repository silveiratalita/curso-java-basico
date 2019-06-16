package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero para o fatorial");
		int n=scan.nextInt();
		int fatorial=1;
	
		
		if (n==0 ||n==1) {
			System.out.println("O fatorial de " + n +" é  1.");	
		}else {
			for(int i=n; i>0;i--) {
			fatorial*=i;
			System.out.println(i);	
						
			
			
			}
		}
		System.out.println(fatorial);	
		
	}

}

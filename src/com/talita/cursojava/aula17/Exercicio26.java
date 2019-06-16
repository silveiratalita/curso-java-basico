package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int fatorial=1;
		int resultado=0;
		
		System.out.print(n+"!= ");
		for (int i=n;i>=1;i--) {
			
			fatorial=fatorial*i;
			System.out.print(+i+" . ");
			
			//System.out.println(fatorial);
			
		}
		System.out.println("= "+fatorial);
	}

}

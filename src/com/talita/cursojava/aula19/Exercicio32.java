package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int [5];
		
		System.out.println("Informe 5 numeros");
		for (int i=0; i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
		
		for(int i=0; i<a.length ; i++) {
			for(int j=1; j<=10;j++)
				System.out.println(  a [ i ] + "   x   " + j + " = " +  a[i]*j);
		}

	}

}

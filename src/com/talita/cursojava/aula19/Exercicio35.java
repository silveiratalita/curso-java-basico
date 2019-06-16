package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int [10];
		
		
		
		for (int i =0; i<a.length;i++) {
			System.out.println("entre com a posição "+i);
			a[i]=scan.nextInt();
		
		}
		for (int i =0; i<a.length;i++) {
			System.out.println("Analizando o numero  "+a[i]);
			
				for(int j=1; j<a[i];j++)
					if(a[i]%2==0) {
						System.out.println(j+" é divisor");
					}
		
		}
	}

}

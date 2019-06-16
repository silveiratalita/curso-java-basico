package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int [10];
		
		
		
		for (int i =0; i<a.length;i++) {
			System.out.println("entre com a posição "+i);
			a[i]=scan.nextInt();
		
		}
		for (int i =0; i<a.length;i++) {
			System.out.println("Analizando o numero  "+a[i]);
			
				for(int j=2; j<a[i];j++)
					if(j%2==0) {
						System.out.println(j+" é par");
					}
		
		}

	}

}

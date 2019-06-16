package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int [11];
		
		
		
		for (int i =0; i<a.length;i++) {
			System.out.println("entre com a posição "+i);
			a[i]=scan.nextInt();
			a=Math.pow(2, i);
		}
		
			System.out.println(" vetor a = ");
			for(int i=0; i<a.length;i++) {
				System.out.println(a[i]+" ");
			}
			
				
		}

	}



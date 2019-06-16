package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
	
			Scanner scan=new Scanner(System.in);
			int a[]=new int [15];
			int b[]=new int [a.length];
		
			
			
			for (int i =0; i<a.length;i++) {
				System.out.println("entre com a posição "+i);
				a[i]=scan.nextInt();
			
			}
			for (int i =0; i<b.length;i++) {
				b[i]=1;
				for (int j=1; j<=a[i];j++) {
					b[i]*=j;
				}
			}
				System.out.println("vetor a");
				
				for (int i =0; i<a.length;i++) {
					
					System.out.println(a[i]+" ");
				
				
			}
				System.out.println("vetor b");
				
				for (int i =0; i<b.length;i++) {
					
					System.out.println(b[i]+" ");
				
				
			}
			
			

	}

}

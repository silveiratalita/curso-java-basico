package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int a[]=new int [10];
		int b[]=new int [a.length];
		int c[]=new int [a.length];
		int pB=0;
		int pC=0;
		
		int par=0;
		int impar=0;
		System.out.println("Informe 10 numeros");
		for (int i=0; i<a.length;i++) {
			a[i]=scan.nextInt();
					if(a[i]%2==0){
					
							b[pB]=a[i];
								pB++;
						}else {
							c[pC]=a[i];
							pC++;
				}
		}
		
		


	
		for(int i=0; i<a.length; i++) {
			System.out.print(", a= "+a[i]);
			//System.out.printl("");
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.print(", b= "+b[i]);
			//System.out.printl("");
}
		for(int i=0; i<a.length; i++) {
			
			System.out.print(" , c="+ c[i]);
			//System.out.println("");
		}
}
}
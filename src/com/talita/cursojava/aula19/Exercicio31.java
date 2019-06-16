package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int [10];
		int b[]=new int [a.length];
		int bFimMenos=a.length;
		int bInicMais=0;
		
		System.out.println("Informe 10 numeros");
		for (int i=0; i<a.length;i++) {
			a[i]=scan.nextInt();
		
					if(a[i]%2==0) {
						
						b[bInicMais]=a[i];
						bInicMais+=1;
					}    else   {
						
						
							b[bFimMenos]=a[i];
							bFimMenos=bFimMenos-1;
			}
			
		}

	
	
			for(int i=0; i<a.length; i++) {
					System.out.print(", a= "+a[i]);
		
	}
	for(int i =0; i<a.length; i++) {
		System.out.print(", b= "+b[i]);
		//System.out.printl("");
	}
	
	
}
	

}
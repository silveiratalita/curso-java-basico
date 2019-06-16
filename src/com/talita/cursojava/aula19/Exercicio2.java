package com.talita.cursojava.aula19;

public class Exercicio2 {

	public static void main(String[] args) {
		int a[]=new int[8];
		
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		int b[]=new int[8];
		b=a;
		
		for(int i=0   ;    i<a.length ;   i++) {
			b[i]=a[i]*2;
			System.out.println("B na posição  "+i+" = ("+a[i]/2+" x 2)= "+b[i]+" Lembrando que a na posição "+i+ " é "+a[i]/2+" e  que "+a[i]/2+" x 2 é = "+b[i]);
			
		}
	
	
		

	}

}

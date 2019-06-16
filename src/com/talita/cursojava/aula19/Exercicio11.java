package com.talita.cursojava.aula19;

public class Exercicio11 {

	public static void main(String[] args) {
		double a[]=new double [10];
		
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		 
		int par=0;
		
		for (int i=0  ;  i<=a.length  ;  i++) {
			if (a[i]%2==0) {
				par++;
			}
			
		}
		System.out.println(" numeros pares dentro do vetor: "+par);
	}

}

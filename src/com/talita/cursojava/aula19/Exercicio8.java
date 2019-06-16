package com.talita.cursojava.aula19;

public class Exercicio8 {

	public static void main(String[] args) {
		int a[]=new int [10];
		int b[]=new int [10];
		int c[]=new int [10];
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
		
		b[0]=10;
		b[1]=62;
		b[2]=3;
		b[3]=66;
		b[4]=532;
		b[5]=85;
		b[6]=7;
		b[7]=10;
		b[8]=9;
		b[9]=41;
		
		for (int i=0 ; i<=a.length  ;  i++) {
			c[i]= a[i]*b[i];
			System.out.println("C = A*B,  sendo que a é "+a[i]+ " e 'b' é "+b[i]+" então c é = "+c[i]);
		}

	}

}

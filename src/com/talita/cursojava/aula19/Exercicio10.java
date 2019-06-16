package com.talita.cursojava.aula19;

public class Exercicio10 {

	public static void main(String[] args) {
		double a[]=new double [10];
		double b[]=new double [10];
		
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
		
		
 
		for(int i=0 ; i<=a.length  ;  i++) {
			b[i]=(a[i]%2);
			System.out.println("b= resto de a dividido por 2, então o resto da divisão de "+a[i]+" por 2 é "+b[i]);
		}

	}

}

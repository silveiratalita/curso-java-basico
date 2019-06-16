package com.talita.cursojava.aula19;

public class Exercicio5 {

	public static void main(String[] args) {
		double a[]=new double[10];
		double b[]=new double[10];
		
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
	
		
		
		for(int i=0 ; i <=a.length ; i++ ) {
			
			b[i]=(a[i]*i);
			System.out.println("Se 'a' é "+a[i]+" e seu indice é  "+i+" e 'b' é "+a[i]+" x "+i+". Então 'b' é "+b[i]);
		}

	}

}

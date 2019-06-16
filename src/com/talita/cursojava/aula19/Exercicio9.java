package com.talita.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio9 {

	public static void main(String[] args) {
		
		DecimalFormat format=new DecimalFormat("###,###,###");
		float a[]=new float [10];
		float b[]=new float [10];
		float c[]=new float [10];
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
 
		for(int i=0 ; i<=a.length  ;  i++) {
			c[i]=(a[i]/b[i]);
			System.out.println("c= "+a[i]+" dividido por "+b[i]+" que é = "+c[i]);
		}
		
	}

}

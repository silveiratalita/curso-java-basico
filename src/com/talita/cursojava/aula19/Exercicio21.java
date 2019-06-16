package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double cotacao=0;
		double a[]=new double[20];
		
		System.out.println("Quanto vale um dolar em real?");
		cotacao=scan.nextDouble();
	
		
		
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
		a[10]=11;
		a[11]=12;
		a[12]=13;
		a[13]=14;
		a[14]=15;
		a[15]=16;
		a[16]=17;
		a[18]=19;
		a[19]=20;
		
		for(int i=0; i< a.length ; i++) {
			
			if(a[i]<=20) {
				a[i]=cotacao*i;
				
				 System.out.println("o valor em reais é de "+a[i]);
			}
			
			
		}

	}

}

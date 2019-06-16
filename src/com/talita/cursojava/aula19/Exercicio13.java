package com.talita.cursojava.aula19;

public class Exercicio13 {

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
		 
		int multiplo=0;
		double vetoresMultiplosSoma=0;
		for (int i=0  ;  i<=a.length  ;  i++) {
			
			if(a[i]%5==0) {
				vetoresMultiplosSoma=a[i]+vetoresMultiplosSoma;
				
			}
			System.out.println("A soma dos numeros do vetor que são multiplos  de 5 é  : "+vetoresMultiplosSoma);
		}
		
		


	}

}

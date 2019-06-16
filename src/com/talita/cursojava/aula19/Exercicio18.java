package com.talita.cursojava.aula19;

public class Exercicio18 {

	public static void main(String[] args) {
			int a[]=new int [10];
		
		
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
		 
		int maior=Integer.MAX_VALUE;
		int menor=Integer.MIN_VALUE;
	
		for (int i=0  ;  i<=a.length  ;  i++) {
		
				if(a[i]<menor) {
					menor=a[i];
				}  
				if (a[i]>maior){
					maior=a[i];
				}
		
				
				
			}
			 System.out.println("O numero menor dentro do vetor é " +menor);
			 System.out.println("O numero maior dentro do vetor é " +maior);
			
	}

}

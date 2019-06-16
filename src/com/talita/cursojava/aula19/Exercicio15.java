package com.talita.cursojava.aula19;

public class Exercicio15 {

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
		 
		
		double vetoresImpares=0;
		double vetoresPares=0;
		double percentualImpar=0;
		double percentualPar=0;
	
		for (int i=0  ;  i<=a.length  ;  i++) {
			
			if( a[i]%2 !=0 ) {
				vetoresImpares=vetoresImpares++;
				
				
			}else {
				vetoresPares=vetoresPares++;
			}
			
			
			
		
		}
		percentualImpar=(vetoresImpares*100)/a.length;
		percentualPar=(vetoresPares*100)/a.length;
		
		System.out.println("O vetor a contem 10 indices, dos quais "+percentualImpar+" % são impares e " +percentualPar+" % são pares.");

	}

}

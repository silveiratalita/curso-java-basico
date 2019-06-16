package com.talita.cursojava.aula19;

public class Exercicio14 {

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
		 
		double numVet=0;
		double vetoresImpares=0;
	
		for (int i=0  ;  i<=a.length  ;  i++) {
			
			if(a[i]%2!=0) {
				vetoresImpares=a[i]+vetoresImpares;
				numVet++;
				
			}
			System.out.println("A media da soma dos numeros impares dos vetores é de é  : "+(vetoresImpares/numVet));
		}
		

	}

}

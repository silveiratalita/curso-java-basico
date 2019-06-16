package com.talita.cursojava.aula19;

public class Exercicio17 {

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
		a[9]=36;
		 
		
	int contadorMaiores=0;
	
	
		for (int i=0  ;  i<=a.length  ;  i++) {
			
			
			if( a[i]>35 ) {//a
				contadorMaiores= contadorMaiores++;		
		}
		
		
		

			System.out.println("Pessoas com mais de 35 anos:  "+contadorMaiores);
	}
		
}
}

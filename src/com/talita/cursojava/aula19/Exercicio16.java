package com.talita.cursojava.aula19;

public class Exercicio16 {

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
		 
		
		double vetoresMenor15=0;
		double vetoresIguais15=0;
		double vetoresMaior15=0;
		double mediaMaiores15=0;
		int contadorMaiores=0;
	
	
		for (int i=0  ;  i<=a.length  ;  i++) {
			
			if(a[i]==15) {//b
				vetoresIguais15=vetoresIguais15+a[i];
			}
			if( a[i]<15 ) {//a
				vetoresMenor15=vetoresMenor15+a[i];
				
				
			}else {
				vetoresMaior15=vetoresMaior15+a[i];
				contadorMaiores= contadorMaiores++;
			}
			 
			//c
			mediaMaiores15=vetoresMaior15/contadorMaiores;
			System.out.println("A media dos valores superiores a 15 é de  "+mediaMaiores15);
		}
		
		
		

	}

	}



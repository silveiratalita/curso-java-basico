package com.talita.cursojava.aula17;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double a=80000;
		double b=200000;
		int cont=0;
		boolean chegou=false;
		do {
		a=	a+((a*3)/100);
		b=	b+((a*1.5)/100);
		
		cont++;
				if (a>=b) {
					System.out.println("anos necessarios: "+cont);
						chegou=true;
					}
			
		}while(!chegou);
		
		System.out.println("anos: "+cont);
	}
	
	


}

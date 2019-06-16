package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a população do pais A e a sua taxa de cerscimento");
		float a=scan.nextFloat();
		float taxaA=scan.nextFloat();
		System.out.println("Informe a população do pais B e a sua taxa de cerscimento");
		float b=scan.nextFloat();
		float taxaB=scan.nextFloat();
		
		int cont=0;
		boolean chegou=false;
		do {
		a=	a+((a*taxaA)/100);
		b=	b+((a*taxaB)/100);
		
		cont++;
				if (a>=b) {
					System.out.println("anos necessarios: "+cont);
						chegou=true;
					}
			
		}while(!chegou);
		
		System.out.println("anos: "+cont);
	}
	

	}



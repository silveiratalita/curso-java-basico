package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Insira um numero");
		
		int numero=scan.nextInt();
		
		System.out.println("A tabuada deve começar em:");
		int numInicio=scan.nextInt();
		System.out.println("A tabuada deve terminar em:");
		int numFim=scan.nextInt();
		int resultado=0;
		if (numFim<numInicio) {
			System.out.println("Numero de termino invalido:");
		}else {
			
			for(int i=numInicio; i<=numFim;i++) {
				resultado =numero*i;
				System.out.println(numero+" x "+ i+" = "+resultado);
				
			  
			 }
				 
				
			 }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

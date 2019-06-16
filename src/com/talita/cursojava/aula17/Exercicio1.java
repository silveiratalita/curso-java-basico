package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida=false;
		
		do {
		System.out.println("informe um valor entre 0 e 10"); 
		int nota= scan.nextInt(); 
		

		if(nota>=0 && nota<=10 ) {
			System.out.println("Voce informou a nota " + nota);
			notaValida=true;
		} else {
			System.out.println("O valor digitado é invalido, tente novamente.");
		}
		
		}while(!notaValida);
			
		
		
		
		
	}
}


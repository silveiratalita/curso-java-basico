package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio1Novamente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean note=false;
		do {
		System.out.println("informe uma nota valida");
		int nota=scan.nextInt();
		if (nota>=0 && nota <=10) {
			 note=true;
		} 
		} while(! note) ;
	
}
}

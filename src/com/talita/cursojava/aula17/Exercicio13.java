package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("informe o numero:");
		int numero =scan.nextInt();
		System.out.println("informe a potencia:");
		int potencia =scan.nextInt();
		double resultado=1;
	//	resultado= Math.pow(numero, potencia);
		//System.out.println(resultado);
		for(int i=1;i<=potencia;i++) {
			
			resultado=resultado*numero;
			
		}
		
		System.out.println(resultado);
	}		

}

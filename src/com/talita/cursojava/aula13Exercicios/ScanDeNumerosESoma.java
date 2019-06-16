package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class ScanDeNumerosESoma {

	public static void main(String[] args) {
		Scanner numerodigitado = new Scanner(System.in);
		
		System.out.println("Digite dois numeros : ");
		int numero1 =  numerodigitado.nextInt();
		int numero2 = numerodigitado.nextInt();
		
		System.out.println("A somas dos numeros que vc digitou é igual a: "+(numero1+numero2));
		

	}

}

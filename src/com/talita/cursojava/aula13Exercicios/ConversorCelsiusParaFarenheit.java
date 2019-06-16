package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class ConversorCelsiusParaFarenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit.");
		int faren = scan.nextInt();
		int celsius = (5*(faren-32)/9);
		System.out.println(faren+" graus Farenheit e quivalem a " +celsius+ " graus celsius.");

	}

}

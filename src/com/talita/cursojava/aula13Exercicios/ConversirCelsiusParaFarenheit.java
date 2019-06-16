package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class ConversirCelsiusParaFarenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite temperatura em graus celsius.");
		int celsius = scan.nextInt();
		int faren = (celsius  *  9/5) + 32;
		System.out.println(celsius + " graus celsius equivalem a " + faren + " graus farenheit.");

	}

}

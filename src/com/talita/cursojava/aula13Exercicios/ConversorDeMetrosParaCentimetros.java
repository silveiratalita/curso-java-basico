package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class ConversorDeMetrosParaCentimetros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float metros;
		float centimetros;
		
		System.out.println("Digite o valor em metros: ");
		metros = scan.nextFloat();
		centimetros = metros * 100;
		System.out.println(metros+ " metros equivalem a "+centimetros+" centimetros.");
		
		
	
		

	}

}

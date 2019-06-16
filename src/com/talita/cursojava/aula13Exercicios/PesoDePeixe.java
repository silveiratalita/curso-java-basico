package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class PesoDePeixe {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o peso dos peixes kilos");
		int peso = scan.nextInt();
		
		int multa = ((peso-50)*4);
		
		System.out.println("O valor da multa é de " + multa + ",00 reais.");
		
		

	}

}

package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class CalcularRaioDeCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio;
		double area;
		
		System.out.println("Digite o valor do raio em centimetros");
		raio=scan.nextDouble();
		area=Math.pow(raio,2);
		System.out.println("A área do circulo é de: "+area+" centimetros.");
;
	}

}

package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe sua altura em metros para o calculo do peso ideal.");
		double altura=scan.nextDouble();
		double pesoIdeal = (72.7*altura) - 58;
		System.out.println("Seu peso ideal é de " + pesoIdeal + " kilos.");


	}

}

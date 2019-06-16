package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class PesoIdealPorSexo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura em metros para o calculo do peso ideal.");
	
		
		double altura = scan.nextDouble();
		double homem = (72.7*altura) - 58;
		double mulher = (62.1*altura) - 44.7;
		
		
		System.out.println("Caso você seja mulher, seu peso ideal é de "+ mulher+ " kilos.");
		System.out.println("Caso você seja homem, seu peso ideal é de "+ homem+ " kilos.");
	
	
	}

}

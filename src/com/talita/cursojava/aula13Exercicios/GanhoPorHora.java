package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class GanhoPorHora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Quantas horas vc trabalha poor mês?");
		int numeroDeHoras = scan.nextInt();
		
		System.out.println("Quanto vc ganha por hora trabalhada?");
		double valorHora = scan.nextDouble();
		
		
		double valorMensal = (valorHora*numeroDeHoras);
		
		System.out.println("Você recebe " + valorMensal + " por mês.");

	}

}

package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		System.out.println("Informe o dia da semana de 1 a 7: ");
		int diaSemana = scan.nextInt();
	
		switch(diaSemana) {
		case 1:System.out.println("Segunda-feira");break;
		case 2:System.out.println("Terça-feira");break;
		case 3:System.out.println("Quarta-feira");break;
		case 4:System.out.println("Quinta-feira");break;
		case 5:System.out.println("Sexta-feira");break;
		case 6:System.out.println("Sabado");break;
		case 7:System.out.println("Domingo");break;
		default:System.out.println("Valor inválido. Digite um valor válido!");break;
		
			
		
		}
	}

}

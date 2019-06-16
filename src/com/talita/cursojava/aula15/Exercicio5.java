package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite as duas notas do aluno.");
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
		
		float media=(nota1+nota2)/2;
		
		
		if (media==10) {
			System.out.println("Aluno Aprovado com DISTINÇÃO");
		}  else if (media>=7) {
			System.out.println("Aluno Aprovado");
		}  else   {
			System.out.println("Aluno Reprovado");
		} 
	}

}

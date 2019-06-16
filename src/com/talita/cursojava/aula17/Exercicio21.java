package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("digite quantas turmas");
		int turmas = scan.nextInt();
		int somaAlunosTurmas=0;
		
		System.out.println("digite quantos alunos na turma 0");
		for(int i=0; i<turmas;i++) {
			
			int alunosPorTurma = scan.nextInt();
			somaAlunosTurmas=somaAlunosTurmas+alunosPorTurma;
			System.out.println("digite quantos alunos na turma "+i);
		
		
		}
					
			int media= somaAlunosTurmas/turmas;
			
			System.out.println("O numero médio de alunos por sala é de :"+media);
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


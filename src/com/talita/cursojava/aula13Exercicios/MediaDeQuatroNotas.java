package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class MediaDeQuatroNotas {

	public static void main(String[] args) {
	
		Scanner nota = new Scanner(System.in);
		
		
		System.out.println("Digite a nota do Primeiro Bimestre");
		int nota1 = nota.nextInt();
		
		System.out.println("Digite a nota do Segundo Bimestre");
		int nota2 = nota.nextInt();
		
		System.out.println("Digite a nota do Terceiro Bimestre");
		int nota3 = nota.nextInt();
		
		System.out.println("Digite a nota do Quarto Bimestre");
		int nota4 = nota.nextInt();
		
		int media = (nota1+nota2+nota3+nota4)/4;
		
	System.out.println("A media de suas notas bimestrais é de:  "+media);
	
		
		
	}

	}



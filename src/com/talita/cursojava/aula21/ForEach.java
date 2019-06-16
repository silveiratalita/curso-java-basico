package com.talita.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		
		int []notas= new int [10];
		
		Random gerador=new Random();
		for(int i=0; i<notas.length; i++ ) {
			notas[i]=gerador.nextInt(10);
		}
			
		
		for(int i=0; i<notas.length; i++ ) {
			int nota=notas[i];
		System.out.println(nota);
		
		}
		//não tem acesso ao contador só a variavel nota do for acima, pq 
		//o exemplo acima mostra como acontece por denbtro do for each
		//foreach não funciona para fazer imput do teclado, pois isso  é outra teoria do java dos tipos inteirosserem valores
		//aqui estamos apenas pegando o valor, o for each usa tipos primitivos pq é um conceito de referencia e valor do java.
		//vai falar mais na aula de POO
		System.out.println("usando um for each");
		for(int nota : notas) {
			System.out.println(nota);
		}
		
		//OUTPUT DE MATRIZ EX 02
		System.out.println("usando um array multidimensional");
double [] [] notasAlunos = new double  [3] [4];
		

		notasAlunos [0][0]=10;
		notasAlunos [0][1]=7;
		notasAlunos [0][2]=9;
		notasAlunos [0][3]=9.5;
		
		notasAlunos [1][0]=9;
		notasAlunos [1][1]=8;
		notasAlunos [1][2]=7;
		notasAlunos [1][3]=9;
		
		notasAlunos [2][0]=8;
		notasAlunos [2][1]=9;
		notasAlunos [2][2]=10;
		notasAlunos [2][3]=7;
		
		for (double [] notasAluno: notasAlunos){
			for(double nota :notasAluno) {
				System.out.println(nota+"  ");
			}
			System.out.println("  ");
		}
		
		
		
		
	}

}

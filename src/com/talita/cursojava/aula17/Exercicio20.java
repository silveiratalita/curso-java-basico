package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int somaIdade=0;
		int n=10;
		int i=0;
	  for ( i =0;i<n;i++) {
		System.out.println("Digite uma idade");
		int idadeIndividual = scan.nextInt();
		somaIdade=somaIdade+idadeIndividual;
	}
	  	int media=somaIdade / i;
	  	if(media<=25) {
	  		System.out.println("turma jovem");//turma jovem
	  	}else if (media>=26 && media/i>=60) {
	  		System.out.println("turma adulta");//turma adulta
	  	}else if (media>60) {
	  		System.out.println("turma idosa");//turma idosa
	  	}
	}
	
}

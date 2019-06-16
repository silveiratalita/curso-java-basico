package com.talita.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		 System.out.println( "Entre com o numero de pessoas que serão entrevistadas");
		 int numEntrevistados=scan.nextInt();
		 String [][] nomeFilhos= new String[numEntrevistados][];
		 
		 for(int i=0; i< nomeFilhos.length; i++) {
			 System.out.println( "Entre com a quantidade de filhos");
			 int qtdFilhos=scan.nextInt();
			 nomeFilhos[i]=new String[qtdFilhos];
			 for(int j=0; i< nomeFilhos[i].length; j++) {
				 
				 System.out.println( "digite o nome do filho" );
				 
				 nomeFilhos[i][j]=scan.next();
			 }
		 }
		 for (int i=0; i<nomeFilhos.length; i++) {
			 for(int j=0; i<nomeFilhos[i].length; j++) {
				 System.out.println( "pessoa " +i+" tem "+ nomeFilhos+" filhos");
				 System.out.println( nomeFilhos[i][j]);
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

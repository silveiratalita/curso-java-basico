package com.talita.cursojava.aula47;

public class Exececao {

	public static void main(String[] args) {
		
	try {
	 int vetor[]=new int [4];
	 System.out.println("antes da execeção");
	 vetor[4]=1;
	 System.out.println("esse texto não sera impresso");
	} catch(ArrayIndexOutOfBoundsException exception) {
		System.out.println("Exceção ao acessar indice do vetor que não existe");
	}
	System.out.println("esse texto  sera impresso apos a exeção");
	}

}

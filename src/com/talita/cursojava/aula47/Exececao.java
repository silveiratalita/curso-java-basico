package com.talita.cursojava.aula47;

public class Exececao {

	public static void main(String[] args) {
		
	try {
	 int vetor[]=new int [4];
	 System.out.println("antes da exece��o");
	 vetor[4]=1;
	 System.out.println("esse texto n�o sera impresso");
	} catch(ArrayIndexOutOfBoundsException exception) {
		System.out.println("Exce��o ao acessar indice do vetor que n�o existe");
	}
	System.out.println("esse texto  sera impresso apos a exe��o");
	}

}

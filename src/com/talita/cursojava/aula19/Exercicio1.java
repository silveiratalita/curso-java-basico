package com.talita.cursojava.aula19;

public class Exercicio1 {

	public static void main(String[] args) {
		int [] A=new int[5];
		A[0]=1;
		A[1]=2;
		A[2]=3;
		A[3]=4;
		A[4]=5;
		int[] B=new int[5];
		
		B=A;
		
		for(int i=0; i<=A.length;i++) {
			if(B==A) {
			System.out.println("No vetor A na posição "+i+" está o valor "+(i+1));
			System.out.println("No vetor B na posição "+i+" está o valor "+(i+1));
			}else {
				System.out.println("a não é iguala a b");
		}

	}

}
}

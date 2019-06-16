package com.talita.cursojava.aula20;

import java.util.Random;

public class Exer2 {

	public static void main(String[] args) {
		
		int [][] matriz= new int [10][10];
		Random gerador= new Random();
		
	int maiorLinha5=0;
	int menorLinha5=0;
	int maiorCol7=0;
	int menorCol7=0;
	
	
	for(int i=0; i<matriz.length;i++) {
		for (int j=0; j<matriz[i].length; j++) {
			matriz[i][j]=gerador.nextInt(9);
		}
	}
	for(int i=0; i<matriz.length; i++) {
		for(int j=0; j<matriz[i].length; j++) {
						if (i==5) {
							if (matriz[i][j]>maiorLinha5) {
								maiorLinha5=matriz[i][j];
								System.out.println("linha "+i+ " maior valor = "+maiorLinha5);
							}if (matriz[i][j]<menorLinha5) {
							 menorLinha5=matriz[i][j];
							 System.out.println("linha "+i+ " menor valor= "+menorLinha5);
							
						}
							
						if (j==7) {
							if (matriz[i][j]>maiorCol7) {
								maiorCol7=matriz[i][j];
								System.out.println("coluna "+j+ " maior valor = "+maiorCol7);
							}if (matriz[i][j]<menorCol7) {
								menorCol7=matriz[i][j];
								System.out.println("coluna "+j+ " menor valor= "+menorCol7);
						}
	
			
		}
	}
	
	
}
		
		 
		 
	
	}
}
}
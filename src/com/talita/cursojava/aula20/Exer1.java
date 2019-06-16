package com.talita.cursojava.aula20;

import java.util.Random;

public class Exer1 {

	public static void main(String[] args) {
		int [][] matrizM= new int [4][4];
		Random gerador=new Random();

		int maior=0;
		
		int linha	=0;
		int coluna=0;
		
		
		
		
		for(int i = 0;  i < matrizM.length ; i++) {
			for (int  j = 0 ;  j < matrizM[i].length; j++ ) {
				matrizM[i][j]=gerador.nextInt(9);
				
				
				if(matrizM[i][j]>maior) {
					maior=matrizM[i][j];
					coluna=j;
					linha=i;
				}
				
				System.out.print(matrizM[i][j]+ ", ");

				
				}
			
			}
		
		System.out.println( " ");
		System.out.print("o maior numero é "+maior+ " na linha "+linha+" e na coluna "+ coluna);
		
			
			}
		
	
				
		
		
		
		
		
		
		
				
			}
		
		
				
				

	



package com.talita.cursojava.aula20;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int [][] matriz= new int [3][3];
		
		int par=0;
		int impar=0;
		
		System.out.println(" insira os valores na matriz:");
		for(int i=0; i<matriz.length; i++) {
}
		
	
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; i<matriz[i].length; j++)
			if(matriz[i][j]%2==0) {
				par++;
			}else {
				impar++;
			}
				
			}
			
System.out.println(" A quantidade de pares é: "+par);
System.out.println(" A quantidade de impares é: "+impar);
}
}
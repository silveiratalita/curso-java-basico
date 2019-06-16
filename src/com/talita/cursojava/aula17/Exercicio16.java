package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Informe um numero:");
//		int numero =scan.nextInt();
		
		long primeiro=0;
		long segundo =1;
		long terceiro=0;
		System.out.print(primeiro+" "+ segundo+" "); 
		 
		do {
			terceiro = primeiro + segundo;
			System.out.print(" "+ terceiro+" "); 
			primeiro= segundo;
			segundo=terceiro;
			
		}while(terceiro<500);
			
		}

	}



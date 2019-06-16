package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Informe um numero:");
		int numero =scan.nextInt();
		int primeiro=0;
		int segundo=1;
		int terceiro=primeiro+segundo;
		
	
		System.out.print(primeiro+" "+segundo);
		for(int i =0; i<numero;i++) {
			//soma o primeiro(1) com o segundo(2)
			terceiro=primeiro+segundo;
			//printa o terceiro(2+1=3), que e o terceiro
			System.out.print(" "+terceiro+" ");
			
			primeiro=segundo;
			segundo=terceiro;
		
			

			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

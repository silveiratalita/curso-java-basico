package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Informe um numero e descubra se ele é ou não primo.");
		int num=scan.nextInt();
		boolean primo=true;
		int restoZero=0;
		int p=0;
		
		
		for(int i=2; i<=num;i++) {
			if((num%i)==0) {
				restoZero++;
			
			}else  {
				p++;
				
			}
				
		}
		
		if(restoZero>2) {
			primo=false;
			System.out.println(" O numero "+num+ " nao é primo");
		}else {
			primo=true;
			System.out.println(" O numero "+num+ " é primo");
		}
	}

}

package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Informe um numero.");
		int num=scan.nextInt();
		boolean primo=true;
		int restoZero=0;
		
		for(int i=0; i<=num ; i++) {
			for(int j=0 ; j<num ; j++)
			if(i % j==0) {
				restoZero++;
				
				if (restoZero<=2) {
					System.out.println(i+" é primo");
				}else {
					System.out.println(i+" não é primo");
				}
				}
			
			

	}
		
		
		/*for(int i =1;i<=num;i++) {
			
			
			for(int j=2;j<i;j++)
				if( i %j==0) {
				
					//System.out.println("não é primo, divisivel por "+i);
					primo=false;
				}
			if (primo=true) {
				System.out.println("é primo"+i);
			}
		}
		*/

}
}
package com.talita.cursojava.aula18;

import java.util.Scanner;

public class BrekEContinue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		

		/*System.out.println("Enter com um numero e com um limite");
	
		int num=scan.nextInt();
		
		System.out.println("Enter com um limite");
		
		int max=scan.nextInt();
	
		for(int i=num;i<=max; i++) {
			System .out.println(i);
			if (i % 7==0) {
				System .out.println("O valor de i é "+i);
			//	break;//se eu achei a resposta então eu paro, não preciso que el vá ate o fim do for ou do loop.
			}//descomentar e comentar o break para verificar
			
		}	
	*/	
	
	/*	for(int i=0; i<=4;i++) {//isso não é utilizado no java, é curiosidade!
			rotulo1:{
			
			rotulo2:{
			
			rotulo3:{
		
			if(i==1) {
				break rotulo1;
			}
			if(i==2) {
				break rotulo2;
			}
			if(i==31) {
				break rotulo3;
			}
	
	
	
	
	
	
	
	
					//rotulo3
					System.out.println("rotulo3");
					}
					//rotulo2
				System.out.println("rotulo2");
				}
					//rotulo1
				System.out.println("rotulo1");
			}
					//for
		System.out.println(i);
		
		
		}*/
	
		
		
		System.out.println("Enter com um numero e com um limite");
		
		int num=scan.nextInt();
		
		System.out.println("Enter com um limite");
		
		int max=scan.nextInt();
	
		for(int i=num;i<=max; i++) {
		
			if (i % 7==0) {
				continue;
			}
				System.out.println("O valor de i é "+i);
		
	}
}
	}


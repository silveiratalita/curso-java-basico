package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Execicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um ano para saber se � bissexto:");
		int ano= scan.nextInt();
		int i=0;
		int restoPor4=(ano%4);
		int restoPor100=(ano%100);
		int restoPor400=(ano%400);
		
		
		if((restoPor4==0)&&((restoPor100!=0))) {
			//ano � bissexto
			System.out.println("Esse ano � bissexto e fevereito tem 28 dias");
		}else if ((restoPor4==0)||(restoPor400==0)) {
			//ano  � bissexto
			System.out.println("Esse ano � bissexto e fevereito tem 28 dias");
		}else {
			System.out.println("Esse ano n�o �  � bissexto e fevereito n�o tem apenas tem 28 dias");
		}


	}

}

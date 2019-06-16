package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Execicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um ano para saber se é bissexto:");
		int ano= scan.nextInt();
		int i=0;
		int restoPor4=(ano%4);
		int restoPor100=(ano%100);
		int restoPor400=(ano%400);
		
		
		if((restoPor4==0)&&((restoPor100!=0))) {
			//ano é bissexto
			System.out.println("Esse ano é bissexto e fevereito tem 28 dias");
		}else if ((restoPor4==0)||(restoPor400==0)) {
			//ano  é bissexto
			System.out.println("Esse ano é bissexto e fevereito tem 28 dias");
		}else {
			System.out.println("Esse ano não é  é bissexto e fevereito não tem apenas tem 28 dias");
		}


	}

}

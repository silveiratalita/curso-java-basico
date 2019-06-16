package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int codigo=0;
		double cachorro=0;
		double bauruS=0;
		double bauruOvo=0;
		double hamburguer=0;
		double cheeseBurguer=0;
		double refrigerante=0;
		
		do {
		System.out.println("Insira um codigo");
		 codigo=scan.nextInt();
		System.out.println("Insira a quantidade");
		double qtd=scan.nextDouble();
		
		
		
		switch(codigo){
		case 100: 
			cachorro=qtd*1.20;
		
		System.out.println("Cachorro quente:      "+qtd+" x  1,20 = "+cachorro);
		break;
		
		case 101:
		
		
			bauruS=qtd*1.30;
			System.out.println("Bauru Simples:      "+qtd+" x  1,30 = "+bauruS);
			break;
		case 102:
		
	
			bauruOvo=qtd*1.50;
			System.out.println("Bauru com Ovo:      "+qtd+" x  1,50 = "+bauruOvo);
			break;
			
		case 103:

		
			hamburguer=qtd*1.20;
			System.out.println("Hamburguer:      "+qtd+" x  1,20 = "+hamburguer);
			break;
			
		case 104:

		
			cheeseBurguer=qtd*1.30;
			System.out.println("CheeseBurguer:      "+qtd+" x  1,30 = "+cheeseBurguer);
			break;
		case 105:

		
			refrigerante=qtd*1.00;
			System.out.println("Refrigerante:      "+qtd+" x  1,00 = "+refrigerante);		
			break;
		
		
		default:System.out.println("Você digitou um numero invalido.");
		break;
			
	}
		
		} while(codigo != 0);

}
}
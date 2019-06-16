package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Em que turono vc estuda?");
		System.out.println("Digite M para matutino");
		System.out.println("Digite V para vespetino");
		System.out.println("e N para noturno");
		
		String turno=scan.next();
		 switch(turno) {
		 case"n":System.out.println("Boa Noite");break;
		 case"v":System.out.println("Boa Tarde");break;
		 case"m":System.out.println("Bom Dia");break;
		 default:System.out.println("inserção invalida");break;
		 
		 
		 }
	}

}

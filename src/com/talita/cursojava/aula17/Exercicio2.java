package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		boolean iguais=true;
		do {
			
		Scanner scan =new Scanner(System.in);
		System.out.println("Informe seu username");
		String user=scan.nextLine();
		System.out.println("Informe sua senha");
		String senha=scan.nextLine();
		if (user.equals(senha)) {
			System.out.println("não podem ser iguais informe um nome e senhas diferentes");	
			iguais=true;
		}
		}while(!iguais);
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}

package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite um valor e direi se � positivo ou negativo"); 
		 int valor = scan.nextInt();
		 
		 if(valor<0) {
			 System.out.println("O valor digitado � negativo!"); 
		 }  else {
			 System.out.println("O valor � positivo!"); 
		 }
		 

	}

}

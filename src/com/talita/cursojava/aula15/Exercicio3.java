package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite M se seu sexo � feminino ou M se seu sexo � masculino"); 
		String sexo=scan.next();
		
		switch (sexo) {
		case "f" :  System.out.println("seu sexo � feminino"); break;
		case "m" : System.out.println("seu sexo � masculino");break;
		default:   System.out.println("sexo invalido");		break;
		}	
		
		
		
	
	}
}

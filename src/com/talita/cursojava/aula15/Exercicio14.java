package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do semestre:");
		double nota1=scan.nextDouble();
		System.out.println("Digite a segunda nota do semestre:");
		double nota2=scan.nextDouble();
		
		double media=((nota1+nota2)/2);
		
		if(media>=9.0 && media<=10.0) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media de  "+media+" - conceito A");
			System.out.println("APROVADO!");
		} else if (media>=7.5 && media<=9.0) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media de  "+media+" - conceito B");
			System.out.println("APROVADO!");
		} else if(media>=6.0 && media<=7.5) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media de  "+media+" - conceito C");
			System.out.println("APROVADO!");
		} else if(media>=4.0 && media<=6.0) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media de  "+media+" - conceito D");
			System.out.println("REPROVADO!");
		} else if(media>=4.0 && media<=0.0) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media de  "+media+" - conceito E");
			System.out.println("REPROVADO!");
		} 
	
	}

}

package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Informe 5 numeros");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int d=scan.nextInt();
			int e=scan.nextInt();
			
			int soma=a+b+c+d+e;
			int media =soma/5;
			System.out.println("a soma dos numeros é "+soma);
			System.out.println("a media dos numeros é "+media);

	}

}

package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class AreaDoQuadradoEDobro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double lado;
		double area;
		
		System.out.println("Informe a medida dos lados do quadrado em centimetros.");
		
		lado = scan.nextDouble();
		area = Math.pow(lado, 2);
		
	System.out.println("A área do quadrado é de: "+area+ " centimetros quadrados");
		
	
	
	
	}

}

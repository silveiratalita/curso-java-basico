package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira os 3 lados de um triangulo");
		System.out.println("Insira o lado 1");
		double lado1=scan.nextDouble();
		System.out.println("Insira o lado 2");
		double lado2=scan.nextDouble();
		System.out.println("Insira o o lado 3");
		double lado3=scan.nextDouble();
		
		
		if(((lado1+lado2)>lado3)||((lado1+lado3)>lado2)||((lado3+lado2)>lado1)){
			//soma do lado1 e lado2>lado 3
			//soma do lado1 e o lado3>lado2
			//soma do lado3 e o lado2>lado1
		System.out.println("Você informou medidas referentes a um triangulo do tipo: ");
		} if(lado1==lado2 && lado2==lado3) {
			System.out.println(" Equilátero");
		}else if(lado1==lado2 || lado2==lado3) {
			System.out.println(" Isósceles");
		}else if(lado1!=lado2 && lado2!=lado3) {
			System.out.println(" Escaleno!");
			
		
		
		
		
	}

}
}

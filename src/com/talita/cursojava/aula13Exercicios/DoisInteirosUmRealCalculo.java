package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class DoisInteirosUmRealCalculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros e um numero Real(que pode ser um numero real do Conjunto Z.");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3= scan.nextInt();
		
		int a= (numero1*2)*(numero2/2);
		int b=(numero1*3) + numero3;
        int c = (int) Math.pow(numero3, 3) ;
				
				System.out.println("O produto do dobro do primeiro com metade do segundo é :" + a);
				System.out.println("A soma do triplo do primeiro com o terceiro é :" + b);
				System.out.println("O terceiro elevado ao cubo é :" + c);
	
	
	
	}

}

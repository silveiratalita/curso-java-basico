package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("informe qual numero deseja exibir a tabuada:");
		int numero =scan.nextInt();
		
		for(int i=1; i<=10;i++) {
			int tabuada = numero*i;
			System.out.println(numero +" x "+i+" = "+ tabuada);
			
		}

	}

}

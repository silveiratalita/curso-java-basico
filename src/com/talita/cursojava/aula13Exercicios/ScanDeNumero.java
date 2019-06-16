package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class ScanDeNumero {

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner numerodigitado = new Scanner(System.in);
		
		int numero=numerodigitado.nextInt();
		System.out.println("O numero que vc digitou foi: "+numero);

	}

}

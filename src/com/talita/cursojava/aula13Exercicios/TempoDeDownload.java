package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class TempoDeDownload {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o tamanho do arquivo:");
		double tamArquivo = scan.nextDouble();
		System.out.println("Entre com a velocidade da internet:");
		double velInternet=scan.nextDouble();
		double tempo= tamArquivo / velInternet;
		System.out.println("O tempo estimado para fazer download do arquivo é de "+tempo+".");
	
	}

}

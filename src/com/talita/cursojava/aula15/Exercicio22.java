package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos quilos de morango vc deseja?");
			double kMorango=scan.nextDouble();
		
		System.out.println("Quantos quilos de maçã vc deseja?");
		double kMaca=scan.nextDouble();
		
		double pesoTotal=kMaca+kMorango;
		double valorMorango=0;
		double valorMaca=0;
		if(kMorango<=5) {
			valorMorango=2.50*kMorango;
		}else {
			valorMorango=2.20*kMorango;
		}
		if (kMaca<=5) {
			valorMaca=1.80*kMaca;
		} else {
			valorMaca=1.50*kMaca;
		}
		
		double valorTotal=valorMaca+valorMorango;
		
		
		if(kMaca+kMorango>=8||valorMaca+valorMorango>=25) {
			System.out.println("Você comprou "+ pesoTotal+" quilos de frutas e gastaria "+valorTotal);
		System.out.println("Por isso ganhou mais 10% de desconto e vai pagar apenas "+(valorTotal-(valorTotal*10)/100));
		}else {
			System.out.println("Você comprou "+ pesoTotal+" quilos de frutas e gastou "+valorTotal);
		
		
		
		
		
		
		
		
		
	}

}
}
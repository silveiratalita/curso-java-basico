package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Informe o numero de cds colecionados");
		int cds= scan.nextInt();
		double somaPrecos=0;
		
		for (int i =0; i<cds; i ++) {
			System.out.println("Informe o preçodos  cds colecionados");
			double precoCd=scan.nextDouble();
			somaPrecos=somaPrecos+precoCd;
			
			
		}
		
		double media= somaPrecos/cds;
		System.out.println("O valor medio gasto por cd colecionado é de "+media);

	}

}

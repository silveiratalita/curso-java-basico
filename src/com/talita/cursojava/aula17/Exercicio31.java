package com.talita.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Insira um salario");
		
		double salario=scan.nextDouble();
		
		int ano=1996;
		
		double percentual=(salario*1.5)/100;
		double percentual1=1.5;
		double percentualAumento=percentual;
	
		DecimalFormat format=new DecimalFormat("###,###,###");
			for(int i=ano ; i<=2018; i++) {
				
				percentualAumento=percentualAumento+percentualAumento;
				salario=salario+percentualAumento;
				percentual1=percentual1+percentual1;
				System.out.println("Ano "+i+" :  salario de " +format.format(salario)+" aumento de "+format.format(percentual1)+" %");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

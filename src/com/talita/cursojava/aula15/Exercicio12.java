package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor pago por hora trabalhada:");
			double valorHora=scan.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas por mês:");	
			int qtdHorasMes = scan.nextInt();
			
			
			double valorBruto=valorHora*qtdHorasMes;
			
			
			if (valorBruto<=900) {
				System.out.println("ISENTO");
			}  else if(valorBruto<=1500) {
				double descontos = (((valorBruto*5)/100)+(((valorBruto*10)/100))) +((valorBruto*3)/100);
				System.out.println("Salário Bruto: "+ valorBruto);
				System.out.println("(-) IR (5%): "+((valorBruto*5)/100));
				System.out.println("(-) Inss (10%): "+((valorBruto*10)/100));
				System.out.println("FGTS: (valor não descontado)"+((valorBruto*11)/100));
				System.out.println("SINDICATO: "+((valorBruto*3)/100));
				System.out.println("TOTAL DOS DESCONTOS:  "+descontos );
				System.out.println("SALARIO LIQUIDO: "+(valorBruto-descontos));
			} 	else if( valorBruto<=2500) {
				double descontos = (((valorBruto*10)/100)+(((valorBruto*10)/100))) +((valorBruto*3)/100);
				System.out.println("Salário Bruto: "+ valorBruto);
				System.out.println("(-) IR (5%): "+((valorBruto*10)/100));
				System.out.println("(-) Inss (10%): "+((valorBruto*10)/100));
				System.out.println("FGTS: (valor não descontado)"+((valorBruto*11)/100));
				System.out.println("Sincicato: "+((valorBruto*3)/100));
				System.out.println("TOTAL DOS DESCONTOS:  "+descontos );
				System.out.println("Salário liquido: "+(valorBruto-descontos));
			} else if(valorBruto>=2501) {
				double descontos = (((valorBruto*20)/100)+(((valorBruto*10)/100))) +((valorBruto*3)/100);
				System.out.println("Salário Bruto: "+ valorBruto);
				System.out.println("(-) IR (5%): "+((valorBruto*20)/100));
				System.out.println("(-) Inss (10%): "+((valorBruto*10)/100));
				System.out.println("FGTS: (valor não descontado)"+((valorBruto*11)/100));
				System.out.println("Sincicato: "+((valorBruto*3)/100));
				System.out.println("Total de descontos:  "+descontos );
				System.out.println("Salário liquido: "+(valorBruto-descontos));
			}
			
		
		
	}

}

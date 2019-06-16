package com.talita.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Holerite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quanto vc ganha por hora");
		double porHora = scan.nextDouble();
		System.out.println("Informe quantas horas você trabalha por mês");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = porHora * horasTrabalhadas;
		double iR = (11 *salarioBruto)/100;
		double sindicato=(5 *salarioBruto)/100;
		double inss = (8 *salarioBruto)/100;
		double descontos =iR + sindicato + inss;
		double salarioLiquido =salarioBruto - descontos;
		
		System.out.println("Abaixo os valores descriminados");
		System.out.println("+ Salário Bruto: " +salarioBruto+" R$");
		System.out.println("- IR: " + iR +" R$");
		System.out.println("- INSS: " + inss + " R$");
		System.out.println("- Sindicato: " + sindicato + " R$");
		System.out.println("= Salário Liquido: " + salarioLiquido + " R$");
	}

}

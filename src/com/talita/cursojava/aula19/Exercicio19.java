package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		double notas1[]=new double[10];
		double notas2[]=new double[10];
		double resultados[]=new double[10];
		

		
		System.out.println("Digite seguidamente a primeira e segunda nota do  aluno nota dos 10 alunos");
		
		for(int i=0; i<=notas1.length;i++) {
			System.out.println("Digite seguidamente a primeira e segunda nota do  aluno"+i);
			notas1[i]=scan.nextDouble();
			notas2[i]=scan.nextDouble();
			
		}
		
		for(int i=0; i<=resultados.length;i++) {
		
			resultados[i]=notas1[i]+notas2[i];
			
			resultados[i]=resultados[i]/2;
			
			
		}
		
		
		
		for(int i=0; i<resultados.length ; i++) {
			
		
			if(resultados[i]<7) {
				System.out.println("Aluno "+i +" - N1= "+notas1[i]+" + N2= " +notas2[i]+" -Media de "+resultados+"REPROVADO");
	
				}else {
						System.out.println("Aluno "+i +" - N1= "+notas1[i]+" + N2= " +notas2[i]+" -Media de "+resultados+"APROVADO");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
}
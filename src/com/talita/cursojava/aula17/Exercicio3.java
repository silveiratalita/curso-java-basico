package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu estado civil:(s,c,v ou d)");
		String estCiv= scan.nextLine();
		if (estCiv.equals("s")||estCiv.equals("c")||estCiv.equals("v")||estCiv.equals("d")) {
			boolean estCivValidacao=true;
			System.out.println("Estado civil "+estCivValidacao+"");
		}
		
	
		System.out.println("Informe o seu Nome:");
		String nome=scan.nextLine();
		if(nome.length() >=3){
			boolean nomeV=true;
			System.out.println("Nome "+nomeV+"");
			
		}	
		
		
		System.out.println("Informe a sua idade: ");	
		int idade=scan.nextInt();
		
		if (idade>=0 && idade<=150){
			boolean idadeV=true;
			System.out.println("idade "+idadeV+"");
		}	
		
		System.out.println("Informe o seu salário:");
		double salario=scan.nextDouble();
		
		if (salario>0) {
			boolean salV=true;
			System.out.println("Salário "+salV+"");
		} 
		
		System.out.println("Informe o seu sexo: F ou M");
		String sex=scan.nextLine();
		if (sex.equals("f")||sex.equals("m")) {
			boolean sexoV=true;
			System.out.println("sexo "+sexoV);
			
		}
		 
		
		//validação
	
		
		
		
		 
		
		
		
 
		
		
	}

}

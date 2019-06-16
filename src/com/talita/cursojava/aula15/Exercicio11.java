package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Insira o salário atual");
			double salario=scan.nextDouble();
			System.out.println("Insira o reajuste contratado");
			int reajuste=scan.nextInt();
			
			if ((salario <=280)&& (reajuste<=20)){
				System.out.println( "O salário antes do reajuste era de "+salario);
				System.out.println( "O spercentual de aumento foi de 20%");
				System.out.println( "O valor do aumento foi de "+((salario*20)/100)); 
				System.out.println( "O salário com reajuste será de "+ salario+ (salario*20/100) );
			} 
				
			if  ((salario>=280) &&(salario<=700)&&(reajuste<=15)){
			
				System.out.println( "O salário antes do reajuste era de "+salario);
				System.out.println( "O spercentual de aumento foi de 15%");
				System.out.println( "O valor do aumento foi de "+((salario*15)/100)); 
				System.out.println( "O salário com reajuste será de "+ salario+ (salario*15/100) );
			}  
				
				
				
				
				if  ((salario >=700 && salario<=1500)&& reajuste<=10){
					System.out.println( "O salário antes do reajuste era de "+salario);
					System.out.println( "O spercentual de aumento foi de 10%");
					System.out.println( "O valor do aumento foi de "+((salario*10)/100)); 
					System.out.println( "O salário com reajuste será de "+ salario+ (salario*10/100) );

			}
				
				
				if  ((salario >=1501)&& reajuste<=5){
				System.out.println( "O salário antes do reajuste era de "+salario);
				System.out.println( "O spercentual de aumento foi de 5%");
				System.out.println( "O valor do aumento foi de "+((salario*5)/100)); 
				System.out.println( "O salário com reajuste será de "+ salario+ (salario*5/100) );
				}   
				
				
				
}
	}


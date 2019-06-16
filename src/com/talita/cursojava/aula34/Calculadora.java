package com.talita.cursojava.aula34;

public class Calculadora {

	static double resultado;
	static double potencia;
	static int n;
	static int fatorial;
	
	
	static double soma(double num1, double num2) {
		
		 resultado=num1+num2;
		  
		 System.out.println("O resultado da operação é: "+resultado);
		 return resultado;
		
	}
	static double subtração (double num1, double num2) {
		
		 resultado=num1-num2;
		 System.out.println("O resultado da operação é: "+resultado);
		 return resultado;
		
	}
	static double multiplicacao(double num1, double num2) {
		
		 resultado=num1*num2;
		 System.out.println("O resultado da operação é: "+resultado);
		 return resultado;
		
	}
	static double divisao(double num1, double num2) {
		
		 resultado=num1/num2;
		 System.out.println("O resultado da operação é: "+resultado);
		 return resultado;
		
	}
	
	static double potencia(double num1, double num2) {
		
		 potencia=Math.pow(num1, num2);
		
		 return potencia;
		
	}
	
	static int fatorial(int n) {
		 System.out.print("n ! = ");
		 for(int i= n; i>0; i--) {
			 fatorial+=(n*i);
			 System.out.print(i+" + ");
		 }
		 System.out.print("= "+fatorial);
		return fatorial;
		
	}
	
}



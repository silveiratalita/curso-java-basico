package com.talita.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int valor1=1;
		int valor2=2;
		
		boolean resultado1=(valor1 == 1) && (valor2 == 2);//usa-se o eduplo curto cirquito
		System.out.println("valor1 é 1 AND valor 2 é 2 -resultado: "+resultado1);
		
		boolean resultado2=(valor1 == 1) || (valor2 == 2);//usa-se o e e barra duplo curto cirquito
		System.out.println("valor1 é 1 AND valor 2 é 2 -resultado: "+resultado2);
	
		boolean verdadeiro=true;
		boolean falso=false;
		System.out.println("verdadeiro e falso= "+(verdadeiro && falso));
		System.out.println("verdadeiro ou falso= "+(verdadeiro || falso));
		System.out.println("Ou verdadeiro ou falso= "+(verdadeiro ^  falso));
		//System.out.println("Se verdadeiro então falso= "+(verdadeiro   falso));
		//System.out.println("verdadeiro SE E SOMENTE SE falso= "+(verdadeiro   falso));
		System.out.println("NÃO verdadeiro e falso= "+(!verdadeiro &&  falso));
	
	}

}

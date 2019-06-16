package com.talita.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		boolean verdadeiro=true;
		boolean falso=false;
		boolean resultado1=falso &
				verdadeiro;
		boolean resultado2=falso &&
				verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		//a explicação do curo circuitro é a seguinte
		//se colocar um & ele analisa as duas proposições
		//se coloca o &&(e duplo) por saber que no caso de conjunção
		//se a primeira for falsa a composta será falsa, então ele não analisa a segunda
		//proposição, e já coloca a validação como falsa.
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1 ;//segue a ordem de pressedencia primeiro multiplicação e divisão depois soma e subtração
		System.out.println(resultado);
		
	}

}

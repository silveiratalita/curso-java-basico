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
		
		//a explica��o do curo circuitro � a seguinte
		//se colocar um & ele analisa as duas proposi��es
		//se coloca o &&(e duplo) por saber que no caso de conjun��o
		//se a primeira for falsa a composta ser� falsa, ent�o ele n�o analisa a segunda
		//proposi��o, e j� coloca a valida��o como falsa.
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1 ;//segue a ordem de pressedencia primeiro multiplica��o e divis�o depois soma e subtra��o
		System.out.println(resultado);
		
	}

}

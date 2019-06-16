package com.talita.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		//seguindo a convenção camelsentitive do java
		int idade;
		String nome="talita";
		String nomeDoMeuCachorro="toto";
		//apesar de aceitasnão são utilizadas
		int _idade;
		int $idade;
		String ano2014 ="2014";
		
		idade=25;
		System.out.println("idade = "+idade);
		System.out.println("Nome = "+nome);
		System.out.println("Nome do cachorrinho = "+nomeDoMeuCachorro);
		//má pratica
		int a=10;
		String b="talita";
		
		//sempre no dia a dia tende dar nome de variavel
		//que signifique alguma coisa, e não algo que não se faz ideia 
		//do que significa, vc pode ate esquecer porque usou aquele nome
	}

}

package com.talita.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		//FOR NORMAL---------------------FORMA MAIS USADA
					//na condi��o normalmente n�o se usa o igual.
				//inicializa��o;condi��o; atualiza��o
		// o escopo da variavel � s� dentro do for na qual ela foi iniciada, ela foi criada para o bloco for e s� vale dentro do bloco for, 
		//se quiser usar essa variavel de novo vai ter que inicializar outra vez.
		for(int i=0; i<5 ; i++ ) {
			System.out.println("i = "+i); //bloco de codigo
		}
		
		
		for(int i =5; i > 0  ; i --) {
			System.out.println("i tem valor de  = "+i); //bloco de codigo
		}
		
		//FOR COM MAIS DE UMA VARIAVEL
		//quando tem mais de uma variavel separa-se por virgula.
		
		for (int i=0, j =10;  i<j;  i++, j--) {//ponto e virgula separa apenas a incializacao, da condi��o e da atualiza��o x,x;x,x,x;x,x
			System.out.println("i = "+i+" j= "+j);
		}
		
		//PARTES AUSENTES- MENOS USADA
		int count=0;//inicia a variavel fora do for
		for(; count <10 ; ) {//parte de condi��o entre as virgulas e dentro dos parenteses
			System.out.println("valor de count: "+count);//atualiza��o feita no bloco de codigo
				count +=2;//atrualiza��o no bloco de codigo
		}
		
		
		for (int cont =0;cont<10;cont+=2) {
			System.out.println("valor de count: "+count);//� a mesma forma
		}
		
		//LOOP INFINITO- FOR COM DOIS PONTOS E VIRGULA DENTRO
		//n�o tente isso em casa! fica s� como curiosidade
		//for ( ; ;);
		
		//LOOP SEM CORPO
		//mais utilizado quando se quer somar valores
		
		int soma =0;
		for (int i =1; i<5; soma +=i++) ;
			//pode deixar esse corpo compeltamente vasio ou - n�o utilizou as chaves
			System.out.println("valor de soma: "+soma);
			
			//for(int i=0; i<5 ; i++ ) ;//quando eu n�o tenho as chaves, n�o � recomendado nunca fazer isso!
				//System.out.println("i = "+i); //bloco de codigo
				//� melhor ter a chave que abra�a e aglomera o codigo para a execu��o, � boa pratica usar chaves
			
		
	}

}

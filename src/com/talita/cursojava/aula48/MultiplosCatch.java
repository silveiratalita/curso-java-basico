package com.talita.cursojava.aula48;

public class MultiplosCatch {

	public static void main(String[] args) {
	int []numero= {4,8,16,32,64,128};
	int[]deno= {2,0,4,8,0};
	
	for(int i=0; i<numero.length;i++) {
		try {
			System.out.println(numero[i]+" /"+deno[i]+" = "+(numero[i]/deno[i]));
		}catch(ArithmeticException e1){//num existe divis�o por 0
			System.out.println("erro ao dividir por 0");
		}catch(ArrayIndexOutOfBoundsException e2) {//array num existe
			System.out.println("Posi��o do array invalida");
		}//a classe throwale � a classe m�e das exeptions, q � diferente de erro. n�o � uma boa pratica
		//poderiamos usar para usar para capturar uma ece�ao generica
		//a prioridade � sempre do catch que foi declarado primeiro
		//se eu colocar um catch especifico depois do generico ele da um erro, pq o java entende que ja estamos
		//usando um catch generico, logo n�o vai cair na especificidade, vai cair no primeiro declarado, q sera priorizado e nesse caso, � o generico
		//quando se usa o throable
	}

	}

}

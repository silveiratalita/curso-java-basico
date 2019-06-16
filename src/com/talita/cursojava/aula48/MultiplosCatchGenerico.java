package com.talita.cursojava.aula48;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {
		int []numero= {4,8,16,32,64,128};
		int[]deno= {2,0,4,8,0};

		for(int i=0; i<numero.length;i++) {
			try {
				System.out.println(numero[i]+" /"+deno[i]+" = "+(numero[i]/deno[i]));
			}catch(ArithmeticException e1){//num existe divis�o por 0
				System.out.println("erro ao dividir por 0");
			}catch(Throwable e2) {//array num existe
				System.out.println("Ocorreu um erro");
			}//a classe throwale � a classe m�e das exeptions, q � diferente de erro. n�o � uma boa pratica
			//poderiamos usar para usar para capturar uma ece�ao generica

		}

	}

}

package com.talita.cursojava.aula48;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {
		int []numero= {4,8,16,32,64,128};
		int[]deno= {2,0,4,8,0};

		for(int i=0; i<numero.length;i++) {
			try {
				System.out.println(numero[i]+" /"+deno[i]+" = "+(numero[i]/deno[i]));
			}catch(ArithmeticException|ArrayIndexOutOfBoundsException e1){//num existe divisão por 0
				System.out.println("Aconteceu um erro");
			}//usando o perador | posso dizer ou um erro, ou outro, de a msg
			//se a versão do java for anterior, 5 ou 6, pode usar um catch atras do outro, a partir do java 7 esse recurso esta disponivel.
		}


	}

}

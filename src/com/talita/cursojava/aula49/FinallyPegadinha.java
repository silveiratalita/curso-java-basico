package com.talita.cursojava.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {
		
			int []numero= {4,8,16,32,64,128};
			int[]deno= {2,0,4,8,0};
			
			for(int i=0; i<numero.length;i++) {
				try {
					System.out.println(numero[i]+" /"+deno[i]+" = "+(numero[i]/deno[i]));
				}catch(ArithmeticException e1){//num existe divisão por 0
					System.out.println("erro ao dividir por 0");
					System.exit(0);
				}catch(ArrayIndexOutOfBoundsException e2) {//array num existe
					System.out.println("Posição do array invalida");
					System.exit(0);
				}
				finally {
					System.out.println("entrou dentro do finally");
					//nesse exemplo o finally sempre será executado
					//você poder explicar como é feito tratamento de erros no java.
					
				}
			}

	}

}

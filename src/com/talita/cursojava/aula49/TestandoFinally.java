package com.talita.cursojava.aula49;

public class TestandoFinally {

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
			}
			finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou catch");
				//nesse exemplo o finally sempre ser� executado
				//voc� poder explicar como � feito tratamento de erros no java.
				
			}
		}

	}

}

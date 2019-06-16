package com.talita.cursojava.aula50;

public class ExceptionGenerica {

	public static void main(String[] args) {
		int []numero= {4,8,16,32,64,128};
		int[]deno= {2,0,4,8,0};
		
		for(int i=0; i<numero.length;i++) {
			try {
				System.out.println(numero[i]+" /"+deno[i]+" = "+(numero[i]/deno[i]));
			}catch(Exception e){//num existe divisão por 0
				System.out.println(e.getMessage());
				e.printStackTrace();
				//agora o que esta fora do try catch vai dar erro exceção e parar a execução
				//queremos tratar o erro e impedir que o programa pare
				//o getmessage e printstactracea vai ajudar a ver o erro e onde ele ocorreu, isso ajuda quem faz o programa.
				
				
				
			}
		}

		}
	
}

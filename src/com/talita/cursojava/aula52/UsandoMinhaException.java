package com.talita.cursojava.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {
		try {
			teste();
		}catch(DivisaoNaoExata e) {
			e.printStackTrace();
		}
		
	}
		public static void teste()throws DivisaoNaoExata {
			int []numero= {4 , 8 , 5 , 16 , 32 , 21 , 64 ,  128};
			int[]deno= { 2, 0, 4, 8, 0, 2, 4};

			for(int i=0; i<numero.length;i++) {
				try {
					if(numero[i]%2 !=0) {
						//lança exception aqui
					//	throw new Exception("numero impar divisão não esxata"); ao inves disso uso a que criei divisao não exatav
						throw new DivisaoNaoExata(numero[i], deno [i]);
					}
					System.out.println(numero[i]+" /"+deno[i]+" = "+(numero[i]/deno[i]));
				}catch(ArithmeticException|ArrayIndexOutOfBoundsException e1){//num existe divisão por 0
					System.out.println("Aconteceu um erro");
					System.out.println(e1.getMessage());
				}
			//	catch(Exception e2) {
				//	System.out.println("Aconteceu um erro");
				//	System.out.println(e2.getMessage());
			//	}

	}
}
}
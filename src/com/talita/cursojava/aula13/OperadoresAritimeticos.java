package com.talita.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int resultado=1+2;
		System.out.println(resultado);
		
		resultado=resultado-1;
		System.out.println(resultado);
		
		resultado=resultado*2;
		System.out.println(resultado);
		
		resultado=resultado/2;
		System.out.println(resultado);
		
		resultado=resultado+8;
		System.out.println(resultado);
		
		resultado=resultado%7;
		System.out.println(resultado);
		
		String primeiroNome="Esta é";
		String segundoNome=" uma string concatenada";
		String terceiroNome=primeiroNome+segundoNome;
		System.out.println(terceiroNome);
		
		resultado=resultado+1;
		System.out.println(resultado);
		
		resultado ++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++);//primeiro imprime o resultado e depois soma um
		System.out.println(++resultado);//aqui primeiro, antes soma o valor na string depois imprime
	
	
		//System.out.println(resultado++);
		//é a mesma coisa que
		//resultado=resultado +1;
		//e
		//resultado+=1;
		
		//System.out.println(++resultado);
		//é igual a
		// resultado+=1;
		//e em seguida
		//System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		//a mesma coisa para decremento
		System.out.println(resultado--);//=resultado- 1 ou resultado-=1;
		System.out.println(--resultado);//igual resultado-=1;
		
		
	
	
	}

}

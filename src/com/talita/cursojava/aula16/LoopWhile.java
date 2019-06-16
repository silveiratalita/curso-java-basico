package com.talita.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i=0;//count ou cont
		int max =10;
		
		System.out.println("contando até "+ max);
		
		while (i<max) {
			System.out.println("o valor de i: "+i);
			i++;// ou i=i+1, ou i+=1;
		}
		
		System.out.println(i);//imprime o 10- virou 10 na linha 13, pq depois que el verificou e imprimiu ele somou de novo
		
		do {///somar um enquanto não chegar em 15, chegando em 15 para
				i++;
				System.out.println("o valor de i: "+i);
		}while (i<15);
		
		System.out.println(i);//apenas imprime o i como ele estiver
	}
	

}

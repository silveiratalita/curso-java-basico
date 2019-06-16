package com.talita.cursojava.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {
		//o varargs permite q se passe infinitos parametros para um metodo sem ter que informar ao metodo 
		

		
		System.out.println("soma utilizando pardão de parametros declarados");
		System.out.println(soma(1, 2));//se a gente quiser passar mais de um numero não dá, pq o metodo aceita só dois parametrtos
		System.out.println("soma utilizando vetor");
		int []vetor= {1,2,3,4,5};
		System.out.println(soma(vetor));
		
		System.out.println("soma utilizando varargs");
		System.out.println(soma(1,2,3,4,5,6,7,8,9,10));
		
		
	}
	
	
	
	
	static int soma(int a, int b) {
		return a+b;
	}
	//foi declarado para aceitar somente 2 parametros
			//se quiswrmos usar o mesmo metodo mas com mais numeros a gente preciusa declarar esse terceiro em outro metodo
			// se quisessemos passar muitos numeros teriamos q declarar um vetor e meter os numetos dentro do vetor
			//itera o vetor do jeito q ja sabemos.
	
	static int soma(int a, int b, int c) {
	return a+b+c;
	}
	
	static int soma(int []vetor) {
		int total=0;
		for(int i=0; i< vetor.length;i++) {
			total+=vetor[i];
		}
		return total;
	}
	//com o var args não precisa criar o vetor para passar os numeros, já passa direto
	//o acesso é igual ao vetor, usa o tipo wrapper mais tres pontinhos
	//tbm tem q iterar acessa como se fosse um vetor, e muda na hora de passar o parametro na chamada do método
	
	static int soma(Integer ... vetor) {//o varargs tem q ser passado por ultimo, para o java saber onde q acaba os parametros outros parametros de outros tipos devem ser declarados antes
		int total=0;
		for(int i=0; i< vetor.length;i++) {
			total+=vetor[i];
		}
		return total;
	}
	}

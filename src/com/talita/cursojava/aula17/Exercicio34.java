package com.talita.cursojava.aula17;

public class Exercicio34 {

	public static void main(String[] args) {
		double h=1.0;
		int termos=32;
		
		
		for(int i=2; i<termos;i++) {
			h=h+(1/i);
			
			
		}
		System.out.println("O valor de H com "+termos+" termos é de "+h);
	}

}

package com.talita.cursojava.aula26;

import com.talita.cursojava.aula26.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca="Fiat";
		van.modelo="Ducato";
		van.capacidadeCombustivel=100;
		van.consumoCombustivel=0.2;
		van.numPassageiros=10;
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		
		
		
		
		
		Carro fusca = new Carro();
		fusca.marca="Volkswagen";
		fusca.modelo="Fusca";
		fusca.capacidadeCombustivel=30;
		fusca.consumoCombustivel=0.15;
		fusca.numPassageiros=4;
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

		
		van.exibirAutonomia();
		double autonomia=van.obterAutonomia();
		System.out.println("A autonomia do carro= "+autonomia);
		
	}
	
	

}

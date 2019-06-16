package com.talita.cursojava.aula29;



public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca="Fiat";
		van.modelo="Ducato";
		van.capacidadeCombustivel=100;
		van.consumoCombustivel=0.2;
		van.numPassageiros=10;
		
		System.out.println(van.numPassageiros);
		
	}

}

package com.talita.cursojava.aula28;



public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca="Fiat";
		van.modelo="Ducato";
		van.capacidadeCombustivel=100;
		van.consumoCombustivel=0.2;
		//van.numPassageiros=10;
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		
		Carro van2 = new Carro("fiat","ducato",10, 100 , 0,2);
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capacidadeCombustivel);
		System.out.println(van2.consumoCombustivel);
		
		
		
		

	}

}

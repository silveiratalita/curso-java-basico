package com.talita.cursojava.aula25;

public class Carro {
String marca;
	
	String modelo;
	
	int numPassageiros;
	
	double capacidadeCombustivel;
	
	double consumoCombustivel;
	
	
	//no java a declaração do metodo se inicia com o ti-po de retorno dele
	//se ele não retorna nenhum valor, só exibe msg na tela
	//declara-se como void
	
	void exibirAutonomia() {
		//aqui é um bloco de codigo
		//deve ser uma logica relacionada a classe
		System.out.println("A autonomia do carro é: "+capacidadeCombustivel*consumoCombustivel+" km.");
	}
}

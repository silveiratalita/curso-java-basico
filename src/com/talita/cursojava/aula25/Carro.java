package com.talita.cursojava.aula25;

public class Carro {
String marca;
	
	String modelo;
	
	int numPassageiros;
	
	double capacidadeCombustivel;
	
	double consumoCombustivel;
	
	
	//no java a declara��o do metodo se inicia com o ti-po de retorno dele
	//se ele n�o retorna nenhum valor, s� exibe msg na tela
	//declara-se como void
	
	void exibirAutonomia() {
		//aqui � um bloco de codigo
		//deve ser uma logica relacionada a classe
		System.out.println("A autonomia do carro �: "+capacidadeCombustivel*consumoCombustivel+" km.");
	}
}

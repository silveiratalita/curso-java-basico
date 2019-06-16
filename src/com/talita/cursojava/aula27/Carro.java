package com.talita.cursojava.aula27;

public class Carro {

	
		String marca;
		
		String modelo;
		
		int numPassageiros;
		
		double capacidadeCombustivel;
		
		double consumoCombustivel;
		
		
		void exibirAutonomia() {
			//aqui é um bloco de codigo
			//deve ser uma logica relacionada a classe
			System.out.println("A autonomia do carro é: "+capacidadeCombustivel*consumoCombustivel+" km.");
		}
		
		double obterAutonomia() {
			System.out.println("metodo obter autonomia foi chamado");
			
			return capacidadeCombustivel*consumoCombustivel;
		}
		
		
		//vai passar parametro quando a informação requerida não está disponivel
		//dentro da classe, exemplo, a kilometragem por litro de combustivel não tem na classe, e precisa ser
		//calculada.
		
		double calcularCombustivel(double km) {
			double qtdCombustivel=km/consumoCombustivel;
			
			return qtdCombustivel;
		}
		
	}
		
	


	



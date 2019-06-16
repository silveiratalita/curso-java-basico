package com.talita.cursojava.exerciciosaula37a43LABS;

public class ContaEspecial extends ContaBancaria {

	private double limite=100000;
	
	
	public double sacar(double valor) {
		
		if(limite<valor) {
			System.out.println("não há limite suficiente");
			return limite;
		}else if(valor>limite) {
			System.out.println("Impossivel sacar, seu limite é "+ limite);
			
		}else {
			limite=limite-valor;
			return limite;
		}
		return limite;
		
	}
public double atualizaSaldo() {
		String s="O limite é de 100, você está com limite de :";
		s+=limite;
		System.out.println(s);
		return limite;
	}

	public double depositar(double valor) {
		limite=limite+valor;
		return limite;
	}

	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}

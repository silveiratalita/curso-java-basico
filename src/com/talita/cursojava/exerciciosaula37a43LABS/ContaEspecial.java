package com.talita.cursojava.exerciciosaula37a43LABS;

public class ContaEspecial extends ContaBancaria {

	private double limite=100000;
	
	
	public double sacar(double valor) {
		
		if(limite<valor) {
			System.out.println("n�o h� limite suficiente");
			return limite;
		}else if(valor>limite) {
			System.out.println("Impossivel sacar, seu limite � "+ limite);
			
		}else {
			limite=limite-valor;
			return limite;
		}
		return limite;
		
	}
public double atualizaSaldo() {
		String s="O limite � de 100, voc� est� com limite de :";
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

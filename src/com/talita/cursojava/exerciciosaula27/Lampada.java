package com.talita.cursojava.exerciciosaula27;

public class Lampada {
	
	String cor;
	String modelo;
	boolean estado;
	
	void ligarLampada() {
	 estado=true;
		System.out.println("A l�mpada est� ligada");
	}

	void desligarLampada() {
		estado=false;
		System.out.println("A l�mpada foi desligada");
	}

}

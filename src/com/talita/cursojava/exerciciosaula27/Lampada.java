package com.talita.cursojava.exerciciosaula27;

public class Lampada {
	
	String cor;
	String modelo;
	boolean estado;
	
	void ligarLampada() {
	 estado=true;
		System.out.println("A lâmpada está ligada");
	}

	void desligarLampada() {
		estado=false;
		System.out.println("A lâmpada foi desligada");
	}

}

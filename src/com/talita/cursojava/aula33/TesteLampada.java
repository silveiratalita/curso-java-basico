package com.talita.cursojava.aula33;

public class TesteLampada {

	public static void main(String[] args) {
		
		//instanciar lampada
Lampada lampada=new Lampada();

		//metodo informar estado
		lampada.informaEstado();
		
		//desligar lampada
		lampada.desligar();
		//ligar lampada
		lampada.ligar();
	}

}

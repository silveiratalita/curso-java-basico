package com.talita.cursojava.aula67;

public class MinhaThread extends Thread {

	
	private String nome;
	private int tempo;
	public MinhaThread(String nome, int tempo) {
		this.nome=nome;
		this.tempo=tempo;
		start();
	}
	//sem get e set,
	
	//nada acontece se n�o usar o metodo run, portanto ele dev ser sobrescrito
	public void run(){
		try {
		for (int i=0; i<6;i++) {
			System.out.println(nome+" contador "+i);
			Thread.sleep(tempo);//quando chama esse metodo h� possibilidade de dar ininterrupdexception, temq  tratar sempre
		}}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("houve um erro");
		}
		System.out.println(nome+" terminou a execu��o");//aqui ela termina a exceu�ao
	}
}

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
	
	//nada acontece se não usar o metodo run, portanto ele dev ser sobrescrito
	public void run(){
		try {
		for (int i=0; i<6;i++) {
			System.out.println(nome+" contador "+i);
			Thread.sleep(tempo);//quando chama esse metodo há possibilidade de dar ininterrupdexception, temq  tratar sempre
		}}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("houve um erro");
		}
		System.out.println(nome+" terminou a execução");//aqui ela termina a exceuçao
	}
}

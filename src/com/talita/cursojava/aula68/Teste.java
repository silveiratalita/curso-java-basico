package com.talita.cursojava.aula68;

import java.util.concurrent.ExecutionException;

public class Teste {

	public static void main(String[] args) {
	MinhaThreadRunnable thread1=new MinhaThreadRunnable("Thread #1", 900);
	//usou a interface, por isso tem q fazer ela virar therad, tipo casting
	//Thread t1=new Thread(thread1);
	//	t1.start();
		//se usar mais theads isso dá um certo trabalhinho
		//dai pode isntanciar uma thread dentro do contrutor da runnable e usar o this para emendar com o q foi criado na runavnebla, asssim não vai ficar perdendo tempo
	MinhaThreadRunnable thread2=new MinhaThreadRunnable("Thread #2", 650);
	MinhaThreadRunnable thread3=new MinhaThreadRunnable("Thread #3", 1100);

	thread1.run();
	thread2.run();
	thread3.run();
	}

}

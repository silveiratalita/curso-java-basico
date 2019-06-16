package com.talita.cursojava.aula69;

import com.talita.cursojava.aula68.MinhaThreadRunnable;

public class Teste3 {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1=new MinhaThreadRunnable("Thread #1", 500);
		MinhaThreadRunnable thread2=new MinhaThreadRunnable("Thread #1", 700);
		MinhaThreadRunnable thread3=new MinhaThreadRunnable("Thread #1", 800);

		Thread t1=new Thread(thread1);
		Thread t2=new Thread(thread2);
		Thread t3=new Thread(thread3);
		/*	t1.start();

		try {
			t1.join(200);//o join espera a execução da tred para poder executar o resti do codigo
			//a thread 2 vai inicar a execução depois q a 1 terminar ou 200 millis segundos depois, o q acontecer primeiro
		}catch(InterruptedException e){
		e.printStackTrace();	
		}

		t2.start();
		try {
			t2.join(200);//o join espera a execução da tred para poder executar o resti do codigo
			//a thread 2 vai inicar a execução depois q a 1 terminar ou 200 millis segundos depois, o q acontecer primeiro
		}catch(InterruptedException e){
		e.printStackTrace();	
		}
		t3.start();
		try {
			t3.join(200);//o join espera a execução da tred para poder executar o resti do codigo
			//a thread 2 vai inicar a execução depois q a 1 terminar ou 200 millis segundos depois, o q acontecer primeiro
		}catch(InterruptedException e){
		e.printStackTrace();	
		}*/
		t1.start();
		t2.start();
		t3.start();


		try {
			t1.join();
			t2.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("programa finalizado");

	}

}

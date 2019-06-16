package com.talita.cursojava.aula69;

import com.talita.cursojava.aula68.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1=new MinhaThreadRunnable("Thread #1", 500);
		MinhaThreadRunnable thread2=new MinhaThreadRunnable("Thread #1", 500);
		MinhaThreadRunnable thread3=new MinhaThreadRunnable("Thread #1", 500);
		
		Thread t1=new Thread(thread1);
		Thread t2=new Thread(thread2);
		Thread t3=new Thread(thread3);
		t1.start();
		t2.start();
		t3.start();
		
		for (int i=0; i<15;i++) {
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("programa finalizado");
	}

}

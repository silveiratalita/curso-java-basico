package com.talita.cursojava.aula69;

import com.talita.cursojava.aula68.MinhaThreadRunnable;

public class Teste2 {

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
		
		while(t1.isAlive()||t2.isAlive()||t3.isAlive()) {//garanti que só depois q elas morrerem é q vai executrar
			try {
				Thread.sleep(200);//thread principal metodo mainq vai dormir
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//o codigo não é limpor, e nem bonito
		
		
		System.out.println("programa finalizado");

	}

}

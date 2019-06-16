package com.talita.cursojava.aula72;

public class ThreadTiqueTaque implements Runnable {
	
	TiqueTaque tt;
	Thread t;
	final int NUM=5;
	public ThreadTiqueTaque(String nome, TiqueTaque tt) {
		
		this.tt = tt;
		t=	new Thread (this,  nome);
		
	}

	@Override
	public void run() {
	if(t.getName().equalsIgnoreCase("Tique")) {
		
		for(int i=0; i<NUM; i++) {
			tt.tique(true);
		}
		tt.taque(false);
	}else {
		for(int i=0; i<NUM; i++) {
			tt.taque(true);
		}
	}
		
	}


	

}

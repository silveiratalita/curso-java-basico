package com.talita.cursojava.aula72;

public class Teste {

	public static void main(String[] args) {
		TiqueTaque tt=new TiqueTaque();
		
		ThreadTiqueTaque tique =new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque =new ThreadTiqueTaque("Tique", tt);
		
		
		try {
		tique.t.join();
		taque.t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}

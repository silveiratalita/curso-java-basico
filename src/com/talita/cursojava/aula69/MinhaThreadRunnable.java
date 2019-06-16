package com.talita.cursojava.aula69;

public class MinhaThreadRunnable implements Runnable {
	private String nome;
	private int tempo;
	


	public   MinhaThreadRunnable(String nome, int tempo) {

		this.nome=nome;
		this.tempo=tempo;
		//	Thread t= new Thread(this);//sendo isso igual ao theast t1=new thead (thead 1-o da classe de teste)
		//	t.start();
}	

	@Override
	public void run() {
		try {
			for (int i=0; i<6;i++) {

				System.out.println(nome+"contador "+i);
				Thread.sleep(tempo);

			}
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("Ocorreu um erro");
		}
		System.out.println(nome+ "terminou a execução ");
	}

}

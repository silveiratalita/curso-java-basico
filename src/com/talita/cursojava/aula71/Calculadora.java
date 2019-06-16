package com.talita.cursojava.aula71;

public class Calculadora {
private int soma;

public synchronized int somaArray (int[] array) {
	soma=0;
	
	for (int i=0; i<array.length;i++) {
		soma+=array[i];
		System.out.println("executando a soma "+Thread.currentThread().getName()+
				" comando o valor "+array[i]+" com total de "+ soma);
		try {
		Thread.sleep(100);
		
	}catch(InterruptedException e) {
			e.printStackTrace();
	}
	}
	
	return soma;
}

}

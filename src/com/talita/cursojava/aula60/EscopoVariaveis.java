package com.talita.cursojava.aula60;

public class EscopoVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor){

		valor = valor + 10;
		
		//this.valor = valor;

		return valor;
	}

	public int teste(){

		int valor = 5;

		if (true){

			valor--;
		}

		//this.valor = valor; //referencial valor global/atributo da classe pq usa o this sacou

		return valor;
	}

	public void outroTeste(){

		for (int i=0; i<10; i++){
			System.out.println(i);
		}
		
		//i++; //erro de compilação
		//sempre utilizar chave para evitar erro
		//quando declaramos variavel dentro do bloco o escopo acaba dentro do bloco e não se usa fora

		int j;
		for (j=0; j<10; j++){
			System.out.println(j);
		}

		System.out.println(j); //j tem valor 10
		//aqui consegue ainda fazer refrencia a essa variavel, mesmo fora do for.
	}

	public void maiUmTeste(){

		boolean flag = true;
		
		if (flag){

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);
		}

		//System.out.println(umaVariavel); //erro de compilação
		//quando declaramos variavel dentro do bloco o escopo acaba dentro do bloco e não se us 
	}

	public void maiUmOutroTeste(int num){

		int total = 0;

		try {
			int outroNum = 0;

			total = num/outroNum;

		} catch (Exception e){
			e.printStackTrace();
		} finally {

			total++;
			//outroNum++; //erro de compilação
			//e.printStackTrace(); //erro de compilação
		}

		num++;

		//outroNum++; //erro de compilação
		//e.printStackTrace(); //erro de compilação
	}
}

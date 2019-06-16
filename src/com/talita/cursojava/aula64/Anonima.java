package com.talita.cursojava.aula64;

public class Anonima implements Texto{
	
	
	public void imperimeTexto() {
		System.out.println("qualquer texto");
	}
	
	

	public static void main(String[] args) {
		
		Anonima anonima =new Anonima() {
			public void imprimiTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		
		anonima.imperimeTexto();
		
		//o java pede para escolher qual o anonima q quer executar, 
		//classes anonimas pdoem implementar interfaces
		
		Texto texto=new Texto() {
			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto -interface");
			}
		};
		texto.imprimeTexto();
	}



	@Override
	public void imprimeTexto() {
		// TODO Auto-generated method stub
		
	}



	

}

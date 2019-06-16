package com.talita.cursojava.aula66;

import com.talita.cursojava.aula61.Contato;

public class ColetorLixo {

	public static void obterMemoriaUsada() {
		final int MB=1024*1024;
		Runtime runtime=Runtime.getRuntime();//singleton
		System.out.println((runtime.totalMemory()-runtime.freeMemory())/MB);
	}
	
	public static void main(String[] args) {
	
		Contato []contatos=new Contato[1000000];
		                               
		
		for (int i=0; i<contatos.length; i++) {
		
			Contato contato=new Contato("Contato "+ i,"123456789","contato"+1+"@email.com");
			contatos[i]=contato;
			System.out.println(contato.getNome());
		
		}
		System.out.println("Contatos criados");
		obterMemoriaUsada();
		contatos= null;//NÃO FUNFOU
		try {
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();//não é garantido o garbage coletor ser realmente chamado.
		System.out.println("Limpou");
		
		}catch(Exception e) {
			System.out.println("ops não deu");
		}
		System.out.println("Contatos removidos da memoria");
		obterMemoriaUsada();//NÃO HOUVE DIFERENÇA TEM Q FORÇAR O COLETOR DE LIXO
	}

}

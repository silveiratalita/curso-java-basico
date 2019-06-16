package com.talita.cursojava.exerciciosaula47a52;

import java.util.EmptyStackException;

public class Agenda {
	
	private Contato []contatosDaAgenda=new Contato[2];
	
	public Contato[] adicionarContato(Contato cont) {
		try {
		for (int i=0; i<contatosDaAgenda.length; i++) {
			if(contatosDaAgenda!=null) {
				contatosDaAgenda[i]=cont;
			}
		}
		return contatosDaAgenda;
	}catch(NullPointerException e ) {
		System.out.println("a AGENDA ESTÁ CHEIA");
		e.getMessage();
		e.printStackTrace();
		return contatosDaAgenda;
	}
	}
	
	
	
	
	
	public Contato[] consultarContato() {
		try {
	for (int i=0; i<contatosDaAgenda.length; i++) {
			System.out.println(contatosDaAgenda[i].getNome());
			System.out.println(contatosDaAgenda[i].getTelefone());
			System.out.println(contatosDaAgenda[i].getId());
		
		}
		return contatosDaAgenda;
		
	}catch(Exception e) {
		System.out.println("o contato não existe");
		e.printStackTrace();
		System.out.println(e.getMessage());
		
		return contatosDaAgenda;
	}

}
}

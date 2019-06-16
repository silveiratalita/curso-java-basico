package com.talita.cursojava.aula36;

public class Agenda {

	private String nomeAgenda;
	private Contato contatoDaAgenda[] = new Contato[3];

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Contato[] getContatoDaAgenda() {
		return contatoDaAgenda;
	}

	public void setContatoDaAgenda(Contato[] contatoDaAgenda) {
		this.contatoDaAgenda = contatoDaAgenda;
	}

	// metodos

	public Contato[] retornaTodosOsContatos() {
		System.out.println(contatoDaAgenda);
		for (int i = 0; i < contatoDaAgenda.length; i++) {
			System.out.println("Nome: "+contatoDaAgenda[i].getNome());
			System.out.println("Email: "+contatoDaAgenda[i].getEmail());
			for(int j=0; j<contatoDaAgenda[i].getTelefone().length;j++) {
				System.out.println("Telefone : "+contatoDaAgenda[i].getTelefone());
			}
			
		}
		return contatoDaAgenda;
	}

	public void adicionarContato(Contato cont) {

		for (int i = 0; i < contatoDaAgenda.length; i++) {
			if (contatoDaAgenda[i] != null) {

			} else {
				contatoDaAgenda[i] = cont;
			}
		}

	}
	
	

}

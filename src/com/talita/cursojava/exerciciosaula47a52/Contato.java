package com.talita.cursojava.exerciciosaula47a52;

public class Contato {
	
	private String nome;
	private int id;
	private String Telefone;
	
	
	public Contato(String nome, int id, String telefone) {
		super();
		this.nome = nome;
		this.id = id;
		Telefone = telefone;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	

}

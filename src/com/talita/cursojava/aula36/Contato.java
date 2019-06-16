package com.talita.cursojava.aula36;

public class Contato {
	private String nome;
	private String telefone[] = new String[3];
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String[] getTelefone() {
		return telefone;
	}

	public void setTelefone(String[] telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

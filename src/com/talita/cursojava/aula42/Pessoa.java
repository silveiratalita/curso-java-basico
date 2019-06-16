package com.talita.cursojava.aula42;

public  final class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	
	public Pessoa() {
		super();
		
	}
	//porem na classe pessoa tem varios metodos e esta td ok,  e os metodos podem executar normalmente.
	//o abstract não pode apenas instanciar a classe diretamente, as classes filhas ainda podem executar os metodos
	public Pessoa(String nome, String endereco, String telefone, String cpf, String telefoneCelular) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.telefoneCelular = telefoneCelular;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
//	public String obterEtiquetaEndereco() {
	//	return endereco;
	//}
	//public abstract void imprimirEtiquetaEndereco() ;
}

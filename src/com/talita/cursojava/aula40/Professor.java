package com.talita.cursojava.aula40;

public class Professor extends Pessoa {
	
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	public String obterEtiquetaEndereco() {
		String s="endereço do PROFESSOR: ";
		s+=super.getEndereco();
		return s;//é o mesmo metodo, a mesma asisnatura, mas retorna outra coisa, que na verdade é a quase a mesma coisA
	}//SE eu chamar de uma instancia do professor  ele vai retornar o endereço do professor
	//se eu chamar apartir de um obheto aluno vem o endereço do aluno
	
	
}

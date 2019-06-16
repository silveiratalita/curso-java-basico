package com.talita.cursojava.aula38;

public class Aluno extends  Pessoa {



private String curso;
private double [] notas;

public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public double[] getNotas() {
	return notas;
}
public void setNotas(double[] notas) {
	this.notas = notas;
}

public double calcularMedia() {
	return 0;
}

public boolean verificarAprovado() {
	return true;
}

public void metodoQualquer() {
	this.setTelefone("19985632569");
	super.setCpf("11133366658");
}
}

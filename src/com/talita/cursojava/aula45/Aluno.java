package com.talita.cursojava.aula45;

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
public String obterEtiquetaEndereco() {
	String s="endereço do aluno: ";
	s+=super.getEndereco();
	return s;//é o mesmo metodo, a mesma asisnatura, mas retorna outra coisa, que na verdade é a quase a mesma coisA
}
@Override
public void imprimirEtiquetaEndereco() {
	System.out.println("imprimindo endereço do aluno");
	System.out.println(this.obterEtiquetaEndereco());
	
}

}

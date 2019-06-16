package com.talita.cursojava.aula43;

import java.util.Arrays;

public class Aluno  {



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
	//this.setTelefone("19985632569");
	//super.setCpf("11133366658");
}
public String obterEtiquetaEndereco() {
	String s="endereço do aluno: ";
	//s+=super.getEndereco();
	return s;//é o mesmo metodo, a mesma asisnatura, mas retorna outra coisa, que na verdade é a quase a mesma coisA
}
//@Override
public void imprimirEtiquetaEndereco() {
	System.out.println("imprimindo endereço do aluno");
	System.out.println(this.obterEtiquetaEndereco());
	
}
//triangulo mostra que é subscrição de metodo da java lang tostring
/*public String toString() {
	String s=curso+"\n";
	for(double nota:notas) {
		s+=nota+" ";
	}
	return curso+notas;
}*/
@Override
public String toString() {
	return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + ", getCurso()=" + getCurso()
			+ ", getNotas()=" + Arrays.toString(getNotas()) + ", calcularMedia()=" + calcularMedia()
			+ ", verificarAprovado()=" + verificarAprovado() + ", obterEtiquetaEndereco()=" + obterEtiquetaEndereco()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((curso == null) ? 0 : curso.hashCode());
	result = prime * result + Arrays.hashCode(notas);
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluno other = (Aluno) obj;
	if (curso .equalsIgnoreCase(other.getCurso())) {
		return true;
	}	
	return false;
	
}



}

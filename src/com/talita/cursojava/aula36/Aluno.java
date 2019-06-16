package com.talita.cursojava.aula36;

import java.util.Scanner;

public class Aluno {

private String nome;

private String matricula;
private double nota1;
private double nota2;
private double nota3;
private double nota4;

private double media;

public double calculaMedia() {
	media=(nota1+nota2+nota3+nota4)/4;
	if(media<7) {
		System.out.println("aluno reprovado");
	}	else{
		System.out.println("aluno aprovado");
	}
	return media;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public double getNota1() {
	return nota1;
}
public void setNota1(double nota1) {
	this.nota1 = nota1;
}
public double getNota2() {
	return nota2;
}
public void setNota2(double nota2) {
	this.nota2 = nota2;
}
public double getNota3() {
	return nota3;
}
public void setNota3(double nota3) {
	this.nota3 = nota3;
}
public double getNota4() {
	return nota4;
}
public void setNota4(double nota4) {
	this.nota4 = nota4;
}
//Scanner scan = new Scanner(System.in);
//pegar notas

//private void adicionarNota(Aluno aluno) {
//	for (int i =0; i<notas.length;i++) {
//	notas[i]=scan.nextDouble();
//	setNotas(notas);
//	}
}









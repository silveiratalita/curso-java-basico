package com.talita.cursojava.aula36;

public class Curso {
	
	private String nomeCurso;
	private String horarioCurso;
	private Professor professor;
	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;
	private Aluno aluno4;
	private Aluno aluno5;
	
	
	public double calculaMediaTurma() {
		double mediaturma;
	mediaturma=	aluno1.calculaMedia()+aluno2.calculaMedia()+aluno3.calculaMedia()+aluno4.calculaMedia()+aluno5.calculaMedia();
		System.out.println("A media da turma é "+mediaturma/5);
		return mediaturma/5;
	}
	
	
	public Aluno getAluno1() {
		return aluno1;
	}
	public void setAluno1(Aluno aluno1) {
		this.aluno1 = aluno1;
	}
	public Aluno getAluno2() {
		return aluno2;
	}
	public void setAluno2(Aluno aluno2) {
		this.aluno2 = aluno2;
	}
	public Aluno getAluno3() {
		return aluno3;
	}
	public void setAluno3(Aluno aluno3) {
		this.aluno3 = aluno3;
	}
	public Aluno getAluno4() {
		return aluno4;
	}
	public void setAluno4(Aluno aluno4) {
		this.aluno4 = aluno4;
	}
	public Aluno getAluno5() {
		return aluno5;
	}
	public void setAluno5(Aluno aluno5) {
		this.aluno5 = aluno5;
	}
	
//	private Aluno alunos[]=new Aluno[5];
	
/*	public void listaAlunos(Aluno al) {
		for(int i =0; i<alunos.length;i++) {
			if(alunos[i]!=null) {
				alunos[i]=al;
			}
			}
	}*/
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getHorarioCurso() {
		return horarioCurso;
	}
	public void setHorarioCurso(String horarioCurso) {
		this.horarioCurso = horarioCurso;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	/*public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	*/


}

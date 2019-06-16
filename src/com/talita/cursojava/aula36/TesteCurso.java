package com.talita.cursojava.aula36;

import java.security.GeneralSecurityException;
import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		
		//cria curso
		Curso curso=new Curso();
		curso.setNomeCurso("ti");
		curso.setHorarioCurso("matutino");
		
		//cria professor
		Professor professor=new Professor();
		professor.setDepartamento("tecnologia");
		professor.setNome("Gustavo");
		professor.setEmail("aaa@prof.com");
		double media=0;
		double soma =0;
		
	/*	Aluno aluno1=new Aluno();
		aluno1.setMatricula("000");
		System.out.println("informe as notas");
		
		for(int i=0; i<aluno1.getNotas().length;i++) {
		
			double notas[] = aluno1.getNotas();
			for (int j=0; j<notas.length;j++) {
				soma+=notas[j];
			}
			}
		media=soma/4;
		
		if(media<7) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
		curso.listaAlunos(aluno1);
		soma=0;
		media=0;
	*/	
		
		//programa, cria curso com 5 alunos e peça
		//para o usuario entrar com as 4 nostas de cada aluno
		System.out.println("Informe as notas de :");
		System.out.println("Aluno1 :");
		Aluno aluno1=new Aluno();
		aluno1.setNota1(scan.nextDouble());
		aluno1.setNota2(scan.nextDouble());
		aluno1.setNota3(scan.nextDouble());
		aluno1.setNota4(scan.nextDouble());
		aluno1.calculaMedia();
		
		curso.setAluno1(aluno1);
		
		System.out.println("Aluno2 :");
		Aluno aluno2=new Aluno();
		aluno2.setNota1(scan.nextDouble());
		aluno2.setNota2(scan.nextDouble());
		aluno2.setNota3(scan.nextDouble());
		aluno2.setNota4(scan.nextDouble());
		aluno2.calculaMedia();
		curso.setAluno2(aluno2);
		
		
		System.out.println("Aluno3 :");
		Aluno aluno3=new Aluno();
		aluno3.setNota1(scan.nextDouble());
		aluno3.setNota2(scan.nextDouble());
		aluno3.setNota3(scan.nextDouble());
		aluno3.setNota4(scan.nextDouble());
		aluno3.calculaMedia();
		curso.setAluno3(aluno3);
		
		
		System.out.println("Aluno4 :");
		Aluno aluno4=new Aluno();
		aluno4.setNota1(scan.nextDouble());
		aluno4.setNota2(scan.nextDouble());
		aluno4.setNota3(scan.nextDouble());
		aluno4.setNota4(scan.nextDouble());
		aluno4.calculaMedia();
		curso.setAluno4(aluno4);
		
		System.out.println("Aluno5 :");
		Aluno aluno5=new Aluno();
		aluno5.setNota1(scan.nextDouble());
		aluno5.setNota2(scan.nextDouble());
		aluno5.setNota3(scan.nextDouble());
		aluno5.setNota4(scan.nextDouble());
		aluno5.calculaMedia();
		curso.setAluno5(aluno5);
		
		curso.calculaMediaTurma();
	}

}

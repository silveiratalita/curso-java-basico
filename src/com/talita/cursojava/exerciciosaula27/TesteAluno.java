package com.talita.cursojava.exerciciosaula27;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1=new Aluno();
		Scanner scan =new Scanner(System.in);
		aluno1.curso="direito";
		
		aluno1. disciplina[0]="civil";
		aluno1.disciplina[1]="penal";
		aluno1.disciplina[2]="tributario";
		aluno1.matricula=12345678;
		aluno1.nome="Talita";
		
		aluno1.notasCivil[0]=9.00;
		aluno1.notasCivil[1]=8.00;
		aluno1.notasCivil[2]=3.00;
		aluno1.notasPenal[0]=9.00;
		aluno1.notasPenal[1]=7.75;
		aluno1.notasPenal[2]=9.32;
		aluno1.notasTributario[0]=9.05;
		aluno1.notasTributario[1]=5.00;
		aluno1.notasTributario[2]=2.05;
		int opcao;
		System.out.println("informe a opção desejada para obter a media");
		System.out.println("1 para direito civil");
		System.out.println("2 para penal");
		System.out.println("3 para tributario");
		System.out.println("0 para mostrar todas as medias, aprovações e reprovações");
		opcao=scan.nextInt();
		
		switch (opcao) {
		case 1:aluno1.calcularAprovacaoCivil();break;
		case 2:aluno1.calcularAprovacaoPenal();break;
		case 3:aluno1.calcularAprovacaoTributario();break;
		case 0:
			aluno1.calcularAprovacaoCivil();
			aluno1.calcularAprovacaoPenal();
			aluno1.calcularAprovacaoTributario();
			break;
			default:
				System.out.println("Opção invalida");break;
				
		}

	}

}

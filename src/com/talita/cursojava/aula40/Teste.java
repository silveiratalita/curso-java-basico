package com.talita.cursojava.aula40;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa=new Pessoa();
		Pessoa aluno= new Aluno();
		Pessoa professor=new Professor();

		pessoa.setEndereco("rua 1 n1 ");
		aluno.setEndereco("rua 2 n2");
		professor.setEndereco("rua 3 n 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}

}

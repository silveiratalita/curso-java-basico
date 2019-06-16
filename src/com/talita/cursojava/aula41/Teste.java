package com.talita.cursojava.aula41;




public class Teste {

	public static void main(String[] args) {
//		Pessoa pessoa=new Pessoa();//agora é impossivel instanciar uma classe de forma real se ela é abstrata
		Pessoa aluno= new Aluno();
		Pessoa professor=new Professor();

	//	pessoa.setEndereco("rua 1 n1 ");
		aluno.setEndereco("rua 2 n2");
		professor.setEndereco("rua 3 n 3");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());

	aluno.imprimirEtiquetaEndereco();
	professor.imprimirEtiquetaEndereco();
	}
//somente subclasse pode ser instanciada
	//no caso de metodos abstratos, as classes filhas devem tbm declarar os metodos, com seus respectivos comportamentos, q podem ser diferentes, mas similares.
}

package com.talita.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
	/*Aluno aluno=new Aluno();
	Professor professor = new Professor();
	Pessoa pessoa=new Pessoa();
	aluno.setNome("talita");
	aluno.setTelefoneCelular("9999");
	*/
		Pessoa aluno =new Aluno();
		//tem acesso apena ao que � comum a pessoa
		Pessoa professor=new Professor();
		//n�o fica disponivel pois declaramos a super classae ao inves de declarra a classe que � do tipo
		//existem duas formas de  declarra
		//declarar a superclasse  e instanciar classe fiklha, mas ter acesso s� a classe m�e
		//declarar a classe filha e instanciar classe filha e utilizar tudo.
		//heran�a � rela��o � um ou � uma, destaque para essa parte
		//s� fa�a heran�a se o relacionamento for � um ou � uma, cachorro n�o � pessoa e n�o pode extender pessoa mesmo tendo telefone.
		
	}

}

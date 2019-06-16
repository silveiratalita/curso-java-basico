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
		//tem acesso apena ao que é comum a pessoa
		Pessoa professor=new Professor();
		//não fica disponivel pois declaramos a super classae ao inves de declarra a classe que é do tipo
		//existem duas formas de  declarra
		//declarar a superclasse  e instanciar classe fiklha, mas ter acesso só a classe mãe
		//declarar a classe filha e instanciar classe filha e utilizar tudo.
		//herança é relação é um ou é uma, destaque para essa parte
		//só faça herança se o relacionamento for é um ou é uma, cachorro não é pessoa e não pode extender pessoa mesmo tendo telefone.
		
	}

}

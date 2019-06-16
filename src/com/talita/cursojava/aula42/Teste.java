package com.talita.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor=new Professor();
	}
//final é imutavel, não se usa em mais lugar nenhum, se usado em atibuto ou variavel, o valor não pode mudar
	//variavel com valor final é chamada tbm de constante
	
	//podem criar uma classe com valores contantes e que todo o projeto pode usar.
	//pode se ter uma classe final de constantes, normalmente se usa static.. para poder facilitar o acesso.
	//constantes tbm devem respeitar constantes, começa com letra minuscula e mudando de palavra viora maiuscula
	//constante usam caixa alta e underscore para separar palavras.

	System.out.println(Contantes.URL_BLOG);

	final int TOTAL = 1; 
	//total = total = 1;
	//total = total + 1;
	System.out.println(TOTAL);
}
	

}

package com.talita.cursojava.aula45;

public class Teste {
/*Aluno aluno =new Aluno();
Pessoa pessoa=new Aluno();//transforma uma classe menor em uma maior
//pessoa está num nivel acima, poderia fazer para prof tbm
 //esse upcasting é automatico, mas tbm pode ser manual, abaixo veremos
 
Pessoa aluno2=(Pessoa)new Aluno();//forçou a conversão

//o downcasting é ao contrario, vai declarra um objeto de uma superclasse e vai transformar em um tipo de classe menor na hierarquia

Pessoa aluno3=new Pessoa();
Aluno aluno4 =(Aluno) aluno3;
*/
	
	Pessoa pessoa=new Pessoa() 
		
	Aluno aluno=new Aluno() 
	
	
	
	if (pessoa instanceof Pessoa) {
		System.out.println("é do tipo pessoa");
	}if (professor instanceof Professor) {
		System.out.println("é do tipo professor");
	}if (aluno instanceof Aluno) {
		System.out.println("é do tipo aluno");
	}
}

}
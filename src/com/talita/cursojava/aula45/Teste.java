package com.talita.cursojava.aula45;

public class Teste {
/*Aluno aluno =new Aluno();
Pessoa pessoa=new Aluno();//transforma uma classe menor em uma maior
//pessoa est� num nivel acima, poderia fazer para prof tbm
 //esse upcasting � automatico, mas tbm pode ser manual, abaixo veremos
 
Pessoa aluno2=(Pessoa)new Aluno();//for�ou a convers�o

//o downcasting � ao contrario, vai declarra um objeto de uma superclasse e vai transformar em um tipo de classe menor na hierarquia

Pessoa aluno3=new Pessoa();
Aluno aluno4 =(Aluno) aluno3;
*/
	
	Pessoa pessoa=new Pessoa() 
		
	Aluno aluno=new Aluno() 
	
	
	
	if (pessoa instanceof Pessoa) {
		System.out.println("� do tipo pessoa");
	}if (professor instanceof Professor) {
		System.out.println("� do tipo professor");
	}if (aluno instanceof Aluno) {
		System.out.println("� do tipo aluno");
	}
}

}
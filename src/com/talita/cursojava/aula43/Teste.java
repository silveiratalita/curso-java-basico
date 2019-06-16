package com.talita.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno=new Aluno();
		aluno.setCurso("direito");
		double[] notas= {10,9,8,7};
		aluno.setNotas(notas);
		System.out.println(aluno);

		
		String s1="asdfasdfasf";
		String s2="asdfasdfasF";
		
		System.out.println(s1==s2);//esta em tese comparando as strings
		//quando se usa o == compara-se as referencias e não os valores, para comparar obeto é bom usar iquals
		//para string tem o equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		Aluno aluno2=new Aluno();
		aluno2.setCurso("direito");
		double[] notas2= {10,9,8,3};
		aluno2.setNotas(notas2);
		System.out.println(aluno2);
		
		System.out.println(aluno==aluno2);
		//para obeto o melhor é usar o equal
		System.out.println(aluno.equals(aluno2));
		//vai continuar dando falso e ele vai comparra ios atributos.
		//pode usar o gerador
		
		//use o equals e controle o retorno q deseja.
		
	}

}

package com.talita.cursojava.aula65;

@interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "www.com.br";
	
	String site()default "www.talita.com";



}

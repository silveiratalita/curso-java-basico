package com.talita.cursojava.aula59;

//import static java.lang.Math.pow;
//import static java.lang.Math.sqrt;
//o melhor é fazer import de metodo por metodo, explicitos, e naõ fazendo tudo.
//tbm dá pra eu fazer import de pacotes do projeto;
import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		
		double a=2;
		double b=3;
		double c=4;
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		//todos os metodos da classe math são estaticos, não precisa instanciar
		System.out.println(pow(a,b));
		System.out.println(sqrt(c));
		System.out.println(abs(a));
		
	}

}

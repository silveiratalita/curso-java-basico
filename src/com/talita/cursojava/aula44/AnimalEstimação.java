package com.talita.cursojava.aula44;

public interface AnimalEstima��o {
	
	public abstract void brincar();
	public abstract void levarPassear();
	
	//na interface � sempre s� metodos publicos e abstratos
	//interfaces n�o tem atributos, se tiver tem q ser tipo public final, ou seja � publico e n�o muda
	//as interfaces s�o tipo classes abstratas, s� tem metodos e esses metodos n�o tem corpo, va� adquirir corpo quando forem implementados em classes que usam implements...interface x
	//QUANDO USAM final vira constantes, mas � melhor n�o declarra isso em interface, � bom ter uma classe ou interface s� para constantes, pq s�o publicas, globais, estaticao e final, imutavel
	//logo pode s� declarar o tipo e que � final e o nome.
	
}

package com.talita.cursojava.aula44;

public interface AnimalEstimação {
	
	public abstract void brincar();
	public abstract void levarPassear();
	
	//na interface é sempre só metodos publicos e abstratos
	//interfaces não tem atributos, se tiver tem q ser tipo public final, ou seja é publico e não muda
	//as interfaces são tipo classes abstratas, só tem metodos e esses metodos não tem corpo, vaõ adquirir corpo quando forem implementados em classes que usam implements...interface x
	//QUANDO USAM final vira constantes, mas é melhor não declarra isso em interface, é bom ter uma classe ou interface só para constantes, pq são publicas, globais, estaticao e final, imutavel
	//logo pode só declarar o tipo e que é final e o nome.
	
}

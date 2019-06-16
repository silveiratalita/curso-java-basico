package com.talita.cursojava.exerciciosaula37a43LABS;

public class Mamifero extends Animal{
	
	
private String alimento;

public String getAlimento() {
	return alimento;
}

public void setAlimento(String alimento) {
	this.alimento = alimento;
}

public Object getCaracteristicas() {
	
	return null;
}

public void printaAnimal(Mamifero  animal ) {
	
	String nome="Animal: ";
	nome+=animal.getNome();
	
	String comprimento="Comprimento: ";
	comprimento+=animal.getComprimento()+" cm";
	
	String numeroPatas="Número de Patas: ";
	numeroPatas+=animal.getNumeroPata();
	
	String cor="Cor: ";
	cor+=animal.getCor();
	
	String ambiente="Ambiente: ";
	ambiente+=animal.getAmbiente();
	
	String velocidade="Velocidade: ";
	velocidade+=animal.getVelocidade()+" m/s.";
	
	
	
	String	alimento=" Alimento não consta ";
	String	caracteristica="Caracteristicas não disponiveis ";
	if(animal.getAlimento()!=null) {
		alimento="Alimento: ";
		alimento+=animal.getAlimento();
	}
	
	
		
	System.out.println(nome);
	System.out.println(comprimento);
	System.out.println(numeroPatas);
	System.out.println(cor);
	System.out.println(ambiente);
	System.out.println(velocidade);
	System.out.println(alimento);
	
	
	
	
		
}
}


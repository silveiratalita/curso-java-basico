package com.talita.cursojava.exerciciosaula37a43LABS;

public class Peixe extends Animal {
	
	private String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	
public void printaAnimal(Peixe  animal ) {
		
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
		
		
		
		
		String	caracteristica="Caracteristicas não disponiveis ";
		
		
		 if(animal.getCaracteristicas()!=null) {
			caracteristica="Caracteristica: ";
			caracteristica+=animal.getCaracteristicas();
		 }
			
		System.out.println(nome);
		System.out.println(comprimento);
		System.out.println(numeroPatas);
		System.out.println(cor);
		System.out.println(ambiente);
		System.out.println(velocidade);
		System.out.println(caracteristica);
		
		
		
			
	}
}


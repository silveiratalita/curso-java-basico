package com.talita.cursojava.exerciciosaula37a43LABS;

public class Animal {

	private String nome;
	private double comprimento;
	private int numeroPata=4;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumeroPata() {
		return numeroPata;
	}
	public void setNumeroPata(int numeroPata) {
		this.numeroPata = numeroPata;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
	public void printaAnimal(Animal  animal ) {
		
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
		
		
		
		/*String	alimento=" Alimento não consta ";
		String	caracteristica="Caracteristicas não disponiveis ";
		if(animal.getAlimento()!=null) {
			alimento="Alimento: ";
			alimento+=animal.getAlimento();
		}
		
		 if(animal.getCaracteristicas()!=null) {
			 caracteristica="Caracteristica: ";
			caracteristica+=animal.getCaracteristicas();
		*/	
			
		System.out.println(nome);
		System.out.println(comprimento);
		System.out.println(numeroPatas);
		System.out.println(cor);
		System.out.println(ambiente);
		System.out.println(velocidade);
	//	System.out.println(alimento);
	//	System.out.println(caracteristica);
		
		
		
			
	}
	
	

	

	
}

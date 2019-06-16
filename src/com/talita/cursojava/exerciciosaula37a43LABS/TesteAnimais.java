package com.talita.cursojava.exerciciosaula37a43LABS;

public class TesteAnimais {

	public static void main(String[] args) {
		
		//criar camelo
		Mamifero camelo =new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setNumeroPata(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		camelo.setAlimento("verduras e cactus");
		
		//criar tubarão
		Peixe tubarao=new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setNumeroPata(0);
		tubarao.setCor("Cinzento");
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristicas("Barbatanas e cauda");
		//criar urso do canada
		
		Mamifero ursoDoCanada=new Mamifero();
		ursoDoCanada.setNome("Urso-Do-Canadá");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setNumeroPata(4);
		ursoDoCanada.setCor("vermelho");
		ursoDoCanada.setAmbiente("Terra");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		
		System.out.println("zoo:");
		System.out.println("___________________________");
		camelo.printaAnimal(camelo);
		System.out.println("___________________________");
		tubarao.printaAnimal(tubarao);
		System.out.println("___________________________");
		ursoDoCanada.printaAnimal(ursoDoCanada);
		System.out.println("___________________________");
		
		
	}

}

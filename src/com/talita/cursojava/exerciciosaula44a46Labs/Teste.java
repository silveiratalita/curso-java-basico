package com.talita.cursojava.exerciciosaula44a46Labs;

public class Teste {

	public static void main(String[] args) {
		//quadrado,triangulo circulo
		
		FiguraGeometrica figuras []=new FiguraGeometrica[6];
		
		
		Quadrado quadrado=new Quadrado();
		quadrado.setNome("quadrado");
		Triangulo triangulo= new Triangulo();
		triangulo.setNome("triangulo");
		Circulo circulo=new Circulo();
		circulo.setNome("circulo");
		//cilindro, cubo e priramide
		Cilindro cilindro =new Cilindro();
		cilindro.setNome("cilindro");
		Cubo cubo = new Cubo();
		Piramide piramide= new Piramide();
		piramide.setNome("piramide");
		
		//add num array
		figuras[0]=quadrado;
		figuras[1]=triangulo;
		figuras[2]=circulo;
		
		figuras[3]=cilindro;
		figuras[4]=cubo;
		figuras[5]=piramide;
		
		for (int i=0; i<figuras.length;i++) {
			if(figuras[i] instanceof Figura2D) {
				System.out.println("A area do "+ ((Figura2D)figuras[i]).getNome()+" é"+((Figura2D)figuras[i]).calcularArea());
			}else {
				System.out.println("A area do "+ ((Figura3D)figuras[i]).getNome()+ " é"+((Figura3D)figuras[i]).calcularArea()+" e o volume do "+((Figura3D)figuras[i]).getNome()+" é "+((Figura3D)figuras[i]).calcularVolume());
			}
		}
		//itere e mostre area e volume
		
		
		

	}

}

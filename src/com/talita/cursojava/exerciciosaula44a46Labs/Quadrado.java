package com.talita.cursojava.exerciciosaula44a46Labs;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
	private double altura;
	private double base;
	private double resultado;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}


	@Override
	public double calcularArea() {
		
		return 4.32;
	}


}

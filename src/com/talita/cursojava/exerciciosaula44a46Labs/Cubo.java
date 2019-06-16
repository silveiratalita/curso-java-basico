package com.talita.cursojava.exerciciosaula44a46Labs;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
	private double raio;
	private double area;
	private double volume;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public double calcularVolume() {
		return 0.69;
	}

	@Override
	public double calcularArea() {

		return 98.56;
	}
}

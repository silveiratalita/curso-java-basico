package com.talita.cursojava.exerciciosaula44a46Labs;

public class Circulo extends Figura2D implements DimensaoSuperficial{
 
	
	
		private double raio;
		private double resultado;
		
		
	public double getRaio() {
			return raio;
		}


		public void setRaio(double raio) {
			this.raio = raio;
		}


		public double getResultado() {
			return resultado;
		}


		public void setResultado(double resultado) {
			this.resultado = resultado;
		}


	@Override
	public double calcularArea() {
		
		return 7.98;
	}


	

	
	

}

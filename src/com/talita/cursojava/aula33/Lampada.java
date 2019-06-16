package com.talita.cursojava.aula33;

public class Lampada {
	private double voltagem;
	private String cor;
	private String tipoLuz;
	private String modelo;
	private 	boolean economica;
	private long duração;
	private int tensao;
	private int potencia;
	private boolean ligada=false;
	
	public Lampada() {}
	public Lampada(double voltagem, String cor, String tipoLuz, String modelo, boolean economica, long duração,
			int tensao, int potencia, boolean ligada) {
		super();
		this.voltagem = voltagem;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.modelo = modelo;
		this.economica = economica;
		this.duração = duração;
		this.tensao = tensao;
		this.potencia = potencia;
		this.ligada=ligada;
	}


	public boolean isLigada() {
		return ligada;
	}


	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}


	public double getVoltagem() {
		return voltagem;
	}


	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getTipoLuz() {
		return tipoLuz;
	}


	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isEconomica() {
		return economica;
	}


	public void setEconomica(boolean economica) {
		this.economica = economica;
	}


	public long getDuração() {
		return duração;
	}


	public void setDuração(long duração) {
		this.duração = duração;
	}


	public int getTensao() {
		return tensao;
	}


	public void setTensao(int tensao) {
		this.tensao = tensao;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
 
//informa o estado da lampada
	public void informaEstado() {
		
		if(isLigada()) {
			System.out.println("a lampada está ligada");
		}else {
			System.out.println("a lampada está desligada");
		}
		
		
	}
	
	//desligar
	public void desligar() {
		if(isLigada()) {
			setLigada(false);
			System.out.println("a lampada foi desligada");
		}else {
			System.out.println("a lampada já está ligada");
	}
	}
	//ligar
	public void ligar() {
		setLigada(true);
		System.out.println("a lampada foi ligada");
		
		}
	
//Apenas ligar e desligar
	
	
public void ligaDesliga() {
	if(isLigada()) {
		desligar();
		System.out.println("a lampada foi desligada");
		
	}else {
		ligar();
		System.out.println("a lampada foi ligada");
	}
	
	

}
}


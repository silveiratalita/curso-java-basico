package com.talita.cursojava.exerciciosaula37a43LABS;

import java.util.Arrays;

public class Contribuinte extends ReceitaFederal{

	
	private String nomeContribuinte;

	public String getNomeContribuinte() {
		return nomeContribuinte;
	}

	public void setNomeContribuinte(String nomeContribuinte) {
		this.nomeContribuinte = nomeContribuinte;
	}

	@Override
	public String toString() {
		return "Contribuinte [nomeContribuinte=" + nomeContribuinte + ", getNomeContribuinte()=" + getNomeContribuinte()
				+ ", getContribuintes()=" + Arrays.toString(getContribuintes()) + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public  void adicionaContribuintesNoArray(Contribuinte cont ) {
	}
}



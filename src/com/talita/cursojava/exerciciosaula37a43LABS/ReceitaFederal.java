package com.talita.cursojava.exerciciosaula37a43LABS;

import java.util.Arrays;

public class ReceitaFederal  {
private Contribuinte contribuintes[]=new Contribuinte[6];
/*
private Contribuinte cont1;
private Contribuinte cont2;
private Contribuinte cont3;
private Contribuinte cont4;
private Contribuinte cont5;
private Contribuinte cont6;

*/





public Contribuinte[] getContribuintes() {
	return contribuintes;
}


public void setContribuintes(Contribuinte[] contribuintes) {
	this.contribuintes = contribuintes;
}


public double impostoPJ (double renda) {
	
return 0;
}


public double impostoPF(double renda) {
	
		return 0;	
	}

public void adicionaContribuintesNoArray(Contribuinte cont ) {
	for (int i = 0; i < contribuintes.length; i++) {
		if (contribuintes[i] != null) {

		} else {
			contribuintes[i] = cont;
		}
	}
		
	}


	

	@Override
public String toString() {
	return "ReceitaFederal [contribuintes=" + Arrays.toString(contribuintes) + ", getContribuintes()="
			+ Arrays.toString(getContribuintes()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}


	public void mostraTodosOsContribuintes() {
		for (int i=0; i<contribuintes.length;i++) {
			System.out.println(contribuintes[i].getNomeContribuinte());
			
			System.out.println(contribuintes[i].to);
			System.out.println(" ");
	}
	
	
}
}







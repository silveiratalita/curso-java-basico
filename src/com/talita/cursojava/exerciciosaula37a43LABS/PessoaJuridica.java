package com.talita.cursojava.exerciciosaula37a43LABS;

import java.util.Arrays;

public class PessoaJuridica extends Contribuinte {
	
	 private String cnpj;
	 
	 private double renda;
	 
	 private double valorDoImposto;
	 
	 
	 public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public double getRenda() {
		return renda;
	}


	public void setRenda(double renda) {
		this.renda = renda;
	}


	public double getValorDoImposto() {
		return valorDoImposto;
	}


	public void setValorDoImposto(double valorDoImposto) {
		this.valorDoImposto = valorDoImposto;
	}


	public double impostoPJ (double renda) {
			
			valorDoImposto=(10*renda)/100;
			return valorDoImposto;
		}


	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", renda=" + renda + ", valorDoImposto=" + valorDoImposto
				+ ", getCnpj()=" + getCnpj() + ", getRenda()=" + getRenda() + ", getValorDoImposto()="
				+ getValorDoImposto() + ", getNomeContribuinte()=" + getNomeContribuinte() + ", toString()="
				+ super.toString() + ", getContribuintes()=" + Arrays.toString(getContribuintes()) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	 
	 
	 
}

package com.talita.cursojava.exerciciosaula37a43LABS;

public class PessoaFisica extends Contribuinte {
	
	
 private String cpf;
 private double valorDoImposto;
 private double renda;
 
 
 public double getRenda() {
	return renda;
}

public void setRenda(double renda) {
	this.renda = renda;
}


 
 public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public double getValorDoImposto() {
	return valorDoImposto;
}

public void setValorDoImposto(double valorDoImposto) {
	this.valorDoImposto = valorDoImposto;
}

public double impostoPF(double renda) {
		if(renda>0 && renda <1400) {
			System.out.println("Alíquota 0%, não paga nada de imposto");
		}
			if(renda>1400 && renda <2100) {
				valorDoImposto=(10*renda)/100;
				System.out.println("Alíquota 10%,  paga "+valorDoImposto+" de imposto");
			}
			if(renda>2100 && renda <2800) {
				valorDoImposto=(15*renda)/100;
				System.out.println("Alíquota 15%,  paga "+valorDoImposto+" de imposto");
			}
			if(renda>2800.01 && renda <3600) {
				valorDoImposto=(25*renda)/100;
				System.out.println("Alíquota 25%,  paga "+valorDoImposto+" de imposto");
			}
			if(renda>3600.001) {
				valorDoImposto=(30*renda)/100;
				System.out.println("Alíquota 30%,  paga "+valorDoImposto+" de imposto");
			}
			
			return valorDoImposto;	
		}

@Override
public String toString() {
	return "PessoaFisica [cpf=" + cpf + ", valorDoImposto=" + valorDoImposto + ", renda=" + renda + ", getRenda()="
			+ getRenda() + ", getCpf()=" + getCpf() + ", getValorDoImposto()=" + getValorDoImposto()
			+ ", getNomeContribuinte()=" + getNomeContribuinte() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}


}

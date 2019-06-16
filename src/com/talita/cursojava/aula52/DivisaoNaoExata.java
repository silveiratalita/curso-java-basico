package com.talita.cursojava.aula52;

import java.util.Arrays;

public class DivisaoNaoExata extends Exception {

	private int num;
	private int dem;
	public DivisaoNaoExata(int num, int dem) {
		super();
		this.num=num;
		this.dem=dem;
	}
	@Override
	public String toString() {
		return "resultado de "+num+" / "+dem+" não é um inteiro !";
	}
	
}

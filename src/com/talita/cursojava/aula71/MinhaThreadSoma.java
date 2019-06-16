package com.talita.cursojava.aula71;

public class MinhaThreadSoma {
private String nome;
private int [] nums;
private static Calculadora calc=new Calculadora();
public MinhaThreadSoma(String nome, int[] nums) {
	
	this.nome = nome;
	this.nums = nums;
	Thread t= new Thread (this, nome);
	t.start();
	
}
public void run() {
	System.out.println(this.nome+" iniciada");
	int soma=calc.somaArray(this.nums);
	System.out.println("o resultado da soma para a thread "+this.nome+ " é: "+ soma );
	System.out.println(this.nome+" terminada");
}






}

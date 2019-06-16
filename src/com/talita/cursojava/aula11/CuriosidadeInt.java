package com.talita.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		int var1= 2147483647;
		long var2=100;
		System.out.println(var1+var2);
		//é como uma roleta,depois do 7 
		// volta para o menos 2147483648. Os numeros no java funcionam como uma roleta 
		//do momento que eu pego e somo, e passa do limite ele vai voltar para 
		//os numeros ngativos.
	}

}

package com.talita.cursojava.aula34;

public class Contador {

	
static	int contador;


	


public static int metodoContador(int num) {
	System.out.println("O contador será incrementado até o valor de  = "+num);
	for(int i=0;i < num; i++) {
		contador+=1;
		System.out.println("contador = "+contador);
	}
	
	
	return contador;
}

public static int zeraContador() {
	contador=0;
	System.out.println("O contador foi zerado ");
	
	return contador;
}
public static void mostraContador() {
	System.out.println("contador = "+contador);
}


}

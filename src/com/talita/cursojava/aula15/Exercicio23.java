package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Qual tipo de carne você deseja.");
			System.out.println("Digite:.");
			System.out.println("1 para filé duplo.");
			System.out.println("2 para alcatra.");
			System.out.println("3 para picanha.");
			int tipoCarne=scan.nextInt();
			System.out.println("Digite quantos quilos de carne vc deseja levar.");
			int qtdCarne=scan.nextInt();
			System.out.println("Possui cartão tabajara? Digite 1 para sim e 0 para não.");
			int possuiCard=scan.nextInt();
			double valorCarne=0;
		
		
									switch(tipoCarne) {
									case 1:
															System.out.println("CUPOM FISCAL:");
															System.out.println("Tipo de carne: File duplo");
															System.out.println("Quantidade comprada: "+qtdCarne);
																if (tipoCarne==1 && qtdCarne<=5) {
																	valorCarne=qtdCarne*4.90;
																}else if(tipoCarne==1 && qtdCarne>=5) {
																	valorCarne=qtdCarne*5.80;
																} System.out.println("Preço Total:" + valorCarne);
																if(possuiCard==1) {
																System.out.println("Tipo de Pagamento :cartão tabajara");
																System.out.println("Valor do desconto: "+ valorCarne*5/100);
																System.out.println("Valor a pagar: "+(valorCarne-valorCarne*5/100));
																}else {
																System.out.println("Tipo de Pagamento :Sem o cartão tabajara, cartão de credito, débito ou em dinheiro");
																System.out.println("Valor do desconto: 0,00");
																System.out.println("Valor a pagar: "+valorCarne);
																};break;
																
										case 2:
																System.out.println("CUPOM FISCAL:");
																System.out.println("Tipo de carne: Alcatra");
																System.out.println("Quantidade comprada: "+qtdCarne);
																	if (tipoCarne==2 && qtdCarne<=5) {
																		valorCarne=qtdCarne*5.90;
																	}else if(tipoCarne==1 && qtdCarne>=5) {
																		valorCarne=qtdCarne*6.80;
																	}
																	
																	System.out.println("Preço Total:" + valorCarne);
																	if(possuiCard==1) {
																	System.out.println("Tipo de Pagamento :cartão tabajara");
																	System.out.println("Valor do desconto: "+ valorCarne*5/100);
																	System.out.println("Valor a pagar: "+(valorCarne-valorCarne*5/100));
																	}else {
																	System.out.println("Tipo de Pagamento :Sem o cartão tabajara, cartão de credito, débito ou em dinheiro");
																	System.out.println("Valor do desconto: 0,00");
																	System.out.println("Valor a pagar: "+valorCarne);
																
																};break;
												
										case 3:
																	System.out.println("CUPOM FISCAL:");
																	System.out.println("Tipo de carne: Picanha");
																	System.out.println("Quantidade comprada: "+qtdCarne);
																		if (tipoCarne==3 && qtdCarne<=5) {
																			valorCarne=qtdCarne*6.90;
																		}else if(tipoCarne==1 && qtdCarne>=5) {
																			valorCarne=qtdCarne*7.80;
																		}
																		
																		System.out.println("Preço Total:" + valorCarne);
																		if(possuiCard==1) {
																		System.out.println("Tipo de Pagamento :cartão tabajara");
																		System.out.println("Valor do desconto: "+ valorCarne*5/100);
																		System.out.println("Valor a pagar: "+(valorCarne-valorCarne*5/100));
																		}else {
																		System.out.println("Tipo de Pagamento :Sem o cartão tabajara, cartão de credito, débito ou em dinheiro");
																		System.out.println("Valor do desconto: 0,00");
																		System.out.println("Valor a pagar: "+valorCarne);
																	
																	};break;
		}
	}
}

	

	



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra para verificar se � vogal ou consoante");
		String letra = scan.next();
		
		switch(letra) {
		case"a" : System.out.println("Voc� digitou uma vogal!");break;
		case"e" : System.out.println("Voc� digitou uma vogal!");break;
		case"i"  : System.out.println("Voc� digitou uma vogal!");break;
		case"o" : System.out.println("Voc� digitou uma vogal!");break;
		case"u" : System.out.println("Voc� digitou uma vogal!");break;
		case"b" : System.out.println("Voc� digitou uma consoante!");break;
		case"c" : System.out.println("Voc� digitou uma consoante!");break;
		case"d" : System.out.println("Voc� digitou uma consoante!");break;
		case"f" : System.out.println("Voc� digitou uma consoante!");break;
		case"g" : System.out.println("Voc� digitou uma consoante!");break;
		case"h" : System.out.println("Voc� digitou uma consoante!");break;
		case"j" : System.out.println("Voc� digitou uma consoante!");break;
		case"k" : System.out.println("Voc� digitou uma consoante!");break;
		case"l" : System.out.println("Voc� digitou uma consoante!");break;
		case"m" : System.out.println("Voc� digitou uma consoante!");break;
		case"n" : System.out.println("Voc� digitou uma consoante!");break;
		case"p" : System.out.println("Voc� digitou uma consoante!");break;
		case"q" : System.out.println("Voc� digitou uma consoante!");break;
		case"r" : System.out.println("Voc� digitou uma consoante!");break;
		case"s" : System.out.println("Voc� digitou uma consoante!");break;
		case"t" : System.out.println("Voc� digitou uma consoante!");break;
		case"v" : System.out.println("Voc� digitou uma consoante!");break;
		case"x" : System.out.println("Voc� digitou uma consoante!");break;
		case"w" : System.out.println("Voc� digitou uma consoante!");break;
		case"y" : System.out.println("Voc� digitou uma consoante!");break;
		case"z" : System.out.println("Voc� digitou uma consoante!");break;
		default : System.out.println("Voc� digitou um caracter invalido!");break;
		
		}

	}

}

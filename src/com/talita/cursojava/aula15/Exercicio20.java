package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 1 para Sim e 0 para N�o");
		System.out.println("a) Telefonou para a v�tima?");
		int a=scan.nextInt();
		System.out.println("b) Esteve no local do crime?");
		int b=scan.nextInt();
		System.out.println("c) Mora perto da v�tima?");
		int c=scan.nextInt();
		System.out.println("d) J� trabalhou com a v�tima?");
		int d=scan.nextInt();
		System.out.println("e) Devia para a v�tima?");
		int e=scan.nextInt();
		
		int resultado = a+b+c+d+e;
		
		switch(resultado) {
	//	case 1 :System.out.println("Inocente");break;
		case 2:System.out.println("Voc� foi classificado como Suspeito");break;
		case 3:System.out.println("Voc� foi classificado como Cumplice");break;
		case 4:System.out.println("Voc� foi classificado como Cumplice");break;
		case 5:System.out.println("Voc� foi classificado como Assassino");break;
		default:System.out.println("Voc� foi classificado como Inocente");break;
		
			
		}
		

	}

}

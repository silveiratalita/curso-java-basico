package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe 5 numeros");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e=scan.nextInt();
		boolean atrue=false;
		boolean btrue=false;
		boolean ctrue=false;
		boolean dtrue=false;
		boolean etrue=false;
		/*se 
		 * a>b,c e d= a é o maior
		 * se
		 * b>a,c,e d=b é o maior
		 * se
		 * c>a,b,e d=c é o maior
		 * se
		 * d>a,c e c=de é o maior
		 * se atue, be true, ctrue
		 * etrue...
		 */
		 
		if(a>b && a>c && a>d && a>e) {
			atrue=true;
			System.out.println(a+" é o maior ");
		} else if(b>a && b>c && b>d && b>e) {
			btrue=true;
			System.out.println(b+" é o maior ");
		} else if(c>a &&c>b && c>d && c>e) {
			ctrue=true;
			System.out.println(c+" é o maior ");
		} else if(c>a && c>b && c>d&&c>e) {
			ctrue=true;
			System.out.println(c+" é o maior ");
		} else if(d>a &&d>b &&d>c&&d>e) {
		dtrue=true;
		System.out.println(d+" é o maior ");
		}else if(e>a &&e>b && e>c&&e>d) {
			etrue=true;
			System.out.println(e+" é o maior ");
			

		}
			
		}
	}

package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 3 valores fora de ordem");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if(num1 <= num2 &&num1 <= num3 && num2<=num3) {
			//numero1 eh menor 
			//numero3 é maior
			//numero 2 fica no meio
			//nume1<numero2<numero3
			System.out.println(num3+"-"+num2+"-"+num1);
		}else if (num1<=num2 &&num1<=num3 && num3<=num2) {
			//numero1 eh menor 
			//numero2 é maior
			//numero 3 fica no meio
			//nume1<numero3<numero2
			System.out.println(num2+"-"+num3+"-"+num1);

		
		} 	else	if(num2<=num1 &&num2<=num3 && num1<=num3) {
			//numero2 eh menor 
			//numero 3 é maior
			//numero 1 fica no meio
			//nume2<numero1<numero3
			System.out.println(num3+"-"+num1+"-"+num2);	
		} else if (num2<=num1 &&num2<=num3 && num3<=num1) {
				//numero2 eh menor 
				//numero1 é maior
				//numero 3 fica no meio
				//nume1<numero3<numero2
				System.out.println(num2+"-"+num3+"-"+num1);
		} else if (num3<=num2 &&num3<=num1 && num2<=num1) {
			//numero3 eh menor 
			//numero1 é maior
			//numero 2 fica no meio
			//nume1<numero3<numero2
			System.out.println(num1+"-"+num2+"-"+num3);
		} else if (num3<=num2 &&num3<=num1 && num1<=num2) {
			//numero3 eh menor
			//numero2 é maior
			//numero 1 fica no meio
			//nume1<numero3<numero2
			System.out.println(num2+"-"+num1+"-"+num3);
		
		
		
		
		}	
}
}
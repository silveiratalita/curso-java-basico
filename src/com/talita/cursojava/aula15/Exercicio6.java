package com.talita.cursojava.aula15;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		

			System.out.println("Informe tr�s numeros para a verifica��o de qual � o maior.");
			int numero1 = scan.nextInt();
			int numero2 = scan.nextInt();
			int numero3 = scan.nextInt();
			
			if ((numero1>numero2) && (numero1 > numero3)) {
				System.out.println("O numero "+numero1+" � o maior");
			}   else if ((numero2>numero1) && (numero2>numero3)) {
				System.out.println("O numero "+numero2+" � o maior");
			}  else if  ((numero3>numero2) && (numero3>numero1)) {
				System.out.println("O numero "+numero3+" � o maior");
				
			}

		

	}

}

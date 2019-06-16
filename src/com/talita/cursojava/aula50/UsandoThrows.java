package com.talita.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("entre com um numero decimal");
		try {
			double num=leNum();
			System.out.println("vc digitou "+ num);
			
		} catch (Exception e) {
			System.out.println("Entrada invalida");
			//e.printStackTrace();
		}
		//para usuario final sempre se deve usar uma msg amigavel, o pink
		//staktrace é só para desenvolvedores.

	}
		public static double leNum()throws Exception{
			Scanner scan=new Scanner(System.in);
			double num=scan.nextDouble();
			return num;
		}

	

}

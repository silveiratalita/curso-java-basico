package com.talita.cursojava.aula19;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int a[]=new int [5];
		boolean primo=true;
		String msg="";
		
		for (int i =0; i<a.length;i++) {
			System.out.println("entre com a posi��o "+i);
			a[i]=scan.nextInt();
		
		}
		
		for(int i=2; i<a.length; i++) {
		
			for (int j=2; j<a[i];j++) {
				if (a[i]%j==0) {
					primo=false;
					break;
				}
			}
			
			if(primo) {
				msg="� primo";
			}else {
				msg="n�o � primo";
			}
			System.out.println(a[i] +" "+msg);
		}
			
	}

}

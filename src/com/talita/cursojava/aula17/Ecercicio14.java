package com.talita.cursojava.aula17;

import java.util.Scanner;

public class Ecercicio14 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("informe 10 numeros:");
		int numero1 =scan.nextInt();
		int numero2 =scan.nextInt();
		int numero3 =scan.nextInt();
		int numero4 =scan.nextInt();
		int numero5 =scan.nextInt();
		int numero6 =scan.nextInt();
		int numero7 =scan.nextInt();
		int numero8 =scan.nextInt();
		int numero9 =scan.nextInt();
		int numero0 =scan.nextInt();
		
		
		int resto1=numero1%2;
		int resto2=numero2%2;
		int resto3=numero3%2;
		int resto4=numero4%2;
		int resto5=numero5%2;
		int resto6=numero6%2;
		int resto7=numero7%2;
		int resto8=numero8%2;
		int resto9=numero9%2;
		int resto0=numero0%2;
		
		
		
		boolean rest1=false;
		boolean rest2 =false;
		boolean rest3 =false;
		boolean rest4 =false;
		boolean rest5 =false;
		boolean rest6 =false;
		boolean rest7 =false;
		boolean rest8 =false;
		boolean rest9 =false;
		boolean rest0 =false;
		int somaImpar=0;
		int somaPar=0;
		int par=0;
		int impar=0;
		
	//-----valida o primeiro numero	
		if(resto1!=0) {
			rest1=true;
			somaImpar= somaImpar+numero1;	
			impar++;
		}else {
			somaPar= somaPar+numero1;	
			par++;
		}
		//-----valida o segundo numero		
		if(resto2!=0) {
			rest2=true;
			somaImpar= somaImpar+numero2;
			impar++;
		}else {
			somaPar= somaPar+numero2;	
			par++;
		}
		
		//-----valida o terceiro numero	
		
		if(resto3!=0) {
			rest3=true;
			impar++;
			somaImpar= somaImpar+numero3;
			
		}else {
			somaPar= somaPar+numero3;	
			par++;
		}
		
		//-----valida o quarto numero	
		
		if(resto4!=0) {
			rest4=true;
			impar++;
			somaImpar= somaImpar+numero4;	
			
		}else {
			somaPar= somaPar+numero4;	
			par++;
		}
		//-----valida o quinto numero	
		
		
		if(resto5!=0) {
			rest5=true;
			impar++;
			somaImpar= somaImpar+numero5;	
		}else {
			somaPar= somaPar+numero5;	
			par++;
		}
		
		//-----valida o sexto numero	
		
		
				if(resto6!=0) {
					rest6=true;
					impar++;
				somaImpar= somaImpar+numero6;	
				}else {
					somaPar= somaPar+numero6;	
					par++;
				}
				
		
				//-----valida o setimo numero	
				
				
				if(resto7!=0) {
					rest7=true;
					impar++;
					somaImpar= somaImpar+numero7;	
				}else {
					somaPar= somaPar+numero7;	
					par++;
				}
		
				//-----valida o oitavo numero	
				
				
				if(resto8!=0) {
					rest8=true;
					impar++;
					somaImpar= somaImpar+numero8;	
				}else {
					somaPar= somaPar+numero8;	
					par++;
				}
		
				//-----valida o nono numero	
				
				
				if(resto9!=0) {
					rest9=true;
					impar++;
					somaImpar= somaImpar+numero9;	
				}else {
					somaPar= somaPar+numero9;	
					par++;
				}
		
		
				//-----valida o decimo numero	
				
				
				if(resto0!=0) {
					rest0=true;
					impar++;
					somaImpar= somaImpar+numero0;	
				}else {
					somaPar= somaPar+numero0;	
					par++;
				}
		
		
		
	System.out.println("São "+ par+" numeros pares e "+impar+" numeros impares.");
		
	System.out.println("A soma dos numeros pares é de "+ somaPar+" E a soma dos numeso impares é de  "+somaImpar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

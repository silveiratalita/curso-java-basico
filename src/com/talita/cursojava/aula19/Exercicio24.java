package com.talita.cursojava.aula19;

public class Exercicio24 {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		
		
		
	
		
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=5;
		a[6]=4;
		a[7]=3;
		a[8]=2;
		a[9]=1;
		 
	
	/*	for(int i=0, j=a.length; i<a.length ; i++, j-- ) {
			
			if(a[i]==a[j]) {
				System.out.println(" a na posição "+i+"é "+a[i]+ "que é diferente de a na posição "+i+" que é "+a[j]);
				System.out.println(" sendo assim, até agora é um palindromo");
			} else {
				System.out.println(" sendo assim, não é um palindromo");
			}
					}*/
		
		boolean palindromo=true;
		for( int i=0; i<(a.length/2); i++) {
			if (a[i] != a[a.length-1-i]) {
				palindromo=false;
				break;
			}
			
		}
		System.out.print(" a=");
		for (int i=0; i<a.length ; i++) {
		System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		if(palindromo) {
			System.out.println(" é palindromo");
			
		}else {
			System.out.println("não é palindromo");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
package com.talita.cursojava.aula19;

public class Exercicio28 {

	public static void main(String[] args) {
		int a[]=new int [10];
		int b[]=new int [10];
		
		a[0]=5;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		
		
		for(int i=0, j=a.length; i<a.length; i++, j--) {
			b[i]=a[i];
		
			
			System.out.println("'a'  "+i+" = "+a[i]+" b "+j+ " =é " +b[i]);
		
		
		
		}
		

}
}
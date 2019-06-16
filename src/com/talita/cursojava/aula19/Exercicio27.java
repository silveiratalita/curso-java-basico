package com.talita.cursojava.aula19;

public class Exercicio27 {

	public static void main(String[] args) {
		int [] a=new int [10];
		//int b[]=new int [10];
		
		
		//se usar char ele imprime  os caractretres da tabaela asc
		char[] b=new char[a.length];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		
		
		
		// a)se a <7 então b=a
		
		for (int i=0; i<a.length; i++) {
			
			if (a[i]<7) {
				b[i]='a';
			
			
			}else if(a[i]==7) {//b)se a==7 então b=b
				b[i]='b';
			}
			
			else if(a[i]>7) {	//c)se a >7 e a<10 então b=c
				b[i]='c';
			}
			
			else if(a[i]==10) {	//d) se a ==10 então b= d
				b[i]='d';
			}
			
			else if(a[i]>10) {	//e) se a>10 então b=e
				b[i]='e';
			
		}
		System.out.println("a-"+a[i]+", b - "+b[i]+",");
		
		
		
		
		
	
		
		
		
		

	}

}
}
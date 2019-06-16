package com.talita.cursojava.aula35;

public class Fibonacci {

	/*static int  primeiro=0;
	static int segundo=1;
	static int terceiro;
	static int resultado;
	static int fibonacci (int n) {
		System.out.print(primeiro+" ,"+ segundo+" ,");
		for (int i=0;i<n;i++) {
		terceiro=primeiro+segundo;
		System.out.print(terceiro+" ,");
		primeiro=segundo;
		segundo=terceiro;
		}
		return terceiro;
	}
	 static int fibonacciR(int n) {
		 
		 terceiro=primeiro+segundo;
			System.out.print(terceiro+" ,");
			primeiro=segundo;
			segundo=terceiro;
		 return terceiro;
	 }
	*/
	
	/*
	 static	int primeiro=0;
	 static int primeiroMais1=primeiro+1;
	 static int soma=0;
	
	static int fib(int n) {
		
		if(soma<n) {
			return soma;
		}
		soma=primeiro+primeiroMais1;
		System.out.println(primeiro+" ,"+primeiroMais1+" ,"+soma);
		primeiro=primeiroMais1;
		
		return soma;
	}*/
	
	static int fibonacci(int n) {
		
		if (n==2 || n==3) {
			return 1;
		}else {
			System.out.println(fibonacci(n-1)+ fibonacci(n-2));
		return fibonacci(n-1)+ fibonacci(n-2);
	}
	
	
}
}

package com.talita.cursojava.aula19;

public class Exercicio22 {

	public static void main(String[] args) {
		int a[]=new int[10];
		int zero=0;
		int um=0;
		double porcentagemUm=0;
		double porcentagemZero=0;
		
		
		
		for(int i=0; i<a.length;i++) {
			a[i]=(int)Math.round(Math.random()*1);
		}
		
		
		for (int i=0; i<a.length;i++) {
			if (a[i]==0) {
				zero++;
			}else if(a[i]==1)
				um++;
		}
		
		porcentagemUm=((um)*100)/a.length;
	
		porcentagemZero=(zero*100)/a.length;
	
		
	for (int i=0; i<a.length;i++) {		
		System.out.print(a[i]+" ," );
	}
	System.out.println(" ");
System.out.println(porcentagemUm+" %  de numero 1  e "+porcentagemZero+"  % de numeros 0." );
	}

}

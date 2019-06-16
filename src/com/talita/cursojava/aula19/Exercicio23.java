package com.talita.cursojava.aula19;

public class Exercicio23 {

	public static void main(String[] args) {
			double a[]=new double[10];
		
		
				a[0]=2;
				a[1]=2;
				a[2]=2;
				a[3]=2;
				a[4]=2;
				a[5]=3;
				a[6]=4;
				a[7]=2;
				a[8]=2;
				a[9]=2;
				 boolean impar=false;
				for (int i=0; i<a.length;i++) {
					if (a[i]%2!=0) {
						impar=true;
						System.out.println("encerrando programa, foi encontrado elemento impar "+a[i]+ " na posição " +i);
						break;
					
						
					}else if(a[i]%2==0) {
						System.out.println(" Executando verificação- ate agora todos elementos  são pares");
					
						
				}
				

	}

}
}
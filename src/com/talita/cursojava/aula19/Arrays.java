package com.talita.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001=31.3;
		double tempDia002=32;
		double tempDia003=33.7;
		double tempDia004=34;
		double tempDia005=31.1;
		
		
		double[] temperaturas=new double[365];		
		temperaturas[0]=31.3;
		temperaturas[1]=32;
		temperaturas[2]=33.7;
		temperaturas[3]=34;
		temperaturas[4]=33.1;
		
		System.out.println("o valor da temperatura do dia 1 � " +temperaturas[3]);
	
		System.out.println("O tamanho do array: "+temperaturas.length);
	
		System.out.println("Os valores do array: "+temperaturas);//vai indicar o endere�o de mem�ria onde vai coloacar e de onde a informa��o vem

		//para mostrar tudo usa-se loop, de preferencia for
		
		for(int i=0;i<temperaturas.length;i++) {//vers�o padr�o do java para arrays
			System.out.println("Os  valor da temperatura do dia "+(i+1)+" �: "+temperaturas[i]);
		}
	
		
		for(double temp : temperaturas) {//nesse for melhorado  vc s� pega a lista, n�o d� pra ver o indice, outras informa��es � o contador que mostra.
			System.out.println(temperaturas);
		}//n�o funcionou printou apenas [D@1db9742- ou seja o local onde est� o array
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

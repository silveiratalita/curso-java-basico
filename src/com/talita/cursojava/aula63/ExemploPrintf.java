package com.talita.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		System.out.printf("hello %s", "ol� mundo");//ele n�o pula linha//� uma forma de formatar
		System.out.println("");
		System.out.printf("hello %S", "ol� mundo");//usando s maiusculo fica tudo em caixa alta
		System.out.println("");
		
		/*alem de string tbm formata caracter
		System.out.printf("%c", "c");
		System.out.println("");
		
		System.out.printf(" %C", "c");//aqui n�o � recomendado fazer \n para pular linha, o melhor usar %n, q isso faz pular linha no printf
	
		System.out.printf("%n");
		*/
		
	//	d� pra imprimir valores de float
		int valor =123456789;
		//para formatar numero inteiro
		System.out.printf("%d %n", valor);
		 double pontoflutuante=3.1456897;
		 System.out.printf("%f%n", pontoflutuante);//perde casas, perde precis�o
		 
		 //juntamente com o % pode usar flags
		 
		 String olaMundo="ola, mundo";
		 System.out.printf("%20s", olaMundo);//20 para la
		 System.out.println("");
		 System.out.printf("%-20s", olaMundo);//20 para ca
		 
		 System.out.println("");
		 System.out.printf("%+d", valor);//vai imprimir o mais na frente
		 //isso pode indicar se ele � positivo ou negativo
		//se eu limitar o numero de caracterer  
		 System.out.println("");
		 System.out.printf("%015d", valor);//15 zeros pra la
		 //separar as casas milhjagens
		 System.out.println("");
		 System.out.printf("%,d", valor);
		 
		 int valor2=-123456789;
		 System.out.println("");
		 System.out.printf("% d", valor2);//espa�o antes do d imprime o sinal antes do numero se positivo ou negativo. negativo ele imprime - positivo ele deixa um esp��o
		 //quero 1 tenha 3 casas decimais depois do numero
		 
		 System.out.println("");
		 System.out.printf("%.3f", pontoflutuante);//vai ter 3 casas decimais depois do numero
		 //ele arredonda dai
		 
		 System.out.println("");
		 System.out.printf("R$%10.2f", pontoflutuante);//20 para ca
		//vai imprimir o r e sifr�o depois vai pegar 10 caracteres vai dar espa�o
		 //e depois vai deixar duas casas s� depois da virgula
		 
		
		testeMaisCompleto();
	
	
	}
	
	private static void testeMaisCompleto() {
		double []precos= {10000,123.54,7843.597,1,4.56789};
		
		for (int i=0; i<precos.length;i++) {
			System.out.println("");
			 System.out.printf("%s %02d: total de R$%,10.2f%n", "Item",i+1,precos[i]);
			 
		}
	}

}
